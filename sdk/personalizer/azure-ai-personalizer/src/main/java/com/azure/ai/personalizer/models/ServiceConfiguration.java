// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** The configuration of the service. */
@Fluent
public final class ServiceConfiguration {
    /*
     * The time span waited until a request is marked with the default reward
     * and should be between 5 seconds and 2 days.
     * For example, PT5M (5 mins). For information about the time format,
     * see http://en.wikipedia.org/wiki/ISO_8601#Durations
     */
    @JsonProperty(value = "rewardWaitTime", required = true)
    private Duration rewardWaitTime;

    /*
     * The reward given if a reward is not received within the specified wait
     * time.
     */
    @JsonProperty(value = "defaultReward", required = true)
    private float defaultReward;

    /*
     * The function used to process rewards, if multiple reward scores are
     * received before rewardWaitTime is over.
     */
    @JsonProperty(value = "rewardAggregation", required = true)
    private String rewardAggregation;

    /*
     * The percentage of rank responses that will use exploration.
     */
    @JsonProperty(value = "explorationPercentage", required = true)
    private float explorationPercentage;

    /*
     * Personalizer will start using the most updated trained model for online
     * ranks automatically every specified time period.
     * For example, PT5M (5 mins). For information about the time format,
     * see http://en.wikipedia.org/wiki/ISO_8601#Durations
     */
    @JsonProperty(value = "modelExportFrequency", required = true)
    private Duration modelExportFrequency;

    /*
     * Flag indicates whether log mirroring is enabled.
     */
    @JsonProperty(value = "logMirrorEnabled")
    private Boolean logMirrorEnabled;

    /*
     * Azure storage account container SAS URI for log mirroring.
     */
    @JsonProperty(value = "logMirrorSasUri")
    private String logMirrorSasUri;

    /*
     * Number of days historical logs are to be maintained. -1 implies the logs
     * will never be deleted.
     */
    @JsonProperty(value = "logRetentionDays", required = true)
    private int logRetentionDays;

    /*
     * Last time model training configuration was updated
     */
    @JsonProperty(value = "lastConfigurationEditDate")
    private OffsetDateTime lastConfigurationEditDate;

    /*
     * Learning Modes for Personalizer
     */
    @JsonProperty(value = "learningMode")
    private LearningMode learningMode;

    /*
     * Flag indicating whether Personalizer will automatically optimize
     * Learning Settings by running Offline Evaluations periodically.
     */
    @JsonProperty(value = "isAutoOptimizationEnabled")
    private Boolean isAutoOptimizationEnabled;

    /*
     * Frequency of automatic optimization. Only relevant if
     * IsAutoOptimizationEnabled is true.
     * For example, PT5M (5 mins). For information about the time format,
     * \r\nsee http://en.wikipedia.org/wiki/ISO_8601#Durations
     */
    @JsonProperty(value = "autoOptimizationFrequency")
    private Duration autoOptimizationFrequency;

    /*
     * Date when the first automatic optimization evaluation must be performed.
     * Only relevant if IsAutoOptimizationEnabled is true.
     */
    @JsonProperty(value = "autoOptimizationStartDate")
    private OffsetDateTime autoOptimizationStartDate;

    /**
     * Get the rewardWaitTime property: The time span waited until a request is marked with the default reward and
     * should be between 5 seconds and 2 days. For example, PT5M (5 mins). For information about the time format, see
     * http://en.wikipedia.org/wiki/ISO_8601#Durations.
     *
     * @return the rewardWaitTime value.
     */
    public Duration getRewardWaitTime() {
        return this.rewardWaitTime;
    }

    /**
     * Set the rewardWaitTime property: The time span waited until a request is marked with the default reward and
     * should be between 5 seconds and 2 days. For example, PT5M (5 mins). For information about the time format, see
     * http://en.wikipedia.org/wiki/ISO_8601#Durations.
     *
     * @param rewardWaitTime the rewardWaitTime value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setRewardWaitTime(Duration rewardWaitTime) {
        this.rewardWaitTime = rewardWaitTime;
        return this;
    }

    /**
     * Get the defaultReward property: The reward given if a reward is not received within the specified wait time.
     *
     * @return the defaultReward value.
     */
    public float getDefaultReward() {
        return this.defaultReward;
    }

