// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Command job definition. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "jobInputType",
    defaultImpl = JobInput.class)
@JsonTypeName("JobInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "MLTable", value = MLTableJobInput.class),
    @JsonSubTypes.Type(name = "CustomModel", value = CustomModelJobInput.class),
    @JsonSubTypes.Type(name = "Literal", value = LiteralJobInput.class),
    @JsonSubTypes.Type(name = "MLFlowModel", value = MLFlowModelJobInput.class),
    @JsonSubTypes.Type(name = "TritonModel", value = TritonModelJobInput.class),
    @JsonSubTypes.Type(name = "UriFile", value = UriFileJobInput.class),
    @JsonSubTypes.Type(name = "UriFolder", value = UriFolderJobInput.class)
})
@Fluent
public class JobInput {
    /*
     * Description for the input.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the description property: Description for the input.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the input.
     *
     * @param description the description value to set.
     * @return the JobInput object itself.
     */
    public JobInput withDescription(String description) {
        this.description = description;
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
