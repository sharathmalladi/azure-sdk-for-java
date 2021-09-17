// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for DiskEncryptionSetIdentityType.
 */
public final class DiskEncryptionSetIdentityType extends ExpandableStringEnum<DiskEncryptionSetIdentityType> {
    /**
     * Static value SystemAssigned for DiskEncryptionSetIdentityType.
     */
    public static final DiskEncryptionSetIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Creates or finds a DiskEncryptionSetIdentityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DiskEncryptionSetIdentityType.
     */
    @JsonCreator
    public static DiskEncryptionSetIdentityType fromString(String name) {
        return fromString(name, DiskEncryptionSetIdentityType.class);
    }

    /**
     * @return known DiskEncryptionSetIdentityType values.
     */
    public static Collection<DiskEncryptionSetIdentityType> values() {
        return values(DiskEncryptionSetIdentityType.class);
    }
}
