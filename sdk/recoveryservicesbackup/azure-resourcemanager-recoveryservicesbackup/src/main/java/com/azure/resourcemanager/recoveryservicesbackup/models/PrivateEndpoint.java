// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Private Endpoint network resource that is linked to the Private Endpoint connection. */
@Fluent
public final class PrivateEndpoint {
    /*
     * Gets or sets id
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: Gets or sets id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Gets or sets id.
     *
     * @param id the id value to set.
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
