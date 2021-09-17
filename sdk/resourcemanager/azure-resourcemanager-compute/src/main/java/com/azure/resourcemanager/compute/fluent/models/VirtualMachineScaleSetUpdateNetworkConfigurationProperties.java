// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetUpdateIpConfiguration;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine scale set updatable network profile's IP
 * configuration.Use this object for updating network profile's IP
 * Configuration.
 */
@Fluent
public final class VirtualMachineScaleSetUpdateNetworkConfigurationProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetUpdateNetworkConfigurationProperties.class);

    /*
     * Whether this is a primary NIC on a virtual machine.
     */
    @JsonProperty(value = "primary")
    private Boolean primary;

    /*
     * Specifies whether the network interface is accelerated
     * networking-enabled.
     */
    @JsonProperty(value = "enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /*
     * Specifies whether the network interface is FPGA networking-enabled.
     */
    @JsonProperty(value = "enableFpga")
    private Boolean enableFpga;

    /*
     * The network security group.
     */
    @JsonProperty(value = "networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /*
     * The dns settings to be applied on the network interfaces.
     */
    @JsonProperty(value = "dnsSettings")
    private VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings;

    /*
     * The virtual machine scale set IP Configuration.
     */
    @JsonProperty(value = "ipConfigurations")
    private List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations;

    /*
     * Whether IP forwarding enabled on this NIC.
     */
    @JsonProperty(value = "enableIPForwarding")
    private Boolean enableIpForwarding;

    /**
     * Get the primary property: Whether this is a primary NIC on a virtual
     * machine.
     * 
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Whether this is a primary NIC on a virtual
     * machine.
     * 
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationProperties withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Specifies whether the
     * network interface is accelerated networking-enabled.
     * 
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: Specifies whether the
     * network interface is accelerated networking-enabled.
     * 
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value
     * to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationProperties withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the enableFpga property: Specifies whether the network interface is
     * FPGA networking-enabled.
     * 
     * @return the enableFpga value.
     */
    public Boolean enableFpga() {
        return this.enableFpga;
    }

    /**
     * Set the enableFpga property: Specifies whether the network interface is
     * FPGA networking-enabled.
     * 
     * @param enableFpga the enableFpga value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationProperties withEnableFpga(Boolean enableFpga) {
        this.enableFpga = enableFpga;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The network security group.
     * 
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The network security group.
     * 
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationProperties withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the
     * network interfaces.
     * 
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the
     * network interfaces.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationProperties withDnsSettings(VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipConfigurations property: The virtual machine scale set IP
     * Configuration.
     * 
     * @return the ipConfigurations value.
     */
    public List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: The virtual machine scale set IP
     * Configuration.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationProperties withIpConfigurations(List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the enableIpForwarding property: Whether IP forwarding enabled on
     * this NIC.
     * 
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.enableIpForwarding;
    }

    /**
     * Set the enableIpForwarding property: Whether IP forwarding enabled on
     * this NIC.
     * 
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfigurationProperties
     * object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfigurationProperties withEnableIpForwarding(Boolean enableIpForwarding) {
        this.enableIpForwarding = enableIpForwarding;
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
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
