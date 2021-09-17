// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response from generation of an SSH key pair.
 */
@Fluent
public final class SshPublicKeyGenerateKeyPairResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SshPublicKeyGenerateKeyPairResultInner.class);

    /*
     * Private key portion of the key pair used to authenticate to a virtual
     * machine through ssh. The private key is returned in RFC3447 format and
     * should be treated as a secret.
     */
    @JsonProperty(value = "privateKey", required = true)
    private String privateKey;

    /*
     * Public key portion of the key pair used to authenticate to a virtual
     * machine through ssh. The public key is in ssh-rsa format.
     */
    @JsonProperty(value = "publicKey", required = true)
    private String publicKey;

    /*
     * The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the privateKey property: Private key portion of the key pair used to
     * authenticate to a virtual machine through ssh. The private key is
     * returned in RFC3447 format and should be treated as a secret.
     * 
     * @return the privateKey value.
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: Private key portion of the key pair used to
     * authenticate to a virtual machine through ssh. The private key is
     * returned in RFC3447 format and should be treated as a secret.
     * 
     * @param privateKey the privateKey value to set.
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the publicKey property: Public key portion of the key pair used to
     * authenticate to a virtual machine through ssh. The public key is in
     * ssh-rsa format.
     * 
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: Public key portion of the key pair used to
     * authenticate to a virtual machine through ssh. The public key is in
     * ssh-rsa format.
     * 
     * @param publicKey the publicKey value to set.
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the id property: The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}.
     * 
     * @param id the id value to set.
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateKey() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property privateKey in model SshPublicKeyGenerateKeyPairResultInner"));
        }
        if (publicKey() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property publicKey in model SshPublicKeyGenerateKeyPairResultInner"));
        }
        if (id() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property id in model SshPublicKeyGenerateKeyPairResultInner"));
        }
    }
}
