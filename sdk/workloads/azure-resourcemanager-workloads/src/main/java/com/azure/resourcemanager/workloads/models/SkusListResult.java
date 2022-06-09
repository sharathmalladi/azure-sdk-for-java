// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.workloads.fluent.models.SkuDefinitionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of SKUs supported by an Azure Resource Provider. */
@Immutable
public final class SkusListResult {
    /*
     * List of SKUs supported by the resource provider
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuDefinitionInner> value;

    /*
     * URL to get the next set of SKU list results (if there are any).
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of SKUs supported by the resource provider.
     *
     * @return the value value.
     */
    public List<SkuDefinitionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of SKU list results (if there are any).
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
