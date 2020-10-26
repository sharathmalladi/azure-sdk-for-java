/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details related to the IPv4 address configuration.
 */
public class Ipv4Config {
    /**
     * The IPv4 address of the network adapter.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /**
     * The IPv4 subnet of the network adapter.
     */
    @JsonProperty(value = "subnet", access = JsonProperty.Access.WRITE_ONLY)
    private String subnet;

    /**
     * The IPv4 gateway of the network adapter.
     */
    @JsonProperty(value = "gateway", access = JsonProperty.Access.WRITE_ONLY)
    private String gateway;

    /**
     * Get the IPv4 address of the network adapter.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the IPv4 subnet of the network adapter.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Get the IPv4 gateway of the network adapter.
     *
     * @return the gateway value
     */
    public String gateway() {
        return this.gateway;
    }

}
