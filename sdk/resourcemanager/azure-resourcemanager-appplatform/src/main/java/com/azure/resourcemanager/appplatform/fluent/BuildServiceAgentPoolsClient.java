// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appplatform.fluent.models.BuildServiceAgentPoolResourceInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BuildServiceAgentPoolsClient. */
public interface BuildServiceAgentPoolsClient {
    /**
     * List build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of build service agent pool resources and a possible link for next set as
     *     paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<BuildServiceAgentPoolResourceInner> listAsync(
        String resourceGroupName, String serviceName, String buildServiceName);

    /**
     * List build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of build service agent pool resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BuildServiceAgentPoolResourceInner> list(
        String resourceGroupName, String serviceName, String buildServiceName);

    /**
     * List build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of build service agent pool resources and a possible link for next set as
     *     paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BuildServiceAgentPoolResourceInner> list(
        String resourceGroupName, String serviceName, String buildServiceName, Context context);

    /**
     * Get build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return build service agent pool along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BuildServiceAgentPoolResourceInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String buildServiceName, String agentPoolName);

    /**
     * Get build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return build service agent pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BuildServiceAgentPoolResourceInner> getAsync(
        String resourceGroupName, String serviceName, String buildServiceName, String agentPoolName);

    /**
     * Get build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return build service agent pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BuildServiceAgentPoolResourceInner get(
        String resourceGroupName, String serviceName, String buildServiceName, String agentPoolName);

    /**
     * Get build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return build service agent pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BuildServiceAgentPoolResourceInner> getWithResponse(
        String resourceGroupName, String serviceName, String buildServiceName, String agentPoolName, Context context);

    /**
     * Create or update build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param agentPoolResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the build service agent pool resource along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updatePutWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String buildServiceName,
        String agentPoolName,
        BuildServiceAgentPoolResourceInner agentPoolResource);

    /**
     * Create or update build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param agentPoolResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of the build service agent pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<BuildServiceAgentPoolResourceInner>, BuildServiceAgentPoolResourceInner> beginUpdatePutAsync(
        String resourceGroupName,
        String serviceName,
        String buildServiceName,
        String agentPoolName,
        BuildServiceAgentPoolResourceInner agentPoolResource);

    /**
     * Create or update build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param agentPoolResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the build service agent pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BuildServiceAgentPoolResourceInner>, BuildServiceAgentPoolResourceInner> beginUpdatePut(
        String resourceGroupName,
        String serviceName,
        String buildServiceName,
        String agentPoolName,
        BuildServiceAgentPoolResourceInner agentPoolResource);

    /**
     * Create or update build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param agentPoolResource Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the build service agent pool resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BuildServiceAgentPoolResourceInner>, BuildServiceAgentPoolResourceInner> beginUpdatePut(
        String resourceGroupName,
        String serviceName,
        String buildServiceName,
        String agentPoolName,
        BuildServiceAgentPoolResourceInner agentPoolResource,
        Context context);

    /**
     * Create or update build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param agentPoolResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the build service agent pool resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BuildServiceAgentPoolResourceInner> updatePutAsync(
        String resourceGroupName,
        String serviceName,
        String buildServiceName,
        String agentPoolName,
        BuildServiceAgentPoolResourceInner agentPoolResource);

    /**
     * Create or update build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param agentPoolResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the build service agent pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BuildServiceAgentPoolResourceInner updatePut(
        String resourceGroupName,
        String serviceName,
        String buildServiceName,
        String agentPoolName,
        BuildServiceAgentPoolResourceInner agentPoolResource);

    /**
     * Create or update build service agent pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param buildServiceName The name of the build service resource.
     * @param agentPoolName The name of the build service agent pool resource.
     * @param agentPoolResource Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the build service agent pool resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BuildServiceAgentPoolResourceInner updatePut(
        String resourceGroupName,
        String serviceName,
        String buildServiceName,
        String agentPoolName,
        BuildServiceAgentPoolResourceInner agentPoolResource,
        Context context);
}
