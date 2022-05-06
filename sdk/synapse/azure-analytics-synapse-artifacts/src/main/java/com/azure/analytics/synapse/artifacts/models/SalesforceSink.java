// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Salesforce sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceSink")
@Fluent
public final class SalesforceSink extends CopySink {
    /*
     * The write behavior for the operation. Default is Insert.
     */
    @JsonProperty(value = "writeBehavior")
    private SalesforceSinkWriteBehavior writeBehavior;

    /*
     * The name of the external ID field for upsert operation. Default value is
     * 'Id' column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "externalIdFieldName")
    private Object externalIdFieldName;

    /*
     * The flag indicating whether or not to ignore null values from input
     * dataset (except key fields) during write operation. Default value is
     * false. If set it to true, it means ADF will leave the data in the
     * destination object unchanged when doing upsert/update operation and
     * insert defined default value when doing insert operation, versus ADF
     * will update the data in the destination object to NULL when doing
     * upsert/update operation and insert NULL value when doing insert
     * operation. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "ignoreNullValues")
    private Object ignoreNullValues;

    /**
     * Get the writeBehavior property: The write behavior for the operation. Default is Insert.
     *
     * @return the writeBehavior value.
     */
    public SalesforceSinkWriteBehavior getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: The write behavior for the operation. Default is Insert.
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the SalesforceSink object itself.
     */
    public SalesforceSink setWriteBehavior(SalesforceSinkWriteBehavior writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * Get the externalIdFieldName property: The name of the external ID field for upsert operation. Default value is
     * 'Id' column. Type: string (or Expression with resultType string).
     *
     * @return the externalIdFieldName value.
     */
    public Object getExternalIdFieldName() {
        return this.externalIdFieldName;
    }

    /**
     * Set the externalIdFieldName property: The name of the external ID field for upsert operation. Default value is
     * 'Id' column. Type: string (or Expression with resultType string).
     *
     * @param externalIdFieldName the externalIdFieldName value to set.
     * @return the SalesforceSink object itself.
     */
    public SalesforceSink setExternalIdFieldName(Object externalIdFieldName) {
        this.externalIdFieldName = externalIdFieldName;
        return this;
    }

    /**
     * Get the ignoreNullValues property: The flag indicating whether or not to ignore null values from input dataset
     * (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave
     * the data in the destination object unchanged when doing upsert/update operation and insert defined default value
     * when doing insert operation, versus ADF will update the data in the destination object to NULL when doing
     * upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with
     * resultType boolean).
     *
     * @return the ignoreNullValues value.
     */
    public Object getIgnoreNullValues() {
        return this.ignoreNullValues;
    }

    /**
     * Set the ignoreNullValues property: The flag indicating whether or not to ignore null values from input dataset
     * (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave
     * the data in the destination object unchanged when doing upsert/update operation and insert defined default value
     * when doing insert operation, versus ADF will update the data in the destination object to NULL when doing
     * upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with
     * resultType boolean).
     *
     * @param ignoreNullValues the ignoreNullValues value to set.
     * @return the SalesforceSink object itself.
     */
    public SalesforceSink setIgnoreNullValues(Object ignoreNullValues) {
        this.ignoreNullValues = ignoreNullValues;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
