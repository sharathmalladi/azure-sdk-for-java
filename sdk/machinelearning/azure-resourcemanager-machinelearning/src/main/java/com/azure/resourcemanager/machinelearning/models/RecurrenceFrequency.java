// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecurrenceFrequency. */
public final class RecurrenceFrequency extends ExpandableStringEnum<RecurrenceFrequency> {
    /** Static value Minute for RecurrenceFrequency. */
    public static final RecurrenceFrequency MINUTE = fromString("Minute");

    /** Static value Hour for RecurrenceFrequency. */
    public static final RecurrenceFrequency HOUR = fromString("Hour");

    /** Static value Day for RecurrenceFrequency. */
    public static final RecurrenceFrequency DAY = fromString("Day");

    /** Static value Week for RecurrenceFrequency. */
    public static final RecurrenceFrequency WEEK = fromString("Week");

    /** Static value Month for RecurrenceFrequency. */
    public static final RecurrenceFrequency MONTH = fromString("Month");

    /**
     * Creates or finds a RecurrenceFrequency from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecurrenceFrequency.
     */
    @JsonCreator
    public static RecurrenceFrequency fromString(String name) {
        return fromString(name, RecurrenceFrequency.class);
    }

    /**
     * Gets known RecurrenceFrequency values.
     *
     * @return known RecurrenceFrequency values.
     */
    public static Collection<RecurrenceFrequency> values() {
        return values(RecurrenceFrequency.class);
    }
}
