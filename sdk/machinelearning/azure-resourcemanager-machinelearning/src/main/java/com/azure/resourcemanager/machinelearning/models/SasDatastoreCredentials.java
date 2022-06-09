// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** SAS datastore credentials configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "credentialsType")
@JsonTypeName("Sas")
@Fluent
public final class SasDatastoreCredentials extends DatastoreCredentials {
    /*
     * [Required] Storage container secrets.
     */
    @JsonProperty(value = "secrets", required = true)
    private SasDatastoreSecrets secrets;

    /**
     * Get the secrets property: [Required] Storage container secrets.
     *
     * @return the secrets value.
     */
    public SasDatastoreSecrets secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: [Required] Storage container secrets.
     *
     * @param secrets the secrets value to set.
     * @return the SasDatastoreCredentials object itself.
     */
    public SasDatastoreCredentials withSecrets(SasDatastoreSecrets secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (secrets() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property secrets in model SasDatastoreCredentials"));
        } else {
            secrets().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SasDatastoreCredentials.class);
}
