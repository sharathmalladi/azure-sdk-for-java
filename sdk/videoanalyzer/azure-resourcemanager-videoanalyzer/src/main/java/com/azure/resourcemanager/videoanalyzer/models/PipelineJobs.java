// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PipelineJobs. */
public interface PipelineJobs {
    /**
     * Retrieves a list of all live pipelines that have been created, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of PipelineJob items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PipelineJob> list(String resourceGroupName, String accountName);

    /**
     * Retrieves a list of all live pipelines that have been created, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param filter Restricts the set of items returned.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of PipelineJob items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PipelineJob> list(
        String resourceGroupName, String accountName, String filter, Integer top, Context context);

    /**
     * Retrieves a specific pipeline job by name. If a pipeline job with that name has been previously created, the call
     * will return the JSON representation of that instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param pipelineJobName The pipeline job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline job represents a unique instance of a batch topology, used for offline processing of selected
     *     portions of archived content.
     */
    PipelineJob get(String resourceGroupName, String accountName, String pipelineJobName);

    /**
     * Retrieves a specific pipeline job by name. If a pipeline job with that name has been previously created, the call
     * will return the JSON representation of that instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param pipelineJobName The pipeline job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline job represents a unique instance of a batch topology, used for offline processing of selected
     *     portions of archived content along with {@link Response}.
     */
    Response<PipelineJob> getWithResponse(
        String resourceGroupName, String accountName, String pipelineJobName, Context context);

    /**
     * Deletes a pipeline job with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param pipelineJobName The pipeline job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String pipelineJobName);

    /**
     * Deletes a pipeline job with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param pipelineJobName The pipeline job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String pipelineJobName, Context context);

    /**
     * Cancels a pipeline job with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param pipelineJobName The pipeline job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(String resourceGroupName, String accountName, String pipelineJobName);

    /**
     * Cancels a pipeline job with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param pipelineJobName The pipeline job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(String resourceGroupName, String accountName, String pipelineJobName, Context context);

    /**
     * Retrieves a specific pipeline job by name. If a pipeline job with that name has been previously created, the call
     * will return the JSON representation of that instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline job represents a unique instance of a batch topology, used for offline processing of selected
     *     portions of archived content along with {@link Response}.
     */
    PipelineJob getById(String id);

    /**
     * Retrieves a specific pipeline job by name. If a pipeline job with that name has been previously created, the call
     * will return the JSON representation of that instance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline job represents a unique instance of a batch topology, used for offline processing of selected
     *     portions of archived content along with {@link Response}.
     */
    Response<PipelineJob> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a pipeline job with the given name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a pipeline job with the given name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PipelineJob resource.
     *
     * @param name resource name.
     * @return the first stage of the new PipelineJob definition.
     */
    PipelineJob.DefinitionStages.Blank define(String name);
}
