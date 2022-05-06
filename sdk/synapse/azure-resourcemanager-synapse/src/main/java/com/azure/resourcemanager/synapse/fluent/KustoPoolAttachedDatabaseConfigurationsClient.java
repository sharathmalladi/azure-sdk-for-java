// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.AttachedDatabaseConfigurationInner;

/**
 * An instance of this class provides access to all the operations defined in
 * KustoPoolAttachedDatabaseConfigurationsClient.
 */
public interface KustoPoolAttachedDatabaseConfigurationsClient {
    /**
     * Returns the list of attached database configurations of the given Kusto Pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list attached database configurations operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttachedDatabaseConfigurationInner> listByKustoPool(
        String workspaceName, String kustoPoolName, String resourceGroupName);

    /**
     * Returns the list of attached database configurations of the given Kusto Pool.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list attached database configurations operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttachedDatabaseConfigurationInner> listByKustoPool(
        String workspaceName, String kustoPoolName, String resourceGroupName, Context context);

    /**
     * Returns an attached database configuration.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttachedDatabaseConfigurationInner get(
        String workspaceName, String kustoPoolName, String attachedDatabaseConfigurationName, String resourceGroupName);

    /**
     * Returns an attached database configuration.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttachedDatabaseConfigurationInner> getWithResponse(
        String workspaceName,
        String kustoPoolName,
        String attachedDatabaseConfigurationName,
        String resourceGroupName,
        Context context);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttachedDatabaseConfigurationInner>, AttachedDatabaseConfigurationInner> beginCreateOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String attachedDatabaseConfigurationName,
        String resourceGroupName,
        AttachedDatabaseConfigurationInner parameters);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttachedDatabaseConfigurationInner>, AttachedDatabaseConfigurationInner> beginCreateOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String attachedDatabaseConfigurationName,
        String resourceGroupName,
        AttachedDatabaseConfigurationInner parameters,
        Context context);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttachedDatabaseConfigurationInner createOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String attachedDatabaseConfigurationName,
        String resourceGroupName,
        AttachedDatabaseConfigurationInner parameters);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttachedDatabaseConfigurationInner createOrUpdate(
        String workspaceName,
        String kustoPoolName,
        String attachedDatabaseConfigurationName,
        String resourceGroupName,
        AttachedDatabaseConfigurationInner parameters,
        Context context);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String workspaceName, String kustoPoolName, String attachedDatabaseConfigurationName, String resourceGroupName);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String workspaceName,
        String kustoPoolName,
        String attachedDatabaseConfigurationName,
        String resourceGroupName,
        Context context);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String workspaceName, String kustoPoolName, String attachedDatabaseConfigurationName, String resourceGroupName);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String workspaceName,
        String kustoPoolName,
        String attachedDatabaseConfigurationName,
        String resourceGroupName,
        Context context);
}
