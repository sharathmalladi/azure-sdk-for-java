// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enum for setting log verbosity. */
public final class LogVerbosity extends ExpandableStringEnum<LogVerbosity> {
    /** Static value NotSet for LogVerbosity. */
    public static final LogVerbosity NOT_SET = fromString("NotSet");

    /** Static value Debug for LogVerbosity. */
    public static final LogVerbosity DEBUG = fromString("Debug");

    /** Static value Info for LogVerbosity. */
    public static final LogVerbosity INFO = fromString("Info");

    /** Static value Warning for LogVerbosity. */
    public static final LogVerbosity WARNING = fromString("Warning");

    /** Static value Error for LogVerbosity. */
    public static final LogVerbosity ERROR = fromString("Error");

    /** Static value Critical for LogVerbosity. */
    public static final LogVerbosity CRITICAL = fromString("Critical");

    /**
     * Creates or finds a LogVerbosity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LogVerbosity.
     */
    @JsonCreator
    public static LogVerbosity fromString(String name) {
        return fromString(name, LogVerbosity.class);
    }

    /**
     * Gets known LogVerbosity values.
     *
     * @return known LogVerbosity values.
     */
    public static Collection<LogVerbosity> values() {
        return values(LogVerbosity.class);
    }
}
