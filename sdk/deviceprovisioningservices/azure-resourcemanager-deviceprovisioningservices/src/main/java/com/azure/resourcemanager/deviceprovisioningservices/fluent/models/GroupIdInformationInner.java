// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceprovisioningservices.models.GroupIdInformationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The group information for creating a private endpoint on a provisioning service. */
@Fluent
public final class GroupIdInformationInner {
    /*
     * The resource identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The properties for a group information object
     */
    @JsonProperty(value = "properties", required = true)
    private GroupIdInformationProperties properties;

    /**
     * Get the id property: The resource identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties property: The properties for a group information object.
     *
     * @return the properties value.
     */
    public GroupIdInformationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties for a group information object.
     *
     * @param properties the properties value to set.
     * @return the GroupIdInformationInner object itself.
     */
    public GroupIdInformationInner withProperties(GroupIdInformationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model GroupIdInformationInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GroupIdInformationInner.class);
}
