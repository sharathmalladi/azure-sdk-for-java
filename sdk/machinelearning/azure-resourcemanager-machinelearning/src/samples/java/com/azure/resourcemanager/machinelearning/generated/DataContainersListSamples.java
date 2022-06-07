// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for DataContainers List. */
public final class DataContainersListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/DataContainer/list.json
     */
    /**
     * Sample code: List Data Container.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listDataContainer(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.dataContainers().list("testrg123", "workspace123", null, null, Context.NONE);
    }
}
