// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerResourceSettings model. */
@Fluent
public final class ContainerResourceSettings {
    /*
     * Number of vCPUs request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    @JsonProperty(value = "cpu")
    private String cpu;

    /*
     * Number of Nvidia GPU cards request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    @JsonProperty(value = "gpu")
    private String gpu;

    /*
     * Memory size request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    @JsonProperty(value = "memory")
    private String memory;

    /**
     * Get the cpu property: Number of vCPUs request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/.
     *
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: Number of vCPUs request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/.
     *
     * @param cpu the cpu value to set.
     * @return the ContainerResourceSettings object itself.
     */
    public ContainerResourceSettings withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the gpu property: Number of Nvidia GPU cards request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/.
     *
     * @return the gpu value.
     */
    public String gpu() {
        return this.gpu;
    }

    /**
     * Set the gpu property: Number of Nvidia GPU cards request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/.
     *
     * @param gpu the gpu value to set.
     * @return the ContainerResourceSettings object itself.
     */
    public ContainerResourceSettings withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * Get the memory property: Memory size request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/.
     *
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Memory size request/limit for container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/.
     *
     * @param memory the memory value to set.
     * @return the ContainerResourceSettings object itself.
     */
    public ContainerResourceSettings withMemory(String memory) {
        this.memory = memory;
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
