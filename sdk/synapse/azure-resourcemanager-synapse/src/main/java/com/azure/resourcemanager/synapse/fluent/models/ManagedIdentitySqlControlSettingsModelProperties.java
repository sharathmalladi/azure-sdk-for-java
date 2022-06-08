// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.models.ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed Identity Sql Control Settings Sql Control Settings for workspace managed identity. */
@Fluent
public final class ManagedIdentitySqlControlSettingsModelProperties {
    /*
     * Grant sql control to managed identity
     */
    @JsonProperty(value = "grantSqlControlToManagedIdentity")
    private ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity
        grantSqlControlToManagedIdentity;

    /**
     * Get the grantSqlControlToManagedIdentity property: Grant sql control to managed identity.
     *
     * @return the grantSqlControlToManagedIdentity value.
     */
    public ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity
        grantSqlControlToManagedIdentity() {
        return this.grantSqlControlToManagedIdentity;
    }

    /**
     * Set the grantSqlControlToManagedIdentity property: Grant sql control to managed identity.
     *
     * @param grantSqlControlToManagedIdentity the grantSqlControlToManagedIdentity value to set.
     * @return the ManagedIdentitySqlControlSettingsModelProperties object itself.
     */
    public ManagedIdentitySqlControlSettingsModelProperties withGrantSqlControlToManagedIdentity(
        ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity
            grantSqlControlToManagedIdentity) {
        this.grantSqlControlToManagedIdentity = grantSqlControlToManagedIdentity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (grantSqlControlToManagedIdentity() != null) {
            grantSqlControlToManagedIdentity().validate();
        }
    }
}
