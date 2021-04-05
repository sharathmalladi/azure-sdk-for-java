// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.communication.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.communication.models.OperationStatus;
import com.azure.resourcemanager.communication.models.Status;
import java.time.OffsetDateTime;

public final class OperationStatusImpl implements OperationStatus {
    private OperationStatusInner innerObject;

    private final com.azure.resourcemanager.communication.CommunicationManager serviceManager;

    OperationStatusImpl(
        OperationStatusInner innerObject, com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Float percentComplete() {
        return this.innerModel().percentComplete();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public OperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.communication.CommunicationManager manager() {
        return this.serviceManager;
    }
}
