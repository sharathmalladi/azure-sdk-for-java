// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** SQL pool A SQL Analytics pool. */
@JsonFlatten
@Fluent
public class SqlPool extends TrackedResource {
    /*
     * Sku SQL pool SKU
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Maximum size in bytes
     */
    @JsonProperty(value = "properties.maxSizeBytes")
    private Long maxSizeBytes;

    /*
     * Collation mode
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /*
     * Source database to create from
     */
    @JsonProperty(value = "properties.sourceDatabaseId")
    private String sourceDatabaseId;

    /*
     * Backup database to restore from
     */
    @JsonProperty(value = "properties.recoverableDatabaseId")
    private String recoverableDatabaseId;

    /*
     * Resource state
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Resource status
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /*
     * Snapshot time to restore
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private String restorePointInTime;

    /*
     * Specifies the mode of sql pool creation.
     *
     * Default: regular sql pool creation.
     *
     * PointInTimeRestore: Creates a sql pool by restoring a point in time
     * backup of an existing sql pool. sourceDatabaseId must be specified as
     * the resource ID of the existing sql pool, and restorePointInTime must be
     * specified.
     *
     * Recovery: Creates a sql pool by a geo-replicated backup.
     * sourceDatabaseId  must be specified as the recoverableDatabaseId to
     * restore.
     *
     * Restore: Creates a sql pool by restoring a backup of a deleted sql
     * pool. SourceDatabaseId should be the sql pool's original resource ID.
     * SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     */
    @JsonProperty(value = "properties.createMode")
    private CreateMode createMode;

    /*
     * Date the SQL pool was created
     */
    @JsonProperty(value = "properties.creationDate")
    private OffsetDateTime creationDate;

    /**
     * Get the sku property: Sku SQL pool SKU.
     *
     * @return the sku value.
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku SQL pool SKU.
     *
     * @param sku the sku value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the maxSizeBytes property: Maximum size in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long getMaxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes property: Maximum size in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the collation property: Collation mode.
     *
     * @return the collation value.
     */
    public String getCollation() {
        return this.collation;
    }

    /**
     * Set the collation property: Collation mode.
     *
     * @param collation the collation value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the sourceDatabaseId property: Source database to create from.
     *
     * @return the sourceDatabaseId value.
     */
    public String getSourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    /**
     * Set the sourceDatabaseId property: Source database to create from.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * Get the recoverableDatabaseId property: Backup database to restore from.
     *
     * @return the recoverableDatabaseId value.
     */
    public String getRecoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }

    /**
     * Set the recoverableDatabaseId property: Backup database to restore from.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setRecoverableDatabaseId(String recoverableDatabaseId) {
        this.recoverableDatabaseId = recoverableDatabaseId;
        return this;
    }

    /**
     * Get the provisioningState property: Resource state.
     *
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Resource state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the status property: Resource status.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Resource status.
     *
     * @param status the status value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the restorePointInTime property: Snapshot time to restore.
     *
     * @return the restorePointInTime value.
     */
    public String getRestorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime property: Snapshot time to restore.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setRestorePointInTime(String restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get the createMode property: Specifies the mode of sql pool creation.
     *
     * <p>Default: regular sql pool creation.
     *
     * <p>PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool.
     * sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be
     * specified.
     *
     * <p>Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId must be specified as the
     * recoverableDatabaseId to restore.
     *
     * <p>Restore: Creates a sql pool by restoring a backup of a deleted sql pool. SourceDatabaseId should be the sql
     * pool's original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     *
     * @return the createMode value.
     */
    public CreateMode getCreateMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Specifies the mode of sql pool creation.
     *
     * <p>Default: regular sql pool creation.
     *
     * <p>PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool.
     * sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be
     * specified.
     *
     * <p>Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId must be specified as the
     * recoverableDatabaseId to restore.
     *
     * <p>Restore: Creates a sql pool by restoring a backup of a deleted sql pool. SourceDatabaseId should be the sql
     * pool's original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     *
     * @param createMode the createMode value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the creationDate property: Date the SQL pool was created.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime getCreationDate() {
        return this.creationDate;
    }

    /**
     * Set the creationDate property: Date the SQL pool was created.
     *
     * @param creationDate the creationDate value to set.
     * @return the SqlPool object itself.
     */
    public SqlPool setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlPool setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlPool setLocation(String location) {
        super.setLocation(location);
        return this;
    }
}
