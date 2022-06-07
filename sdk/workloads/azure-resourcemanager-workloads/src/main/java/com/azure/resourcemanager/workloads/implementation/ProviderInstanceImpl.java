// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.workloads.fluent.models.ProviderInstanceInner;
import com.azure.resourcemanager.workloads.models.ProviderInstance;
import com.azure.resourcemanager.workloads.models.ProviderInstancePropertiesErrors;
import com.azure.resourcemanager.workloads.models.ProviderSpecificProperties;
import com.azure.resourcemanager.workloads.models.WorkloadMonitorProvisioningState;

public final class ProviderInstanceImpl implements ProviderInstance, ProviderInstance.Definition {
    private ProviderInstanceInner innerObject;

    private final com.azure.resourcemanager.workloads.WorkloadsManager serviceManager;

    ProviderInstanceImpl(
        ProviderInstanceInner innerObject, com.azure.resourcemanager.workloads.WorkloadsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public WorkloadMonitorProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ProviderInstancePropertiesErrors errors() {
        return this.innerModel().errors();
    }

    public ProviderSpecificProperties providerSettings() {
        return this.innerModel().providerSettings();
    }

    public ProviderInstanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.workloads.WorkloadsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String monitorName;

    private String providerInstanceName;

    public ProviderInstanceImpl withExistingMonitor(String resourceGroupName, String monitorName) {
        this.resourceGroupName = resourceGroupName;
        this.monitorName = monitorName;
        return this;
    }

    public ProviderInstance create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProviderInstances()
                .create(resourceGroupName, monitorName, providerInstanceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ProviderInstance create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProviderInstances()
                .create(resourceGroupName, monitorName, providerInstanceName, this.innerModel(), context);
        return this;
    }

    ProviderInstanceImpl(String name, com.azure.resourcemanager.workloads.WorkloadsManager serviceManager) {
        this.innerObject = new ProviderInstanceInner();
        this.serviceManager = serviceManager;
        this.providerInstanceName = name;
    }

    public ProviderInstance refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProviderInstances()
                .getWithResponse(resourceGroupName, monitorName, providerInstanceName, Context.NONE)
                .getValue();
        return this;
    }

    public ProviderInstance refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProviderInstances()
                .getWithResponse(resourceGroupName, monitorName, providerInstanceName, context)
                .getValue();
        return this;
    }

    public ProviderInstanceImpl withProviderSettings(ProviderSpecificProperties providerSettings) {
        this.innerModel().withProviderSettings(providerSettings);
        return this;
    }
}
