// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for ProtectionContainers Refresh. */
public final class ProtectionContainersRefreshSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2022-02-01/examples/Common/RefreshContainers.json
     */
    /**
     * Sample code: Trigger Azure Vm Discovery.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void triggerAzureVmDiscovery(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .protectionContainers()
            .refreshWithResponse("NetSDKTestRsVault", "SwaggerTestRg", "Azure", null, Context.NONE);
    }
}
