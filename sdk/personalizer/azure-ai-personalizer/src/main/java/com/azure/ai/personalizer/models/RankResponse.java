// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Returns which action to use as rewardActionId, and additional information about each action as a result of a Rank
 * request.
 */
@Immutable
public final class RankResponse {
    /*
     * The calculated ranking for the current request.
     */
    @JsonProperty(value = "ranking", access = JsonProperty.Access.WRITE_ONLY)
    private List<RankedAction> ranking;

    /*
     * The eventId for the round trip from request to response.
     */
    @JsonProperty(value = "eventId", access = JsonProperty.Access.WRITE_ONLY)
    private String eventId;

    /*
     * The action chosen by the Personalizer service.
     * This is the action your application should display, and for which to
     * report the reward.
     * This might not be the first found in 'ranking'.
     */
    @JsonProperty(value = "rewardActionId", access = JsonProperty.Access.WRITE_ONLY)
    private String rewardActionId;

    /**
     * Get the ranking property: The calculated ranking for the current request.
     *
     * @return the ranking value.
     */
    public List<RankedAction> getRanking() {
        return this.ranking;
    }

    /**
     * Get the eventId property: The eventId for the round trip from request to response.
     *
     * @return the eventId value.
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * Get the rewardActionId property: The action chosen by the Personalizer service. This is the action your
     * application should display, and for which to report the reward. This might not be the first found in 'ranking'.
     *
     * @return the rewardActionId value.
     */
    public String getRewardActionId() {
        return this.rewardActionId;
    }
}
