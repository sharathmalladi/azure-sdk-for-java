// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Sort order for composite paths. */
public final class CompositePathSortOrder extends ExpandableStringEnum<CompositePathSortOrder> {
    /** Static value ascending for CompositePathSortOrder. */
    public static final CompositePathSortOrder ASCENDING = fromString("ascending");

    /** Static value descending for CompositePathSortOrder. */
    public static final CompositePathSortOrder DESCENDING = fromString("descending");

    /**
     * Creates or finds a CompositePathSortOrder from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CompositePathSortOrder.
     */
    @JsonCreator
    public static CompositePathSortOrder fromString(String name) {
        return fromString(name, CompositePathSortOrder.class);
    }

    /**
     * Gets known CompositePathSortOrder values.
     *
     * @return known CompositePathSortOrder values.
     */
    public static Collection<CompositePathSortOrder> values() {
        return values(CompositePathSortOrder.class);
    }
}
