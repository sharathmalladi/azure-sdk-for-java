// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties related to the trained model. */
@Immutable
public final class ModelProperties {
    /*
     * Creation time of the model.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Last time the model was modified.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /**
     * Get the creationTime property: Creation time of the model.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Last time the model was modified.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime getLastModifiedTime() {
        return this.lastModifiedTime;
    }
}
