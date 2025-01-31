// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSWriteSettings;
import org.junit.jupiter.api.Test;

public final class AzureBlobFSWriteSettingsTests {
    @Test
    public void testDeserialize() {
        AzureBlobFSWriteSettings model =
            BinaryData
                .fromString("{\"type\":\"AzureBlobFSWriteSettings\",\"\":{}}")
                .toObject(AzureBlobFSWriteSettings.class);
    }

    @Test
    public void testSerialize() {
        AzureBlobFSWriteSettings model = new AzureBlobFSWriteSettings();
        model = BinaryData.fromObject(model).toObject(AzureBlobFSWriteSettings.class);
    }
}