    /**
     * Set the defaultReward property: The reward given if a reward is not received within the specified wait time.
     *
     * @param defaultReward the defaultReward value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setDefaultReward(float defaultReward) {
        this.defaultReward = defaultReward;
        return this;
    }

    /**
     * Get the rewardAggregation property: The function used to process rewards, if multiple reward scores are received
     * before rewardWaitTime is over.
     *
     * @return the rewardAggregation value.
     */
    public String getRewardAggregation() {
        return this.rewardAggregation;
    }

    /**
     * Set the rewardAggregation property: The function used to process rewards, if multiple reward scores are received
     * before rewardWaitTime is over.
     *
     * @param rewardAggregation the rewardAggregation value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setRewardAggregation(String rewardAggregation) {
        this.rewardAggregation = rewardAggregation;
        return this;
    }

    /**
     * Get the explorationPercentage property: The percentage of rank responses that will use exploration.
     *
     * @return the explorationPercentage value.
     */
    public float getExplorationPercentage() {
        return this.explorationPercentage;
    }

    /**
     * Set the explorationPercentage property: The percentage of rank responses that will use exploration.
     *
     * @param explorationPercentage the explorationPercentage value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setExplorationPercentage(float explorationPercentage) {
        this.explorationPercentage = explorationPercentage;
        return this;
    }

    /**
     * Get the modelExportFrequency property: Personalizer will start using the most updated trained model for online
     * ranks automatically every specified time period. For example, PT5M (5 mins). For information about the time
     * format, see http://en.wikipedia.org/wiki/ISO_8601#Durations.
     *
     * @return the modelExportFrequency value.
     */
    public Duration getModelExportFrequency() {
        return this.modelExportFrequency;
    }

    /**
     * Set the modelExportFrequency property: Personalizer will start using the most updated trained model for online
     * ranks automatically every specified time period. For example, PT5M (5 mins). For information about the time
     * format, see http://en.wikipedia.org/wiki/ISO_8601#Durations.
     *
     * @param modelExportFrequency the modelExportFrequency value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setModelExportFrequency(Duration modelExportFrequency) {
        this.modelExportFrequency = modelExportFrequency;
        return this;
    }

    /**
     * Get the logMirrorEnabled property: Flag indicates whether log mirroring is enabled.
     *
     * @return the logMirrorEnabled value.
     */
    public Boolean isLogMirrorEnabled() {
        return this.logMirrorEnabled;
    }

    /**
     * Set the logMirrorEnabled property: Flag indicates whether log mirroring is enabled.
     *
     * @param logMirrorEnabled the logMirrorEnabled value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setLogMirrorEnabled(Boolean logMirrorEnabled) {
        this.logMirrorEnabled = logMirrorEnabled;
        return this;
    }

    /**
     * Get the logMirrorSasUri property: Azure storage account container SAS URI for log mirroring.
     *
     * @return the logMirrorSasUri value.
     */
    public String getLogMirrorSasUri() {
        return this.logMirrorSasUri;
    }

    /**
     * Set the logMirrorSasUri property: Azure storage account container SAS URI for log mirroring.
     *
     * @param logMirrorSasUri the logMirrorSasUri value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setLogMirrorSasUri(String logMirrorSasUri) {
        this.logMirrorSasUri = logMirrorSasUri;
        return this;
    }

    /**
     * Get the logRetentionDays property: Number of days historical logs are to be maintained. -1 implies the logs will
     * never be deleted.
     *
     * @return the logRetentionDays value.
     */
    public int getLogRetentionDays() {
        return this.logRetentionDays;
    }

