// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources List. */
public final class PrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/digitaltwins/resource-manager/Microsoft.DigitalTwins/preview/2021-06-30-preview/examples/PrivateLinkResourcesList_example.json
     */
    /**
     * Sample code: List private link resources for given Digital Twin.
     *
     * @param manager Entry point to AzureDigitalTwinsManager.
     */
    public static void listPrivateLinkResourcesForGivenDigitalTwin(
        com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager manager) {
        manager.privateLinkResources().listWithResponse("resRg", "myDigitalTwinsService", Context.NONE);
    }
}
