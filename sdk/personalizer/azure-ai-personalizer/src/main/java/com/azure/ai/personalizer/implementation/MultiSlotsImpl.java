// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation;

import com.azure.ai.personalizer.models.ErrorResponseException;
import com.azure.ai.personalizer.models.MultiSlotRankRequest;
import com.azure.ai.personalizer.models.MultiSlotRankResponse;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MultiSlots. */
public final class MultiSlotsImpl {
    /** The proxy service used to perform REST calls. */
    private final MultiSlotsService service;

    /** The service client containing this operation class. */
    private final PersonalizerClientV1Preview3Impl client;

    /**
     * Initializes an instance of MultiSlotsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MultiSlotsImpl(PersonalizerClientV1Preview3Impl client) {
        this.service =
                RestProxy.create(MultiSlotsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PersonalizerClientV1Preview3MultiSlots to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{Endpoint}/personalizer/v1.1-preview.3")
    @ServiceInterface(name = "PersonalizerClientV1")
    public interface MultiSlotsService {
        @Post("/multislot/rank")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<MultiSlotRankResponse>> rank(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/json") MultiSlotRankRequest body,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Post multi-slot Rank.
     *
     * <p>Submit a Personalizer multi-slot rank request. Receives a context, a list of actions, and a list of slots.
     * Returns which of the provided actions should be used in each slot, in each rewardActionId.
     *
     * @param body A Personalizer multi-slot Rank request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MultiSlotRankResponse>> rankWithResponseAsync(MultiSlotRankRequest body) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.rank(this.client.getEndpoint(), body, accept, context));
    }

    /**
     * Post multi-slot Rank.
     *
     * <p>Submit a Personalizer multi-slot rank request. Receives a context, a list of actions, and a list of slots.
     * Returns which of the provided actions should be used in each slot, in each rewardActionId.
     *
     * @param body A Personalizer multi-slot Rank request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MultiSlotRankResponse>> rankWithResponseAsync(MultiSlotRankRequest body, Context context) {
        final String accept = "application/json";
        return service.rank(this.client.getEndpoint(), body, accept, context);
    }

    /**
     * Post multi-slot Rank.
     *
     * <p>Submit a Personalizer multi-slot rank request. Receives a context, a list of actions, and a list of slots.
     * Returns which of the provided actions should be used in each slot, in each rewardActionId.
     *
     * @param body A Personalizer multi-slot Rank request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MultiSlotRankResponse> rankAsync(MultiSlotRankRequest body) {
        return rankWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Post multi-slot Rank.
     *
     * <p>Submit a Personalizer multi-slot rank request. Receives a context, a list of actions, and a list of slots.
     * Returns which of the provided actions should be used in each slot, in each rewardActionId.
     *
     * @param body A Personalizer multi-slot Rank request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MultiSlotRankResponse> rankAsync(MultiSlotRankRequest body, Context context) {
        return rankWithResponseAsync(body, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Post multi-slot Rank.
     *
     * <p>Submit a Personalizer multi-slot rank request. Receives a context, a list of actions, and a list of slots.
     * Returns which of the provided actions should be used in each slot, in each rewardActionId.
     *
     * @param body A Personalizer multi-slot Rank request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MultiSlotRankResponse rank(MultiSlotRankRequest body) {
        return rankAsync(body).block();
    }

    /**
     * Post multi-slot Rank.
     *
     * <p>Submit a Personalizer multi-slot rank request. Receives a context, a list of actions, and a list of slots.
     * Returns which of the provided actions should be used in each slot, in each rewardActionId.
     *
     * @param body A Personalizer multi-slot Rank request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MultiSlotRankResponse> rankWithResponse(MultiSlotRankRequest body, Context context) {
        return rankWithResponseAsync(body, context).block();
    }
}
