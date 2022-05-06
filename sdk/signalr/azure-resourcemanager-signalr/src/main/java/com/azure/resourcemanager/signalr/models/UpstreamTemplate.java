// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Upstream template item settings. It defines the Upstream URL of the incoming requests. The template defines the
 * pattern of the event, the hub or the category of the incoming request that matches current URL template.
 */
@Fluent
public final class UpstreamTemplate {
    /*
     * Gets or sets the matching pattern for hub names. If not set, it matches
     * any hub.
     * There are 3 kind of patterns supported:
     * 1. "*", it to matches any hub name.
     * 2. Combine multiple hubs with ",", for example "hub1,hub2", it matches
     * "hub1" and "hub2".
     * 3. The single hub name, for example, "hub1", it matches "hub1".
     */
    @JsonProperty(value = "hubPattern")
    private String hubPattern;

    /*
     * Gets or sets the matching pattern for event names. If not set, it
     * matches any event.
     * There are 3 kind of patterns supported:
     * 1. "*", it to matches any event name.
     * 2. Combine multiple events with ",", for example "connect,disconnect",
     * it matches event "connect" and "disconnect".
     * 3. The single event name, for example, "connect", it matches "connect".
     */
    @JsonProperty(value = "eventPattern")
    private String eventPattern;

    /*
     * Gets or sets the matching pattern for category names. If not set, it
     * matches any category.
     * There are 3 kind of patterns supported:
     * 1. "*", it to matches any category name.
     * 2. Combine multiple categories with ",", for example
     * "connections,messages", it matches category "connections" and
     * "messages".
     * 3. The single category name, for example, "connections", it matches the
     * category "connections".
     */
    @JsonProperty(value = "categoryPattern")
    private String categoryPattern;

    /*
     * Gets or sets the Upstream URL template. You can use 3 predefined
     * parameters {hub}, {category} {event} inside the template, the value of
     * the Upstream URL is dynamically calculated when the client request comes
     * in.
     * For example, if the urlTemplate is
     * `http://example.com/{hub}/api/{event}`, with a client request from hub
     * `chat` connects, it will first POST to this URL:
     * `http://example.com/chat/api/connect`.
     */
    @JsonProperty(value = "urlTemplate", required = true)
    private String urlTemplate;

    /*
     * Upstream auth settings. If not set, no auth is used for upstream
     * messages.
     */
    @JsonProperty(value = "auth")
    private UpstreamAuthSettings auth;

    /**
     * Get the hubPattern property: Gets or sets the matching pattern for hub names. If not set, it matches any hub.
     * There are 3 kind of patterns supported: 1. "*", it to matches any hub name. 2. Combine multiple hubs with ",",
     * for example "hub1,hub2", it matches "hub1" and "hub2". 3. The single hub name, for example, "hub1", it matches
     * "hub1".
     *
     * @return the hubPattern value.
     */
    public String hubPattern() {
        return this.hubPattern;
    }

    /**
     * Set the hubPattern property: Gets or sets the matching pattern for hub names. If not set, it matches any hub.
     * There are 3 kind of patterns supported: 1. "*", it to matches any hub name. 2. Combine multiple hubs with ",",
     * for example "hub1,hub2", it matches "hub1" and "hub2". 3. The single hub name, for example, "hub1", it matches
     * "hub1".
     *
     * @param hubPattern the hubPattern value to set.
     * @return the UpstreamTemplate object itself.
     */
    public UpstreamTemplate withHubPattern(String hubPattern) {
        this.hubPattern = hubPattern;
        return this;
    }

    /**
     * Get the eventPattern property: Gets or sets the matching pattern for event names. If not set, it matches any
     * event. There are 3 kind of patterns supported: 1. "*", it to matches any event name. 2. Combine multiple events
     * with ",", for example "connect,disconnect", it matches event "connect" and "disconnect". 3. The single event
     * name, for example, "connect", it matches "connect".
     *
     * @return the eventPattern value.
     */
    public String eventPattern() {
        return this.eventPattern;
    }

    /**
     * Set the eventPattern property: Gets or sets the matching pattern for event names. If not set, it matches any
     * event. There are 3 kind of patterns supported: 1. "*", it to matches any event name. 2. Combine multiple events
     * with ",", for example "connect,disconnect", it matches event "connect" and "disconnect". 3. The single event
     * name, for example, "connect", it matches "connect".
     *
     * @param eventPattern the eventPattern value to set.
     * @return the UpstreamTemplate object itself.
     */
    public UpstreamTemplate withEventPattern(String eventPattern) {
        this.eventPattern = eventPattern;
        return this;
    }

    /**
     * Get the categoryPattern property: Gets or sets the matching pattern for category names. If not set, it matches
     * any category. There are 3 kind of patterns supported: 1. "*", it to matches any category name. 2. Combine
     * multiple categories with ",", for example "connections,messages", it matches category "connections" and
     * "messages". 3. The single category name, for example, "connections", it matches the category "connections".
     *
     * @return the categoryPattern value.
     */
    public String categoryPattern() {
        return this.categoryPattern;
    }

    /**
     * Set the categoryPattern property: Gets or sets the matching pattern for category names. If not set, it matches
     * any category. There are 3 kind of patterns supported: 1. "*", it to matches any category name. 2. Combine
     * multiple categories with ",", for example "connections,messages", it matches category "connections" and
     * "messages". 3. The single category name, for example, "connections", it matches the category "connections".
     *
     * @param categoryPattern the categoryPattern value to set.
     * @return the UpstreamTemplate object itself.
     */
    public UpstreamTemplate withCategoryPattern(String categoryPattern) {
        this.categoryPattern = categoryPattern;
        return this;
    }

    /**
     * Get the urlTemplate property: Gets or sets the Upstream URL template. You can use 3 predefined parameters {hub},
     * {category} {event} inside the template, the value of the Upstream URL is dynamically calculated when the client
     * request comes in. For example, if the urlTemplate is `http://example.com/{hub}/api/{event}`, with a client
     * request from hub `chat` connects, it will first POST to this URL: `http://example.com/chat/api/connect`.
     *
     * @return the urlTemplate value.
     */
    public String urlTemplate() {
        return this.urlTemplate;
    }

    /**
     * Set the urlTemplate property: Gets or sets the Upstream URL template. You can use 3 predefined parameters {hub},
     * {category} {event} inside the template, the value of the Upstream URL is dynamically calculated when the client
     * request comes in. For example, if the urlTemplate is `http://example.com/{hub}/api/{event}`, with a client
     * request from hub `chat` connects, it will first POST to this URL: `http://example.com/chat/api/connect`.
     *
     * @param urlTemplate the urlTemplate value to set.
     * @return the UpstreamTemplate object itself.
     */
    public UpstreamTemplate withUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
        return this;
    }

    /**
     * Get the auth property: Upstream auth settings. If not set, no auth is used for upstream messages.
     *
     * @return the auth value.
     */
    public UpstreamAuthSettings auth() {
        return this.auth;
    }

    /**
     * Set the auth property: Upstream auth settings. If not set, no auth is used for upstream messages.
     *
     * @param auth the auth value to set.
     * @return the UpstreamTemplate object itself.
     */
    public UpstreamTemplate withAuth(UpstreamAuthSettings auth) {
        this.auth = auth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (urlTemplate() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property urlTemplate in model UpstreamTemplate"));
        }
        if (auth() != null) {
            auth().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpstreamTemplate.class);
}
