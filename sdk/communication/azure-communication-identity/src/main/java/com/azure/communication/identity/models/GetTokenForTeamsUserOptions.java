// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.identity.models;

import com.azure.communication.identity.CommunicationIdentityAsyncClient;
import com.azure.communication.identity.CommunicationIdentityClient;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options class for configuring the {@link
 * CommunicationIdentityAsyncClient#getTokenForTeamsUser(GetTokenForTeamsUserOptions)} and {@link
 * CommunicationIdentityClient#getTokenForTeamsUser(GetTokenForTeamsUserOptions)} methods.
 */
@Immutable
public final class GetTokenForTeamsUserOptions {

    /*
     * Azure AD access token of a Teams User to acquire a new Communication
     * Identity access token.
     */
    @JsonProperty(value = "token", required = true)
    private String teamsUserAadToken;

    /*
     * Client ID of an Azure AD application to be verified against the appid
     * claim in the Azure AD access token.
     */
    @JsonProperty(value = "appId", required = true)
    private String clientId;

    /*
     * Object ID of an Azure AD user (Teams User) to be verified against the
     * oid claim in the Azure AD access token.
     */
    @JsonProperty(value = "userId", required = true)
    private String userObjectId;

    /**
     * Constructor of {@link GetTokenForTeamsUserOptions}.
     *
     * @param teamsUserAadToken Azure AD access token of a Teams User.
     * @param clientId Client ID of an Azure AD application to be verified against the appId claim in the Azure AD
     *     access token.
     * @param userObjectId Object ID of an Azure AD user (Teams User) to be verified against the OID claim in the Azure
     *     AD access token.
     */
    public GetTokenForTeamsUserOptions(String teamsUserAadToken, String clientId, String userObjectId) {
        this.teamsUserAadToken = teamsUserAadToken;
        this.clientId = clientId;
        this.userObjectId = userObjectId;
    }

    /**
     * Gets the Azure AD access token of a Teams User.
     *
     * @return the Azure AD access token of a Teams User.
     */
    public String getTeamsUserAadToken() {
        return this.teamsUserAadToken;
    }

    /**
     * Gets the Client ID of an Azure AD application.
     *
     * @return the Client ID of an Azure AD application.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Gets the Object ID of an Azure AD user (Teams User).
     *
     * @return the Object ID of an Azure AD user (Teams User).
     */
    public String getUserObjectId() {
        return this.userObjectId;
    }
}
