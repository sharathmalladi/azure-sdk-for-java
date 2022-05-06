// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ManagedEnvironments Delete. */
public final class ManagedEnvironmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-01-01-preview/examples/ManagedEnvironments_Delete.json
     */
    /**
     * Sample code: Delete environment by name.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteEnvironmentByName(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().delete("examplerg", "examplekenv", Context.NONE);
    }
}
