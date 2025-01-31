// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceConnectionPropertiesV2BasicResourceInner;
import com.azure.resourcemanager.machinelearning.models.ConnectionCategory;
import com.azure.resourcemanager.machinelearning.models.ValueFormat;
import com.azure.resourcemanager.machinelearning.models.WorkspaceConnectionPropertiesV2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WorkspaceConnectionPropertiesV2BasicResourceInnerTests {
    @Test
    public void testDeserialize() {
        WorkspaceConnectionPropertiesV2BasicResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"authType\":\"WorkspaceConnectionPropertiesV2\",\"category\":\"ContainerRegistry\",\"target\":\"wiydmcwyhzdxssad\",\"value\":\"mnvdfzn\",\"valueFormat\":\"JSON\"},\"id\":\"dvxzbncblylpst\",\"name\":\"bhhxsrzdzuc\",\"type\":\"rsc\"}")
                .toObject(WorkspaceConnectionPropertiesV2BasicResourceInner.class);
        Assertions.assertEquals(ConnectionCategory.CONTAINER_REGISTRY, model.properties().category());
        Assertions.assertEquals("wiydmcwyhzdxssad", model.properties().target());
        Assertions.assertEquals("mnvdfzn", model.properties().value());
        Assertions.assertEquals(ValueFormat.JSON, model.properties().valueFormat());
    }

    @Test
    public void testSerialize() {
        WorkspaceConnectionPropertiesV2BasicResourceInner model =
            new WorkspaceConnectionPropertiesV2BasicResourceInner()
                .withProperties(
                    new WorkspaceConnectionPropertiesV2()
                        .withCategory(ConnectionCategory.CONTAINER_REGISTRY)
                        .withTarget("wiydmcwyhzdxssad")
                        .withValue("mnvdfzn")
                        .withValueFormat(ValueFormat.JSON));
        model = BinaryData.fromObject(model).toObject(WorkspaceConnectionPropertiesV2BasicResourceInner.class);
        Assertions.assertEquals(ConnectionCategory.CONTAINER_REGISTRY, model.properties().category());
        Assertions.assertEquals("wiydmcwyhzdxssad", model.properties().target());
        Assertions.assertEquals("mnvdfzn", model.properties().value());
        Assertions.assertEquals(ValueFormat.JSON, model.properties().valueFormat());
    }
}
