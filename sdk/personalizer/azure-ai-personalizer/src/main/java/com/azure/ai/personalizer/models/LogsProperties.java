// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Immutable;

/** Properties related to data used to train the model. */
@Immutable
public final class LogsProperties {
    /*
     * Date range.
     */
    private LogsPropertiesDateRange dateRange;

    /**
     * Get the dateRange property: Date range.
     *
     * @return the dateRange value.
     */
    public LogsPropertiesDateRange getDateRange() {
        return this.dateRange;
    }
}
