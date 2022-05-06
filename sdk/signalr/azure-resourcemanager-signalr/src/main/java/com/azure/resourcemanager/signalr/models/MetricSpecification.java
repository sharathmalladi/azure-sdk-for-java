// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifications of the Metrics for Azure Monitoring. */
@Fluent
public final class MetricSpecification {
    /*
     * Name of the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized friendly display name of the metric.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Localized friendly description of the metric.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /*
     * The unit that makes sense for the metric.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Only provide one value for this field. Valid values: Average, Minimum,
     * Maximum, Total, Count.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /*
     * Optional. If set to true, then zero will be returned for time duration
     * where no metric is emitted/published.
     * Ex. a metric that returns the number of times a particular error code
     * was emitted. The error code may not appear
     * often, instead of the RP publishing 0, Shoebox can auto fill in 0s for
     * time periods where nothing was emitted.
     */
    @JsonProperty(value = "fillGapWithZero")
    private String fillGapWithZero;

    /*
     * The name of the metric category that the metric belongs to. A metric can
     * only belong to a single category.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The dimensions of the metrics.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /**
     * Get the name property: Name of the metric.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the metric.
     *
     * @param name the name value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized friendly display name of the metric.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized friendly display name of the metric.
     *
     * @param displayName the displayName value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: Localized friendly description of the metric.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Localized friendly description of the metric.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: The unit that makes sense for the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit that makes sense for the metric.
     *
     * @param unit the unit value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: Only provide one value for this field. Valid values: Average, Minimum, Maximum,
     * Total, Count.
     *
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: Only provide one value for this field. Valid values: Average, Minimum, Maximum,
     * Total, Count.
     *
     * @param aggregationType the aggregationType value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the fillGapWithZero property: Optional. If set to true, then zero will be returned for time duration where no
     * metric is emitted/published. Ex. a metric that returns the number of times a particular error code was emitted.
     * The error code may not appear often, instead of the RP publishing 0, Shoebox can auto fill in 0s for time periods
     * where nothing was emitted.
     *
     * @return the fillGapWithZero value.
     */
    public String fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero property: Optional. If set to true, then zero will be returned for time duration where no
     * metric is emitted/published. Ex. a metric that returns the number of times a particular error code was emitted.
     * The error code may not appear often, instead of the RP publishing 0, Shoebox can auto fill in 0s for time periods
     * where nothing was emitted.
     *
     * @param fillGapWithZero the fillGapWithZero value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(String fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the category property: The name of the metric category that the metric belongs to. A metric can only belong
     * to a single category.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The name of the metric category that the metric belongs to. A metric can only belong
     * to a single category.
     *
     * @param category the category value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the dimensions property: The dimensions of the metrics.
     *
     * @return the dimensions value.
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: The dimensions of the metrics.
     *
     * @param dimensions the dimensions value to set.
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }
}
