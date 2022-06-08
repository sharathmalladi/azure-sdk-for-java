// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines ConvertToManagedDisks. */
public final class VirtualMachinesConvertToManagedDisksSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ConvertToManagedDisks_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_ConvertToManagedDisks_MinimumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachinesConvertToManagedDisksMinimumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .convertToManagedDisks("rgcompute", "aaaaaaaaaaa", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/virtualMachineExamples/VirtualMachines_ConvertToManagedDisks_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachines_ConvertToManagedDisks_MaximumSet_Gen.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualMachinesConvertToManagedDisksMaximumSetGen(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .convertToManagedDisks("rgcompute", "aaaaaaa", Context.NONE);
    }
}
