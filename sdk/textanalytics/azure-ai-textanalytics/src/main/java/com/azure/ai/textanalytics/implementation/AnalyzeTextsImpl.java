// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation;

import com.azure.ai.textanalytics.implementation.models.AnalyzeTextJobState;
import com.azure.ai.textanalytics.implementation.models.AnalyzeTextJobsInput;
import com.azure.ai.textanalytics.implementation.models.AnalyzeTextsCancelJobResponse;
import com.azure.ai.textanalytics.implementation.models.AnalyzeTextsSubmitJobResponse;
import com.azure.ai.textanalytics.implementation.models.ErrorResponseException;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import reactor.core.publisher.Mono;

import java.util.UUID;

/** An instance of this class provides access to all the operations defined in AnalyzeTexts. */
public final class AnalyzeTextsImpl {
    /** The proxy service used to perform REST calls. */
    private final AnalyzeTextsService service;

    /** The service client containing this operation class. */
    private final MicrosoftCognitiveLanguageServiceImpl client;

    /**
     * Initializes an instance of AnalyzeTextsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public AnalyzeTextsImpl(MicrosoftCognitiveLanguageServiceImpl client) {
        this.service =
                RestProxy.create(AnalyzeTextsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftCognitiveLanguageServiceAnalyzeTexts to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{Endpoint}/language")
    @ServiceInterface(name = "MicrosoftCognitiveLa")
    public interface AnalyzeTextsService {
        @Post("/analyze-text/jobs")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<AnalyzeTextsSubmitJobResponse> submitJob(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") AnalyzeTextJobsInput body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/analyze-text/jobs/{jobId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<AnalyzeTextJobState>> jobStatus(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("jobId") UUID jobId,
                @QueryParam("showStats") Boolean showStats,
                @QueryParam("top") Integer top,
                @QueryParam("skip") Integer skip,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/analyze-text/jobs/{jobId}:cancel")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<AnalyzeTextsCancelJobResponse> cancelJob(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("jobId") UUID jobId,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Submit a collection of text documents for analysis. Specify one or more unique tasks to be executed as a
     * long-running operation.
     *
     * @param body Collection of documents to analyze and one or more tasks to execute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeTextsSubmitJobResponse> submitJobWithResponseAsync(AnalyzeTextJobsInput body, Context context) {
        final String accept = "application/json";
        return service.submitJob(this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context);
    }

    /**
     * Get the status of an analysis job. A job may consist of one or more tasks. Once all tasks are succeeded, the job
     * will transition to the succeeded state and results will be available for each task.
     *
     * @param jobId Job ID.
     * @param showStats (Optional) if set to true, response will contain request and document level statistics.
     * @param top The maximum number of resources to return from the collection.
     * @param skip An offset into the collection of the first resource to be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an analysis job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnalyzeTextJobState>> jobStatusWithResponseAsync(
            UUID jobId, Boolean showStats, Integer top, Integer skip, Context context) {
        final String accept = "application/json";
        return service.jobStatus(
                this.client.getEndpoint(), this.client.getApiVersion(), jobId, showStats, top, skip, accept, context);
    }

    /**
     * Cancel a long-running Text Analysis job.
     *
     * @param jobId Job ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnalyzeTextsCancelJobResponse> cancelJobWithResponseAsync(UUID jobId, Context context) {
        final String accept = "application/json";
        return service.cancelJob(this.client.getEndpoint(), this.client.getApiVersion(), jobId, accept, context);
    }
}
