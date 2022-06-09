// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateCustomizer;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateDistributor;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateLastRunStatus;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplatePropertiesValidate;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateSource;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateVmProfile;
import com.azure.resourcemanager.imagebuilder.models.ProvisioningError;
import com.azure.resourcemanager.imagebuilder.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the properties of an image template. */
@Fluent
public final class ImageTemplateProperties {
    /*
     * Specifies the properties used to describe the source image.
     */
    @JsonProperty(value = "source", required = true)
    private ImageTemplateSource source;

    /*
     * Specifies the properties used to describe the customization steps of the
     * image, like Image source etc
     */
    @JsonProperty(value = "customize")
    private List<ImageTemplateCustomizer> customize;

    /*
     * Configuration options and list of validations to be performed on the
     * resulting image.
     */
    @JsonProperty(value = "validate")
    private ImageTemplatePropertiesValidate validation;

    /*
     * The distribution targets where the image output needs to go to.
     */
    @JsonProperty(value = "distribute", required = true)
    private List<ImageTemplateDistributor> distribute;

    /*
     * Provisioning state of the resource
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Provisioning error, if any
     */
    @JsonProperty(value = "provisioningError", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningError provisioningError;

    /*
     * State of 'run' that is currently executing or was last executed.
     */
    @JsonProperty(value = "lastRunStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ImageTemplateLastRunStatus lastRunStatus;

    /*
     * Maximum duration to wait while building the image template (includes all
     * customizations, validations, and distributions). Omit or specify 0 to
     * use the default (4 hours).
     */
    @JsonProperty(value = "buildTimeoutInMinutes")
    private Integer buildTimeoutInMinutes;

    /*
     * Describes how virtual machine is set up to build images
     */
    @JsonProperty(value = "vmProfile")
    private ImageTemplateVmProfile vmProfile;

    /*
     * The staging resource group id in the same subscription as the image
     * template that will be used to build the image. If this field is empty, a
     * resource group with a random name will be created. If the resource group
     * specified in this field doesn't exist, it will be created with the same
     * name. If the resource group specified exists, it must be empty and in
     * the same region as the image template. The resource group created will
     * be deleted during template deletion if this field is empty or the
     * resource group specified doesn't exist, but if the resource group
     * specified exists the resources created in the resource group will be
     * deleted during template deletion and the resource group itself will
     * remain.
     */
    @JsonProperty(value = "stagingResourceGroup")
    private String stagingResourceGroup;

    /*
     * The staging resource group id in the same subscription as the image
     * template that will be used to build the image. This read-only field
     * differs from 'stagingResourceGroup' only if the value specified in the
     * 'stagingResourceGroup' field is empty.
     */
    @JsonProperty(value = "exactStagingResourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String exactStagingResourceGroup;

    /**
     * Get the source property: Specifies the properties used to describe the source image.
     *
     * @return the source value.
     */
    public ImageTemplateSource source() {
        return this.source;
    }

    /**
     * Set the source property: Specifies the properties used to describe the source image.
     *
     * @param source the source value to set.
     * @return the ImageTemplateProperties object itself.
     */
    public ImageTemplateProperties withSource(ImageTemplateSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the customize property: Specifies the properties used to describe the customization steps of the image, like
     * Image source etc.
     *
     * @return the customize value.
     */
    public List<ImageTemplateCustomizer> customize() {
        return this.customize;
    }

    /**
     * Set the customize property: Specifies the properties used to describe the customization steps of the image, like
     * Image source etc.
     *
     * @param customize the customize value to set.
     * @return the ImageTemplateProperties object itself.
     */
    public ImageTemplateProperties withCustomize(List<ImageTemplateCustomizer> customize) {
        this.customize = customize;
        return this;
    }

    /**
     * Get the validation property: Configuration options and list of validations to be performed on the resulting
     * image.
     *
     * @return the validation value.
     */
    public ImageTemplatePropertiesValidate validation() {
        return this.validation;
    }

    /**
     * Set the validation property: Configuration options and list of validations to be performed on the resulting
     * image.
     *
     * @param validation the validation value to set.
     * @return the ImageTemplateProperties object itself.
     */
    public ImageTemplateProperties withValidation(ImageTemplatePropertiesValidate validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Get the distribute property: The distribution targets where the image output needs to go to.
     *
     * @return the distribute value.
     */
    public List<ImageTemplateDistributor> distribute() {
        return this.distribute;
    }

    /**
     * Set the distribute property: The distribution targets where the image output needs to go to.
     *
     * @param distribute the distribute value to set.
     * @return the ImageTemplateProperties object itself.
     */
    public ImageTemplateProperties withDistribute(List<ImageTemplateDistributor> distribute) {
        this.distribute = distribute;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningError property: Provisioning error, if any.
     *
     * @return the provisioningError value.
     */
    public ProvisioningError provisioningError() {
        return this.provisioningError;
    }

    /**
     * Get the lastRunStatus property: State of 'run' that is currently executing or was last executed.
     *
     * @return the lastRunStatus value.
     */
    public ImageTemplateLastRunStatus lastRunStatus() {
        return this.lastRunStatus;
    }

    /**
     * Get the buildTimeoutInMinutes property: Maximum duration to wait while building the image template (includes all
     * customizations, validations, and distributions). Omit or specify 0 to use the default (4 hours).
     *
     * @return the buildTimeoutInMinutes value.
     */
    public Integer buildTimeoutInMinutes() {
        return this.buildTimeoutInMinutes;
    }

    /**
     * Set the buildTimeoutInMinutes property: Maximum duration to wait while building the image template (includes all
     * customizations, validations, and distributions). Omit or specify 0 to use the default (4 hours).
     *
     * @param buildTimeoutInMinutes the buildTimeoutInMinutes value to set.
     * @return the ImageTemplateProperties object itself.
     */
    public ImageTemplateProperties withBuildTimeoutInMinutes(Integer buildTimeoutInMinutes) {
        this.buildTimeoutInMinutes = buildTimeoutInMinutes;
        return this;
    }

    /**
     * Get the vmProfile property: Describes how virtual machine is set up to build images.
     *
     * @return the vmProfile value.
     */
    public ImageTemplateVmProfile vmProfile() {
        return this.vmProfile;
    }

    /**
     * Set the vmProfile property: Describes how virtual machine is set up to build images.
     *
     * @param vmProfile the vmProfile value to set.
     * @return the ImageTemplateProperties object itself.
     */
    public ImageTemplateProperties withVmProfile(ImageTemplateVmProfile vmProfile) {
        this.vmProfile = vmProfile;
        return this;
    }

    /**
     * Get the stagingResourceGroup property: The staging resource group id in the same subscription as the image
     * template that will be used to build the image. If this field is empty, a resource group with a random name will
     * be created. If the resource group specified in this field doesn't exist, it will be created with the same name.
     * If the resource group specified exists, it must be empty and in the same region as the image template. The
     * resource group created will be deleted during template deletion if this field is empty or the resource group
     * specified doesn't exist, but if the resource group specified exists the resources created in the resource group
     * will be deleted during template deletion and the resource group itself will remain.
     *
     * @return the stagingResourceGroup value.
     */
    public String stagingResourceGroup() {
        return this.stagingResourceGroup;
    }

    /**
     * Set the stagingResourceGroup property: The staging resource group id in the same subscription as the image
     * template that will be used to build the image. If this field is empty, a resource group with a random name will
     * be created. If the resource group specified in this field doesn't exist, it will be created with the same name.
     * If the resource group specified exists, it must be empty and in the same region as the image template. The
     * resource group created will be deleted during template deletion if this field is empty or the resource group
     * specified doesn't exist, but if the resource group specified exists the resources created in the resource group
     * will be deleted during template deletion and the resource group itself will remain.
     *
     * @param stagingResourceGroup the stagingResourceGroup value to set.
     * @return the ImageTemplateProperties object itself.
     */
    public ImageTemplateProperties withStagingResourceGroup(String stagingResourceGroup) {
        this.stagingResourceGroup = stagingResourceGroup;
        return this;
    }

    /**
     * Get the exactStagingResourceGroup property: The staging resource group id in the same subscription as the image
     * template that will be used to build the image. This read-only field differs from 'stagingResourceGroup' only if
     * the value specified in the 'stagingResourceGroup' field is empty.
     *
     * @return the exactStagingResourceGroup value.
     */
    public String exactStagingResourceGroup() {
        return this.exactStagingResourceGroup;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property source in model ImageTemplateProperties"));
        } else {
            source().validate();
        }
        if (customize() != null) {
            customize().forEach(e -> e.validate());
        }
        if (validation() != null) {
            validation().validate();
        }
        if (distribute() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property distribute in model ImageTemplateProperties"));
        } else {
            distribute().forEach(e -> e.validate());
        }
        if (provisioningError() != null) {
            provisioningError().validate();
        }
        if (lastRunStatus() != null) {
            lastRunStatus().validate();
        }
        if (vmProfile() != null) {
            vmProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageTemplateProperties.class);
}
