// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure data lake store write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreWriteSettings")
@Fluent
public final class AzureDataLakeStoreWriteSettings extends StoreWriteSettings {
    /*
     * Specifies the expiry time of the written files. The time is applied to
     * the UTC time zone in the format of "2018-12-01T05:00:00Z". Default value
     * is NULL. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "expiryDateTime")
    private Object expiryDateTime;

    /**
     * Get the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: integer (or Expression with
     * resultType integer).
     *
     * @return the expiryDateTime value.
     */
    public Object getExpiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Set the expiryDateTime property: Specifies the expiry time of the written files. The time is applied to the UTC
     * time zone in the format of "2018-12-01T05:00:00Z". Default value is NULL. Type: integer (or Expression with
     * resultType integer).
     *
     * @param expiryDateTime the expiryDateTime value to set.
     * @return the AzureDataLakeStoreWriteSettings object itself.
     */
    public AzureDataLakeStoreWriteSettings setExpiryDateTime(Object expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreWriteSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreWriteSettings setCopyBehavior(Object copyBehavior) {
        super.setCopyBehavior(copyBehavior);
        return this;
    }
}
