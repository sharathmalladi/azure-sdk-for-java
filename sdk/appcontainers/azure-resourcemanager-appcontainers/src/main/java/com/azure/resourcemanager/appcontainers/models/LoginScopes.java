// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration settings of the login flow, including the scopes that should be requested. */
@Fluent
public final class LoginScopes {
    /*
     * A list of the scopes that should be requested while authenticating.
     */
    @JsonProperty(value = "scopes")
    private List<String> scopes;

    /**
     * Get the scopes property: A list of the scopes that should be requested while authenticating.
     *
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A list of the scopes that should be requested while authenticating.
     *
     * @param scopes the scopes value to set.
     * @return the LoginScopes object itself.
     */
    public LoginScopes withScopes(List<String> scopes) {
        this.scopes = scopes;
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
