// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RawCertificateData model. */
@Fluent
public final class RawCertificateData {
    /*
     * The certificates property.
     */
    @JsonProperty(value = "certificates")
    private List<String> certificates;

    /**
     * Get the certificates property: The certificates property.
     *
     * @return the certificates value.
     */
    public List<String> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: The certificates property.
     *
     * @param certificates the certificates value to set.
     * @return the RawCertificateData object itself.
     */
    public RawCertificateData withCertificates(List<String> certificates) {
        this.certificates = certificates;
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
