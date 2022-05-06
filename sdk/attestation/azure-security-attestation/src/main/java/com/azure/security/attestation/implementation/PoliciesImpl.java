// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.security.attestation.implementation.models.CloudErrorException;
import com.azure.security.attestation.implementation.models.PolicyResponse;
import com.azure.security.attestation.models.AttestationType;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Policies. */
public final class PoliciesImpl {
    /** The proxy service used to perform REST calls. */
    private final PoliciesService service;

    /** The service client containing this operation class. */
    private final AttestationClientImpl client;

    /**
     * Initializes an instance of PoliciesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PoliciesImpl(AttestationClientImpl client) {
        this.service = RestProxy.create(PoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AttestationClientPolicies to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{instanceUrl}")
    @ServiceInterface(name = "AttestationClientPol")
    public interface PoliciesService {
        @Get("/policies/{attestationType}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<PolicyResponse>> get(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @PathParam("attestationType") AttestationType attestationType,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/policies/{attestationType}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<PolicyResponse>> set(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @PathParam("attestationType") AttestationType attestationType,
                @BodyParam("text/plain") String newAttestationPolicy,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/policies/{attestationType}:reset")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<PolicyResponse>> reset(
                @HostParam("instanceUrl") String instanceUrl,
                @QueryParam("api-version") String apiVersion,
                @PathParam("attestationType") AttestationType attestationType,
                @BodyParam("text/plain") String policyJws,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Retrieves the current policy for an attestation type.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyResponse>> getWithResponseAsync(AttestationType attestationType, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (attestationType == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter attestationType is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.get(this.client.getInstanceUrl(), this.client.getApiVersion(), attestationType, accept, context);
    }

    /**
     * Sets the policy for a given attestation type.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @param newAttestationPolicy JWT Expressing the new policy whose body is a StoredAttestationPolicy object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyResponse>> setWithResponseAsync(
            AttestationType attestationType, String newAttestationPolicy, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (attestationType == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter attestationType is required and cannot be null."));
        }
        if (newAttestationPolicy == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter newAttestationPolicy is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.set(
                this.client.getInstanceUrl(),
                this.client.getApiVersion(),
                attestationType,
                newAttestationPolicy,
                accept,
                context);
    }

    /**
     * Resets the attestation policy for the specified tenant and reverts to the default policy.
     *
     * @param attestationType Specifies the trusted execution environment to be used to validate the evidence.
     * @param policyJws JSON Web Signature with an empty policy document.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to an attestation policy operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PolicyResponse>> resetWithResponseAsync(
            AttestationType attestationType, String policyJws, Context context) {
        if (this.client.getInstanceUrl() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getInstanceUrl() is required and cannot be null."));
        }
        if (attestationType == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter attestationType is required and cannot be null."));
        }
        if (policyJws == null) {
            return Mono.error(new IllegalArgumentException("Parameter policyJws is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.reset(
                this.client.getInstanceUrl(), this.client.getApiVersion(), attestationType, policyJws, accept, context);
    }
}
