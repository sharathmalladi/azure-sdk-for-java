// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for BuildService ListSupportedStacks. */
public final class BuildServiceListSupportedStacksSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-04-01/examples/BuildService_ListSupportedStacks.json
     */
    /**
     * Sample code: BuildService_ListSupportedStacks.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceListSupportedStacks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getBuildServices()
            .listSupportedStacksWithResponse("myResourceGroup", "myservice", "default", Context.NONE);
    }
}
