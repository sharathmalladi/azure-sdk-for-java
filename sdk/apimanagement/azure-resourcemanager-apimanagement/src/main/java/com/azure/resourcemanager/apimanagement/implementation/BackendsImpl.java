// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.BackendsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.BackendContractInner;
import com.azure.resourcemanager.apimanagement.models.BackendContract;
import com.azure.resourcemanager.apimanagement.models.BackendReconnectContract;
import com.azure.resourcemanager.apimanagement.models.Backends;
import com.azure.resourcemanager.apimanagement.models.BackendsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.BackendsGetResponse;

public final class BackendsImpl implements Backends {
    private static final ClientLogger LOGGER = new ClientLogger(BackendsImpl.class);

    private final BackendsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public BackendsImpl(
        BackendsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BackendContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<BackendContractInner> inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new BackendContractImpl(inner1, this.manager()));
    }

    public PagedIterable<BackendContract> listByService(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<BackendContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new BackendContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String backendId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, backendId);
    }

    public BackendsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String backendId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, backendId, context);
    }

    public BackendContract get(String resourceGroupName, String serviceName, String backendId) {
        BackendContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, backendId);
        if (inner != null) {
            return new BackendContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackendContract> getWithResponse(
        String resourceGroupName, String serviceName, String backendId, Context context) {
        BackendsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, backendId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackendContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String backendId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, backendId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String backendId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, backendId, ifMatch, context);
    }

    public void reconnect(String resourceGroupName, String serviceName, String backendId) {
        this.serviceClient().reconnect(resourceGroupName, serviceName, backendId);
    }

    public Response<Void> reconnectWithResponse(
        String resourceGroupName,
        String serviceName,
        String backendId,
        BackendReconnectContract parameters,
        Context context) {
        return this
            .serviceClient()
            .reconnectWithResponse(resourceGroupName, serviceName, backendId, parameters, context);
    }

    public BackendContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String backendId = Utils.getValueFromIdByName(id, "backends");
        if (backendId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backends'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, backendId, Context.NONE).getValue();
    }

    public Response<BackendContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String backendId = Utils.getValueFromIdByName(id, "backends");
        if (backendId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backends'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, backendId, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String backendId = Utils.getValueFromIdByName(id, "backends");
        if (backendId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backends'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, backendId, localIfMatch, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String backendId = Utils.getValueFromIdByName(id, "backends");
        if (backendId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backends'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, backendId, ifMatch, context);
    }

    private BackendsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public BackendContractImpl define(String name) {
        return new BackendContractImpl(name, this.manager());
    }
}
