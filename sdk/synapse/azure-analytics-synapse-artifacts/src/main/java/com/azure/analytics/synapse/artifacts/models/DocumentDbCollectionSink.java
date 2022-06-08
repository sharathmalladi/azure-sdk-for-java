// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Document Database Collection sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DocumentDbCollectionSink")
@Fluent
public final class DocumentDbCollectionSink extends CopySink {
    /*
     * Nested properties separator. Default is . (dot). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "nestingSeparator")
    private Object nestingSeparator;

    /*
     * Describes how to write data to Azure Cosmos DB. Type: string (or
     * Expression with resultType string). Allowed values: insert and upsert.
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /**
     * Get the nestingSeparator property: Nested properties separator. Default is . (dot). Type: string (or Expression
     * with resultType string).
     *
     * @return the nestingSeparator value.
     */
    public Object getNestingSeparator() {
        return this.nestingSeparator;
    }

    /**
     * Set the nestingSeparator property: Nested properties separator. Default is . (dot). Type: string (or Expression
     * with resultType string).
     *
     * @param nestingSeparator the nestingSeparator value to set.
     * @return the DocumentDbCollectionSink object itself.
     */
    public DocumentDbCollectionSink setNestingSeparator(Object nestingSeparator) {
        this.nestingSeparator = nestingSeparator;
        return this;
    }

    /**
     * Get the writeBehavior property: Describes how to write data to Azure Cosmos DB. Type: string (or Expression with
     * resultType string). Allowed values: insert and upsert.
     *
     * @return the writeBehavior value.
     */
    public Object getWriteBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Describes how to write data to Azure Cosmos DB. Type: string (or Expression with
     * resultType string). Allowed values: insert and upsert.
     *
     * @param writeBehavior the writeBehavior value to set.
     * @return the DocumentDbCollectionSink object itself.
     */
    public DocumentDbCollectionSink setWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DocumentDbCollectionSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
