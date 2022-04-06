// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.implementation;

import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpResponse;
import com.azure.core.util.Context;
import com.azure.core.util.UrlBuilder;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.common.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import static com.azure.storage.common.Utility.urlDecode;
import static com.azure.storage.common.implementation.Constants.HeaderConstants.ERROR_CODE;

/**
 * Utility class which is used internally.
 */
public class StorageImplUtils {
    private static final ClientLogger LOGGER = new ClientLogger(StorageImplUtils.class);

    private static final String ARGUMENT_NULL_OR_EMPTY =
        "The argument must not be null or an empty string. Argument name: %s.";

    private static final String PARAMETER_NOT_IN_RANGE = "The value of the parameter '%s' should be between %s and %s.";

    private static final String NO_PATH_SEGMENTS = "URL %s does not contain path segments.";

    private static final String STRING_TO_SIGN_LOG_INFO_MESSAGE = "The string to sign computed by the SDK is: {}{}";

    private static final String STRING_TO_SIGN_LOG_WARNING_MESSAGE = "Please remember to disable '{}' before going "
        + "to production as this string can potentially contain PII.";

    private static final String STORAGE_EXCEPTION_LOG_STRING_TO_SIGN_MESSAGE = String.format(
        "If you are using a StorageSharedKeyCredential, and the server returned an "
            + "error message that says 'Signature did not match', you can compare the string to sign with"
            + " the one generated by the SDK. To log the string to sign, pass in the context key value pair "
            + "'%s': true to the appropriate method call.%n"
            + "If you are using a SAS token, and the server returned an error message that says "
            + "'Signature did not match', you can compare the string to sign with"
            + " the one generated by the SDK. To log the string to sign, pass in the context key value "
            + "pair '%s': true to the appropriate generateSas method call.%n"
            + "Please remember to disable '%s' before going to production as this string can potentially "
            + "contain PII.%n",
        Constants.STORAGE_LOG_STRING_TO_SIGN, Constants.STORAGE_LOG_STRING_TO_SIGN,
        Constants.STORAGE_LOG_STRING_TO_SIGN);

    /**
     * @deprecated See value in {@link StorageImplUtils}
     */
    @Deprecated
    public static final String INVALID_DATE_STRING = "Invalid Date String: %s.";

    /**
     * Stores a reference to the date/time pattern with the greatest precision Java.util.Date is capable of expressing.
     * @deprecated See value in {@link StorageImplUtils}
     */
    @Deprecated
    public static final String MAX_PRECISION_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    /**
     * The length of a datestring that matches the MAX_PRECISION_PATTERN.
     * @deprecated See value in {@link StorageImplUtils}
     */
    @Deprecated
    public static final int MAX_PRECISION_DATESTRING_LENGTH = MAX_PRECISION_PATTERN.replaceAll("'", "")
            .length();

    /**
     * Stores a reference to the ISO8601 date/time pattern.
     * @deprecated See value in {@link StorageImplUtils}
     */
    @Deprecated
    public static final String ISO8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    /**
     * Stores a reference to the ISO8601 date/time pattern.
     * @deprecated See value in {@link StorageImplUtils}
     */
    @Deprecated
    public static final String ISO8601_PATTERN_NO_SECONDS = "yyyy-MM-dd'T'HH:mm'Z'";

    /**
     * A compiled Pattern that finds 'Z'. This is used as Java 8's String.replace method uses Pattern.compile
     * internally without simple case opt-outs.
     * @deprecated See value in {@link StorageImplUtils}
     */
    @Deprecated
    public static final Pattern Z_PATTERN = Pattern.compile("Z");

    /**
     * Parses the query string into a key-value pair map that maintains key, query parameter key, order. The value is
     * stored as a string (ex. key=val1,val2,val3 instead of key=[val1, val2, val3]).
     *
     * @param queryString Query string to parse
     * @return a mapping of query string pieces as key-value pairs.
     */
    public static Map<String, String> parseQueryString(final String queryString) {
        return parseQueryStringHelper(queryString, Utility::urlDecode);
    }

    /**
     * Parses the query string into a key-value pair map that maintains key, query parameter key, order. The value is
     * stored as a parsed array (ex. key=[val1, val2, val3] instead of key=val1,val2,val3).
     *
     * @param queryString Query string to parse
     * @return a mapping of query string pieces as key-value pairs.
     */
    public static Map<String, String[]> parseQueryStringSplitValues(final String queryString) {
        // We need to first split by comma and then decode each piece since we don't want to confuse legitimate separate
        // query values from query values that container a comma.
        // Example 1: prefix=a%2cb => prefix={decode(a%2cb)} => prefix={"a,b"}
        // Example 2: prefix=a,b => prefix={decode(a),decode(b)} => prefix={"a", "b"}
        return parseQueryStringHelper(queryString, value -> {
            String[] v = value.split(",");
            String[] ret = new String[v.length];
            for (int i = 0; i < v.length; i++) {
                ret[i] = urlDecode(v[i]);
            }
            return ret;
        });
    }

