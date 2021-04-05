// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.UserSubscriptionsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.SubscriptionContractInner;
import com.azure.resourcemanager.apimanagement.models.SubscriptionContract;
import com.azure.resourcemanager.apimanagement.models.UserSubscriptions;
import com.azure.resourcemanager.apimanagement.models.UserSubscriptionsGetResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UserSubscriptionsImpl implements UserSubscriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserSubscriptionsImpl.class);

    private final UserSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public UserSubscriptionsImpl(
        UserSubscriptionsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SubscriptionContract> list(String resourceGroupName, String serviceName, String userId) {
        PagedIterable<SubscriptionContractInner> inner =
            this.serviceClient().list(resourceGroupName, serviceName, userId);
        return Utils.mapPage(inner, inner1 -> new SubscriptionContractImpl(inner1, this.manager()));
    }

    public PagedIterable<SubscriptionContract> list(
        String resourceGroupName,
        String serviceName,
        String userId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<SubscriptionContractInner> inner =
            this.serviceClient().list(resourceGroupName, serviceName, userId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new SubscriptionContractImpl(inner1, this.manager()));
    }

    public SubscriptionContract get(String resourceGroupName, String serviceName, String userId, String sid) {
        SubscriptionContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, userId, sid);
        if (inner != null) {
            return new SubscriptionContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SubscriptionContract> getWithResponse(
        String resourceGroupName, String serviceName, String userId, String sid, Context context) {
        UserSubscriptionsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, userId, sid, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private UserSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
