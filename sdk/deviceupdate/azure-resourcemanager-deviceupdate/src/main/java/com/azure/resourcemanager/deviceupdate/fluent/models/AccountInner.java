// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.deviceupdate.models.Location;
import com.azure.resourcemanager.deviceupdate.models.ManagedServiceIdentity;
import com.azure.resourcemanager.deviceupdate.models.ProvisioningState;
import com.azure.resourcemanager.deviceupdate.models.PublicNetworkAccess;
import com.azure.resourcemanager.deviceupdate.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Device Update account details. */
@Fluent
public final class AccountInner extends Resource {
    /*
     * Device Update account properties.
     */
    @JsonProperty(value = "properties")
    private AccountProperties innerProperties;

    /*
     * The type of identity used for the resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Get the innerProperties property: Device Update account properties.
     *
     * @return the innerProperties value.
     */
    private AccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The type of identity used for the resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The type of identity used for the resource.
     *
     * @param identity the identity value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the hostname property: API host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for the account.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for the account.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections associated with the account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections associated with the account.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    /**
     * Get the sku property: Device Update Sku.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: Device Update Sku.
     *
     * @param sku the sku value to set.
     * @return the AccountInner object itself.
     */
    public AccountInner withSku(Sku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccountProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the locations property: Device Update account primary and failover location details.
     *
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.innerProperties() == null ? null : this.innerProperties().locations();
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
