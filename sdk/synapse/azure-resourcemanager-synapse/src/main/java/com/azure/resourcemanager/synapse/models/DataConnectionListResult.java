// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.DataConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto data connections operation response. */
@Fluent
public final class DataConnectionListResult {
    /*
     * The list of Kusto data connections.
     */
    @JsonProperty(value = "value")
    private List<DataConnectionInner> value;

    /**
     * Get the value property: The list of Kusto data connections.
     *
     * @return the value value.
     */
    public List<DataConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Kusto data connections.
     *
     * @param value the value value to set.
     * @return the DataConnectionListResult object itself.
     */
    public DataConnectionListResult withValue(List<DataConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
