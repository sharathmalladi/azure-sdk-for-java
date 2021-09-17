// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.Disallowed;
import com.azure.resourcemanager.compute.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.models.GalleryImagePropertiesProvisioningState;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.RecommendedMachineConfiguration;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Describes the properties of a gallery Image Definition.
 */
@Fluent
public final class GalleryImageProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(GalleryImageProperties.class);

    /*
     * The description of this gallery Image Definition resource. This property
     * is updatable.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The Eula agreement for the gallery Image Definition.
     */
    @JsonProperty(value = "eula")
    private String eula;

    /*
     * The privacy statement uri.
     */
    @JsonProperty(value = "privacyStatementUri")
    private String privacyStatementUri;

    /*
     * The release note uri.
     */
    @JsonProperty(value = "releaseNoteUri")
    private String releaseNoteUri;

    /*
     * This property allows you to specify the type of the OS that is included
     * in the disk when creating a VM from a managed image. <br><br> Possible
     * values are: <br><br> **Windows** <br><br> **Linux**
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemTypes osType;

    /*
     * This property allows the user to specify whether the virtual machines
     * created under this image are 'Generalized' or 'Specialized'.
     */
    @JsonProperty(value = "osState", required = true)
    private OperatingSystemStateTypes osState;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * The end of life date of the gallery Image Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     */
    @JsonProperty(value = "endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /*
     * This is the gallery Image Definition identifier.
     */
    @JsonProperty(value = "identifier", required = true)
    private GalleryImageIdentifier identifier;

    /*
     * The properties describe the recommended machine configuration for this
     * Image Definition. These properties are updatable.
     */
    @JsonProperty(value = "recommended")
    private RecommendedMachineConfiguration recommended;

    /*
     * Describes the disallowed disk types.
     */
    @JsonProperty(value = "disallowed")
    private Disallowed disallowed;

    /*
     * Describes the gallery Image Definition purchase plan. This is used by
     * marketplace images.
     */
    @JsonProperty(value = "purchasePlan")
    private ImagePurchasePlan purchasePlan;

    /*
     * The current state of the gallery Image Definition. The provisioning
     * state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryImagePropertiesProvisioningState provisioningState;

    /**
     * Get the description property: The description of this gallery Image
     * Definition resource. This property is updatable.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this gallery Image
     * Definition resource. This property is updatable.
     * 
     * @param description the description value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the eula property: The Eula agreement for the gallery Image
     * Definition.
     * 
     * @return the eula value.
     */
    public String eula() {
        return this.eula;
    }

    /**
     * Set the eula property: The Eula agreement for the gallery Image
     * Definition.
     * 
     * @param eula the eula value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withEula(String eula) {
        this.eula = eula;
        return this;
    }

    /**
     * Get the privacyStatementUri property: The privacy statement uri.
     * 
     * @return the privacyStatementUri value.
     */
    public String privacyStatementUri() {
        return this.privacyStatementUri;
    }

    /**
     * Set the privacyStatementUri property: The privacy statement uri.
     * 
     * @param privacyStatementUri the privacyStatementUri value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withPrivacyStatementUri(String privacyStatementUri) {
        this.privacyStatementUri = privacyStatementUri;
        return this;
    }

    /**
     * Get the releaseNoteUri property: The release note uri.
     * 
     * @return the releaseNoteUri value.
     */
    public String releaseNoteUri() {
        return this.releaseNoteUri;
    }

    /**
     * Set the releaseNoteUri property: The release note uri.
     * 
     * @param releaseNoteUri the releaseNoteUri value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withReleaseNoteUri(String releaseNoteUri) {
        this.releaseNoteUri = releaseNoteUri;
        return this;
    }

    /**
     * Get the osType property: This property allows you to specify the type of
     * the OS that is included in the disk when creating a VM from a managed
     * image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of
     * the OS that is included in the disk when creating a VM from a managed
     * image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     * 
     * @param osType the osType value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState property: This property allows the user to specify
     * whether the virtual machines created under this image are 'Generalized'
     * or 'Specialized'.
     * 
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState property: This property allows the user to specify
     * whether the virtual machines created under this image are 'Generalized'
     * or 'Specialized'.
     * 
     * @param osState the osState value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
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
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery
     * Image Definition. This property can be used for decommissioning
     * purposes. This property is updatable.
     * 
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery
     * Image Definition. This property can be used for decommissioning
     * purposes. This property is updatable.
     * 
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the identifier property: This is the gallery Image Definition
     * identifier.
     * 
     * @return the identifier value.
     */
    public GalleryImageIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: This is the gallery Image Definition
     * identifier.
     * 
     * @param identifier the identifier value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withIdentifier(GalleryImageIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the recommended property: The properties describe the recommended
     * machine configuration for this Image Definition. These properties are
     * updatable.
     * 
     * @return the recommended value.
     */
    public RecommendedMachineConfiguration recommended() {
        return this.recommended;
    }

    /**
     * Set the recommended property: The properties describe the recommended
     * machine configuration for this Image Definition. These properties are
     * updatable.
     * 
     * @param recommended the recommended value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withRecommended(RecommendedMachineConfiguration recommended) {
        this.recommended = recommended;
        return this;
    }

    /**
     * Get the disallowed property: Describes the disallowed disk types.
     * 
     * @return the disallowed value.
     */
    public Disallowed disallowed() {
        return this.disallowed;
    }

    /**
     * Set the disallowed property: Describes the disallowed disk types.
     * 
     * @param disallowed the disallowed value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withDisallowed(Disallowed disallowed) {
        this.disallowed = disallowed;
        return this;
    }

    /**
     * Get the purchasePlan property: Describes the gallery Image Definition
     * purchase plan. This is used by marketplace images.
     * 
     * @return the purchasePlan value.
     */
    public ImagePurchasePlan purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Describes the gallery Image Definition
     * purchase plan. This is used by marketplace images.
     * 
     * @param purchasePlan the purchasePlan value to set.
     * @return the GalleryImageProperties object itself.
     */
    public GalleryImageProperties withPurchasePlan(ImagePurchasePlan purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery
     * Image Definition. The provisioning state, which only appears in the
     * response.
     * 
     * @return the provisioningState value.
     */
    public GalleryImagePropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osType() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property osType in model GalleryImageProperties"));
        }
        if (osState() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property osState in model GalleryImageProperties"));
        }
        if (identifier() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Missing required property identifier in model GalleryImageProperties"));
        } else {
            identifier().validate();
        }
        if (recommended() != null) {
            recommended().validate();
        }
        if (disallowed() != null) {
            disallowed().validate();
        }
        if (purchasePlan() != null) {
            purchasePlan().validate();
        }
    }
}
