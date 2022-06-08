// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** scopedRoleMembership. */
@Fluent
public final class MicrosoftGraphScopedRoleMembership extends MicrosoftGraphEntity {
    /*
     * Unique identifier for the administrative unit that the directory role is
     * scoped to
     */
    @JsonProperty(value = "administrativeUnitId")
    private String administrativeUnitId;

    /*
     * Unique identifier for the directory role that the member is in.
     */
    @JsonProperty(value = "roleId")
    private String roleId;

    /*
     * identity
     */
    @JsonProperty(value = "roleMemberInfo")
    private MicrosoftGraphIdentity roleMemberInfo;

    /*
     * scopedRoleMembership
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the administrativeUnitId property: Unique identifier for the administrative unit that the directory role is
     * scoped to.
     *
     * @return the administrativeUnitId value.
     */
    public String administrativeUnitId() {
        return this.administrativeUnitId;
    }

    /**
     * Set the administrativeUnitId property: Unique identifier for the administrative unit that the directory role is
     * scoped to.
     *
     * @param administrativeUnitId the administrativeUnitId value to set.
     * @return the MicrosoftGraphScopedRoleMembership object itself.
     */
    public MicrosoftGraphScopedRoleMembership withAdministrativeUnitId(String administrativeUnitId) {
        this.administrativeUnitId = administrativeUnitId;
        return this;
    }

    /**
     * Get the roleId property: Unique identifier for the directory role that the member is in.
     *
     * @return the roleId value.
     */
    public String roleId() {
        return this.roleId;
    }

    /**
     * Set the roleId property: Unique identifier for the directory role that the member is in.
     *
     * @param roleId the roleId value to set.
     * @return the MicrosoftGraphScopedRoleMembership object itself.
     */
    public MicrosoftGraphScopedRoleMembership withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Get the roleMemberInfo property: identity.
     *
     * @return the roleMemberInfo value.
     */
    public MicrosoftGraphIdentity roleMemberInfo() {
        return this.roleMemberInfo;
    }

    /**
     * Set the roleMemberInfo property: identity.
     *
     * @param roleMemberInfo the roleMemberInfo value to set.
     * @return the MicrosoftGraphScopedRoleMembership object itself.
     */
    public MicrosoftGraphScopedRoleMembership withRoleMemberInfo(MicrosoftGraphIdentity roleMemberInfo) {
        this.roleMemberInfo = roleMemberInfo;
        return this;
    }

    /**
     * Get the additionalProperties property: scopedRoleMembership.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: scopedRoleMembership.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphScopedRoleMembership object itself.
     */
    public MicrosoftGraphScopedRoleMembership withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphScopedRoleMembership withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (roleMemberInfo() != null) {
            roleMemberInfo().validate();
        }
    }
}
