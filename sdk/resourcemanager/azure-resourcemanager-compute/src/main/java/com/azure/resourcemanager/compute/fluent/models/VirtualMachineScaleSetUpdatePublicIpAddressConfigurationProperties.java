// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machines scale set IP Configuration's PublicIPAddress
 * configuration.
 */
@Fluent
public final class VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties.class);

    /*
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * The dns settings to be applied on the publicIP addresses .
     */
    @JsonProperty(value = "dnsSettings")
    private VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings;

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP
     * address.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP
     * address.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the
     * VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the
     * publicIP addresses .
     * 
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the
     * publicIP addresses .
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the
     * VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIpAddressConfigurationProperties withDnsSettings(VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
    }
}
