// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.CreationData;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.SnapshotSku;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Snapshot resource.
 */
@Fluent
public final class SnapshotInner extends Resource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SnapshotInner.class);

    /*
     * Unused. Always Null.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /*
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or
     * Standard_ZRS.
     */
    @JsonProperty(value = "sku")
    private SnapshotSku sku;

    /*
     * Snapshot resource properties.
     */
    @JsonProperty(value = "properties")
    private SnapshotProperties innerProperties;

    /**
     * Get the managedBy property: Unused. Always Null.
     * 
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the sku property: The snapshots sku name. Can be Standard_LRS,
     * Premium_LRS, or Standard_ZRS.
     * 
     * @return the sku value.
     */
    public SnapshotSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The snapshots sku name. Can be Standard_LRS,
     * Premium_LRS, or Standard_ZRS.
     * 
     * @param sku the sku value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withSku(SnapshotSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Snapshot resource properties.
     * 
     * @return the innerProperties value.
     */
    private SnapshotProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SnapshotInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SnapshotInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the timeCreated property: The time when the disk was created.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Get the osType property: The Operating System type.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: The Operating System type.
     * 
     * @param osType the osType value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withOsType(OperatingSystemTypes osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the
     * Virtual Machine. Applicable to OS disks only.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the
     * Virtual Machine. Applicable to OS disks only.
     * 
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData
     * information cannot be changed after the disk has been created.
     * 
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.innerProperties() == null ? null : this.innerProperties().creationData();
    }

    /**
     * Set the creationData property: Disk source information. CreationData
     * information cannot be changed after the disk has been created.
     * 
     * @param creationData the creationData value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withCreationData(CreationData creationData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withCreationData(creationData);
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this
     * field is mandatory and it indicates the size of the disk to create. If
     * this field is present for updates or creation with other options, it
     * indicates a resize. Resizes are only allowed if the disk is not attached
     * to a running VM, and can only increase the disk's size.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeGB();
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this
     * field is mandatory and it indicates the size of the disk to create. If
     * this field is present for updates or creation with other options, it
     * indicates a resize. Resizes are only allowed if the disk is not attached
     * to a running VM, and can only increase the disk's size.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withDiskSizeGB(Integer diskSizeGB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withDiskSizeGB(diskSizeGB);
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This
     * field is read only.
     * 
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeBytes();
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.innerProperties() == null ? null : this.innerProperties().uniqueId();
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings
     * collection used be Azure Disk Encryption, can contain multiple
     * encryption settings per disk or snapshot.
     * 
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionSettingsCollection();
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings
     * collection used be Azure Disk Encryption, can contain multiple
     * encryption settings per disk or snapshot.
     * 
     * @param encryptionSettingsCollection the encryptionSettingsCollection
     * value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withEncryptionSettingsCollection(encryptionSettingsCollection);
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the incremental property: Whether a snapshot is incremental.
     * Incremental snapshots on the same disk occupy less space than full
     * snapshots and can be diffed.
     * 
     * @return the incremental value.
     */
    public Boolean incremental() {
        return this.innerProperties() == null ? null : this.innerProperties().incremental();
    }

    /**
     * Set the incremental property: Whether a snapshot is incremental.
     * Incremental snapshots on the same disk occupy less space than full
     * snapshots and can be diffed.
     * 
     * @param incremental the incremental value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withIncremental(Boolean incremental) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withIncremental(incremental);
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt
     * data at rest with customer managed keys or platform managed keys.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt
     * data at rest with customer managed keys or platform managed keys.
     * 
     * @param encryption the encryption value to set.
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
