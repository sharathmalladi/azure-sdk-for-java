// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.models.DataMoveLevel;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrepareDataMoveRequest;

/** Samples for ResourceProvider BmsPrepareDataMove. */
public final class ResourceProviderBmsPrepareDataMoveSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2022-02-01/examples/BackupDataMove/PrepareDataMove_Post.json
     */
    /**
     * Sample code: Prepare Data Move.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void prepareDataMove(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .resourceProviders()
            .bmsPrepareDataMove(
                "source-rsv",
                "sourceRG",
                new PrepareDataMoveRequest()
                    .withTargetResourceId(
                        "/subscriptions/04cf684a-d41f-4550-9f70-7708a3a2283b/resourceGroups/targetRG/providers/Microsoft.RecoveryServices/vaults/target-rsv")
                    .withTargetRegion("USGov Virginia")
                    .withDataMoveLevel(DataMoveLevel.VAULT),
                Context.NONE);
    }
}
