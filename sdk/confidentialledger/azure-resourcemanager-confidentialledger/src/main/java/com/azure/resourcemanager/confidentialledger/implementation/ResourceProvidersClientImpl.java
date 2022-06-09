// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.confidentialledger.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.confidentialledger.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.confidentialledger.models.CheckNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final ConfidentialLedgerManagementClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(ConfidentialLedgerManagementClientImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConfidentialLedgerManagementClientResourceProviders to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConfidentialLedgerMa")
    private interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.ConfidentialLedger/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") CheckNameAvailabilityRequest nameAvailabilityRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * To check whether a resource name is available.
     *
     * @param nameAvailabilityRequest Name availability request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityRequest nameAvailabilityRequest) {
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
        if (nameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter nameAvailabilityRequest is required and cannot be null."));
        } else {
            nameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            nameAvailabilityRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * To check whether a resource name is available.
     *
     * @param nameAvailabilityRequest Name availability request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        CheckNameAvailabilityRequest nameAvailabilityRequest, Context context) {
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
        if (nameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter nameAvailabilityRequest is required and cannot be null."));
        } else {
            nameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                nameAvailabilityRequest,
                accept,
                context);
    }

    /**
     * To check whether a resource name is available.
     *
     * @param nameAvailabilityRequest Name availability request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResponseInner> checkNameAvailabilityAsync(
        CheckNameAvailabilityRequest nameAvailabilityRequest) {
        return checkNameAvailabilityWithResponseAsync(nameAvailabilityRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * To check whether a resource name is available.
     *
     * @param nameAvailabilityRequest Name availability request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResponseInner checkNameAvailability(
        CheckNameAvailabilityRequest nameAvailabilityRequest) {
        return checkNameAvailabilityAsync(nameAvailabilityRequest).block();
    }

    /**
     * To check whether a resource name is available.
     *
     * @param nameAvailabilityRequest Name availability request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest nameAvailabilityRequest, Context context) {
        return checkNameAvailabilityWithResponseAsync(nameAvailabilityRequest, context).block();
    }
}
