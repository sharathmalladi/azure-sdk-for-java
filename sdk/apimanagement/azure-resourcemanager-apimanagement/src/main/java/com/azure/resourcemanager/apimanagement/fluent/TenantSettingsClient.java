// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.TenantSettingsContractInner;
import com.azure.resourcemanager.apimanagement.models.SettingsTypeName;
import com.azure.resourcemanager.apimanagement.models.TenantSettingsGetResponse;

/** An instance of this class provides access to all the operations defined in TenantSettingsClient. */
public interface TenantSettingsClient {
    /**
     * Public settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged AccessInformation list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TenantSettingsContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Public settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter Not used.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged AccessInformation list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TenantSettingsContractInner> listByService(
        String resourceGroupName, String serviceName, String filter, Context context);

    /**
     * Get tenant settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param settingsType The identifier of the settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TenantSettingsContractInner get(String resourceGroupName, String serviceName, SettingsTypeName settingsType);

    /**
     * Get tenant settings.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param settingsType The identifier of the settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tenant settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TenantSettingsGetResponse getWithResponse(
        String resourceGroupName, String serviceName, SettingsTypeName settingsType, Context context);
}
