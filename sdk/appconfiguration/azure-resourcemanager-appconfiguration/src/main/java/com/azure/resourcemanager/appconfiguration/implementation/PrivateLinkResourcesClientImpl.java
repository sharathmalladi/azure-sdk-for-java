// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.appconfiguration.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.appconfiguration.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.appconfiguration.models.PrivateLinkResourceListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public final class PrivateLinkResourcesClientImpl implements PrivateLinkResourcesClient {
    /** The proxy service used to perform REST calls. */
    private final PrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final AppConfigurationManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateLinkResourcesClientImpl(AppConfigurationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AppConfigurationManagementClientPrivateLinkResources to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AppConfigurationMana")
    private interface PrivateLinkResourcesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AppConfiguration"
                + "/configurationStores/{configStoreName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResult>> listByConfigurationStore(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configStoreName") String configStoreName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AppConfiguration"
                + "/configurationStores/{configStoreName}/privateLinkResources/{groupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("configStoreName") String configStoreName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("groupName") String groupName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResult>> listByConfigurationStoreNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByConfigurationStoreSinglePageAsync(
        String resourceGroupName, String configStoreName) {
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
        if (configStoreName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByConfigurationStore(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            configStoreName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<PrivateLinkResourceInner>>map(
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
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store along with {@link
     *     PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByConfigurationStoreSinglePageAsync(
        String resourceGroupName, String configStoreName, Context context) {
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
        if (configStoreName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByConfigurationStore(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                configStoreName,
                this.client.getApiVersion(),
                accept,
                context)
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
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store as paginated response with
     *     {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateLinkResourceInner> listByConfigurationStoreAsync(
        String resourceGroupName, String configStoreName) {
        return new PagedFlux<>(
            () -> listByConfigurationStoreSinglePageAsync(resourceGroupName, configStoreName),
            nextLink -> listByConfigurationStoreNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store as paginated response with
     *     {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PrivateLinkResourceInner> listByConfigurationStoreAsync(
        String resourceGroupName, String configStoreName, Context context) {
        return new PagedFlux<>(
            () -> listByConfigurationStoreSinglePageAsync(resourceGroupName, configStoreName, context),
            nextLink -> listByConfigurationStoreNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByConfigurationStore(
        String resourceGroupName, String configStoreName) {
        return new PagedIterable<>(listByConfigurationStoreAsync(resourceGroupName, configStoreName));
    }

    /**
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByConfigurationStore(
        String resourceGroupName, String configStoreName, Context context) {
        return new PagedIterable<>(listByConfigurationStoreAsync(resourceGroupName, configStoreName, context));
    }

    /**
     * Gets a private link resource that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a configuration store along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName, String configStoreName, String groupName) {
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
        if (configStoreName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            configStoreName,
                            this.client.getApiVersion(),
                            groupName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a private link resource that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param groupName The name of the private link resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a configuration store along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName, String configStoreName, String groupName, Context context) {
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
        if (configStoreName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter configStoreName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                configStoreName,
                this.client.getApiVersion(),
                groupName,
                accept,
                context);
    }

    /**
     * Gets a private link resource that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a configuration store on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateLinkResourceInner> getAsync(
        String resourceGroupName, String configStoreName, String groupName) {
        return getWithResponseAsync(resourceGroupName, configStoreName, groupName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a private link resource that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a configuration store.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceInner get(String resourceGroupName, String configStoreName, String groupName) {
        return getAsync(resourceGroupName, configStoreName, groupName).block();
    }

    /**
     * Gets a private link resource that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param groupName The name of the private link resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a configuration store along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName, String configStoreName, String groupName, Context context) {
        return getWithResponseAsync(resourceGroupName, configStoreName, groupName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByConfigurationStoreNextSinglePageAsync(String nextLink) {
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
            .withContext(
                context -> service.listByConfigurationStoreNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<PrivateLinkResourceInner>>map(
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
     * @return a list of private link resources along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PrivateLinkResourceInner>> listByConfigurationStoreNextSinglePageAsync(
        String nextLink, Context context) {
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
            .listByConfigurationStoreNext(nextLink, this.client.getEndpoint(), accept, context)
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
