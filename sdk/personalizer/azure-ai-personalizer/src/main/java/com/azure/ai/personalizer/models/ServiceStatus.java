// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServiceStatus model. */
@Fluent
public final class ServiceStatus {
    /*
     * The service property.
     */
    @JsonProperty(value = "service")
    private String service;

    /*
     * The apiStatus property.
     */
    @JsonProperty(value = "apiStatus")
    private String apiStatus;

    /*
     * The apiStatusMessage property.
     */
    @JsonProperty(value = "apiStatusMessage")
    private String apiStatusMessage;

    /**
     * Get the service property: The service property.
     *
     * @return the service value.
     */
    public String getService() {
        return this.service;
    }

    /**
     * Set the service property: The service property.
     *
     * @param service the service value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the apiStatus property: The apiStatus property.
     *
     * @return the apiStatus value.
     */
    public String getApiStatus() {
        return this.apiStatus;
    }

    /**
     * Set the apiStatus property: The apiStatus property.
     *
     * @param apiStatus the apiStatus value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }

    /**
     * Get the apiStatusMessage property: The apiStatusMessage property.
     *
     * @return the apiStatusMessage value.
     */
    public String getApiStatusMessage() {
        return this.apiStatusMessage;
    }

    /**
     * Set the apiStatusMessage property: The apiStatusMessage property.
     *
     * @param apiStatusMessage the apiStatusMessage value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus setApiStatusMessage(String apiStatusMessage) {
        this.apiStatusMessage = apiStatusMessage;
        return this;
    }
}