    private static <T> Map<String, T> parseQueryStringHelper(final String queryString,
                                                             Function<String, T> valueParser) {
        TreeMap<String, T> pieces = new TreeMap<>();

        if (CoreUtils.isNullOrEmpty(queryString)) {
            return pieces;
        }

        for (String kvp : queryString.split("&")) {
            int equalIndex = kvp.indexOf("=");
            String key = urlDecode(kvp.substring(0, equalIndex).toLowerCase(Locale.ROOT));
            T value = valueParser.apply(kvp.substring(equalIndex + 1));

            pieces.putIfAbsent(key, value);
        }

        return pieces;
    }

    /**
     * Blocks an asynchronous response with an optional timeout.
     *
     * @param response Asynchronous response to block
     * @param timeout Optional timeout
     * @param <T> Return type of the asynchronous response
     * @return the value of the asynchronous response
     * @throws RuntimeException If the asynchronous response doesn't complete before the timeout expires.
     */
    public static <T> T blockWithOptionalTimeout(Mono<T> response, Duration timeout) {
        if (timeout == null) {
            return response.block();
        } else {
            return response.block(timeout);
        }
    }

    /**
     * Applies a timeout to a publisher if the given timeout is not null.
     *
     * @param publisher Mono to apply optional timeout to.
     * @param timeout Optional timeout.
     * @param <T> Return type of the Mono.
     * @return Mono with an applied timeout, if any.
     */
    public static <T> Mono<T> applyOptionalTimeout(Mono<T> publisher, Duration timeout) {
        return timeout == null
            ? publisher
            : publisher.timeout(timeout);
    }

    /**
     * Applies a timeout to a publisher if the given timeout is not null.
     *
     * @param publisher Flux to apply optional timeout to.
     * @param timeout Optional timeout.
     * @param <T> Return type of the Flux.
     * @return Flux with an applied timeout, if any.
     */
    public static <T> Flux<T> applyOptionalTimeout(Flux<T> publisher, Duration timeout) {
        return timeout == null
            ? publisher
            : publisher.timeout(timeout);
    }

    /**
     * Asserts that a value is not {@code null}.
     *
     * @param param Name of the parameter
     * @param value Value of the parameter
     * @throws NullPointerException If {@code value} is {@code null}
     */
    public static void assertNotNull(final String param, final Object value) {
        if (value == null) {
            throw new NullPointerException(String.format(Locale.ROOT, ARGUMENT_NULL_OR_EMPTY, param));
        }
    }

