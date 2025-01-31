// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** SQL Server workload type. */
public final class SqlWorkloadType extends ExpandableStringEnum<SqlWorkloadType> {
    /** Static value GENERAL for SqlWorkloadType. */
    public static final SqlWorkloadType GENERAL = fromString("GENERAL");

    /** Static value OLTP for SqlWorkloadType. */
    public static final SqlWorkloadType OLTP = fromString("OLTP");

    /** Static value DW for SqlWorkloadType. */
    public static final SqlWorkloadType DW = fromString("DW");

    /**
     * Creates or finds a SqlWorkloadType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlWorkloadType.
     */
    @JsonCreator
    public static SqlWorkloadType fromString(String name) {
        return fromString(name, SqlWorkloadType.class);
    }

    /**
     * Gets known SqlWorkloadType values.
     *
     * @return known SqlWorkloadType values.
     */
    public static Collection<SqlWorkloadType> values() {
        return values(SqlWorkloadType.class);
    }
}
