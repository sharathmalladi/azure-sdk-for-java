// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The display string. */
@Fluent
public final class DedicatedHsmOperationDisplay {
    /*
     * The Resource Provider of the operation
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Operation type: Read, write, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * The object that represents the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: The Resource Provider of the operation.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The Resource Provider of the operation.
     *
     * @param provider the provider value to set.
     * @return the DedicatedHsmOperationDisplay object itself.
     */
    public DedicatedHsmOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed.
     *
     * @param resource the resource value to set.
     * @return the DedicatedHsmOperationDisplay object itself.
     */
    public DedicatedHsmOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Operation type: Read, write, delete, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation type: Read, write, delete, etc.
     *
     * @param operation the operation value to set.
     * @return the DedicatedHsmOperationDisplay object itself.
     */
    public DedicatedHsmOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: The object that represents the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The object that represents the operation.
     *
     * @param description the description value to set.
     * @return the DedicatedHsmOperationDisplay object itself.
     */
    public DedicatedHsmOperationDisplay withDescription(String description) {
        this.description = description;
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
