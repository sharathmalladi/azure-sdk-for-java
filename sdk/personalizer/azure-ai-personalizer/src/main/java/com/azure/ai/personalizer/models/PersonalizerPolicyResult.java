// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * This class contains the Learning Settings information and the results of the Offline Evaluation using that policy.
 */
@Immutable
public final class PersonalizerPolicyResult {
    /*
     * The name of the Learning Settings.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The arguments of the Learning Settings.
     */
    @JsonProperty(value = "arguments", access = JsonProperty.Access.WRITE_ONLY)
    private String arguments;

    /*
     * The source of the Learning Settings.
     */
    @JsonProperty(value = "policySource", access = JsonProperty.Access.WRITE_ONLY)
    private PersonalizerPolicySource policySource;

    /*
     * The aggregate results of the Offline Evaluation.
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private List<PersonalizerPolicyResultSummary> summary;

    /*
     * The aggregate total of the Offline Evaluation.
     */
    @JsonProperty(value = "totalSummary", access = JsonProperty.Access.WRITE_ONLY)
    private PersonalizerPolicyResultTotalSummary totalSummary;

    /**
     * Get the name property: The name of the Learning Settings.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the arguments property: The arguments of the Learning Settings.
     *
     * @return the arguments value.
     */
    public String getArguments() {
        return this.arguments;
    }

    /**
     * Get the policySource property: The source of the Learning Settings.
     *
     * @return the policySource value.
     */
    public PersonalizerPolicySource getPolicySource() {
        return this.policySource;
    }

    /**
     * Get the summary property: The aggregate results of the Offline Evaluation.
     *
     * @return the summary value.
     */
    public List<PersonalizerPolicyResultSummary> getSummary() {
        return this.summary;
    }

    /**
     * Get the totalSummary property: The aggregate total of the Offline Evaluation.
     *
     * @return the totalSummary value.
     */
    public PersonalizerPolicyResultTotalSummary getTotalSummary() {
        return this.totalSummary;
    }
}
