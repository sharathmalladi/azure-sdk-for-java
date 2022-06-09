// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualMachineSchema model. */
@Fluent
public class VirtualMachineSchema {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineSchemaProperties properties;

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public VirtualMachineSchemaProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the VirtualMachineSchema object itself.
     */
    public VirtualMachineSchema withProperties(VirtualMachineSchemaProperties properties) {
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
