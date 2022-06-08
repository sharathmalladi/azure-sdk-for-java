// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InstantRPAdditionalDetails model. */
@Fluent
public final class InstantRPAdditionalDetails {
    /*
     * The azureBackupRGNamePrefix property.
     */
    @JsonProperty(value = "azureBackupRGNamePrefix")
    private String azureBackupRGNamePrefix;

    /*
     * The azureBackupRGNameSuffix property.
     */
    @JsonProperty(value = "azureBackupRGNameSuffix")
    private String azureBackupRGNameSuffix;

    /**
     * Get the azureBackupRGNamePrefix property: The azureBackupRGNamePrefix property.
     *
     * @return the azureBackupRGNamePrefix value.
     */
    public String azureBackupRGNamePrefix() {
        return this.azureBackupRGNamePrefix;
    }

    /**
     * Set the azureBackupRGNamePrefix property: The azureBackupRGNamePrefix property.
     *
     * @param azureBackupRGNamePrefix the azureBackupRGNamePrefix value to set.
     * @return the InstantRPAdditionalDetails object itself.
     */
    public InstantRPAdditionalDetails withAzureBackupRGNamePrefix(String azureBackupRGNamePrefix) {
        this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
        return this;
    }

    /**
     * Get the azureBackupRGNameSuffix property: The azureBackupRGNameSuffix property.
     *
     * @return the azureBackupRGNameSuffix value.
     */
    public String azureBackupRGNameSuffix() {
        return this.azureBackupRGNameSuffix;
    }

    /**
     * Set the azureBackupRGNameSuffix property: The azureBackupRGNameSuffix property.
     *
     * @param azureBackupRGNameSuffix the azureBackupRGNameSuffix value to set.
     * @return the InstantRPAdditionalDetails object itself.
     */
    public InstantRPAdditionalDetails withAzureBackupRGNameSuffix(String azureBackupRGNameSuffix) {
        this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
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
