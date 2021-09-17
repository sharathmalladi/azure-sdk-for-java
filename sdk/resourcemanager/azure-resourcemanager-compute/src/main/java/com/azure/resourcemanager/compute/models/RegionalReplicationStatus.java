// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the regional replication status.
 */
@Immutable
public final class RegionalReplicationStatus {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(RegionalReplicationStatus.class);

    /*
     * The region to which the gallery Image Version is being replicated to.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /*
     * This is the regional replication state.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationState state;

    /*
     * The details of the replication status.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /*
     * It indicates progress of the replication job.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private Integer progress;

    /**
     * Get the region property: The region to which the gallery Image Version
     * is being replicated to.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the state property: This is the regional replication state.
     * 
     * @return the state value.
     */
    public ReplicationState state() {
        return this.state;
    }

    /**
     * Get the details property: The details of the replication status.
     * 
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Get the progress property: It indicates progress of the replication job.
     * 
     * @return the progress value.
     */
    public Integer progress() {
        return this.progress;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
