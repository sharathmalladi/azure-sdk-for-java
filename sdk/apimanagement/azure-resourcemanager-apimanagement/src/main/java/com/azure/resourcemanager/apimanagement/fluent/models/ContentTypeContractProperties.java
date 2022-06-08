// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContentTypeContractProperties model. */
@Fluent
public final class ContentTypeContractProperties {
    /*
     * Content type identifier
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Content type name. Must be 1 to 250 characters long.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Content type description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Content type schema.
     */
    @JsonProperty(value = "schema")
    private Object schema;

    /*
     * Content type version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the id property: Content type identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Content type identifier.
     *
     * @param id the id value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Content type name. Must be 1 to 250 characters long.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Content type name. Must be 1 to 250 characters long.
     *
     * @param name the name value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Content type description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Content type description.
     *
     * @param description the description value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the schema property: Content type schema.
     *
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Content type schema.
     *
     * @param schema the schema value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the version property: Content type version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Content type version.
     *
     * @param version the version value to set.
     * @return the ContentTypeContractProperties object itself.
     */
    public ContentTypeContractProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
