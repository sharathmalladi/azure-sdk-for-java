// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventSubscriptionStatus. */
public final class EventSubscriptionStatus extends ExpandableStringEnum<EventSubscriptionStatus> {
    /** Static value Enabled for EventSubscriptionStatus. */
    public static final EventSubscriptionStatus ENABLED = fromString("Enabled");

    /** Static value Provisioning for EventSubscriptionStatus. */
    public static final EventSubscriptionStatus PROVISIONING = fromString("Provisioning");

    /** Static value Deprovisioning for EventSubscriptionStatus. */
    public static final EventSubscriptionStatus DEPROVISIONING = fromString("Deprovisioning");

    /** Static value Disabled for EventSubscriptionStatus. */
    public static final EventSubscriptionStatus DISABLED = fromString("Disabled");

    /** Static value Unknown for EventSubscriptionStatus. */
    public static final EventSubscriptionStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a EventSubscriptionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventSubscriptionStatus.
     */
    @JsonCreator
    public static EventSubscriptionStatus fromString(String name) {
        return fromString(name, EventSubscriptionStatus.class);
    }

    /**
     * Gets known EventSubscriptionStatus values.
     *
     * @return known EventSubscriptionStatus values.
     */
    public static Collection<EventSubscriptionStatus> values() {
        return values(EventSubscriptionStatus.class);
    }
}
