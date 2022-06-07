// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EnabledProtocols. */
public final class EnabledProtocols extends ExpandableStringEnum<EnabledProtocols> {
    /** Static value SMB for EnabledProtocols. */
    public static final EnabledProtocols SMB = fromString("SMB");

    /** Static value NFS for EnabledProtocols. */
    public static final EnabledProtocols NFS = fromString("NFS");

    /**
     * Creates or finds a EnabledProtocols from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnabledProtocols.
     */
    @JsonCreator
    public static EnabledProtocols fromString(String name) {
        return fromString(name, EnabledProtocols.class);
    }

    /**
     * Gets known EnabledProtocols values.
     *
     * @return known EnabledProtocols values.
     */
    public static Collection<EnabledProtocols> values() {
        return values(EnabledProtocols.class);
    }
}
