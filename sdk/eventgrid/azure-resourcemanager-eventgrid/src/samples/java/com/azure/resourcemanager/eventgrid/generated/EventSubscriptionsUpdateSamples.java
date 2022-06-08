// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.models.AzureFunctionEventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.EventHubEventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFilter;
import com.azure.resourcemanager.eventgrid.models.HybridConnectionEventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.ServiceBusQueueEventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.ServiceBusTopicEventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.StorageBlobDeadLetterDestination;
import com.azure.resourcemanager.eventgrid.models.StorageQueueEventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.WebhookEventSubscriptionDestination;
import java.util.Arrays;

/** Samples for EventSubscriptions Update. */
public final class EventSubscriptionsUpdateSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic_EventHubDestination.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic_EventHubDestination.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopicEventHubDestination(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic2",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(
                new EventHubEventSubscriptionDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.EventHub/namespaces/ContosoNamespace/eventhubs/EH1"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic_AzureFunctionDestination.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic_AzureFunctionDestination.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopicAzureFunctionDestination(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic1",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(
                new AzureFunctionEventSubscriptionDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.Web/sites/ContosoSite/funtions/ContosoFunc"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("ExamplePrefix")
                    .withSubjectEndsWith("ExampleSuffix")
                    .withIsSubjectCaseSensitive(false))
            .withDeadLetterDestination(
                new StorageBlobDeadLetterDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.Storage/storageAccounts/contosostg")
                    .withBlobContainerName("contosocontainer"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic_WebhookDestination.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic_WebhookDestination.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopicWebhookDestination(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic2",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(new WebhookEventSubscriptionDestination().withEndpointUrl("https://requestb.in/15ksip71"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic_StorageQueueDestination.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic_StorageQueueDestination.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopicStorageQueueDestination(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic1",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(
                new StorageQueueEventSubscriptionDestination()
                    .withResourceId(
                        "/subscriptions/d33c5f7a-02ea-40f4-bf52-07f17e84d6a8/resourceGroups/TestRG/providers/Microsoft.Storage/storageAccounts/contosostg")
                    .withQueueName("queue1")
                    .withQueueMessageTimeToLiveInSeconds(300L))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("ExamplePrefix")
                    .withSubjectEndsWith("ExampleSuffix")
                    .withIsSubjectCaseSensitive(false))
            .withDeadLetterDestination(
                new StorageBlobDeadLetterDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.Storage/storageAccounts/contosostg")
                    .withBlobContainerName("contosocontainer"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic_ServiceBusTopicDestination.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic_ServiceBusTopicDestination.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopicServiceBusTopicDestination(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic2",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(
                new ServiceBusTopicEventSubscriptionDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.ServiceBus/namespaces/ContosoNamespace/topics/SBT"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic_HybridConnectionDestination.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic_HybridConnectionDestination.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopicHybridConnectionDestination(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic2",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(
                new HybridConnectionEventSubscriptionDestination()
                    .withResourceId(
                        "/subscriptions/d33c5f7a-02ea-40f4-bf52-07f17e84d6a8/resourceGroups/TestRG/providers/Microsoft.Relay/namespaces/ContosoNamespace/hybridConnections/HC1"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic_ServiceBusQueueDestination.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic_ServiceBusQueueDestination.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopicServiceBusQueueDestination(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic1",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(
                new ServiceBusQueueEventSubscriptionDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.ServiceBus/namespaces/ContosoNamespace/queues/SBQ"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("ExamplePrefix")
                    .withSubjectEndsWith("ExampleSuffix")
                    .withIsSubjectCaseSensitive(false))
            .withDeadLetterDestination(
                new StorageBlobDeadLetterDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.Storage/storageAccounts/contosostg")
                    .withBlobContainerName("contosocontainer"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForCustomTopic.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForCustomTopic.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForCustomTopic(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/topics/exampletopic2",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(new WebhookEventSubscriptionDestination().withEndpointUrl("https://requestb.in/15ksip71"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForResource.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForResource.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForResource(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventHub/namespaces/examplenamespace1",
                    "examplesubscription1",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(new WebhookEventSubscriptionDestination().withEndpointUrl("https://requestb.in/15ksip71"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForResourceGroup.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForResourceGroup.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForResourceGroup(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg",
                    "examplesubscription2",
                    Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(
                new EventHubEventSubscriptionDestination()
                    .withResourceId(
                        "/subscriptions/55f3dcd4-cac7-43b4-990b-a139d62a1eb2/resourceGroups/TestRG/providers/Microsoft.EventHub/namespaces/ContosoNamespace/eventhubs/EH1"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/EventSubscriptions_UpdateForSubscription.json
     */
    /**
     * Sample code: EventSubscriptions_UpdateForSubscription.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsUpdateForSubscription(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        EventSubscription resource =
            manager
                .eventSubscriptions()
                .getWithResponse(
                    "subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4", "examplesubscription3", Context.NONE)
                .getValue();
        resource
            .update()
            .withDestination(new WebhookEventSubscriptionDestination().withEndpointUrl("https://requestb.in/15ksip71"))
            .withFilter(
                new EventSubscriptionFilter()
                    .withSubjectBeginsWith("existingPrefix")
                    .withSubjectEndsWith("newSuffix")
                    .withIsSubjectCaseSensitive(true))
            .withLabels(Arrays.asList("label1", "label2"))
            .apply();
    }
}
