// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reward given to a rank response. */
@Fluent
public final class RewardRequest {
    /*
     * Reward to be assigned to an action. Value is a float calculated by your
     * application, typically between 0 and 1, and must be between -1 and 1.
     */
    @JsonProperty(value = "value", required = true)
    private float value;

    /**
     * Get the value property: Reward to be assigned to an action. Value is a float calculated by your application,
     * typically between 0 and 1, and must be between -1 and 1.
     *
     * @return the value value.
     */
    public float getValue() {
        return this.value;
    }

    /**
     * Set the value property: Reward to be assigned to an action. Value is a float calculated by your application,
     * typically between 0 and 1, and must be between -1 and 1.
     *
     * @param value the value value to set.
     * @return the RewardRequest object itself.
     */
    public RewardRequest setValue(float value) {
        this.value = value;
        return this;
    }
}
