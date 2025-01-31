// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.okhttp.implementation;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.util.CoreUtils;
import okhttp3.Headers;
import okhttp3.Response;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;

/**
 * Base response class for OkHttp with implementations for response metadata.
 */
abstract class OkHttpAsyncResponseBase extends HttpResponse {
    private final int statusCode;
    private final HttpHeaders headers;

    OkHttpAsyncResponseBase(Response response, HttpRequest request, boolean eagerlyConvertHeaders) {
        super(request);
        this.statusCode = response.code();
        this.headers = eagerlyConvertHeaders
            ? fromOkHttpHeaders(response.headers())
            : new OkHttpToAzureCoreHttpHeadersWrapper(response.headers());
    }

    @Override
    public final int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public final String getHeaderValue(String name) {
        return this.headers.getValue(name);
    }

    @Override
    public final HttpHeaders getHeaders() {
        return this.headers;
    }

    @Override
    public final Mono<String> getBodyAsString() {
        return getBodyAsByteArray().map(bytes -> CoreUtils.bomAwareToString(bytes, getHeaderValue("Content-Type")));
    }

    @Override
    public final Mono<String> getBodyAsString(Charset charset) {
        return getBodyAsByteArray().map(bytes -> new String(bytes, charset));
    }

    /**
     * Creates azure-core HttpHeaders from okhttp headers.
     *
     * @param okHttpHeaders okhttp headers
     * @return azure-core HttpHeaders
     */
    static HttpHeaders fromOkHttpHeaders(Headers okHttpHeaders) {
        /*
         * While OkHttp's Headers class offers a method which converts the headers into a Map<String, List<String>>,
         * which matches one of the setters in our HttpHeaders, the method implicitly lower cases header names while
         * doing the conversion. This is fine when working purely with HTTPs request-response structure as headers are
         * case-insensitive per their definition RFC but this could cause issues when/if the headers are used in
         * serialization or deserialization as casing may matter.
         */
        HttpHeaders azureHeaders = new HttpHeaders((int) (okHttpHeaders.size() / 0.75F));

        // Use OkHttp's Headers forEach instead of the previous names and values approach.
        // forEach allows for a single iteration over the internal array of header values whereas names and values
        // will iterate over the internal array of header values for each name. With the new approach use azure-core
        // HttpHeaders add method.
        // Overall, this is much better performing as almost all headers will have a single value.
        okHttpHeaders.forEach(nameValuePair -> azureHeaders.add(nameValuePair.getFirst(), nameValuePair.getSecond()));

        return azureHeaders;
    }
}
