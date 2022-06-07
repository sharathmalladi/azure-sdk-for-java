// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Asset output type. */
@Fluent
public class AssetJobOutput {
    /*
     * Output Asset Delivery Mode.
     */
    @JsonProperty(value = "mode")
    private OutputDeliveryMode mode;

    /*
     * Output Asset URI.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get the mode property: Output Asset Delivery Mode.
     *
     * @return the mode value.
     */
    public OutputDeliveryMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Output Asset Delivery Mode.
     *
     * @param mode the mode value to set.
     * @return the AssetJobOutput object itself.
     */
    public AssetJobOutput withMode(OutputDeliveryMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the uri property: Output Asset URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Output Asset URI.
     *
     * @param uri the uri value to set.
     * @return the AssetJobOutput object itself.
     */
    public AssetJobOutput withUri(String uri) {
        this.uri = uri;
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
