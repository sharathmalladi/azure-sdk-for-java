// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UpgradeMode.
 */
public enum UpgradeMode {
    /**
     * Enum value Automatic.
     */
    AUTOMATIC("Automatic"),

    /**
     * Enum value Manual.
     */
    MANUAL("Manual"),

    /**
     * Enum value Rolling.
     */
    ROLLING("Rolling");

    /**
     * The actual serialized value for a UpgradeMode instance.
     */
    private final String value;

    UpgradeMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UpgradeMode instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed UpgradeMode object, or null if unable to parse.
     */
    @JsonCreator
    public static UpgradeMode fromString(String value) {
        UpgradeMode[] items = UpgradeMode.values();
        for (UpgradeMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
