// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.PortalSettingsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PortalSettingsCollectionInner;
import com.azure.resourcemanager.apimanagement.models.PortalSettings;
import com.azure.resourcemanager.apimanagement.models.PortalSettingsCollection;

public final class PortalSettingsImpl implements PortalSettings {
    private static final ClientLogger LOGGER = new ClientLogger(PortalSettingsImpl.class);

    private final PortalSettingsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public PortalSettingsImpl(
        PortalSettingsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PortalSettingsCollection listByService(String resourceGroupName, String serviceName) {
        PortalSettingsCollectionInner inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        if (inner != null) {
            return new PortalSettingsCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PortalSettingsCollection> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        Response<PortalSettingsCollectionInner> inner =
            this.serviceClient().listByServiceWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PortalSettingsCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PortalSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
