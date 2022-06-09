// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AksSchema model. */
@Fluent
public class AksSchema {
    /*
     * AKS properties
     */
    @JsonProperty(value = "properties")
    private AksSchemaProperties properties;

    /**
     * Get the properties property: AKS properties.
     *
     * @return the properties value.
     */
    public AksSchemaProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: AKS properties.
     *
     * @param properties the properties value to set.
     * @return the AksSchema object itself.
     */
    public AksSchema withProperties(AksSchemaProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
