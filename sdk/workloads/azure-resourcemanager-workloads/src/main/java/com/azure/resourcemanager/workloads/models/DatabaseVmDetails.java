// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Database VM Details. */
@Immutable
public final class DatabaseVmDetails {
    /*
     * The virtualMachineId property.
     */
    @JsonProperty(value = "virtualMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualMachineId;

    /*
     * Defines the SAP Instance status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private SapVirtualInstanceStatus status;

    /**
     * Get the virtualMachineId property: The virtualMachineId property.
     *
     * @return the virtualMachineId value.
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Get the status property: Defines the SAP Instance status.
     *
     * @return the status value.
     */
    public SapVirtualInstanceStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
