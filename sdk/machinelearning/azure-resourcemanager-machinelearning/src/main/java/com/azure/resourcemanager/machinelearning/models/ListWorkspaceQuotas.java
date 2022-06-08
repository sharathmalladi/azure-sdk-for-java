// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.machinelearning.fluent.models.ResourceQuotaInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List WorkspaceQuotasByVMFamily operation response. */
@Immutable
public final class ListWorkspaceQuotas {
    /*
     * The list of Workspace Quotas by VM Family
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceQuotaInner> value;

    /*
     * The URI to fetch the next page of workspace quota information by VM
     * Family. Call ListNext() with this to fetch the next page of Workspace
     * Quota information.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of Workspace Quotas by VM Family.
     *
     * @return the value value.
     */
    public List<ResourceQuotaInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of workspace quota information by VM Family. Call
     * ListNext() with this to fetch the next page of Workspace Quota information.
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
