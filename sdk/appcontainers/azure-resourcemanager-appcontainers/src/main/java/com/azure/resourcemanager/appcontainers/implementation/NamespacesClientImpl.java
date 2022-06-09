// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.appcontainers.fluent.NamespacesClient;
import com.azure.resourcemanager.appcontainers.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NamespacesClient. */
public final class NamespacesClientImpl implements NamespacesClient {
    /** The proxy service used to perform REST calls. */
    private final NamespacesService service;

    /** The service client containing this operation class. */
    private final ContainerAppsApiClientImpl client;

    /**
     * Initializes an instance of NamespacesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NamespacesClientImpl(ContainerAppsApiClientImpl client) {
        this.service =
            RestProxy.create(NamespacesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerAppsApiClientNamespaces to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerAppsApiClie")
    private interface NamespacesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.App"
                + "/managedEnvironments/{environmentName}/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("environmentName") String environmentName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CheckNameAvailabilityRequest checkNameAvailabilityRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Checks if resource name is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param checkNameAvailabilityRequest The check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        String resourceGroupName, String environmentName, CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (environmentName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter environmentName is required and cannot be null."));
        }
        if (checkNameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkNameAvailabilityRequest is required and cannot be null."));
        } else {
            checkNameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            environmentName,
                            this.client.getApiVersion(),
                            checkNameAvailabilityRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Checks if resource name is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param checkNameAvailabilityRequest The check name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        String resourceGroupName,
        String environmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest,
        Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (environmentName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter environmentName is required and cannot be null."));
        }
        if (checkNameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter checkNameAvailabilityRequest is required and cannot be null."));
        } else {
            checkNameAvailabilityRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                environmentName,
                this.client.getApiVersion(),
                checkNameAvailabilityRequest,
                accept,
                context);
    }

    /**
     * Checks if resource name is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param checkNameAvailabilityRequest The check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResponseInner> checkNameAvailabilityAsync(
        String resourceGroupName, String environmentName, CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityWithResponseAsync(resourceGroupName, environmentName, checkNameAvailabilityRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Checks if resource name is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param checkNameAvailabilityRequest The check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResponseInner checkNameAvailability(
        String resourceGroupName, String environmentName, CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityAsync(resourceGroupName, environmentName, checkNameAvailabilityRequest).block();
    }

    /**
     * Checks if resource name is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param checkNameAvailabilityRequest The check name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String environmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest,
        Context context) {
        return checkNameAvailabilityWithResponseAsync(
                resourceGroupName, environmentName, checkNameAvailabilityRequest, context)
            .block();
    }
}
