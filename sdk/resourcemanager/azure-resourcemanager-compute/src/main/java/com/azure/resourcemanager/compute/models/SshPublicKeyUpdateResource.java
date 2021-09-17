// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.SshPublicKeyResourceProperties;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Specifies information about the SSH public key.
 */
@Fluent
public final class SshPublicKeyUpdateResource extends UpdateResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SshPublicKeyUpdateResource.class);

    /*
     * Properties of the SSH public key.
     */
    @JsonProperty(value = "properties")
    private SshPublicKeyResourceProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of the SSH public key.
     * 
     * @return the innerProperties value.
     */
    private SshPublicKeyResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SshPublicKeyUpdateResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the publicKey property: SSH public key used to authenticate to a
     * virtual machine through ssh. If this property is not initially provided
     * when the resource is created, the publicKey property will be populated
     * when generateKeyPair is called. If the public key is provided upon
     * resource creation, the provided public key needs to be at least 2048-bit
     * and in ssh-rsa format.
     * 
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.innerProperties() == null ? null : this.innerProperties().publicKey();
    }

    /**
     * Set the publicKey property: SSH public key used to authenticate to a
     * virtual machine through ssh. If this property is not initially provided
     * when the resource is created, the publicKey property will be populated
     * when generateKeyPair is called. If the public key is provided upon
     * resource creation, the provided public key needs to be at least 2048-bit
     * and in ssh-rsa format.
     * 
     * @param publicKey the publicKey value to set.
     * @return the SshPublicKeyUpdateResource object itself.
     */
    public SshPublicKeyUpdateResource withPublicKey(String publicKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SshPublicKeyResourceProperties();
        }
        this.innerProperties().withPublicKey(publicKey);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
