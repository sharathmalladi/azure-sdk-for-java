// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the corresponding partner topic of a Channel. */
@Fluent
public final class PartnerTopicInfo {
    /*
     * Azure subscription ID of the subscriber. The partner topic associated
     * with the channel will be
     * created under this Azure subscription.
     */
    @JsonProperty(value = "azureSubscriptionId")
    private String azureSubscriptionId;

    /*
     * Azure Resource Group of the subscriber. The partner topic associated
     * with the channel will be
     * created under this resource group.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * Name of the partner topic associated with the channel.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Event Type Information for the partner topic. This information is
     * provided by the publisher and can be used by the
     * subscriber to view different types of events that are published.
     */
    @JsonProperty(value = "eventTypeInfo")
    private EventTypeInfo eventTypeInfo;

    /*
     * The source information is provided by the publisher to determine the
     * scope or context from which the events
     * are originating. This information can be used by the subscriber during
     * the approval process of the
     * created partner topic.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Get the azureSubscriptionId property: Azure subscription ID of the subscriber. The partner topic associated with
     * the channel will be created under this Azure subscription.
     *
     * @return the azureSubscriptionId value.
     */
    public String azureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    /**
     * Set the azureSubscriptionId property: Azure subscription ID of the subscriber. The partner topic associated with
     * the channel will be created under this Azure subscription.
     *
     * @param azureSubscriptionId the azureSubscriptionId value to set.
     * @return the PartnerTopicInfo object itself.
     */
    public PartnerTopicInfo withAzureSubscriptionId(String azureSubscriptionId) {
        this.azureSubscriptionId = azureSubscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Azure Resource Group of the subscriber. The partner topic associated with the
     * channel will be created under this resource group.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Azure Resource Group of the subscriber. The partner topic associated with the
     * channel will be created under this resource group.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the PartnerTopicInfo object itself.
     */
    public PartnerTopicInfo withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the name property: Name of the partner topic associated with the channel.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the partner topic associated with the channel.
     *
     * @param name the name value to set.
     * @return the PartnerTopicInfo object itself.
     */
    public PartnerTopicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the eventTypeInfo property: Event Type Information for the partner topic. This information is provided by the
     * publisher and can be used by the subscriber to view different types of events that are published.
     *
     * @return the eventTypeInfo value.
     */
    public EventTypeInfo eventTypeInfo() {
        return this.eventTypeInfo;
    }

    /**
     * Set the eventTypeInfo property: Event Type Information for the partner topic. This information is provided by the
     * publisher and can be used by the subscriber to view different types of events that are published.
     *
     * @param eventTypeInfo the eventTypeInfo value to set.
     * @return the PartnerTopicInfo object itself.
     */
    public PartnerTopicInfo withEventTypeInfo(EventTypeInfo eventTypeInfo) {
        this.eventTypeInfo = eventTypeInfo;
        return this;
    }

    /**
     * Get the source property: The source information is provided by the publisher to determine the scope or context
     * from which the events are originating. This information can be used by the subscriber during the approval process
     * of the created partner topic.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: The source information is provided by the publisher to determine the scope or context
     * from which the events are originating. This information can be used by the subscriber during the approval process
     * of the created partner topic.
     *
     * @param source the source value to set.
     * @return the PartnerTopicInfo object itself.
     */
    public PartnerTopicInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (eventTypeInfo() != null) {
            eventTypeInfo().validate();
        }
    }
}
