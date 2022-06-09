// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.applicationinsights.fluent.ComponentCurrentBillingFeaturesClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentBillingFeaturesInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ComponentCurrentBillingFeaturesClient. */
public final class ComponentCurrentBillingFeaturesClientImpl implements ComponentCurrentBillingFeaturesClient {
    /** The proxy service used to perform REST calls. */
    private final ComponentCurrentBillingFeaturesService service;

    /** The service client containing this operation class. */
    private final ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of ComponentCurrentBillingFeaturesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ComponentCurrentBillingFeaturesClientImpl(ApplicationInsightsManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ComponentCurrentBillingFeaturesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApplicationInsightsManagementClientComponentCurrentBillingFeatures to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApplicationInsightsM")
    private interface ComponentCurrentBillingFeaturesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components"
                + "/{resourceName}/currentbillingfeatures")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApplicationInsightsComponentBillingFeaturesInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceName") String resourceName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/components"
                + "/{resourceName}/currentbillingfeatures")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ApplicationInsightsComponentBillingFeaturesInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceName") String resourceName,
            @BodyParam("application/json") ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentBillingFeaturesInner>> getWithResponseAsync(
        String resourceGroupName, String resourceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentBillingFeaturesInner>> getWithResponseAsync(
        String resourceGroupName, String resourceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                apiVersion,
                this.client.getSubscriptionId(),
                resourceName,
                accept,
                context);
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApplicationInsightsComponentBillingFeaturesInner> getAsync(
        String resourceGroupName, String resourceName) {
        return getWithResponseAsync(resourceGroupName, resourceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationInsightsComponentBillingFeaturesInner get(String resourceGroupName, String resourceName) {
        return getAsync(resourceGroupName, resourceName).block();
    }

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationInsightsComponentBillingFeaturesInner> getWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        return getWithResponseAsync(resourceGroupName, resourceName, context).block();
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an
     *     Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentBillingFeaturesInner>> updateWithResponseAsync(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (billingFeaturesProperties == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter billingFeaturesProperties is required and cannot be null."));
        } else {
            billingFeaturesProperties.validate();
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceName,
                            billingFeaturesProperties,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an
     *     Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInsightsComponentBillingFeaturesInner>> updateWithResponseAsync(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (billingFeaturesProperties == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter billingFeaturesProperties is required and cannot be null."));
        } else {
            billingFeaturesProperties.validate();
        }
        final String apiVersion = "2015-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                apiVersion,
                this.client.getSubscriptionId(),
                resourceName,
                billingFeaturesProperties,
                accept,
                context);
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an
     *     Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ApplicationInsightsComponentBillingFeaturesInner> updateAsync(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties) {
        return updateWithResponseAsync(resourceGroupName, resourceName, billingFeaturesProperties)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an
     *     Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationInsightsComponentBillingFeaturesInner update(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties) {
        return updateAsync(resourceGroupName, resourceName, billingFeaturesProperties).block();
    }

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an
     *     Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationInsightsComponentBillingFeaturesInner> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties,
        Context context) {
        return updateWithResponseAsync(resourceGroupName, resourceName, billingFeaturesProperties, context).block();
    }
}