    /**
     * Asserts that the specified number is in the valid range. The range is inclusive.
     *
     * @param param Name of the parameter
     * @param value Value of the parameter
     * @param min The minimum allowed value
     * @param max The maximum allowed value
     * @throws IllegalArgumentException If {@code value} is less than {@code min} or {@code value} is greater than
     * {@code max}.
     */
    public static void assertInBounds(final String param, final long value, final long min, final long max) {
        if (value < min || value > max) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(Locale.ROOT,
                PARAMETER_NOT_IN_RANGE, param, min, max)));
        }
    }

    /**
     * Computes a signature for the specified string using the HMAC-SHA256 algorithm.
     *
     * @param base64Key Base64 encoded key used to sign the string
     * @param stringToSign UTF-8 encoded string to sign
     * @return the HMAC-SHA256 encoded signature
     * @throws RuntimeException If the HMAC-SHA256 algorithm isn't support, if the key isn't a valid Base64 encoded
     * string, or the UTF-8 charset isn't supported.
     */
    public static String computeHMac256(final String base64Key, final String stringToSign) {
        try {
            byte[] key = Base64.getDecoder().decode(base64Key);
            Mac hmacSHA256 = Mac.getInstance("HmacSHA256");
            hmacSHA256.init(new SecretKeySpec(key, "HmacSHA256"));
            byte[] utf8Bytes = stringToSign.getBytes(StandardCharsets.UTF_8);
            return Base64.getEncoder().encodeToString(hmacSHA256.doFinal(utf8Bytes));
        } catch (NoSuchAlgorithmException | InvalidKeyException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Appends a string to the end of the passed URL's path.
     *
     * @param baseURL URL having a path appended
     * @param name Name of the path
     * @return a URL with the path appended.
     * @throws IllegalArgumentException If {@code name} causes the URL to become malformed.
     */
    public static URL appendToUrlPath(String baseURL, String name) {
        UrlBuilder builder = UrlBuilder.parse(baseURL);

        if (builder.getPath() == null) {
            builder.setPath("/");
        } else if (!builder.getPath().endsWith("/")) {
            builder.setPath(builder.getPath() + "/");
        }

        builder.setPath(builder.getPath() + name);

        try {
            return builder.toUrl();
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException(ex);
        }
    }


    /**
     * Strips the last path segment from the passed URL.
     *
     * @param baseUrl URL having its last path segment stripped
     * @return a URL with the path segment stripped.
     * @throws IllegalArgumentException If stripping the last path segment causes the URL to become malformed or it
     * doesn't contain any path segments.
     */
    public static URL stripLastPathSegment(URL baseUrl) {
        UrlBuilder builder = UrlBuilder.parse(baseUrl);

        if (builder.getPath() == null || !builder.getPath().contains("/")) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, NO_PATH_SEGMENTS, baseUrl));
        }

        builder.setPath(builder.getPath().substring(0, builder.getPath().lastIndexOf("/")));
        try {
            return builder.toUrl();
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException(ex);
        }
    }

    /**
     * Strips the account name from host part of the URL object.
     *
     * @param url URL having its  hostanme
     * @return account name.
     */
    public static String getAccountName(URL url) {
        UrlBuilder builder = UrlBuilder.parse(url);
        String accountName =  null;
        String host = builder.getHost();
        //Parse host to get account name
        // host will look like this : <accountname>.blob.core.windows.net
        if (!CoreUtils.isNullOrEmpty(host)) {
            int accountNameIndex = host.indexOf('.');
            if (accountNameIndex == -1) {
                // host only contains account name
                accountName = host;
            } else {
                // if host is separated by .
                accountName = host.substring(0, accountNameIndex);
            }
        }
        return accountName;
    }

    /** Returns an empty string if value is {@code null}, otherwise returns value
     * @param value The value to check and return.
     * @return The value or empty string.
     */
    public static String emptyIfNull(String value) {
        return value == null ? "" : value;
    }

    /**
     * Logs the string to sign if a valid context is provided.
     *
     * @param logger {@link ClientLogger}
     * @param stringToSign The string to sign to log.
     * @param context Additional context to determine if the string to sign should be logged.
     */
    public static void logStringToSign(ClientLogger logger, String stringToSign, Context context) {
        if (context != null && Boolean.TRUE.equals(context.getData(Constants.STORAGE_LOG_STRING_TO_SIGN).orElse(false))) {
            logger.info(STRING_TO_SIGN_LOG_INFO_MESSAGE, stringToSign, System.lineSeparator());
            logger.warning(STRING_TO_SIGN_LOG_WARNING_MESSAGE, Constants.STORAGE_LOG_STRING_TO_SIGN);
        }
    }

    /**
     * Converts the storage exception message.
     *
     * @param message The storage exception message
     * @param response The storage service response.
     * @return The converted storage exception message.
     */
    public static String convertStorageExceptionMessage(String message, HttpResponse response) {
        if (response != null) {
            if (response.getStatusCode() == 403) {
                return STORAGE_EXCEPTION_LOG_STRING_TO_SIGN_MESSAGE + message;
            }
            if (response.getRequest() != null && response.getRequest().getHttpMethod() != null
                && response.getRequest().getHttpMethod().equals(HttpMethod.HEAD)
                && response.getHeaders().getValue(ERROR_CODE) != null) {
                return message.replaceFirst("(empty body)", response.getHeaders().getValue(ERROR_CODE));
            }
        }
        return message;
    }

    /**
     * Given a String representing a date in a form of the ISO8601 pattern, generates a Date representing it with up to
     * millisecond precision.
     *
     * @param dateString the {@code String} to be interpreted as a <code>Date</code>
     * @return the corresponding <code>Date</code> object
     * @throws IllegalArgumentException If {@code dateString} doesn't match an ISO8601 pattern
     */
    public static TimeAndFormat parseDateAndFormat(String dateString) {
        String pattern = MAX_PRECISION_PATTERN;
        switch (dateString.length()) {
            case 28: // "yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'"-> [2012-01-04T23:21:59.1234567Z] length = 28
            case 27: // "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'"-> [2012-01-04T23:21:59.123456Z] length = 27
            case 26: // "yyyy-MM-dd'T'HH:mm:ss.SSSSS'Z'"-> [2012-01-04T23:21:59.12345Z] length = 26
            case 25: // "yyyy-MM-dd'T'HH:mm:ss.SSSS'Z'"-> [2012-01-04T23:21:59.1234Z] length = 25
            case 24: // "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"-> [2012-01-04T23:21:59.123Z] length = 24
                dateString = dateString.substring(0, MAX_PRECISION_DATESTRING_LENGTH);
                break;
            case 23: // "yyyy-MM-dd'T'HH:mm:ss.SS'Z'"-> [2012-01-04T23:21:59.12Z] length = 23
                // SS is assumed to be milliseconds, so a trailing 0 is necessary
                dateString = Z_PATTERN.matcher(dateString).replaceAll("0");
                break;
            case 22: // "yyyy-MM-dd'T'HH:mm:ss.S'Z'"-> [2012-01-04T23:21:59.1Z] length = 22
                // S is assumed to be milliseconds, so trailing 0's are necessary
                dateString = Z_PATTERN.matcher(dateString).replaceAll("00");
                break;
            case 20: // "yyyy-MM-dd'T'HH:mm:ss'Z'"-> [2012-01-04T23:21:59Z] length = 20
                pattern = ISO8601_PATTERN;
                break;
            case 17: // "yyyy-MM-dd'T'HH:mm'Z'"-> [2012-01-04T23:21Z] length = 17
                pattern = ISO8601_PATTERN_NO_SECONDS;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.ROOT, INVALID_DATE_STRING, dateString));
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ROOT);
        return new TimeAndFormat(LocalDateTime.parse(dateString, formatter).atZone(ZoneOffset.UTC).toOffsetDateTime(),
            formatter);
    }
}
