// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes information on user who created this ComputeInstance. */
@Immutable
public final class ComputeInstanceCreatedBy {
    /*
     * Name of the user.
     */
    @JsonProperty(value = "userName", access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    /*
     * Uniquely identifies user' Azure Active Directory organization.
     */
    @JsonProperty(value = "userOrgId", access = JsonProperty.Access.WRITE_ONLY)
    private String userOrgId;

    /*
     * Uniquely identifies the user within his/her organization.
     */
    @JsonProperty(value = "userId", access = JsonProperty.Access.WRITE_ONLY)
    private String userId;

    /**
     * Get the username property: Name of the user.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Get the userOrgId property: Uniquely identifies user' Azure Active Directory organization.
     *
     * @return the userOrgId value.
     */
    public String userOrgId() {
        return this.userOrgId;
    }

    /**
     * Get the userId property: Uniquely identifies the user within his/her organization.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
