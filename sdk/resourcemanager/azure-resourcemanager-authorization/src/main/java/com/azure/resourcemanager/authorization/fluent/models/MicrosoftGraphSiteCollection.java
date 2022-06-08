// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** siteCollection. */
@Fluent
public final class MicrosoftGraphSiteCollection {
    /*
     * The geographic region code for where this site collection resides.
     * Read-only.
     */
    @JsonProperty(value = "dataLocationCode")
    private String dataLocationCode;

    /*
     * The hostname for the site collection. Read-only.
     */
    @JsonProperty(value = "hostname")
    private String hostname;

    /*
     * root
     */
    @JsonProperty(value = "root")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> root;

    /*
     * siteCollection
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the dataLocationCode property: The geographic region code for where this site collection resides. Read-only.
     *
     * @return the dataLocationCode value.
     */
    public String dataLocationCode() {
        return this.dataLocationCode;
    }

    /**
     * Set the dataLocationCode property: The geographic region code for where this site collection resides. Read-only.
     *
     * @param dataLocationCode the dataLocationCode value to set.
     * @return the MicrosoftGraphSiteCollection object itself.
     */
    public MicrosoftGraphSiteCollection withDataLocationCode(String dataLocationCode) {
        this.dataLocationCode = dataLocationCode;
        return this;
    }

    /**
     * Get the hostname property: The hostname for the site collection. Read-only.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The hostname for the site collection. Read-only.
     *
     * @param hostname the hostname value to set.
     * @return the MicrosoftGraphSiteCollection object itself.
     */
    public MicrosoftGraphSiteCollection withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the root property: root.
     *
     * @return the root value.
     */
    public Map<String, Object> root() {
        return this.root;
    }

    /**
     * Set the root property: root.
     *
     * @param root the root value to set.
     * @return the MicrosoftGraphSiteCollection object itself.
     */
    public MicrosoftGraphSiteCollection withRoot(Map<String, Object> root) {
        this.root = root;
        return this;
    }

    /**
     * Get the additionalProperties property: siteCollection.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: siteCollection.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSiteCollection object itself.
     */
    public MicrosoftGraphSiteCollection withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
