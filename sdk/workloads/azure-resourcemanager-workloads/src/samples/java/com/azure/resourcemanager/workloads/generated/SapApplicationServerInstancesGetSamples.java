// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.Context;

/** Samples for SapApplicationServerInstances Get. */
public final class SapApplicationServerInstancesGetSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/preview/2021-12-01-preview/examples/sapvirtualinstances/SAPApplicationServerInstances_Get.json
     */
    /**
     * Sample code: SAPApplicationServerInstances_Get.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void sAPApplicationServerInstancesGet(com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager.sapApplicationServerInstances().getWithResponse("test-rg", "X00", "app01", Context.NONE);
    }
}
