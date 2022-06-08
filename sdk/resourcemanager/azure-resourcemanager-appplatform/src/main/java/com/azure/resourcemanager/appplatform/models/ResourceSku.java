// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes an available Azure Spring Apps SKU. */
@Fluent
public final class ResourceSku {
    /*
     * Gets the type of resource the SKU applies to.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Gets the name of SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets the tier of SKU.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Gets the capacity of SKU.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /*
     * Gets the set of locations that the SKU is available.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * Gets a list of locations and availability zones in those locations where
     * the SKU is available.
     */
    @JsonProperty(value = "locationInfo")
    private List<ResourceSkuLocationInfo> locationInfo;

    /*
     * Gets the restrictions because of which SKU cannot be used. This is
     * empty if there are no restrictions.
     */
    @JsonProperty(value = "restrictions")
    private List<ResourceSkuRestrictions> restrictions;

    /**
     * Get the resourceType property: Gets the type of resource the SKU applies to.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Gets the type of resource the SKU applies to.
     *
     * @param resourceType the resourceType value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the name property: Gets the name of SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets the name of SKU.
     *
     * @param name the name value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Gets the tier of SKU.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Gets the tier of SKU.
     *
     * @param tier the tier value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: Gets the capacity of SKU.
     *
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Gets the capacity of SKU.
     *
     * @param capacity the capacity value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the locations property: Gets the set of locations that the SKU is available.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Gets the set of locations that the SKU is available.
     *
     * @param locations the locations value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the locationInfo property: Gets a list of locations and availability zones in those locations where the SKU
     * is available.
     *
     * @return the locationInfo value.
     */
    public List<ResourceSkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Set the locationInfo property: Gets a list of locations and availability zones in those locations where the SKU
     * is available.
     *
     * @param locationInfo the locationInfo value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withLocationInfo(List<ResourceSkuLocationInfo> locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * Get the restrictions property: Gets the restrictions because of which SKU cannot be used. This is empty if there
     * are no restrictions.
     *
     * @return the restrictions value.
     */
    public List<ResourceSkuRestrictions> restrictions() {
        return this.restrictions;
    }

    /**
     * Set the restrictions property: Gets the restrictions because of which SKU cannot be used. This is empty if there
     * are no restrictions.
     *
     * @param restrictions the restrictions value to set.
     * @return the ResourceSku object itself.
     */
    public ResourceSku withRestrictions(List<ResourceSkuRestrictions> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (locationInfo() != null) {
            locationInfo().forEach(e -> e.validate());
        }
        if (restrictions() != null) {
            restrictions().forEach(e -> e.validate());
        }
    }
}
