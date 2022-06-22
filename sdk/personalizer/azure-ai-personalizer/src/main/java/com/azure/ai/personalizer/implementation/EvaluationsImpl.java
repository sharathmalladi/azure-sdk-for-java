// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation;

import com.azure.ai.personalizer.implementation.models.ErrorResponseException;
import com.azure.ai.personalizer.implementation.models.Evaluation;
import com.azure.ai.personalizer.implementation.models.EvaluationContract;
import com.azure.ai.personalizer.implementation.models.EvaluationsCreateResponse;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Evaluations. */
public final class EvaluationsImpl {
    /** The proxy service used to perform REST calls. */
    private final EvaluationsService service;

    /** The service client containing this operation class. */
    private final PersonalizerClientV1Preview3Impl client;

    /**
     * Initializes an instance of EvaluationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    EvaluationsImpl(PersonalizerClientV1Preview3Impl client) {
        this.service =
                RestProxy.create(EvaluationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PersonalizerClientV1Preview3Evaluations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{Endpoint}/personalizer/v1.1-preview.3")
    @ServiceInterface(name = "PersonalizerClientV1")
    public interface EvaluationsService {
        @Get("/evaluations/{evaluationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Evaluation>> get(
                @HostParam("Endpoint") String endpoint,
                @PathParam("evaluationId") String evaluationId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/evaluations/{evaluationId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("Endpoint") String endpoint,
                @PathParam("evaluationId") String evaluationId,
                Context context);

        @Get("/evaluations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<List<Evaluation>>> list(
                @HostParam("Endpoint") String endpoint, @HeaderParam("Accept") String accept, Context context);

        @Post("/evaluations")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<EvaluationsCreateResponse> create(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/json") EvaluationContract evaluation,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Get the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Offline Evaluation associated with the Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Evaluation>> getWithResponseAsync(String evaluationId, Context context) {
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), evaluationId, accept, context);
    }

    /**
     * Delete the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String evaluationId, Context context) {
        return service.delete(this.client.getEndpoint(), evaluationId, context);
    }

    /**
     * List of all Offline Evaluations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Evaluation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Evaluation>>> listWithResponseAsync(Context context) {
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), accept, context);
    }

    /**
     * Submit a new Offline Evaluation job.
     *
     * @param evaluation The Offline Evaluation job definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a counterfactual evaluation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EvaluationsCreateResponse> createWithResponseAsync(EvaluationContract evaluation, Context context) {
        final String accept = "application/json";
        return service.create(this.client.getEndpoint(), evaluation, accept, context);
    }
}
