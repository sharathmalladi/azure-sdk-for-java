// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.CodeVersionsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.CodeVersionDataInner;
import com.azure.resourcemanager.machinelearning.models.CodeVersionData;
import com.azure.resourcemanager.machinelearning.models.CodeVersions;

public final class CodeVersionsImpl implements CodeVersions {
    private static final ClientLogger LOGGER = new ClientLogger(CodeVersionsImpl.class);

    private final CodeVersionsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public CodeVersionsImpl(
        CodeVersionsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CodeVersionData> list(String resourceGroupName, String workspaceName, String name) {
        PagedIterable<CodeVersionDataInner> inner = this.serviceClient().list(resourceGroupName, workspaceName, name);
        return Utils.mapPage(inner, inner1 -> new CodeVersionDataImpl(inner1, this.manager()));
    }

    public PagedIterable<CodeVersionData> list(
        String resourceGroupName,
        String workspaceName,
        String name,
        String orderBy,
        Integer top,
        String skip,
        Context context) {
        PagedIterable<CodeVersionDataInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, name, orderBy, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new CodeVersionDataImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String name, String version) {
        this.serviceClient().delete(resourceGroupName, workspaceName, name, version);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String name, String version, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, workspaceName, name, version, context);
    }

    public CodeVersionData get(String resourceGroupName, String workspaceName, String name, String version) {
        CodeVersionDataInner inner = this.serviceClient().get(resourceGroupName, workspaceName, name, version);
        if (inner != null) {
            return new CodeVersionDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CodeVersionData> getWithResponse(
        String resourceGroupName, String workspaceName, String name, String version, Context context) {
        Response<CodeVersionDataInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, name, version, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CodeVersionDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CodeVersionData getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "codes");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'codes'.", id)));
        }
        String version = Utils.getValueFromIdByName(id, "versions");
        if (version == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, name, version, Context.NONE).getValue();
    }

    public Response<CodeVersionData> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "codes");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'codes'.", id)));
        }
        String version = Utils.getValueFromIdByName(id, "versions");
        if (version == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, name, version, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "codes");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'codes'.", id)));
        }
        String version = Utils.getValueFromIdByName(id, "versions");
        if (version == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, workspaceName, name, version, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "codes");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'codes'.", id)));
        }
        String version = Utils.getValueFromIdByName(id, "versions");
        if (version == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, workspaceName, name, version, context);
    }

    private CodeVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    public CodeVersionDataImpl define(String name) {
        return new CodeVersionDataImpl(name, this.manager());
    }
}
