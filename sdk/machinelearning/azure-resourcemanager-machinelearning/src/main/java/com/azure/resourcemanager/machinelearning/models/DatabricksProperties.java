// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Databricks. */
@Fluent
public final class DatabricksProperties {
    /*
     * Databricks access token
     */
    @JsonProperty(value = "databricksAccessToken")
    private String databricksAccessToken;

    /*
     * Workspace Url
     */
    @JsonProperty(value = "workspaceUrl")
    private String workspaceUrl;

    /**
     * Get the databricksAccessToken property: Databricks access token.
     *
     * @return the databricksAccessToken value.
     */
    public String databricksAccessToken() {
        return this.databricksAccessToken;
    }

    /**
     * Set the databricksAccessToken property: Databricks access token.
     *
     * @param databricksAccessToken the databricksAccessToken value to set.
     * @return the DatabricksProperties object itself.
     */
    public DatabricksProperties withDatabricksAccessToken(String databricksAccessToken) {
        this.databricksAccessToken = databricksAccessToken;
        return this;
    }

    /**
     * Get the workspaceUrl property: Workspace Url.
     *
     * @return the workspaceUrl value.
     */
    public String workspaceUrl() {
        return this.workspaceUrl;
    }

    /**
     * Set the workspaceUrl property: Workspace Url.
     *
     * @param workspaceUrl the workspaceUrl value to set.
     * @return the DatabricksProperties object itself.
     */
    public DatabricksProperties withWorkspaceUrl(String workspaceUrl) {
        this.workspaceUrl = workspaceUrl;
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
