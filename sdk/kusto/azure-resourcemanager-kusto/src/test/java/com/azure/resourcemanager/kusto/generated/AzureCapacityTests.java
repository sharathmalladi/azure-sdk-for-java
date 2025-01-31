// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.AzureCapacity;
import com.azure.resourcemanager.kusto.models.AzureScaleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureCapacityTests {
    @Test
    public void testDeserialize() {
        AzureCapacity model =
            BinaryData
                .fromString(
                    "{\"scaleType\":\"manual\",\"minimum\":1762722977,\"maximum\":611347280,\"default\":168254793}")
                .toObject(AzureCapacity.class);
        Assertions.assertEquals(AzureScaleType.MANUAL, model.scaleType());
        Assertions.assertEquals(1762722977, model.minimum());
        Assertions.assertEquals(611347280, model.maximum());
        Assertions.assertEquals(168254793, model.defaultProperty());
    }

    @Test
    public void testSerialize() {
        AzureCapacity model =
            new AzureCapacity()
                .withScaleType(AzureScaleType.MANUAL)
                .withMinimum(1762722977)
                .withMaximum(611347280)
                .withDefaultProperty(168254793);
        model = BinaryData.fromObject(model).toObject(AzureCapacity.class);
        Assertions.assertEquals(AzureScaleType.MANUAL, model.scaleType());
        Assertions.assertEquals(1762722977, model.minimum());
        Assertions.assertEquals(611347280, model.maximum());
        Assertions.assertEquals(168254793, model.defaultProperty());
    }
}
