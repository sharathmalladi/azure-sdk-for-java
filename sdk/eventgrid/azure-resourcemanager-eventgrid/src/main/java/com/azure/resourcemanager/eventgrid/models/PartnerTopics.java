// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PartnerTopics. */
public interface PartnerTopics {
    /**
     * Get properties of a partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner topic.
     */
    PartnerTopic getByResourceGroup(String resourceGroupName, String partnerTopicName);

    /**
     * Get properties of a partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner topic along with {@link Response}.
     */
    Response<PartnerTopic> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerTopicName, Context context);

    /**
     * Delete existing partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String partnerTopicName);

    /**
     * Delete existing partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String partnerTopicName, Context context);

    /**
     * List all the partner topics under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerTopic> list();

    /**
     * List all the partner topics under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerTopic> list(String filter, Integer top, Context context);

    /**
     * List all the partner topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerTopic> listByResourceGroup(String resourceGroupName);

    /**
     * List all the partner topics under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Topics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerTopic> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * Activate a newly created partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic.
     */
    PartnerTopic activate(String resourceGroupName, String partnerTopicName);

    /**
     * Activate a newly created partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic along with {@link Response}.
     */
    Response<PartnerTopic> activateWithResponse(String resourceGroupName, String partnerTopicName, Context context);

    /**
     * Deactivate specific partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic.
     */
    PartnerTopic deactivate(String resourceGroupName, String partnerTopicName);

    /**
     * Deactivate specific partner topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerTopicName Name of the partner topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Grid Partner Topic along with {@link Response}.
     */
    Response<PartnerTopic> deactivateWithResponse(String resourceGroupName, String partnerTopicName, Context context);

    /**
     * Get properties of a partner topic.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner topic along with {@link Response}.
     */
    PartnerTopic getById(String id);

    /**
     * Get properties of a partner topic.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner topic along with {@link Response}.
     */
    Response<PartnerTopic> getByIdWithResponse(String id, Context context);

    /**
     * Delete existing partner topic.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete existing partner topic.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PartnerTopic resource.
     *
     * @param name resource name.
     * @return the first stage of the new PartnerTopic definition.
     */
    PartnerTopic.DefinitionStages.Blank define(String name);
}
