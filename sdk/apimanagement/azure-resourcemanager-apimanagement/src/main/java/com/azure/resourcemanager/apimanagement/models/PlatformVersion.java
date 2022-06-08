// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PlatformVersion. */
public final class PlatformVersion extends ExpandableStringEnum<PlatformVersion> {
    /** Static value undetermined for PlatformVersion. */
    public static final PlatformVersion UNDETERMINED = fromString("undetermined");

    /** Static value stv1 for PlatformVersion. */
    public static final PlatformVersion STV1 = fromString("stv1");

    /** Static value stv2 for PlatformVersion. */
    public static final PlatformVersion STV2 = fromString("stv2");

    /** Static value mtv1 for PlatformVersion. */
    public static final PlatformVersion MTV1 = fromString("mtv1");

    /**
     * Creates or finds a PlatformVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PlatformVersion.
     */
    @JsonCreator
    public static PlatformVersion fromString(String name) {
        return fromString(name, PlatformVersion.class);
    }

    /** @return known PlatformVersion values. */
    public static Collection<PlatformVersion> values() {
        return values(PlatformVersion.class);
    }
}
