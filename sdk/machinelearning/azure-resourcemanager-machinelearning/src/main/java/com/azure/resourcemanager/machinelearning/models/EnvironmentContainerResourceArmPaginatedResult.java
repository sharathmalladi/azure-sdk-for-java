// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentContainerDataInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paginated list of EnvironmentContainer entities. */
@Fluent
public final class EnvironmentContainerResourceArmPaginatedResult {
    /*
     * The link to the next page of EnvironmentContainer objects. If null,
     * there are no additional pages.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * An array of objects of type EnvironmentContainer.
     */
    @JsonProperty(value = "value")
    private List<EnvironmentContainerDataInner> value;

    /**
     * Get the nextLink property: The link to the next page of EnvironmentContainer objects. If null, there are no
     * additional pages.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of EnvironmentContainer objects. If null, there are no
     * additional pages.
     *
     * @param nextLink the nextLink value to set.
     * @return the EnvironmentContainerResourceArmPaginatedResult object itself.
     */
    public EnvironmentContainerResourceArmPaginatedResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: An array of objects of type EnvironmentContainer.
     *
     * @return the value value.
     */
    public List<EnvironmentContainerDataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type EnvironmentContainer.
     *
     * @param value the value value to set.
     * @return the EnvironmentContainerResourceArmPaginatedResult object itself.
     */
    public EnvironmentContainerResourceArmPaginatedResult withValue(List<EnvironmentContainerDataInner> value) {
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
