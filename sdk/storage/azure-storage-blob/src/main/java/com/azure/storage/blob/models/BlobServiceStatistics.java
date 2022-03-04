// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Statistics for the storage service. */
@JacksonXmlRootElement(localName = "StorageServiceStats")
@Fluent
public final class BlobServiceStatistics {
    /*
     * Geo-Replication information for the Secondary Storage Service
     */
    @JsonProperty(value = "GeoReplication")
    private GeoReplication geoReplication;

    /**
     * Get the geoReplication property: Geo-Replication information for the Secondary Storage Service.
     *
     * @return the geoReplication value.
     */
    public GeoReplication getGeoReplication() {
        return this.geoReplication;
    }

    /**
     * Set the geoReplication property: Geo-Replication information for the Secondary Storage Service.
     *
     * @param geoReplication the geoReplication value to set.
     * @return the BlobServiceStatistics object itself.
     */
    public BlobServiceStatistics setGeoReplication(GeoReplication geoReplication) {
        this.geoReplication = geoReplication;
        return this;
    }
}
