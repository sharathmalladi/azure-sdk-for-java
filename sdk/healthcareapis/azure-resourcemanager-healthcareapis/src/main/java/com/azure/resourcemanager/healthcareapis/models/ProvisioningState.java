// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProvisioningState. */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /** Static value Deleting for ProvisioningState. */
    public static final ProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for ProvisioningState. */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Creating for ProvisioningState. */
    public static final ProvisioningState CREATING = fromString("Creating");

    /** Static value Accepted for ProvisioningState. */
    public static final ProvisioningState ACCEPTED = fromString("Accepted");

    /** Static value Verifying for ProvisioningState. */
    public static final ProvisioningState VERIFYING = fromString("Verifying");

    /** Static value Updating for ProvisioningState. */
    public static final ProvisioningState UPDATING = fromString("Updating");

    /** Static value Failed for ProvisioningState. */
    public static final ProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ProvisioningState. */
    public static final ProvisioningState CANCELED = fromString("Canceled");

    /** Static value Deprovisioned for ProvisioningState. */
    public static final ProvisioningState DEPROVISIONED = fromString("Deprovisioned");

    /** Static value Moving for ProvisioningState. */
    public static final ProvisioningState MOVING = fromString("Moving");

    /** Static value Suspended for ProvisioningState. */
    public static final ProvisioningState SUSPENDED = fromString("Suspended");

    /** Static value Warned for ProvisioningState. */
    public static final ProvisioningState WARNED = fromString("Warned");

    /** Static value SystemMaintenance for ProvisioningState. */
    public static final ProvisioningState SYSTEM_MAINTENANCE = fromString("SystemMaintenance");

    /**
     * Creates or finds a ProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisioningState.
     */
    @JsonCreator
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /** @return known ProvisioningState values. */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
