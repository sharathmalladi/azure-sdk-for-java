// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ArcSettings properties. */
@Fluent
public final class ArcSettingsPatchProperties {
    /*
     * contains connectivity related configuration for ARC resources
     */
    @JsonProperty(value = "connectivityProperties")
    private Object connectivityProperties;

    /**
     * Get the connectivityProperties property: contains connectivity related configuration for ARC resources.
     *
     * @return the connectivityProperties value.
     */
    public Object connectivityProperties() {
        return this.connectivityProperties;
    }

    /**
     * Set the connectivityProperties property: contains connectivity related configuration for ARC resources.
     *
     * @param connectivityProperties the connectivityProperties value to set.
     * @return the ArcSettingsPatchProperties object itself.
     */
    public ArcSettingsPatchProperties withConnectivityProperties(Object connectivityProperties) {
        this.connectivityProperties = connectivityProperties;
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
