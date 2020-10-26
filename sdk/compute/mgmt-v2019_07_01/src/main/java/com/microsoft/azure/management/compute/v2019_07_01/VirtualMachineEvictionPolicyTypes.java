/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VirtualMachineEvictionPolicyTypes.
 */
public final class VirtualMachineEvictionPolicyTypes extends ExpandableStringEnum<VirtualMachineEvictionPolicyTypes> {
    /** Static value Deallocate for VirtualMachineEvictionPolicyTypes. */
    public static final VirtualMachineEvictionPolicyTypes DEALLOCATE = fromString("Deallocate");

    /** Static value Delete for VirtualMachineEvictionPolicyTypes. */
    public static final VirtualMachineEvictionPolicyTypes DELETE = fromString("Delete");

    /**
     * Creates or finds a VirtualMachineEvictionPolicyTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding VirtualMachineEvictionPolicyTypes
     */
    @JsonCreator
    public static VirtualMachineEvictionPolicyTypes fromString(String name) {
        return fromString(name, VirtualMachineEvictionPolicyTypes.class);
    }

    /**
     * @return known VirtualMachineEvictionPolicyTypes values
     */
    public static Collection<VirtualMachineEvictionPolicyTypes> values() {
        return values(VirtualMachineEvictionPolicyTypes.class);
    }
}
