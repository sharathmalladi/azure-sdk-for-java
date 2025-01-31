// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MediaJobErrorCategory. */
public enum MediaJobErrorCategory {
    /** Enum value Service. */
    SERVICE("Service"),

    /** Enum value Download. */
    DOWNLOAD("Download"),

    /** Enum value Upload. */
    UPLOAD("Upload"),

    /** Enum value Configuration. */
    CONFIGURATION("Configuration"),

    /** Enum value Content. */
    CONTENT("Content"),

    /** Enum value Account. */
    ACCOUNT("Account");

    /** The actual serialized value for a MediaJobErrorCategory instance. */
    private final String value;

    MediaJobErrorCategory(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MediaJobErrorCategory instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MediaJobErrorCategory object, or null if unable to parse.
     */
    @JsonCreator
    public static MediaJobErrorCategory fromString(String value) {
        MediaJobErrorCategory[] items = MediaJobErrorCategory.values();
        for (MediaJobErrorCategory item : items) {
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
