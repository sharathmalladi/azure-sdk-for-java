// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UserEngagementTracking. */
public final class UserEngagementTracking extends ExpandableStringEnum<UserEngagementTracking> {
    /** Static value Disabled for UserEngagementTracking. */
    public static final UserEngagementTracking DISABLED = fromString("Disabled");

    /** Static value Enabled for UserEngagementTracking. */
    public static final UserEngagementTracking ENABLED = fromString("Enabled");

    /**
     * Creates or finds a UserEngagementTracking from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UserEngagementTracking.
     */
    @JsonCreator
    public static UserEngagementTracking fromString(String name) {
        return fromString(name, UserEngagementTracking.class);
    }

    /**
     * Gets known UserEngagementTracking values.
     *
     * @return known UserEngagementTracking values.
     */
    public static Collection<UserEngagementTracking> values() {
        return values(UserEngagementTracking.class);
    }
}
