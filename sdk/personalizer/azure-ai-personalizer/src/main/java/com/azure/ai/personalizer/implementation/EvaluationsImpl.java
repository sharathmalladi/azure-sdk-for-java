// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation;

import com.azure.ai.personalizer.models.ErrorResponseException;
import com.azure.ai.personalizer.models.Evaluation;
import com.azure.ai.personalizer.models.EvaluationContract;
import com.azure.ai.personalizer.models.EvaluationsCreateHeaders;
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
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
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
        Mono<ResponseBase<EvaluationsCreateHeaders, Evaluation>> create(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/json") EvaluationContract evaluation,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Get Evaluation.
     *
     * <p>Get the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Offline Evaluation associated with the Id along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Evaluation>> getWithResponseAsync(String evaluationId) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), evaluationId, accept, context));
    }

    /**
     * Get Evaluation.
     *
     * <p>Get the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Offline Evaluation associated with the Id along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Evaluation>> getWithResponseAsync(String evaluationId, Context context) {
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), evaluationId, accept, context);
    }

    /**
     * Get Evaluation.
     *
     * <p>Get the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Offline Evaluation associated with the Id on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Evaluation> getAsync(String evaluationId) {
        return getWithResponseAsync(evaluationId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Evaluation.
     *
     * <p>Get the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Offline Evaluation associated with the Id on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Evaluation> getAsync(String evaluationId, Context context) {
        return getWithResponseAsync(evaluationId, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Evaluation.
     *
     * <p>Get the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Offline Evaluation associated with the Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Evaluation get(String evaluationId) {
        return getAsync(evaluationId).block();
    }

    /**
     * Get Evaluation.
     *
     * <p>Get the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Offline Evaluation associated with the Id along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Evaluation> getWithResponse(String evaluationId, Context context) {
        return getWithResponseAsync(evaluationId, context).block();
    }

    /**
     * Delete Evaluation.
     *
     * <p>Delete the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String evaluationId) {
        return FluxUtil.withContext(context -> service.delete(this.client.getEndpoint(), evaluationId, context));
    }

    /**
     * Delete Evaluation.
     *
     * <p>Delete the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String evaluationId, Context context) {
        return service.delete(this.client.getEndpoint(), evaluationId, context);
    }

    /**
     * Delete Evaluation.
     *
     * <p>Delete the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String evaluationId) {
        return deleteWithResponseAsync(evaluationId).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete Evaluation.
     *
     * <p>Delete the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String evaluationId, Context context) {
        return deleteWithResponseAsync(evaluationId, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete Evaluation.
     *
     * <p>Delete the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String evaluationId) {
        deleteAsync(evaluationId).block();
    }

    /**
     * Delete Evaluation.
     *
     * <p>Delete the Offline Evaluation associated with the Id.
     *
     * @param evaluationId Id of the Offline Evaluation to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String evaluationId, Context context) {
        return deleteWithResponseAsync(evaluationId, context).block();
    }

    /**
     * List Offline Evaluations.
     *
     * <p>List of all Offline Evaluations.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Evaluation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Evaluation>>> listWithResponseAsync() {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.list(this.client.getEndpoint(), accept, context));
    }

    /**
     * List Offline Evaluations.
     *
     * <p>List of all Offline Evaluations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Evaluation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Evaluation>>> listWithResponseAsync(Context context) {
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), accept, context);
    }

    /**
     * List Offline Evaluations.
     *
     * <p>List of all Offline Evaluations.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Evaluation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Evaluation>> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Offline Evaluations.
     *
     * <p>List of all Offline Evaluations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Evaluation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Evaluation>> listAsync(Context context) {
        return listWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Offline Evaluations.
     *
     * <p>List of all Offline Evaluations.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Evaluation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Evaluation> list() {
        return listAsync().block();
    }

    /**
     * List Offline Evaluations.
     *
     * <p>List of all Offline Evaluations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Evaluation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<Evaluation>> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }

    /**
     * Create Offline Evaluation.
     *
     * <p>Submit a new Offline Evaluation job.
     *
     * @param evaluation The Offline Evaluation job definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a counterfactual evaluation along with {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<EvaluationsCreateHeaders, Evaluation>> createWithResponseAsync(
            EvaluationContract evaluation) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.create(this.client.getEndpoint(), evaluation, accept, context));
    }

    /**
     * Create Offline Evaluation.
     *
     * <p>Submit a new Offline Evaluation job.
     *
     * @param evaluation The Offline Evaluation job definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a counterfactual evaluation along with {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<EvaluationsCreateHeaders, Evaluation>> createWithResponseAsync(
            EvaluationContract evaluation, Context context) {
        final String accept = "application/json";
        return service.create(this.client.getEndpoint(), evaluation, accept, context);
    }

    /**
     * Create Offline Evaluation.
     *
     * <p>Submit a new Offline Evaluation job.
     *
     * @param evaluation The Offline Evaluation job definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a counterfactual evaluation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Evaluation> createAsync(EvaluationContract evaluation) {
        return createWithResponseAsync(evaluation).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create Offline Evaluation.
     *
     * <p>Submit a new Offline Evaluation job.
     *
     * @param evaluation The Offline Evaluation job definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a counterfactual evaluation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Evaluation> createAsync(EvaluationContract evaluation, Context context) {
        return createWithResponseAsync(evaluation, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Create Offline Evaluation.
     *
     * <p>Submit a new Offline Evaluation job.
     *
     * @param evaluation The Offline Evaluation job definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a counterfactual evaluation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Evaluation create(EvaluationContract evaluation) {
        return createAsync(evaluation).block();
    }

    /**
     * Create Offline Evaluation.
     *
     * <p>Submit a new Offline Evaluation job.
     *
     * @param evaluation The Offline Evaluation job definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a counterfactual evaluation along with {@link ResponseBase}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseBase<EvaluationsCreateHeaders, Evaluation> createWithResponse(
            EvaluationContract evaluation, Context context) {
        return createWithResponseAsync(evaluation, context).block();
    }
}
