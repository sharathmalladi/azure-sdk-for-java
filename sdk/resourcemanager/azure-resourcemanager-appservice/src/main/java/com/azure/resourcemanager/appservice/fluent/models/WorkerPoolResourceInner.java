// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ComputeModeOptions;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.SkuDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Worker pool of an App Service Environment ARM resource. */
@Fluent
public final class WorkerPoolResourceInner extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private WorkerPool innerProperties;

    /*
     * Description of a SKU for a scalable resource.
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /**
     * Get the innerProperties property: Core resource properties.
     *
     * @return the innerProperties value.
     */
    private WorkerPool innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: Description of a SKU for a scalable resource.
     *
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Description of a SKU for a scalable resource.
     *
     * @param sku the sku value to set.
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkerPoolResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the workerSizeId property: Worker size ID for referencing this worker pool.
     *
     * @return the workerSizeId value.
     */
    public Integer workerSizeId() {
        return this.innerProperties() == null ? null : this.innerProperties().workerSizeId();
    }

    /**
     * Set the workerSizeId property: Worker size ID for referencing this worker pool.
     *
     * @param workerSizeId the workerSizeId value to set.
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withWorkerSizeId(Integer workerSizeId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkerPool();
        }
        this.innerProperties().withWorkerSizeId(workerSizeId);
        return this;
    }

    /**
     * Get the computeMode property: Shared or dedicated app hosting.
     *
     * @return the computeMode value.
     */
    public ComputeModeOptions computeMode() {
        return this.innerProperties() == null ? null : this.innerProperties().computeMode();
    }

    /**
     * Set the computeMode property: Shared or dedicated app hosting.
     *
     * @param computeMode the computeMode value to set.
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withComputeMode(ComputeModeOptions computeMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkerPool();
        }
        this.innerProperties().withComputeMode(computeMode);
        return this;
    }

    /**
     * Get the workerSize property: VM size of the worker pool instances.
     *
     * @return the workerSize value.
     */
    public String workerSize() {
        return this.innerProperties() == null ? null : this.innerProperties().workerSize();
    }

    /**
     * Set the workerSize property: VM size of the worker pool instances.
     *
     * @param workerSize the workerSize value to set.
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withWorkerSize(String workerSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkerPool();
        }
        this.innerProperties().withWorkerSize(workerSize);
        return this;
    }

    /**
     * Get the workerCount property: Number of instances in the worker pool.
     *
     * @return the workerCount value.
     */
    public Integer workerCount() {
        return this.innerProperties() == null ? null : this.innerProperties().workerCount();
    }

    /**
     * Set the workerCount property: Number of instances in the worker pool.
     *
     * @param workerCount the workerCount value to set.
     * @return the WorkerPoolResourceInner object itself.
     */
    public WorkerPoolResourceInner withWorkerCount(Integer workerCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkerPool();
        }
        this.innerProperties().withWorkerCount(workerCount);
        return this;
    }

    /**
     * Get the instanceNames property: Names of all instances in the worker pool (read only).
     *
     * @return the instanceNames value.
     */
    public List<String> instanceNames() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceNames();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
