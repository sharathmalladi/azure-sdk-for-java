// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeUpdateProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeUpdatePropertiesTests {
    @Test
    public void testDeserialize() {
        VolumeUpdateProperties model =
            BinaryData.fromString("{\"sizeGiB\":246259275856309822}").toObject(VolumeUpdateProperties.class);
        Assertions.assertEquals(246259275856309822L, model.sizeGiB());
    }

    @Test
    public void testSerialize() {
        VolumeUpdateProperties model = new VolumeUpdateProperties().withSizeGiB(246259275856309822L);
        model = BinaryData.fromObject(model).toObject(VolumeUpdateProperties.class);
        Assertions.assertEquals(246259275856309822L, model.sizeGiB());
    }
}
