// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.machinelearning.fluent.models.DiagnoseResponseResultInner;
import com.azure.resourcemanager.machinelearning.fluent.models.ExternalFqdnResponseInner;
import com.azure.resourcemanager.machinelearning.fluent.models.ListNotebookKeysResultInner;
import com.azure.resourcemanager.machinelearning.fluent.models.ListStorageAccountKeysResultInner;
import com.azure.resourcemanager.machinelearning.fluent.models.ListWorkspaceKeysResultInner;
import com.azure.resourcemanager.machinelearning.fluent.models.NotebookAccessTokenResultInner;
import com.azure.resourcemanager.machinelearning.fluent.models.NotebookResourceInfoInner;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.machinelearning.models.DiagnoseWorkspaceParameters;
import com.azure.resourcemanager.machinelearning.models.WorkspaceUpdateParameters;

/** An instance of this class provides access to all the operations defined in WorkspacesClient. */
public interface WorkspacesClient {
    /**
     * Gets the properties of the specified machine learning workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Gets the properties of the specified machine learning workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified machine learning workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner parameters);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginCreateOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner parameters, Context context);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(String resourceGroupName, String workspaceName, WorkspaceInner parameters);

    /**
     * Creates or updates a workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for creating or updating a machine learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(
        String resourceGroupName, String workspaceName, WorkspaceInner parameters, Context context);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName);

    /**
     * Deletes a machine learning workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Updates a machine learning workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for updating a machine learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginUpdate(
        String resourceGroupName, String workspaceName, WorkspaceUpdateParameters parameters);

    /**
     * Updates a machine learning workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for updating a machine learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WorkspaceInner>, WorkspaceInner> beginUpdate(
        String resourceGroupName, String workspaceName, WorkspaceUpdateParameters parameters, Context context);

    /**
     * Updates a machine learning workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for updating a machine learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(String resourceGroupName, String workspaceName, WorkspaceUpdateParameters parameters);

    /**
     * Updates a machine learning workspace with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameters for updating a machine learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a machine learning workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(
        String resourceGroupName, String workspaceName, WorkspaceUpdateParameters parameters, Context context);

    /**
     * Lists all the available machine learning workspaces under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the available machine learning workspaces under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName, String skip, Context context);

    /**
     * Diagnose workspace setup issue.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameter of diagnosing workspace health.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnoseResponseResultInner>, DiagnoseResponseResultInner> beginDiagnose(
        String resourceGroupName, String workspaceName, DiagnoseWorkspaceParameters parameters);

    /**
     * Diagnose workspace setup issue.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameter of diagnosing workspace health.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnoseResponseResultInner>, DiagnoseResponseResultInner> beginDiagnose(
        String resourceGroupName, String workspaceName, DiagnoseWorkspaceParameters parameters, Context context);

    /**
     * Diagnose workspace setup issue.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameter of diagnosing workspace health.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnoseResponseResultInner diagnose(
        String resourceGroupName, String workspaceName, DiagnoseWorkspaceParameters parameters);

    /**
     * Diagnose workspace setup issue.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnoseResponseResultInner diagnose(String resourceGroupName, String workspaceName);

    /**
     * Diagnose workspace setup issue.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param parameters The parameter of diagnosing workspace health.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnoseResponseResultInner diagnose(
        String resourceGroupName, String workspaceName, DiagnoseWorkspaceParameters parameters, Context context);

    /**
     * Lists all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListWorkspaceKeysResultInner listKeys(String resourceGroupName, String workspaceName);

    /**
     * Lists all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListWorkspaceKeysResultInner> listKeysWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginResyncKeys(String resourceGroupName, String workspaceName);

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginResyncKeys(String resourceGroupName, String workspaceName, Context context);

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resyncKeys(String resourceGroupName, String workspaceName);

    /**
     * Resync all the keys associated with this workspace. This includes keys for the storage account, app insights and
     * password for container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void resyncKeys(String resourceGroupName, String workspaceName, Context context);

    /**
     * Lists all the available machine learning workspaces under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list();

    /**
     * Lists all the available machine learning workspaces under the specified subscription.
     *
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list machine learning workspaces as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list(String skip, Context context);

    /**
     * return notebook access token and refresh token.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotebookAccessTokenResultInner listNotebookAccessToken(String resourceGroupName, String workspaceName);

    /**
     * return notebook access token and refresh token.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NotebookAccessTokenResultInner> listNotebookAccessTokenWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Prepare a notebook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NotebookResourceInfoInner>, NotebookResourceInfoInner> beginPrepareNotebook(
        String resourceGroupName, String workspaceName);

    /**
     * Prepare a notebook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NotebookResourceInfoInner>, NotebookResourceInfoInner> beginPrepareNotebook(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Prepare a notebook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotebookResourceInfoInner prepareNotebook(String resourceGroupName, String workspaceName);

    /**
     * Prepare a notebook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NotebookResourceInfoInner prepareNotebook(String resourceGroupName, String workspaceName, Context context);

    /**
     * List storage account keys of a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListStorageAccountKeysResultInner listStorageAccountKeys(String resourceGroupName, String workspaceName);

    /**
     * List storage account keys of a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListStorageAccountKeysResultInner> listStorageAccountKeysWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * List keys of a notebook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListNotebookKeysResultInner listNotebookKeys(String resourceGroupName, String workspaceName);

    /**
     * List keys of a notebook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListNotebookKeysResultInner> listNotebookKeysWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Called by Client (Portal, CLI, etc) to get a list of all external outbound dependencies (FQDNs) programmatically.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExternalFqdnResponseInner listOutboundNetworkDependenciesEndpoints(String resourceGroupName, String workspaceName);

    /**
     * Called by Client (Portal, CLI, etc) to get a list of all external outbound dependencies (FQDNs) programmatically.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExternalFqdnResponseInner> listOutboundNetworkDependenciesEndpointsWithResponse(
        String resourceGroupName, String workspaceName, Context context);
}
