// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Resource requests/limits for this instance type. */
@Fluent
public final class InstanceTypeSchemaResources {
    /*
     * Resource requests for this instance type
     */
    @JsonProperty(value = "requests")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> requests;

    /*
     * Resource limits for this instance type
     */
    @JsonProperty(value = "limits")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> limits;

    /**
     * Get the requests property: Resource requests for this instance type.
     *
     * @return the requests value.
     */
    public Map<String, String> requests() {
        return this.requests;
    }

    /**
     * Set the requests property: Resource requests for this instance type.
     *
     * @param requests the requests value to set.
     * @return the InstanceTypeSchemaResources object itself.
     */
    public InstanceTypeSchemaResources withRequests(Map<String, String> requests) {
        this.requests = requests;
        return this;
    }

    /**
     * Get the limits property: Resource limits for this instance type.
     *
     * @return the limits value.
     */
    public Map<String, String> limits() {
        return this.limits;
    }

    /**
     * Set the limits property: Resource limits for this instance type.
     *
     * @param limits the limits value to set.
     * @return the InstanceTypeSchemaResources object itself.
     */
    public InstanceTypeSchemaResources withLimits(Map<String, String> limits) {
        this.limits = limits;
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
