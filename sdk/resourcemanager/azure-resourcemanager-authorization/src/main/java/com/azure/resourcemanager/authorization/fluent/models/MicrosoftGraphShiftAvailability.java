// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** shiftAvailability. */
@Fluent
public final class MicrosoftGraphShiftAvailability {
    /*
     * patternedRecurrence
     */
    @JsonProperty(value = "recurrence")
    private MicrosoftGraphPatternedRecurrence recurrence;

    /*
     * The time slot(s) preferred by the user.
     */
    @JsonProperty(value = "timeSlots")
    private List<MicrosoftGraphTimeRange> timeSlots;

    /*
     * Specifies the time zone for the indicated time.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * shiftAvailability
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the recurrence property: patternedRecurrence.
     *
     * @return the recurrence value.
     */
    public MicrosoftGraphPatternedRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: patternedRecurrence.
     *
     * @param recurrence the recurrence value to set.
     * @return the MicrosoftGraphShiftAvailability object itself.
     */
    public MicrosoftGraphShiftAvailability withRecurrence(MicrosoftGraphPatternedRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Get the timeSlots property: The time slot(s) preferred by the user.
     *
     * @return the timeSlots value.
     */
    public List<MicrosoftGraphTimeRange> timeSlots() {
        return this.timeSlots;
    }

    /**
     * Set the timeSlots property: The time slot(s) preferred by the user.
     *
     * @param timeSlots the timeSlots value to set.
     * @return the MicrosoftGraphShiftAvailability object itself.
     */
    public MicrosoftGraphShiftAvailability withTimeSlots(List<MicrosoftGraphTimeRange> timeSlots) {
        this.timeSlots = timeSlots;
        return this;
    }

    /**
     * Get the timeZone property: Specifies the time zone for the indicated time.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Specifies the time zone for the indicated time.
     *
     * @param timeZone the timeZone value to set.
     * @return the MicrosoftGraphShiftAvailability object itself.
     */
    public MicrosoftGraphShiftAvailability withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the additionalProperties property: shiftAvailability.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: shiftAvailability.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphShiftAvailability object itself.
     */
    public MicrosoftGraphShiftAvailability withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recurrence() != null) {
            recurrence().validate();
        }
        if (timeSlots() != null) {
            timeSlots().forEach(e -> e.validate());
        }
    }
}
