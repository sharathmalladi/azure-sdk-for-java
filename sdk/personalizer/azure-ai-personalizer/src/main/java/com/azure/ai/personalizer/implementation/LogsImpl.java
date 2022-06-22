// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation;

import com.azure.ai.personalizer.implementation.models.ErrorResponseException;
import com.azure.ai.personalizer.implementation.models.LogsProperties;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Logs. */
public final class LogsImpl {
    /** The proxy service used to perform REST calls. */
    private final LogsService service;

    /** The service client containing this operation class. */
    private final PersonalizerClientV1Preview3Impl client;

    /**
     * Initializes an instance of LogsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LogsImpl(PersonalizerClientV1Preview3Impl client) {
        this.service = RestProxy.create(LogsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PersonalizerClientV1Preview3Logs to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{Endpoint}/personalizer/v1.1-preview.3")
    @ServiceInterface(name = "PersonalizerClientV1")
    public interface LogsService {
        @Post("/logs/interactions")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> interactions(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/octet-stream") Flux<ByteBuffer> body,
                @HeaderParam("Content-Length") long contentLength,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/logs/observations")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> observations(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/octet-stream") Flux<ByteBuffer> body,
                @HeaderParam("Content-Length") long contentLength,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/logs")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> delete(@HostParam("Endpoint") String endpoint, Context context);

        @Get("/logs/properties")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<LogsProperties>> getProperties(
                @HostParam("Endpoint") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * The endpoint is intended to be used from within a SDK for logging interactions and accepts specific format
     * defined in https://github.com/VowpalWabbit/reinforcement_learning. This endpoint should not be used by the
     * customer.
     *
     * @param body Interactions binary payload.
     * @param contentLength The contentLength parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> interactionsWithResponseAsync(
            Flux<ByteBuffer> body, long contentLength, Context context) {
        final String accept = "application/json";
        return service.interactions(this.client.getEndpoint(), body, contentLength, accept, context);
    }

    /**
     * The endpoint is intended to be used from within a SDK for logging observations and accepts specific format
     * defined in https://github.com/VowpalWabbit/reinforcement_learning. This endpoint should not be used by the
     * customer.
     *
     * @param body Observations binary payload.
     * @param contentLength The contentLength parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> observationsWithResponseAsync(
            Flux<ByteBuffer> body, long contentLength, Context context) {
        final String accept = "application/json";
        return service.observations(this.client.getEndpoint(), body, contentLength, accept, context);
    }

    /**
     * Delete all logs of Rank and Reward calls stored by Personalizer.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(Context context) {
        return service.delete(this.client.getEndpoint(), context);
    }

    /**
     * Get properties of the Personalizer logs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the Personalizer logs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LogsProperties>> getPropertiesWithResponseAsync(Context context) {
        final String accept = "application/json";
        return service.getProperties(this.client.getEndpoint(), accept, context);
    }
}
