// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the error happened when create or update an image template. */
@Fluent
public final class ProvisioningError {
    /*
     * Error code of the provisioning failure
     */
    @JsonProperty(value = "provisioningErrorCode")
    private ProvisioningErrorCode provisioningErrorCode;

    /*
     * Verbose error message about the provisioning failure
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the provisioningErrorCode property: Error code of the provisioning failure.
     *
     * @return the provisioningErrorCode value.
     */
    public ProvisioningErrorCode provisioningErrorCode() {
        return this.provisioningErrorCode;
    }

    /**
     * Set the provisioningErrorCode property: Error code of the provisioning failure.
     *
     * @param provisioningErrorCode the provisioningErrorCode value to set.
     * @return the ProvisioningError object itself.
     */
    public ProvisioningError withProvisioningErrorCode(ProvisioningErrorCode provisioningErrorCode) {
        this.provisioningErrorCode = provisioningErrorCode;
        return this;
    }

    /**
     * Get the message property: Verbose error message about the provisioning failure.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Verbose error message about the provisioning failure.
     *
     * @param message the message value to set.
     * @return the ProvisioningError object itself.
     */
    public ProvisioningError withMessage(String message) {
        this.message = message;
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
