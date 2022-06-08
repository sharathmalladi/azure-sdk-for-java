// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for TopicEventSubscriptions Get. */
public final class TopicEventSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/TopicEventSubscriptions_Get.json
     */
    /**
     * Sample code: TopicEventSubscriptions_Get.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void topicEventSubscriptionsGet(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .topicEventSubscriptions()
            .getWithResponse("examplerg", "exampleTopic1", "examplesubscription1", Context.NONE);
    }
}
