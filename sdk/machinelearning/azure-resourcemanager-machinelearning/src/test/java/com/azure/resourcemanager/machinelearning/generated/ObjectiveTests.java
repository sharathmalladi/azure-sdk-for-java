// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.Goal;
import com.azure.resourcemanager.machinelearning.models.Objective;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ObjectiveTests {
    @Test
    public void testDeserialize() {
        Objective model =
            BinaryData
                .fromString("{\"goal\":\"Minimize\",\"primaryMetric\":\"qxjoshohtotryeg\"}")
                .toObject(Objective.class);
        Assertions.assertEquals(Goal.MINIMIZE, model.goal());
        Assertions.assertEquals("qxjoshohtotryeg", model.primaryMetric());
    }

    @Test
    public void testSerialize() {
        Objective model = new Objective().withGoal(Goal.MINIMIZE).withPrimaryMetric("qxjoshohtotryeg");
        model = BinaryData.fromObject(model).toObject(Objective.class);
        Assertions.assertEquals(Goal.MINIMIZE, model.goal());
        Assertions.assertEquals("qxjoshohtotryeg", model.primaryMetric());
    }
}
