// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ClassificationPrimaryMetrics. */
public final class ClassificationPrimaryMetrics extends ExpandableStringEnum<ClassificationPrimaryMetrics> {
    /** Static value AUCWeighted for ClassificationPrimaryMetrics. */
    public static final ClassificationPrimaryMetrics AUCWEIGHTED = fromString("AUCWeighted");

    /** Static value Accuracy for ClassificationPrimaryMetrics. */
    public static final ClassificationPrimaryMetrics ACCURACY = fromString("Accuracy");

    /** Static value NormMacroRecall for ClassificationPrimaryMetrics. */
    public static final ClassificationPrimaryMetrics NORM_MACRO_RECALL = fromString("NormMacroRecall");

    /** Static value AveragePrecisionScoreWeighted for ClassificationPrimaryMetrics. */
    public static final ClassificationPrimaryMetrics AVERAGE_PRECISION_SCORE_WEIGHTED =
        fromString("AveragePrecisionScoreWeighted");

    /** Static value PrecisionScoreWeighted for ClassificationPrimaryMetrics. */
    public static final ClassificationPrimaryMetrics PRECISION_SCORE_WEIGHTED = fromString("PrecisionScoreWeighted");

    /**
     * Creates or finds a ClassificationPrimaryMetrics from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClassificationPrimaryMetrics.
     */
    @JsonCreator
    public static ClassificationPrimaryMetrics fromString(String name) {
        return fromString(name, ClassificationPrimaryMetrics.class);
    }

    /**
     * Gets known ClassificationPrimaryMetrics values.
     *
     * @return known ClassificationPrimaryMetrics values.
     */
    public static Collection<ClassificationPrimaryMetrics> values() {
        return values(ClassificationPrimaryMetrics.class);
    }
}
