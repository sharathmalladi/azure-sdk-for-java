// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DatabricksSchema model. */
@Fluent
public class DatabricksSchema {
    /*
     * Properties of Databricks
     */
    @JsonProperty(value = "properties")
    private DatabricksProperties properties;

    /**
     * Get the properties property: Properties of Databricks.
     *
     * @return the properties value.
     */
    public DatabricksProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of Databricks.
     *
     * @param properties the properties value to set.
     * @return the DatabricksSchema object itself.
     */
    public DatabricksSchema withProperties(DatabricksProperties properties) {
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
