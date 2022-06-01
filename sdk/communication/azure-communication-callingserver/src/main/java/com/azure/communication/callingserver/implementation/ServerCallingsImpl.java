// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation;

import com.azure.communication.callingserver.implementation.models.AnswerCallRequest;
import com.azure.communication.callingserver.implementation.models.AnswerCallResponse;
import com.azure.communication.callingserver.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.callingserver.implementation.models.CreateCallRequest;
import com.azure.communication.callingserver.implementation.models.CreateCallResultInternal;
import com.azure.communication.callingserver.implementation.models.RedirectCallRequest;
import com.azure.communication.callingserver.implementation.models.RejectCallRequest;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServerCallings. */
public final class ServerCallingsImpl {
    /** The proxy service used to perform REST calls. */
    private final ServerCallingsService service;

    /** The service client containing this operation class. */
    private final AzureCommunicationCallingServerServiceImpl client;

    /**
     * Initializes an instance of ServerCallingsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServerCallingsImpl(AzureCommunicationCallingServerServiceImpl client) {
        this.service =
                RestProxy.create(ServerCallingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationCallingServerServiceServerCallings to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationCa")
    private interface ServerCallingsService {
        @Post("/calling")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = CommunicationErrorResponseException.class,
                code = {400, 401, 403, 500})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<CreateCallResultInternal>> createCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") CreateCallRequest createCallRequest,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/calling:answer")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(
                value = CommunicationErrorResponseException.class,
                code = {400, 401, 403, 404, 500})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<AnswerCallResponse>> answerCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") AnswerCallRequest answerCallRequest,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/calling:redirect")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(
                value = CommunicationErrorResponseException.class,
                code = {400, 401, 403, 404, 500})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> redirectCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RedirectCallRequest redirectCallRequest,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/calling:reject")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(
                value = CommunicationErrorResponseException.class,
                code = {400, 401, 403, 404, 500})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> rejectCall(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RejectCallRequest rejectCallRequest,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Create an outbound call.
     *
     * @param createCallRequest The make call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the create call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CreateCallResultInternal>> createCallWithResponseAsync(CreateCallRequest createCallRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createCall(
                                this.client.getEndpoint(),
                                this.client.getApiVersion(),
                                createCallRequest,
                                accept,
                                context));
    }

    /**
     * Create an outbound call.
     *
     * @param createCallRequest The make call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the create call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CreateCallResultInternal>> createCallWithResponseAsync(
            CreateCallRequest createCallRequest, Context context) {
        final String accept = "application/json";
        return service.createCall(
                this.client.getEndpoint(), this.client.getApiVersion(), createCallRequest, accept, context);
    }

    /**
     * Create an outbound call.
     *
     * @param createCallRequest The make call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the create call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateCallResultInternal> createCallAsync(CreateCallRequest createCallRequest) {
        return createCallWithResponseAsync(createCallRequest)
                .flatMap(
                        (Response<CreateCallResultInternal> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create an outbound call.
     *
     * @param createCallRequest The make call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the create call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateCallResultInternal> createCallAsync(CreateCallRequest createCallRequest, Context context) {
        return createCallWithResponseAsync(createCallRequest, context)
                .flatMap(
                        (Response<CreateCallResultInternal> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create an outbound call.
     *
     * @param createCallRequest The make call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the create call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreateCallResultInternal createCall(CreateCallRequest createCallRequest) {
        return createCallAsync(createCallRequest).block();
    }

    /**
     * Create an outbound call.
     *
     * @param createCallRequest The make call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the create call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CreateCallResultInternal> createCallWithResponse(
            CreateCallRequest createCallRequest, Context context) {
        return createCallWithResponseAsync(createCallRequest, context).block();
    }

    /**
     * Answer an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the answer call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnswerCallResponse>> answerCallWithResponseAsync(AnswerCallRequest answerCallRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.answerCall(
                                this.client.getEndpoint(),
                                this.client.getApiVersion(),
                                answerCallRequest,
                                accept,
                                context));
    }

    /**
     * Answer an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the answer call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AnswerCallResponse>> answerCallWithResponseAsync(
            AnswerCallRequest answerCallRequest, Context context) {
        final String accept = "application/json";
        return service.answerCall(
                this.client.getEndpoint(), this.client.getApiVersion(), answerCallRequest, accept, context);
    }

    /**
     * Answer an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the answer call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnswerCallResponse> answerCallAsync(AnswerCallRequest answerCallRequest) {
        return answerCallWithResponseAsync(answerCallRequest)
                .flatMap(
                        (Response<AnswerCallResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Answer an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the answer call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AnswerCallResponse> answerCallAsync(AnswerCallRequest answerCallRequest, Context context) {
        return answerCallWithResponseAsync(answerCallRequest, context)
                .flatMap(
                        (Response<AnswerCallResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Answer an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the answer call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AnswerCallResponse answerCall(AnswerCallRequest answerCallRequest) {
        return answerCallAsync(answerCallRequest).block();
    }

    /**
     * Answer an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param answerCallRequest The answer call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response payload of the answer call operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AnswerCallResponse> answerCallWithResponse(AnswerCallRequest answerCallRequest, Context context) {
        return answerCallWithResponseAsync(answerCallRequest, context).block();
    }

    /**
     * Redirect an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redirectCallWithResponseAsync(RedirectCallRequest redirectCallRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.redirectCall(
                                this.client.getEndpoint(),
                                this.client.getApiVersion(),
                                redirectCallRequest,
                                accept,
                                context));
    }

    /**
     * Redirect an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> redirectCallWithResponseAsync(
            RedirectCallRequest redirectCallRequest, Context context) {
        final String accept = "application/json";
        return service.redirectCall(
                this.client.getEndpoint(), this.client.getApiVersion(), redirectCallRequest, accept, context);
    }

    /**
     * Redirect an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> redirectCallAsync(RedirectCallRequest redirectCallRequest) {
        return redirectCallWithResponseAsync(redirectCallRequest).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Redirect an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> redirectCallAsync(RedirectCallRequest redirectCallRequest, Context context) {
        return redirectCallWithResponseAsync(redirectCallRequest, context)
                .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Redirect an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void redirectCall(RedirectCallRequest redirectCallRequest) {
        redirectCallAsync(redirectCallRequest).block();
    }

    /**
     * Redirect an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param redirectCallRequest The request payload for redirecting the call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> redirectCallWithResponse(RedirectCallRequest redirectCallRequest, Context context) {
        return redirectCallWithResponseAsync(redirectCallRequest, context).block();
    }

    /**
     * Reject an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param rejectCallRequest The reject call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rejectCallWithResponseAsync(RejectCallRequest rejectCallRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.rejectCall(
                                this.client.getEndpoint(),
                                this.client.getApiVersion(),
                                rejectCallRequest,
                                accept,
                                context));
    }

    /**
     * Reject an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param rejectCallRequest The reject call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> rejectCallWithResponseAsync(RejectCallRequest rejectCallRequest, Context context) {
        final String accept = "application/json";
        return service.rejectCall(
                this.client.getEndpoint(), this.client.getApiVersion(), rejectCallRequest, accept, context);
    }

    /**
     * Reject an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param rejectCallRequest The reject call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> rejectCallAsync(RejectCallRequest rejectCallRequest) {
        return rejectCallWithResponseAsync(rejectCallRequest).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Reject an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param rejectCallRequest The reject call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> rejectCallAsync(RejectCallRequest rejectCallRequest, Context context) {
        return rejectCallWithResponseAsync(rejectCallRequest, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Reject an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param rejectCallRequest The reject call request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void rejectCall(RejectCallRequest rejectCallRequest) {
        rejectCallAsync(rejectCallRequest).block();
    }

    /**
     * Reject an incoming call using the IncomingCallContext from Event Grid.
     *
     * @param rejectCallRequest The reject call request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server on status code 400, 401,
     *     403, 404, 500.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> rejectCallWithResponse(RejectCallRequest rejectCallRequest, Context context) {
        return rejectCallWithResponseAsync(rejectCallRequest, context).block();
    }
}
