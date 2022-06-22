// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A counterfactual evaluation. */
@Fluent
public final class Evaluation {
    /*
     * The ID of the evaluation.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the evaluation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The start time of the evaluation.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The end time of the evaluation.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The ID of the job processing the evaluation.
     */
    @JsonProperty(value = "jobId", access = JsonProperty.Access.WRITE_ONLY)
    private String jobId;

    /*
     * The status of the job processing the evaluation.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private EvaluationJobStatus status;

    /*
     * The results of the evaluation.
     */
    @JsonProperty(value = "policyResults")
    private List<PolicyResult> policyResults;

    /*
     * Feature Importance.
     */
    @JsonProperty(value = "featureImportance")
    private List<List<String>> featureImportance;

    /*
     * Evaluation type (manual or through Automatic Optimization).
     */
    @JsonProperty(value = "evaluationType")
    private EvaluationType evaluationType;

    /*
     * Thr optimal policy.
     */
    @JsonProperty(value = "optimalPolicy")
    private String optimalPolicy;

    /*
     * Creation time.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /**
     * Get the id property: The ID of the evaluation.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name of the evaluation.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the startTime property: The start time of the evaluation.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of the evaluation.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the jobId property: The ID of the job processing the evaluation.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the status property: The status of the job processing the evaluation.
     *
     * @return the status value.
     */
    public EvaluationJobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the policyResults property: The results of the evaluation.
     *
     * @return the policyResults value.
     */
    public List<PolicyResult> getPolicyResults() {
        return this.policyResults;
    }

    /**
     * Set the policyResults property: The results of the evaluation.
     *
     * @param policyResults the policyResults value to set.
     * @return the Evaluation object itself.
     */
    public Evaluation setPolicyResults(List<PolicyResult> policyResults) {
        this.policyResults = policyResults;
        return this;
    }

    /**
     * Get the featureImportance property: Feature Importance.
     *
     * @return the featureImportance value.
     */
    public List<List<String>> getFeatureImportance() {
        return this.featureImportance;
    }

    /**
     * Set the featureImportance property: Feature Importance.
     *
     * @param featureImportance the featureImportance value to set.
     * @return the Evaluation object itself.
     */
    public Evaluation setFeatureImportance(List<List<String>> featureImportance) {
        this.featureImportance = featureImportance;
        return this;
    }

    /**
     * Get the evaluationType property: Evaluation type (manual or through Automatic Optimization).
     *
     * @return the evaluationType value.
     */
    public EvaluationType getEvaluationType() {
        return this.evaluationType;
    }

    /**
     * Set the evaluationType property: Evaluation type (manual or through Automatic Optimization).
     *
     * @param evaluationType the evaluationType value to set.
     * @return the Evaluation object itself.
     */
    public Evaluation setEvaluationType(EvaluationType evaluationType) {
        this.evaluationType = evaluationType;
        return this;
    }

    /**
     * Get the optimalPolicy property: Thr optimal policy.
     *
     * @return the optimalPolicy value.
     */
    public String getOptimalPolicy() {
        return this.optimalPolicy;
    }

    /**
     * Set the optimalPolicy property: Thr optimal policy.
     *
     * @param optimalPolicy the optimalPolicy value to set.
     * @return the Evaluation object itself.
     */
    public Evaluation setOptimalPolicy(String optimalPolicy) {
        this.optimalPolicy = optimalPolicy;
        return this;
    }

    /**
     * Get the creationTime property: Creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the Evaluation object itself.
     */
    public Evaluation setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }
}
