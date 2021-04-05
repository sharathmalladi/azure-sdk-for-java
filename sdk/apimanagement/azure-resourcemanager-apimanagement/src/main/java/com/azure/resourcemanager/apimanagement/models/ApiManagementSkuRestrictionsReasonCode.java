// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ApiManagementSkuRestrictionsReasonCode. */
public enum ApiManagementSkuRestrictionsReasonCode {
    /** Enum value QuotaId. */
    QUOTA_ID("QuotaId"),

    /** Enum value NotAvailableForSubscription. */
    NOT_AVAILABLE_FOR_SUBSCRIPTION("NotAvailableForSubscription");

    /** The actual serialized value for a ApiManagementSkuRestrictionsReasonCode instance. */
    private final String value;

    ApiManagementSkuRestrictionsReasonCode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ApiManagementSkuRestrictionsReasonCode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ApiManagementSkuRestrictionsReasonCode object, or null if unable to parse.
     */
    @JsonCreator
    public static ApiManagementSkuRestrictionsReasonCode fromString(String value) {
        ApiManagementSkuRestrictionsReasonCode[] items = ApiManagementSkuRestrictionsReasonCode.values();
        for (ApiManagementSkuRestrictionsReasonCode item : items) {
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
