// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Office365 account. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Office365Table")
@JsonFlatten
@Fluent
public class Office365Dataset extends Dataset {
    /*
     * Name of the dataset to extract from Office 365. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName", required = true)
    private Object tableName;

    /*
     * A predicate expression that can be used to filter the specific rows to
     * extract from Office 365. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.predicate")
    private Object predicate;

    /**
     * Get the tableName property: Name of the dataset to extract from Office 365. Type: string (or Expression with
     * resultType string).
     *
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: Name of the dataset to extract from Office 365. Type: string (or Expression with
     * resultType string).
     *
     * @param tableName the tableName value to set.
     * @return the Office365Dataset object itself.
     */
    public Office365Dataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the predicate property: A predicate expression that can be used to filter the specific rows to extract from
     * Office 365. Type: string (or Expression with resultType string).
     *
     * @return the predicate value.
     */
    public Object getPredicate() {
        return this.predicate;
    }

    /**
     * Set the predicate property: A predicate expression that can be used to filter the specific rows to extract from
     * Office 365. Type: string (or Expression with resultType string).
     *
     * @param predicate the predicate value to set.
     * @return the Office365Dataset object itself.
     */
    public Office365Dataset setPredicate(Object predicate) {
        this.predicate = predicate;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365Dataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365Dataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365Dataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365Dataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365Dataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365Dataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Office365Dataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
