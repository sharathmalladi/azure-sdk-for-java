// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContainerAppProvisioningState. */
public final class ContainerAppProvisioningState extends ExpandableStringEnum<ContainerAppProvisioningState> {
    /** Static value InProgress for ContainerAppProvisioningState. */
    public static final ContainerAppProvisioningState IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for ContainerAppProvisioningState. */
    public static final ContainerAppProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ContainerAppProvisioningState. */
    public static final ContainerAppProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ContainerAppProvisioningState. */
    public static final ContainerAppProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a ContainerAppProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContainerAppProvisioningState.
     */
    @JsonCreator
    public static ContainerAppProvisioningState fromString(String name) {
        return fromString(name, ContainerAppProvisioningState.class);
    }

    /**
     * Gets known ContainerAppProvisioningState values.
     *
     * @return known ContainerAppProvisioningState values.
     */
    public static Collection<ContainerAppProvisioningState> values() {
        return values(ContainerAppProvisioningState.class);
    }
}
