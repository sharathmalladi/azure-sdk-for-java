// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Learning settings specifying how to train the model. */
@Fluent
public final class PolicyContract {
    /*
     * Name of the learning settings.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Arguments of the learning settings.
     */
    @JsonProperty(value = "arguments", required = true)
    private String arguments;

    /**
     * Get the name property: Name of the learning settings.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the learning settings.
     *
     * @param name the name value to set.
     * @return the PolicyContract object itself.
     */
    public PolicyContract setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the arguments property: Arguments of the learning settings.
     *
     * @return the arguments value.
     */
    public String getArguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: Arguments of the learning settings.
     *
     * @param arguments the arguments value to set.
     * @return the PolicyContract object itself.
     */
    public PolicyContract setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
}
