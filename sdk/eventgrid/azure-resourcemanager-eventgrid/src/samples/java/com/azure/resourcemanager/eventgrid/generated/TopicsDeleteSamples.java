// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for Topics Delete. */
public final class TopicsDeleteSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/Topics_Delete.json
     */
    /**
     * Sample code: Topics_Delete.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void topicsDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.topics().delete("examplerg1", "exampletopic1", Context.NONE);
    }
}
