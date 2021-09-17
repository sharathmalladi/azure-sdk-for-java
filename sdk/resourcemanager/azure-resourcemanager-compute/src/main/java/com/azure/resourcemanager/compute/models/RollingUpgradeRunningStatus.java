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
import java.time.OffsetDateTime;

/**
 * Information about the current running state of the overall upgrade.
 */
@Immutable
public final class RollingUpgradeRunningStatus {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(RollingUpgradeRunningStatus.class);

    /*
     * Code indicating the current status of the upgrade.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeStatusCode code;

    /*
     * Start time of the upgrade.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The last action performed on the rolling upgrade.
     */
    @JsonProperty(value = "lastAction", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeActionType lastAction;

    /*
     * Last action time of the upgrade.
     */
    @JsonProperty(value = "lastActionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastActionTime;

    /**
     * Get the code property: Code indicating the current status of the
     * upgrade.
     * 
     * @return the code value.
     */
    public RollingUpgradeStatusCode code() {
        return this.code;
    }

    /**
     * Get the startTime property: Start time of the upgrade.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the lastAction property: The last action performed on the rolling
     * upgrade.
     * 
     * @return the lastAction value.
     */
    public RollingUpgradeActionType lastAction() {
        return this.lastAction;
    }

    /**
     * Get the lastActionTime property: Last action time of the upgrade.
     * 
     * @return the lastActionTime value.
     */
    public OffsetDateTime lastActionTime() {
        return this.lastActionTime;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
