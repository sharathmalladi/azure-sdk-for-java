// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** uri-file data version entity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataType")
@JsonTypeName("UriFile")
@Fluent
public final class UriFileDataVersion extends DataVersionBaseDetails {
    /** {@inheritDoc} */
    @Override
    public UriFileDataVersion withDataUri(String dataUri) {
        super.withDataUri(dataUri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UriFileDataVersion withIsAnonymous(Boolean isAnonymous) {
        super.withIsAnonymous(isAnonymous);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UriFileDataVersion withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UriFileDataVersion withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UriFileDataVersion withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UriFileDataVersion withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
