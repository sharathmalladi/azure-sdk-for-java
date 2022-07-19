// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EvaluationsCreateHeaders model. */
@Fluent
public final class EvaluationsCreateHeaders {
    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of EvaluationsCreateHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public EvaluationsCreateHeaders(HttpHeaders rawHeaders) {
        this.location = rawHeaders.getValue("Location");
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the EvaluationsCreateHeaders object itself.
     */
    public EvaluationsCreateHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}