    /**
     * Set the logRetentionDays property: Number of days historical logs are to be maintained. -1 implies the logs will
     * never be deleted.
     *
     * @param logRetentionDays the logRetentionDays value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setLogRetentionDays(int logRetentionDays) {
        this.logRetentionDays = logRetentionDays;
        return this;
    }

    /**
     * Get the lastConfigurationEditDate property: Last time model training configuration was updated.
     *
     * @return the lastConfigurationEditDate value.
     */
    public OffsetDateTime getLastConfigurationEditDate() {
        return this.lastConfigurationEditDate;
    }

    /**
     * Set the lastConfigurationEditDate property: Last time model training configuration was updated.
     *
     * @param lastConfigurationEditDate the lastConfigurationEditDate value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setLastConfigurationEditDate(OffsetDateTime lastConfigurationEditDate) {
        this.lastConfigurationEditDate = lastConfigurationEditDate;
        return this;
    }

    /**
     * Get the learningMode property: Learning Modes for Personalizer.
     *
     * @return the learningMode value.
     */
    public LearningMode getLearningMode() {
        return this.learningMode;
    }

    /**
     * Set the learningMode property: Learning Modes for Personalizer.
     *
     * @param learningMode the learningMode value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setLearningMode(LearningMode learningMode) {
        this.learningMode = learningMode;
        return this;
    }

    /**
     * Get the isAutoOptimizationEnabled property: Flag indicating whether Personalizer will automatically optimize
     * Learning Settings by running Offline Evaluations periodically.
     *
     * @return the isAutoOptimizationEnabled value.
     */
    public Boolean isAutoOptimizationEnabled() {
        return this.isAutoOptimizationEnabled;
    }

    /**
     * Set the isAutoOptimizationEnabled property: Flag indicating whether Personalizer will automatically optimize
     * Learning Settings by running Offline Evaluations periodically.
     *
     * @param isAutoOptimizationEnabled the isAutoOptimizationEnabled value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setIsAutoOptimizationEnabled(Boolean isAutoOptimizationEnabled) {
        this.isAutoOptimizationEnabled = isAutoOptimizationEnabled;
        return this;
    }

    /**
     * Get the autoOptimizationFrequency property: Frequency of automatic optimization. Only relevant if
     * IsAutoOptimizationEnabled is true. For example, PT5M (5 mins). For information about the time format, \r\nsee
     * http://en.wikipedia.org/wiki/ISO_8601#Durations.
     *
     * @return the autoOptimizationFrequency value.
     */
    public Duration getAutoOptimizationFrequency() {
        return this.autoOptimizationFrequency;
    }

    /**
     * Set the autoOptimizationFrequency property: Frequency of automatic optimization. Only relevant if
     * IsAutoOptimizationEnabled is true. For example, PT5M (5 mins). For information about the time format, \r\nsee
     * http://en.wikipedia.org/wiki/ISO_8601#Durations.
     *
     * @param autoOptimizationFrequency the autoOptimizationFrequency value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setAutoOptimizationFrequency(Duration autoOptimizationFrequency) {
        this.autoOptimizationFrequency = autoOptimizationFrequency;
        return this;
    }

    /**
     * Get the autoOptimizationStartDate property: Date when the first automatic optimization evaluation must be
     * performed. Only relevant if IsAutoOptimizationEnabled is true.
     *
     * @return the autoOptimizationStartDate value.
     */
    public OffsetDateTime getAutoOptimizationStartDate() {
        return this.autoOptimizationStartDate;
    }

    /**
     * Set the autoOptimizationStartDate property: Date when the first automatic optimization evaluation must be
     * performed. Only relevant if IsAutoOptimizationEnabled is true.
     *
     * @param autoOptimizationStartDate the autoOptimizationStartDate value to set.
     * @return the ServiceConfiguration object itself.
     */
    public ServiceConfiguration setAutoOptimizationStartDate(OffsetDateTime autoOptimizationStartDate) {
        this.autoOptimizationStartDate = autoOptimizationStartDate;
        return this;
    }
}
