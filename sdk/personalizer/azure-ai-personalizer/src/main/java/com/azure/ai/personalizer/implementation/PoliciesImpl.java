// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation;

import com.azure.ai.personalizer.implementation.models.ErrorResponseException;
import com.azure.ai.personalizer.implementation.models.PolicyContract;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Policies. */
public final class PoliciesImpl {
    /** The proxy service used to perform REST calls. */
    private final PoliciesService service;

    /** The service client containing this operation class. */
    private final PersonalizerClientV1Preview3Impl client;

    /**
     * Initializes an instance of PoliciesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PoliciesImpl(PersonalizerClientV1Preview3Impl client) {
        this.service = RestProxy.create(PoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PersonalizerClientV1Preview3Policies to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{Endpoint}/personalizer/v1.1-preview.3")
    @ServiceInterface(name = "PersonalizerClientV1")
    public interface PoliciesService {
        @Get("/configurations/policy")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<PolicyContract>> get(
                @HostParam("Endpoint") String endpoint, @HeaderParam("Accept") String accept, Context context);

        @Put("/configurations/policy")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<PolicyContract>> update(
                @HostParam("Endpoint") String endpoint,
                @BodyParam("application/json") PolicyContract policy,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/configurations/policy")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<PolicyContract>> reset(
                @HostParam("Endpoint") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get the Learning Settings currently used by the Personalizer service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Learning Settings currently used by the Personalizer service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyContract>> getWithResponseAsync(Context context) {
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), accept, context);
    }

    /**
     * Update the Learning Settings that the Personalizer service will use to train models.
     *
     * @param policy The learning settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return learning settings specifying how to train the model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyContract>> updateWithResponseAsync(PolicyContract policy, Context context) {
        final String accept = "application/json";
        return service.update(this.client.getEndpoint(), policy, accept, context);
    }

    /**
     * Resets the learning settings of the Personalizer service to default.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return learning settings specifying how to train the model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyContract>> resetWithResponseAsync(Context context) {
        final String accept = "application/json";
        return service.reset(this.client.getEndpoint(), accept, context);
    }
}
