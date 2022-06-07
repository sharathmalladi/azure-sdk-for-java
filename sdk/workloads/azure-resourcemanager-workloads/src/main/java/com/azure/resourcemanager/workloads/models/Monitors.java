// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Monitors. */
public interface Monitors {
    /**
     * Gets a list of SAP monitors in the specified subscription. The operations returns various properties of each SAP
     * monitor.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP monitors in the specified subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Monitor> list();

    /**
     * Gets a list of SAP monitors in the specified subscription. The operations returns various properties of each SAP
     * monitor.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP monitors in the specified subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Monitor> list(Context context);

    /**
     * Gets a list of SAP monitors in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP monitors in the specified resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Monitor> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of SAP monitors in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP monitors in the specified resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Monitor> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets properties of a SAP monitor for the specified subscription, resource group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP monitor for the specified subscription, resource group, and resource name.
     */
    Monitor getByResourceGroup(String resourceGroupName, String monitorName);

    /**
     * Gets properties of a SAP monitor for the specified subscription, resource group, and resource name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP monitor for the specified subscription, resource group, and resource name along with
     *     {@link Response}.
     */
    Response<Monitor> getByResourceGroupWithResponse(String resourceGroupName, String monitorName, Context context);

    /**
     * Deletes a SAP monitor with the specified subscription, resource group, and monitor name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult deleteByResourceGroup(String resourceGroupName, String monitorName);

    /**
     * Deletes a SAP monitor with the specified subscription, resource group, and monitor name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Name of the SAP monitor resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult delete(String resourceGroupName, String monitorName, Context context);

    /**
     * Gets properties of a SAP monitor for the specified subscription, resource group, and resource name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP monitor for the specified subscription, resource group, and resource name along with
     *     {@link Response}.
     */
    Monitor getById(String id);

    /**
     * Gets properties of a SAP monitor for the specified subscription, resource group, and resource name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP monitor for the specified subscription, resource group, and resource name along with
     *     {@link Response}.
     */
    Response<Monitor> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a SAP monitor with the specified subscription, resource group, and monitor name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult deleteById(String id);

    /**
     * Deletes a SAP monitor with the specified subscription, resource group, and monitor name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Monitor resource.
     *
     * @param name resource name.
     * @return the first stage of the new Monitor definition.
     */
    Monitor.DefinitionStages.Blank define(String name);
}
