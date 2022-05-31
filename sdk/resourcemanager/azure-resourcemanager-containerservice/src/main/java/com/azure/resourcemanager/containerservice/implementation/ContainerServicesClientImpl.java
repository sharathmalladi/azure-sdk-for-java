// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.implementation;

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
import com.azure.resourcemanager.containerservice.fluent.ContainerServicesClient;
import com.azure.resourcemanager.containerservice.fluent.models.OrchestratorVersionProfileListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ContainerServicesClient. */
public final class ContainerServicesClientImpl implements ContainerServicesClient {
    /** The proxy service used to perform REST calls. */
    private final ContainerServicesService service;

    /** The service client containing this operation class. */
    private final ContainerServiceManagementClientImpl client;

    /**
     * Initializes an instance of ContainerServicesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ContainerServicesClientImpl(ContainerServiceManagementClientImpl client) {
        this.service =
            RestProxy.create(ContainerServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerServiceManagementClientContainerServices to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerServiceMana")
    private interface ContainerServicesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ContainerService/locations/{location}/orchestrators")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OrchestratorVersionProfileListResultInner>> listOrchestrators(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("resource-type") String resourceType,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each
     * orchestrator including version, available upgrades and whether that version or upgrades are in preview.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of supported orchestrators in the specified subscription along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OrchestratorVersionProfileListResultInner>> listOrchestratorsWithResponseAsync(
        String location, String resourceType) {
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
        final String apiVersion = "2019-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listOrchestrators(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            location,
                            resourceType,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each
     * orchestrator including version, available upgrades and whether that version or upgrades are in preview.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of supported orchestrators in the specified subscription along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OrchestratorVersionProfileListResultInner>> listOrchestratorsWithResponseAsync(
        String location, String resourceType, Context context) {
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
        final String apiVersion = "2019-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listOrchestrators(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                location,
                resourceType,
                accept,
                context);
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each
     * orchestrator including version, available upgrades and whether that version or upgrades are in preview.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of supported orchestrators in the specified subscription on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OrchestratorVersionProfileListResultInner> listOrchestratorsAsync(
        String location, String resourceType) {
        return listOrchestratorsWithResponseAsync(location, resourceType)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each
     * orchestrator including version, available upgrades and whether that version or upgrades are in preview.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of supported orchestrators in the specified subscription on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OrchestratorVersionProfileListResultInner> listOrchestratorsAsync(String location) {
        final String resourceType = null;
        return listOrchestratorsWithResponseAsync(location, resourceType)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each
     * orchestrator including version, available upgrades and whether that version or upgrades are in preview.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of supported orchestrators in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OrchestratorVersionProfileListResultInner listOrchestrators(String location) {
        final String resourceType = null;
        return listOrchestratorsAsync(location, resourceType).block();
    }

    /**
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each
     * orchestrator including version, available upgrades and whether that version or upgrades are in preview.
     *
     * @param location The name of a supported Azure region.
     * @param resourceType resource type for which the list of orchestrators needs to be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of supported orchestrators in the specified subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OrchestratorVersionProfileListResultInner> listOrchestratorsWithResponse(
        String location, String resourceType, Context context) {
        return listOrchestratorsWithResponseAsync(location, resourceType, context).block();
    }
}
