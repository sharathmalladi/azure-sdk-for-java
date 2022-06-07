// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobStatus. */
public final class JobStatus extends ExpandableStringEnum<JobStatus> {
    /** Static value NotStarted for JobStatus. */
    public static final JobStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Starting for JobStatus. */
    public static final JobStatus STARTING = fromString("Starting");

    /** Static value Provisioning for JobStatus. */
    public static final JobStatus PROVISIONING = fromString("Provisioning");

    /** Static value Preparing for JobStatus. */
    public static final JobStatus PREPARING = fromString("Preparing");

    /** Static value Queued for JobStatus. */
    public static final JobStatus QUEUED = fromString("Queued");

    /** Static value Running for JobStatus. */
    public static final JobStatus RUNNING = fromString("Running");

    /** Static value Finalizing for JobStatus. */
    public static final JobStatus FINALIZING = fromString("Finalizing");

    /** Static value CancelRequested for JobStatus. */
    public static final JobStatus CANCEL_REQUESTED = fromString("CancelRequested");

    /** Static value Completed for JobStatus. */
    public static final JobStatus COMPLETED = fromString("Completed");

    /** Static value Failed for JobStatus. */
    public static final JobStatus FAILED = fromString("Failed");

    /** Static value Canceled for JobStatus. */
    public static final JobStatus CANCELED = fromString("Canceled");

    /** Static value NotResponding for JobStatus. */
    public static final JobStatus NOT_RESPONDING = fromString("NotResponding");

    /** Static value Paused for JobStatus. */
    public static final JobStatus PAUSED = fromString("Paused");

    /** Static value Unknown for JobStatus. */
    public static final JobStatus UNKNOWN = fromString("Unknown");

    /** Static value Scheduled for JobStatus. */
    public static final JobStatus SCHEDULED = fromString("Scheduled");

    /**
     * Creates or finds a JobStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobStatus.
     */
    @JsonCreator
    public static JobStatus fromString(String name) {
        return fromString(name, JobStatus.class);
    }

    /**
     * Gets known JobStatus values.
     *
     * @return known JobStatus values.
     */
    public static Collection<JobStatus> values() {
        return values(JobStatus.class);
    }
}
