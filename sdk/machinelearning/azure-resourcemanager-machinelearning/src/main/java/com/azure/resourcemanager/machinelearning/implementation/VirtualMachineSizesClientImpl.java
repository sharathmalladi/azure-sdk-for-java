// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
import com.azure.resourcemanager.machinelearning.fluent.VirtualMachineSizesClient;
import com.azure.resourcemanager.machinelearning.fluent.models.VirtualMachineSizeListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineSizesClient. */
public final class VirtualMachineSizesClientImpl implements VirtualMachineSizesClient {
    /** The proxy service used to perform REST calls. */
    private final VirtualMachineSizesService service;

    /** The service client containing this operation class. */
    private final AzureMachineLearningWorkspacesImpl client;

    /**
     * Initializes an instance of VirtualMachineSizesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineSizesClientImpl(AzureMachineLearningWorkspacesImpl client) {
        this.service =
            RestProxy.create(VirtualMachineSizesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureMachineLearningWorkspacesVirtualMachineSizes to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureMachineLearning")
    private interface VirtualMachineSizesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.MachineLearningServices/locations/{location}/vmSizes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VirtualMachineSizeListResultInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns supported VM Sizes in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine size operation response along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualMachineSizeListResultInner>> listWithResponseAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            location,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns supported VM Sizes in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine size operation response along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualMachineSizeListResultInner>> listWithResponseAsync(String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                location,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Returns supported VM Sizes in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine size operation response on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VirtualMachineSizeListResultInner> listAsync(String location) {
        return listWithResponseAsync(location).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns supported VM Sizes in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine size operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineSizeListResultInner list(String location) {
        return listAsync(location).block();
    }

    /**
     * Returns supported VM Sizes in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine size operation response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VirtualMachineSizeListResultInner> listWithResponse(String location, Context context) {
        return listWithResponseAsync(location, context).block();
    }
}
