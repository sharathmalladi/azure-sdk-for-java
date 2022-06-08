// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.Context;

/** Samples for CommitmentTiers List. */
public final class CommitmentTiersListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2022-03-01/examples/ListCommitmentTiers.json
     */
    /**
     * Sample code: ListCommitmentTiers.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void listCommitmentTiers(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.commitmentTiers().list("location", Context.NONE);
    }
}
