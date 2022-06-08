// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.RoleEligibilityScheduleRequestInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleEligibilityScheduleRequestsClient. */
public interface RoleEligibilityScheduleRequestsClient {
    /**
     * Creates a role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility to create. It can be any valid GUID.
     * @param parameters Parameters for the role eligibility schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleEligibilityScheduleRequestInner>> createWithResponseAsync(
        String scope, String roleEligibilityScheduleRequestName, RoleEligibilityScheduleRequestInner parameters);

    /**
     * Creates a role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility to create. It can be any valid GUID.
     * @param parameters Parameters for the role eligibility schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleEligibilityScheduleRequestInner> createAsync(
        String scope, String roleEligibilityScheduleRequestName, RoleEligibilityScheduleRequestInner parameters);

    /**
     * Creates a role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility to create. It can be any valid GUID.
     * @param parameters Parameters for the role eligibility schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleEligibilityScheduleRequestInner create(
        String scope, String roleEligibilityScheduleRequestName, RoleEligibilityScheduleRequestInner parameters);

    /**
     * Creates a role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request to create. The scope can be any REST resource
     *     instance. For example, use '/subscriptions/{subscription-id}/' for a subscription,
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and
     *     '/subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}'
     *     for a resource.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility to create. It can be any valid GUID.
     * @param parameters Parameters for the role eligibility schedule request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleEligibilityScheduleRequestInner> createWithResponse(
        String scope,
        String roleEligibilityScheduleRequestName,
        RoleEligibilityScheduleRequestInner parameters,
        Context context);

    /**
     * Get the specified role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request.
     * @param roleEligibilityScheduleRequestName The name (guid) of the role eligibility schedule request to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule request along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleEligibilityScheduleRequestInner>> getWithResponseAsync(
        String scope, String roleEligibilityScheduleRequestName);

    /**
     * Get the specified role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request.
     * @param roleEligibilityScheduleRequestName The name (guid) of the role eligibility schedule request to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleEligibilityScheduleRequestInner> getAsync(String scope, String roleEligibilityScheduleRequestName);

    /**
     * Get the specified role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request.
     * @param roleEligibilityScheduleRequestName The name (guid) of the role eligibility schedule request to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleEligibilityScheduleRequestInner get(String scope, String roleEligibilityScheduleRequestName);

    /**
     * Get the specified role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility schedule request.
     * @param roleEligibilityScheduleRequestName The name (guid) of the role eligibility schedule request to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleEligibilityScheduleRequestInner> getWithResponse(
        String scope, String roleEligibilityScheduleRequestName, Context context);

    /**
     * Gets role eligibility schedule requests for a scope.
     *
     * @param scope The scope of the role eligibility schedule requests.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role eligibility schedule
     *     requests at or above the scope. Use $filter=principalId eq {id} to return all role eligibility schedule
     *     requests at, above or below the scope for the specified principal. Use $filter=asRequestor() to return all
     *     role eligibility schedule requests requested by the current user. Use $filter=asTarget() to return all role
     *     eligibility schedule requests created for the current user. Use $filter=asApprover() to return all role
     *     eligibility schedule requests where the current user is an approver.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule requests for a scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleEligibilityScheduleRequestInner> listForScopeAsync(String scope, String filter);

    /**
     * Gets role eligibility schedule requests for a scope.
     *
     * @param scope The scope of the role eligibility schedule requests.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule requests for a scope as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleEligibilityScheduleRequestInner> listForScopeAsync(String scope);

    /**
     * Gets role eligibility schedule requests for a scope.
     *
     * @param scope The scope of the role eligibility schedule requests.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule requests for a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleEligibilityScheduleRequestInner> listForScope(String scope);

    /**
     * Gets role eligibility schedule requests for a scope.
     *
     * @param scope The scope of the role eligibility schedule requests.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role eligibility schedule
     *     requests at or above the scope. Use $filter=principalId eq {id} to return all role eligibility schedule
     *     requests at, above or below the scope for the specified principal. Use $filter=asRequestor() to return all
     *     role eligibility schedule requests requested by the current user. Use $filter=asTarget() to return all role
     *     eligibility schedule requests created for the current user. Use $filter=asApprover() to return all role
     *     eligibility schedule requests where the current user is an approver.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule requests for a scope as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleEligibilityScheduleRequestInner> listForScope(String scope, String filter, Context context);

    /**
     * Cancels a pending role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to cancel.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> cancelWithResponseAsync(String scope, String roleEligibilityScheduleRequestName);

    /**
     * Cancels a pending role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to cancel.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> cancelAsync(String scope, String roleEligibilityScheduleRequestName);

    /**
     * Cancels a pending role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to cancel.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(String scope, String roleEligibilityScheduleRequestName);

    /**
     * Cancels a pending role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to cancel.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to cancel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> cancelWithResponse(String scope, String roleEligibilityScheduleRequestName, Context context);

    /**
     * Validates a new role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to validate.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to validate.
     * @param parameters Parameters for the role eligibility schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleEligibilityScheduleRequestInner>> validateWithResponseAsync(
        String scope, String roleEligibilityScheduleRequestName, RoleEligibilityScheduleRequestInner parameters);

    /**
     * Validates a new role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to validate.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to validate.
     * @param parameters Parameters for the role eligibility schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleEligibilityScheduleRequestInner> validateAsync(
        String scope, String roleEligibilityScheduleRequestName, RoleEligibilityScheduleRequestInner parameters);

    /**
     * Validates a new role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to validate.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to validate.
     * @param parameters Parameters for the role eligibility schedule request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleEligibilityScheduleRequestInner validate(
        String scope, String roleEligibilityScheduleRequestName, RoleEligibilityScheduleRequestInner parameters);

    /**
     * Validates a new role eligibility schedule request.
     *
     * @param scope The scope of the role eligibility request to validate.
     * @param roleEligibilityScheduleRequestName The name of the role eligibility request to validate.
     * @param parameters Parameters for the role eligibility schedule request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Eligibility schedule request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleEligibilityScheduleRequestInner> validateWithResponse(
        String scope,
        String roleEligibilityScheduleRequestName,
        RoleEligibilityScheduleRequestInner parameters,
        Context context);
}
