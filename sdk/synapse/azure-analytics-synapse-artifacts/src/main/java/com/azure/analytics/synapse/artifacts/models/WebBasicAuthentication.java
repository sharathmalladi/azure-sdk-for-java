// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A WebLinkedService that uses basic authentication to communicate with an HTTP endpoint. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authenticationType")
@JsonTypeName("Basic")
@Fluent
public final class WebBasicAuthentication extends WebLinkedServiceTypeProperties {
    /*
     * User name for Basic authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "username", required = true)
    private Object username;

    /*
     * The password for Basic authentication.
     */
    @JsonProperty(value = "password", required = true)
    private SecretBase password;

    /**
     * Get the username property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: User name for Basic authentication. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the WebBasicAuthentication object itself.
     */
    public WebBasicAuthentication setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password for Basic authentication.
     *
     * @param password the password value to set.
     * @return the WebBasicAuthentication object itself.
     */
    public WebBasicAuthentication setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebBasicAuthentication setUrl(Object url) {
        super.setUrl(url);
        return this;
    }
}
