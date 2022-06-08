// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Disk resource creation details. */
@Fluent
public final class DiskInfo {
    /*
     * Storage type
     */
    @JsonProperty(value = "storageType", required = true)
    private DiskStorageType storageType;

    /*
     * Disk size in GB
     */
    @JsonProperty(value = "sizeInGB")
    private Long sizeInGB;

    /**
     * Get the storageType property: Storage type.
     *
     * @return the storageType value.
     */
    public DiskStorageType storageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: Storage type.
     *
     * @param storageType the storageType value to set.
     * @return the DiskInfo object itself.
     */
    public DiskInfo withStorageType(DiskStorageType storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get the sizeInGB property: Disk size in GB.
     *
     * @return the sizeInGB value.
     */
    public Long sizeInGB() {
        return this.sizeInGB;
    }

    /**
     * Set the sizeInGB property: Disk size in GB.
     *
     * @param sizeInGB the sizeInGB value to set.
     * @return the DiskInfo object itself.
     */
    public DiskInfo withSizeInGB(Long sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property storageType in model DiskInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskInfo.class);
}
