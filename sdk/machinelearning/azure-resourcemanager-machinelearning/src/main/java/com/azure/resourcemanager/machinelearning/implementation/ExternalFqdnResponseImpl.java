// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.resourcemanager.machinelearning.fluent.models.ExternalFqdnResponseInner;
import com.azure.resourcemanager.machinelearning.models.ExternalFqdnResponse;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpoints;
import java.util.Collections;
import java.util.List;

public final class ExternalFqdnResponseImpl implements ExternalFqdnResponse {
    private ExternalFqdnResponseInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    ExternalFqdnResponseImpl(
        ExternalFqdnResponseInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<FqdnEndpoints> value() {
        List<FqdnEndpoints> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ExternalFqdnResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}
