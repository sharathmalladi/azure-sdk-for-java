// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Product profile. */
@Fluent
public final class ProductContractProperties extends ProductEntityBaseParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProductContractProperties.class);

    /*
     * Product name.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /**
     * Get the displayName property: Product name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Product name.
     *
     * @param displayName the displayName value to set.
     * @return the ProductContractProperties object itself.
     */
    public ProductContractProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProductContractProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProductContractProperties withTerms(String terms) {
        super.withTerms(terms);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProductContractProperties withSubscriptionRequired(Boolean subscriptionRequired) {
        super.withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProductContractProperties withApprovalRequired(Boolean approvalRequired) {
        super.withApprovalRequired(approvalRequired);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProductContractProperties withSubscriptionsLimit(Integer subscriptionsLimit) {
        super.withSubscriptionsLimit(subscriptionsLimit);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProductContractProperties withState(ProductState state) {
        super.withState(state);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model ProductContractProperties"));
        }
    }
}
