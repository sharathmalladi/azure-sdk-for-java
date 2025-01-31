// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gateway certificate authority details. */
@Fluent
public final class GatewayCertificateAuthorityContractInner extends ProxyResource {
    /*
     * Gateway certificate authority details.
     */
    @JsonProperty(value = "properties")
    private GatewayCertificateAuthorityContractProperties innerProperties;

    /**
     * Get the innerProperties property: Gateway certificate authority details.
     *
     * @return the innerProperties value.
     */
    private GatewayCertificateAuthorityContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isTrusted property: Determines whether certificate authority is trusted.
     *
     * @return the isTrusted value.
     */
    public Boolean isTrusted() {
        return this.innerProperties() == null ? null : this.innerProperties().isTrusted();
    }

    /**
     * Set the isTrusted property: Determines whether certificate authority is trusted.
     *
     * @param isTrusted the isTrusted value to set.
     * @return the GatewayCertificateAuthorityContractInner object itself.
     */
    public GatewayCertificateAuthorityContractInner withIsTrusted(Boolean isTrusted) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GatewayCertificateAuthorityContractProperties();
        }
        this.innerProperties().withIsTrusted(isTrusted);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
