// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.synapse.models.ColumnDataType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A Sql pool column resource. */
@Fluent
public final class SqlPoolColumnInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SqlPoolColumnProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SqlPoolColumnProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the columnType property: The column data type.
     *
     * @return the columnType value.
     */
    public ColumnDataType columnType() {
        return this.innerProperties() == null ? null : this.innerProperties().columnType();
    }

    /**
     * Set the columnType property: The column data type.
     *
     * @param columnType the columnType value to set.
     * @return the SqlPoolColumnInner object itself.
     */
    public SqlPoolColumnInner withColumnType(ColumnDataType columnType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlPoolColumnProperties();
        }
        this.innerProperties().withColumnType(columnType);
        return this;
    }

    /**
     * Get the isComputed property: Indicates whether column value is computed or not.
     *
     * @return the isComputed value.
     */
    public Boolean isComputed() {
        return this.innerProperties() == null ? null : this.innerProperties().isComputed();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
