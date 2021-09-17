// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.CreationData;
import com.azure.resourcemanager.compute.models.DiskState;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Disk resource properties.
 */
@Fluent
public final class DiskProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(DiskProperties.class);

    /*
     * The time when the disk was created.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /*
     * The Operating System type.
     */
    @JsonProperty(value = "osType")
    private OperatingSystemTypes osType;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "creationData", required = true)
    private CreationData creationData;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /*
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /*
     * Encryption settings collection used for Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     */
    @JsonProperty(value = "encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The disk provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The number of IOPS allowed for this disk; only settable for UltraSSD
     * disks. One operation can transfer between 4k and 256k bytes.
     */
    @JsonProperty(value = "diskIOPSReadWrite")
    private Long diskIopsReadWrite;

    /*
     * The bandwidth allowed for this disk; only settable for UltraSSD disks.
     * MBps means millions of bytes per second - MB here uses the ISO notation,
     * of powers of 10.
     */
    @JsonProperty(value = "diskMBpsReadWrite")
    private Integer diskMBpsReadWrite;

    /*
     * The state of the disk.
     */
    @JsonProperty(value = "diskState", access = JsonProperty.Access.WRITE_ONLY)
    private DiskState diskState;

    /*
     * Encryption property can be used to encrypt data at rest with customer
     * managed keys or platform managed keys.
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /**
     * Get the timeCreated property: The time when the disk was created.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the osType property: The Operating System type.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The Operating System type.
     * 
     * @param osType the osType value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the
     * Virtual Machine. Applicable to OS disks only.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the
     * Virtual Machine. Applicable to OS disks only.
     * 
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData
     * information cannot be changed after the disk has been created.
     * 
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: Disk source information. CreationData
     * information cannot be changed after the disk has been created.
     * 
     * @param creationData the creationData value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withCreationData(CreationData creationData) {
        this.creationData = creationData;
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
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this
     * field is mandatory and it indicates the size of the disk to create. If
     * this field is present for updates or creation with other options, it
     * indicates a resize. Resizes are only allowed if the disk is not attached
     * to a running VM, and can only increase the disk's size.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This
     * field is read only.
     * 
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings
     * collection used for Azure Disk Encryption, can contain multiple
     * encryption settings per disk or snapshot.
     * 
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings
     * collection used for Azure Disk Encryption, can contain multiple
     * encryption settings per disk or snapshot.
     * 
     * @param encryptionSettingsCollection the encryptionSettingsCollection
     * value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the diskIopsReadWrite property: The number of IOPS allowed for this
     * disk; only settable for UltraSSD disks. One operation can transfer
     * between 4k and 256k bytes.
     * 
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.diskIopsReadWrite;
    }

    /**
     * Set the diskIopsReadWrite property: The number of IOPS allowed for this
     * disk; only settable for UltraSSD disks. One operation can transfer
     * between 4k and 256k bytes.
     * 
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskIopsReadWrite(Long diskIopsReadWrite) {
        this.diskIopsReadWrite = diskIopsReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk;
     * only settable for UltraSSD disks. MBps means millions of bytes per
     * second - MB here uses the ISO notation, of powers of 10.
     * 
     * @return the diskMBpsReadWrite value.
     */
    public Integer diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk;
     * only settable for UltraSSD disks. MBps means millions of bytes per
     * second - MB here uses the ISO notation, of powers of 10.
     * 
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskMBpsReadWrite(Integer diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the diskState property: The state of the disk.
     * 
     * @return the diskState value.
     */
    public DiskState diskState() {
        return this.diskState;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt
     * data at rest with customer managed keys or platform managed keys.
     * 
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt
     * data at rest with customer managed keys or platform managed keys.
     * 
     * @param encryption the encryption value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (creationData() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property creationData in model DiskProperties"));
        } else {
            creationData().validate();
        }
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
