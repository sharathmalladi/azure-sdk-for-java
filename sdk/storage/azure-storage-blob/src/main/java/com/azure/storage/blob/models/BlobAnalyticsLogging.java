// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Azure Analytics Logging settings. */
@JacksonXmlRootElement(localName = "Logging")
@Fluent
public final class BlobAnalyticsLogging {
    /*
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version", required = true)
    private String version;

    /*
     * Indicates whether all delete requests should be logged.
     */
    @JsonProperty(value = "Delete", required = true)
    private boolean delete;

    /*
     * Indicates whether all read requests should be logged.
     */
    @JsonProperty(value = "Read", required = true)
    private boolean read;

    /*
     * Indicates whether all write requests should be logged.
     */
    @JsonProperty(value = "Write", required = true)
    private boolean write;

    /*
     * the retention policy which determines how long the associated data
     * should persist
     */
    @JsonProperty(value = "RetentionPolicy", required = true)
    private BlobRetentionPolicy retentionPolicy;

    /**
     * Get the version property: The version of Storage Analytics to configure.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     *
     * @param version the version value to set.
     * @return the BlobAnalyticsLogging object itself.
     */
    public BlobAnalyticsLogging setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the delete property: Indicates whether all delete requests should be logged.
     *
     * @return the delete value.
     */
    public boolean isDelete() {
        return this.delete;
    }

    /**
     * Set the delete property: Indicates whether all delete requests should be logged.
     *
     * @param delete the delete value to set.
     * @return the BlobAnalyticsLogging object itself.
     */
    public BlobAnalyticsLogging setDelete(boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Get the read property: Indicates whether all read requests should be logged.
     *
     * @return the read value.
     */
    public boolean isRead() {
        return this.read;
    }

    /**
     * Set the read property: Indicates whether all read requests should be logged.
     *
     * @param read the read value to set.
     * @return the BlobAnalyticsLogging object itself.
     */
    public BlobAnalyticsLogging setRead(boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get the write property: Indicates whether all write requests should be logged.
     *
     * @return the write value.
     */
    public boolean isWrite() {
        return this.write;
    }

    /**
     * Set the write property: Indicates whether all write requests should be logged.
     *
     * @param write the write value to set.
     * @return the BlobAnalyticsLogging object itself.
     */
    public BlobAnalyticsLogging setWrite(boolean write) {
        this.write = write;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy which determines how long the associated data should
     * persist.
     *
     * @return the retentionPolicy value.
     */
    public BlobRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy which determines how long the associated data should
     * persist.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the BlobAnalyticsLogging object itself.
     */
    public BlobAnalyticsLogging setRetentionPolicy(BlobRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
}
