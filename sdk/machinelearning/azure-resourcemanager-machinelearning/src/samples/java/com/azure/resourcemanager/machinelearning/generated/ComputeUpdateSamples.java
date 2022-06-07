// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.models.ComputeResource;
import com.azure.resourcemanager.machinelearning.models.ScaleSettings;
import com.azure.resourcemanager.machinelearning.models.ScaleSettingsInformation;
import java.time.Duration;

/** Samples for Compute Update. */
public final class ComputeUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Compute/patch.json
     */
    /**
     * Sample code: Update a AmlCompute Compute.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void updateAAmlComputeCompute(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        ComputeResource resource =
            manager.computes().getWithResponse("testrg123", "workspaces123", "compute123", Context.NONE).getValue();
        resource
            .update()
            .withProperties(
                new ScaleSettingsInformation()
                    .withScaleSettings(
                        new ScaleSettings()
                            .withMaxNodeCount(4)
                            .withMinNodeCount(4)
                            .withNodeIdleTimeBeforeScaleDown(Duration.parse("PT5M"))))
            .apply();
    }
}
