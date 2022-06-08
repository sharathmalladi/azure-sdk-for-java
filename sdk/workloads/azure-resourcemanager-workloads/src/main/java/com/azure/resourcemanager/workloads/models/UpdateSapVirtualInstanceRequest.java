// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Defines the request body for updating Virtual Instance for SAP. */
@Fluent
public final class UpdateSapVirtualInstanceRequest {
    /*
     * Gets or sets the Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Managed service identity (user assigned identities)
     */
    @JsonProperty(value = "identity")
    private UserAssignedServiceIdentity identity;

    /**
     * Get the tags property: Gets or sets the Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the Resource tags.
     *
     * @param tags the tags value to set.
     * @return the UpdateSapVirtualInstanceRequest object itself.
     */
    public UpdateSapVirtualInstanceRequest withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Managed service identity (user assigned identities).
     *
     * @return the identity value.
     */
    public UserAssignedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (user assigned identities).
     *
     * @param identity the identity value to set.
     * @return the UpdateSapVirtualInstanceRequest object itself.
     */
    public UpdateSapVirtualInstanceRequest withIdentity(UserAssignedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
