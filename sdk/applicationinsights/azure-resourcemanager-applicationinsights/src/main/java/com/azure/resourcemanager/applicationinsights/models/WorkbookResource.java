// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An azure resource object. */
@Fluent
public class WorkbookResource extends Resource {
    /*
     * Identity used for BYOS
     */
    @JsonProperty(value = "identity")
    private WorkbookResourceIdentity identity;

    /*
     * The kind of workbook. Only valid value is shared.
     */
    @JsonProperty(value = "kind")
    private WorkbookSharedTypeKind kind;

    /*
     * Resource etag
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the identity property: Identity used for BYOS.
     *
     * @return the identity value.
     */
    public WorkbookResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity used for BYOS.
     *
     * @param identity the identity value to set.
     * @return the WorkbookResource object itself.
     */
    public WorkbookResource withIdentity(WorkbookResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the kind property: The kind of workbook. Only valid value is shared.
     *
     * @return the kind value.
     */
    public WorkbookSharedTypeKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of workbook. Only valid value is shared.
     *
     * @param kind the kind value to set.
     * @return the WorkbookResource object itself.
     */
    public WorkbookResource withKind(WorkbookSharedTypeKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the etag property: Resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Resource etag.
     *
     * @param etag the etag value to set.
     * @return the WorkbookResource object itself.
     */
    public WorkbookResource withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkbookResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkbookResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
