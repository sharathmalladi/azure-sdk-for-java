// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The desired maximum forecast horizon in units of time-series frequency. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "mode",
    defaultImpl = ForecastHorizon.class)
@JsonTypeName("ForecastHorizon")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Auto", value = AutoForecastHorizon.class),
    @JsonSubTypes.Type(name = "Custom", value = CustomForecastHorizon.class)
})
@Immutable
public class ForecastHorizon {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
