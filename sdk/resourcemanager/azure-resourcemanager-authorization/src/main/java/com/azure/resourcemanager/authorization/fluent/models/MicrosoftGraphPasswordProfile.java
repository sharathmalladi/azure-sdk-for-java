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

/** passwordProfile. */
@Fluent
public final class MicrosoftGraphPasswordProfile {
    /*
     * true if the user must change her password on the next login; otherwise
     * false.
     */
    @JsonProperty(value = "forceChangePasswordNextSignIn")
    private Boolean forceChangePasswordNextSignIn;

    /*
     * If true, at next sign-in, the user must perform a multi-factor
     * authentication (MFA) before being forced to change their password. The
     * behavior is identical to forceChangePasswordNextSignIn except that the
     * user is required to first perform a multi-factor authentication before
     * password change. After a password change, this property will be
     * automatically reset to false. If not set, default is false.
     */
    @JsonProperty(value = "forceChangePasswordNextSignInWithMfa")
    private Boolean forceChangePasswordNextSignInWithMfa;

    /*
     * The password for the user. This property is required when a user is
     * created. It can be updated, but the user will be required to change the
     * password on the next login. The password must satisfy minimum
     * requirements as specified by the user’s passwordPolicies property. By
     * default, a strong password is required.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * passwordProfile
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the forceChangePasswordNextSignIn property: true if the user must change her password on the next login;
     * otherwise false.
     *
     * @return the forceChangePasswordNextSignIn value.
     */
    public Boolean forceChangePasswordNextSignIn() {
        return this.forceChangePasswordNextSignIn;
    }

    /**
     * Set the forceChangePasswordNextSignIn property: true if the user must change her password on the next login;
     * otherwise false.
     *
     * @param forceChangePasswordNextSignIn the forceChangePasswordNextSignIn value to set.
     * @return the MicrosoftGraphPasswordProfile object itself.
     */
    public MicrosoftGraphPasswordProfile withForceChangePasswordNextSignIn(Boolean forceChangePasswordNextSignIn) {
        this.forceChangePasswordNextSignIn = forceChangePasswordNextSignIn;
        return this;
    }

    /**
     * Get the forceChangePasswordNextSignInWithMfa property: If true, at next sign-in, the user must perform a
     * multi-factor authentication (MFA) before being forced to change their password. The behavior is identical to
     * forceChangePasswordNextSignIn except that the user is required to first perform a multi-factor authentication
     * before password change. After a password change, this property will be automatically reset to false. If not set,
     * default is false.
     *
     * @return the forceChangePasswordNextSignInWithMfa value.
     */
    public Boolean forceChangePasswordNextSignInWithMfa() {
        return this.forceChangePasswordNextSignInWithMfa;
    }

    /**
     * Set the forceChangePasswordNextSignInWithMfa property: If true, at next sign-in, the user must perform a
     * multi-factor authentication (MFA) before being forced to change their password. The behavior is identical to
     * forceChangePasswordNextSignIn except that the user is required to first perform a multi-factor authentication
     * before password change. After a password change, this property will be automatically reset to false. If not set,
     * default is false.
     *
     * @param forceChangePasswordNextSignInWithMfa the forceChangePasswordNextSignInWithMfa value to set.
     * @return the MicrosoftGraphPasswordProfile object itself.
     */
    public MicrosoftGraphPasswordProfile withForceChangePasswordNextSignInWithMfa(
        Boolean forceChangePasswordNextSignInWithMfa) {
        this.forceChangePasswordNextSignInWithMfa = forceChangePasswordNextSignInWithMfa;
        return this;
    }

    /**
     * Get the password property: The password for the user. This property is required when a user is created. It can be
     * updated, but the user will be required to change the password on the next login. The password must satisfy
     * minimum requirements as specified by the user’s passwordPolicies property. By default, a strong password is
     * required.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for the user. This property is required when a user is created. It can be
     * updated, but the user will be required to change the password on the next login. The password must satisfy
     * minimum requirements as specified by the user’s passwordPolicies property. By default, a strong password is
     * required.
     *
     * @param password the password value to set.
     * @return the MicrosoftGraphPasswordProfile object itself.
     */
    public MicrosoftGraphPasswordProfile withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the additionalProperties property: passwordProfile.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: passwordProfile.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPasswordProfile object itself.
     */
    public MicrosoftGraphPasswordProfile withAdditionalProperties(Map<String, Object> additionalProperties) {
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
