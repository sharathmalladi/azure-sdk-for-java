// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The role management policy approval rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("RoleManagementPolicyApprovalRule")
@Fluent
public final class RoleManagementPolicyApprovalRule extends RoleManagementPolicyRule {
    /*
     * The approval setting
     */
    @JsonProperty(value = "setting")
    private ApprovalSettings setting;

    /**
     * Get the setting property: The approval setting.
     *
     * @return the setting value.
     */
    public ApprovalSettings setting() {
        return this.setting;
    }

    /**
     * Set the setting property: The approval setting.
     *
     * @param setting the setting value to set.
     * @return the RoleManagementPolicyApprovalRule object itself.
     */
    public RoleManagementPolicyApprovalRule withSetting(ApprovalSettings setting) {
        this.setting = setting;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyApprovalRule withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyApprovalRule withTarget(RoleManagementPolicyRuleTarget target) {
        super.withTarget(target);
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
        if (setting() != null) {
            setting().validate();
        }
    }
}
