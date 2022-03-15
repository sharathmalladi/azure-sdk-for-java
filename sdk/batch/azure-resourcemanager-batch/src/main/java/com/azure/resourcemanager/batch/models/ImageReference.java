// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to an Azure Virtual Machines Marketplace image or the Azure Image resource of a custom Virtual Machine.
 * To get the list of all imageReferences verified by Azure Batch, see the 'List supported node agent SKUs' operation.
 */
@Fluent
public final class ImageReference {
    /*
     * The publisher of the Azure Virtual Machines Marketplace image. For
     * example, Canonical or MicrosoftWindowsServer.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The offer type of the Azure Virtual Machines Marketplace image. For
     * example, UbuntuServer or WindowsServer.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /*
     * The SKU of the Azure Virtual Machines Marketplace image. For example,
     * 18.04-LTS or 2022-datacenter.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * The version of the Azure Virtual Machines Marketplace image. A value of
     * 'latest' can be specified to select the latest version of an image. If
     * omitted, the default is 'latest'.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The ARM resource identifier of the Shared Image Gallery Image. Compute
     * Nodes in the Pool will be created using this Image Id. This is of the
     * form
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/images/{imageDefinitionName}/versions/{versionId}.
     * This property is mutually exclusive with other properties. The Shared
     * Image Gallery image must have replicas in the same region as the Azure
     * Batch account. For information about the firewall settings for the Batch
     * node agent to communicate with the Batch service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the publisher property: The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical
     * or MicrosoftWindowsServer.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical
     * or MicrosoftWindowsServer.
     *
     * @param publisher the publisher value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer
     * or WindowsServer.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer
     * or WindowsServer.
     *
     * @param offer the offer value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: The SKU of the Azure Virtual Machines Marketplace image. For example, 18.04-LTS or
     * 2022-datacenter.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Azure Virtual Machines Marketplace image. For example, 18.04-LTS or
     * 2022-datacenter.
     *
     * @param sku the sku value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the version property: The version of the Azure Virtual Machines Marketplace image. A value of 'latest' can be
     * specified to select the latest version of an image. If omitted, the default is 'latest'.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the Azure Virtual Machines Marketplace image. A value of 'latest' can be
     * specified to select the latest version of an image. If omitted, the default is 'latest'.
     *
     * @param version the version value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the id property: The ARM resource identifier of the Shared Image Gallery Image. Compute Nodes in the Pool
     * will be created using this Image Id. This is of the form
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/images/{imageDefinitionName}/versions/{versionId}.
     * This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in
     * the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent
     * to communicate with the Batch service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM resource identifier of the Shared Image Gallery Image. Compute Nodes in the Pool
     * will be created using this Image Id. This is of the form
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/images/{imageDefinitionName}/versions/{versionId}.
     * This property is mutually exclusive with other properties. The Shared Image Gallery image must have replicas in
     * the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent
     * to communicate with the Batch service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     *
     * @param id the id value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
