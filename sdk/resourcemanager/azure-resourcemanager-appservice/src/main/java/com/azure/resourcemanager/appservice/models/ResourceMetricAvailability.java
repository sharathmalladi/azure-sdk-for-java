// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metrics availability and retention. */
@Immutable
public final class ResourceMetricAvailability {
    /*
     * Time grain .
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /*
     * Retention period for the current time grain.
     */
    @JsonProperty(value = "retention", access = JsonProperty.Access.WRITE_ONLY)
    private String retention;

    /**
     * Get the timeGrain property: Time grain .
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the retention property: Retention period for the current time grain.
     *
     * @return the retention value.
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
