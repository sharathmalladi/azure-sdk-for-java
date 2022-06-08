// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.fluent.SignalRsClient;
import com.azure.resourcemanager.signalr.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.signalr.fluent.models.SignalRKeysInner;
import com.azure.resourcemanager.signalr.fluent.models.SignalRResourceInner;
import com.azure.resourcemanager.signalr.fluent.models.SkuListInner;
import com.azure.resourcemanager.signalr.models.NameAvailability;
import com.azure.resourcemanager.signalr.models.NameAvailabilityParameters;
import com.azure.resourcemanager.signalr.models.RegenerateKeyParameters;
import com.azure.resourcemanager.signalr.models.SignalRKeys;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRs;
import com.azure.resourcemanager.signalr.models.SkuList;

public final class SignalRsImpl implements SignalRs {
    private static final ClientLogger LOGGER = new ClientLogger(SignalRsImpl.class);

    private final SignalRsClient innerClient;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    public SignalRsImpl(SignalRsClient innerClient, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NameAvailability checkNameAvailability(String location, NameAvailabilityParameters parameters) {
        NameAvailabilityInner inner = this.serviceClient().checkNameAvailability(location, parameters);
        if (inner != null) {
            return new NameAvailabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailability> checkNameAvailabilityWithResponse(
        String location, NameAvailabilityParameters parameters, Context context) {
        Response<NameAvailabilityInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SignalRResource> list() {
        PagedIterable<SignalRResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SignalRResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SignalRResource> list(Context context) {
        PagedIterable<SignalRResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SignalRResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SignalRResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SignalRResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SignalRResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SignalRResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SignalRResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SignalRResourceImpl(inner1, this.manager()));
    }

    public SignalRResource getByResourceGroup(String resourceGroupName, String resourceName) {
        SignalRResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new SignalRResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SignalRResource> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<SignalRResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SignalRResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public void delete(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().delete(resourceGroupName, resourceName, context);
    }

    public SignalRKeys listKeys(String resourceGroupName, String resourceName) {
        SignalRKeysInner inner = this.serviceClient().listKeys(resourceGroupName, resourceName);
        if (inner != null) {
            return new SignalRKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SignalRKeys> listKeysWithResponse(String resourceGroupName, String resourceName, Context context) {
        Response<SignalRKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SignalRKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SignalRKeys regenerateKey(
        String resourceGroupName, String resourceName, RegenerateKeyParameters parameters) {
        SignalRKeysInner inner = this.serviceClient().regenerateKey(resourceGroupName, resourceName, parameters);
        if (inner != null) {
            return new SignalRKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SignalRKeys regenerateKey(
        String resourceGroupName, String resourceName, RegenerateKeyParameters parameters, Context context) {
        SignalRKeysInner inner =
            this.serviceClient().regenerateKey(resourceGroupName, resourceName, parameters, context);
        if (inner != null) {
            return new SignalRKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void restart(String resourceGroupName, String resourceName) {
        this.serviceClient().restart(resourceGroupName, resourceName);
    }

    public void restart(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().restart(resourceGroupName, resourceName, context);
    }

    public SkuList listSkus(String resourceGroupName, String resourceName) {
        SkuListInner inner = this.serviceClient().listSkus(resourceGroupName, resourceName);
        if (inner != null) {
            return new SkuListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SkuList> listSkusWithResponse(String resourceGroupName, String resourceName, Context context) {
        Response<SkuListInner> inner =
            this.serviceClient().listSkusWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SkuListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SignalRResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<SignalRResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        this.delete(resourceGroupName, resourceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        this.delete(resourceGroupName, resourceName, context);
    }

    private SignalRsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }

    public SignalRResourceImpl define(String name) {
        return new SignalRResourceImpl(name, this.manager());
    }
}
