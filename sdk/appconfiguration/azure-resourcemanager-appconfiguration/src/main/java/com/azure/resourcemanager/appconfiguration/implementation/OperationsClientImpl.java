// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.appconfiguration.fluent.OperationsClient;
import com.azure.resourcemanager.appconfiguration.fluent.models.NameAvailabilityStatusInner;
import com.azure.resourcemanager.appconfiguration.fluent.models.OperationDefinitionInner;
import com.azure.resourcemanager.appconfiguration.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.appconfiguration.models.OperationDefinitionListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public final class OperationsClientImpl implements OperationsClient {
    /** The proxy service used to perform REST calls. */
    private final OperationsService service;

    /** The service client containing this operation class. */
    private final AppConfigurationManagementClientImpl client;

    /**
     * Initializes an instance of OperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OperationsClientImpl(AppConfigurationManagementClientImpl client) {
        this.service =
            RestProxy.create(OperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AppConfigurationManagementClientOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AppConfigurationMana")
    private interface OperationsService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.AppConfiguration/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NameAvailabilityStatusInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityParameters checkNameAvailabilityParameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.AppConfiguration/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationDefinitionListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$skipToken") String skipToken,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.AppConfiguration/locations/{location}"
                + "/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NameAvailabilityStatusInner>> regionalCheckNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityParameters checkNameAvailabilityParameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationDefinitionListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityStatusInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (checkNameAvailabilityParameters == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkNameAvailabilityParameters is required and cannot be null."));
        } else {
            checkNameAvailabilityParameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            checkNameAvailabilityParameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityStatusInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (checkNameAvailabilityParameters == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkNameAvailabilityParameters is required and cannot be null."));
        } else {
            checkNameAvailabilityParameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                checkNameAvailabilityParameters,
                accept,
                context);
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NameAvailabilityStatusInner> checkNameAvailabilityAsync(
        CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        return checkNameAvailabilityWithResponseAsync(checkNameAvailabilityParameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NameAvailabilityStatusInner checkNameAvailability(
        CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        return checkNameAvailabilityAsync(checkNameAvailabilityParameters).block();
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NameAvailabilityStatusInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        return checkNameAvailabilityWithResponseAsync(checkNameAvailabilityParameters, context).block();
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationDefinitionInner>> listSinglePageAsync(String skipToken) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service.list(this.client.getEndpoint(), this.client.getApiVersion(), skipToken, accept, context))
            .<PagedResponse<OperationDefinitionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationDefinitionInner>> listSinglePageAsync(String skipToken, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), skipToken, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OperationDefinitionInner> listAsync(String skipToken) {
        return new PagedFlux<>(() -> listSinglePageAsync(skipToken), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the operations available from this provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OperationDefinitionInner> listAsync() {
        final String skipToken = null;
        return new PagedFlux<>(() -> listSinglePageAsync(skipToken), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<OperationDefinitionInner> listAsync(String skipToken, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(skipToken, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the operations available from this provider.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationDefinitionInner> list() {
        final String skipToken = null;
        return new PagedIterable<>(listAsync(skipToken));
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<OperationDefinitionInner> list(String skipToken, Context context) {
        return new PagedIterable<>(listAsync(skipToken, context));
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityStatusInner>> regionalCheckNameAvailabilityWithResponseAsync(
        String location, CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (checkNameAvailabilityParameters == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkNameAvailabilityParameters is required and cannot be null."));
        } else {
            checkNameAvailabilityParameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .regionalCheckNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            checkNameAvailabilityParameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityStatusInner>> regionalCheckNameAvailabilityWithResponseAsync(
        String location, CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (checkNameAvailabilityParameters == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkNameAvailabilityParameters is required and cannot be null."));
        } else {
            checkNameAvailabilityParameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .regionalCheckNameAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                checkNameAvailabilityParameters,
                accept,
                context);
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NameAvailabilityStatusInner> regionalCheckNameAvailabilityAsync(
        String location, CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        return regionalCheckNameAvailabilityWithResponseAsync(location, checkNameAvailabilityParameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NameAvailabilityStatusInner regionalCheckNameAvailability(
        String location, CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        return regionalCheckNameAvailabilityAsync(location, checkNameAvailabilityParameters).block();
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailabilityParameters The object containing information for the availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to check the availability of a resource name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NameAvailabilityStatusInner> regionalCheckNameAvailabilityWithResponse(
        String location, CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        return regionalCheckNameAvailabilityWithResponseAsync(location, checkNameAvailabilityParameters, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationDefinitionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<OperationDefinitionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list configuration store operations along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<OperationDefinitionInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
