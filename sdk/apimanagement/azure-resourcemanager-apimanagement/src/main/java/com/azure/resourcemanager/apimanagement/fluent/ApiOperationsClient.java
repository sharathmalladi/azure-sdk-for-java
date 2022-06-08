// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.OperationContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiOperationsCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.ApiOperationsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ApiOperationsGetResponse;
import com.azure.resourcemanager.apimanagement.models.ApiOperationsUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.OperationUpdateContract;

/** An instance of this class provides access to all the operations defined in ApiOperationsClient. */
public interface ApiOperationsClient {
    /**
     * Lists a collection of the operations for the specified API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Operation list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationContractInner> listByApi(String resourceGroupName, String serviceName, String apiId);

    /**
     * Lists a collection of the operations for the specified API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| displayName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param tags Include tags in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Operation list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationContractInner> listByApi(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Integer top,
        Integer skip,
        String tags,
        Context context);

    /**
     * Gets the entity state (Etag) version of the API operation specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String apiId, String operationId);

    /**
     * Gets the entity state (Etag) version of the API operation specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the API operation specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiOperationsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String apiId, String operationId, Context context);

    /**
     * Gets the details of the API Operation specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API Operation specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationContractInner get(String resourceGroupName, String serviceName, String apiId, String operationId);

    /**
     * Gets the details of the API Operation specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the API Operation specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiOperationsGetResponse getWithResponse(
        String resourceGroupName, String serviceName, String apiId, String operationId, Context context);

    /**
     * Creates a new operation in the API or updates an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI Operation details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        OperationContractInner parameters);

    /**
     * Creates a new operation in the API or updates an existing one.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI Operation details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiOperationsCreateOrUpdateResponse createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        OperationContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the details of the operation in the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters API Operation Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI Operation details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationContractInner update(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        String ifMatch,
        OperationUpdateContract parameters);

    /**
     * Updates the details of the operation in the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters API Operation Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return aPI Operation details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiOperationsUpdateResponse updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        String ifMatch,
        OperationUpdateContract parameters,
        Context context);

    /**
     * Deletes the specified operation in the API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String apiId, String operationId, String ifMatch);

    /**
     * Deletes the specified operation in the API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        String ifMatch,
        Context context);
}
