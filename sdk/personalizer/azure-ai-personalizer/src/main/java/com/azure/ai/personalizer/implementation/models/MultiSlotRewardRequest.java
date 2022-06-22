// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Reward given to a list of slots. */
@Fluent
public final class MultiSlotRewardRequest {
    /*
     * List of SlotRewards
     */
    @JsonProperty(value = "reward", required = true)
    private List<SlotReward> reward;

    /**
     * Get the reward property: List of SlotRewards.
     *
     * @return the reward value.
     */
    public List<SlotReward> getReward() {
        return this.reward;
    }

    /**
     * Set the reward property: List of SlotRewards.
     *
     * @param reward the reward value to set.
     * @return the MultiSlotRewardRequest object itself.
     */
    public MultiSlotRewardRequest setReward(List<SlotReward> reward) {
        this.reward = reward;
        return this;
    }
}
