// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.DataContainerDataInner;
import com.azure.resourcemanager.machinelearning.models.DataContainerData;
import com.azure.resourcemanager.machinelearning.models.DataContainerDetails;

public final class DataContainerDataImpl
    implements DataContainerData, DataContainerData.Definition, DataContainerData.Update {
    private DataContainerDataInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DataContainerDetails properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DataContainerDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    public DataContainerDataImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public DataContainerData create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataContainerData create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataContainerDataImpl(
        String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new DataContainerDataInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public DataContainerDataImpl update() {
        return this;
    }

    public DataContainerData apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataContainerData apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataContainerDataImpl(
        DataContainerDataInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "data");
    }

    public DataContainerData refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .getWithResponse(resourceGroupName, workspaceName, name, Context.NONE)
                .getValue();
        return this;
    }

    public DataContainerData refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataContainers()
                .getWithResponse(resourceGroupName, workspaceName, name, context)
                .getValue();
        return this;
    }

    public DataContainerDataImpl withProperties(DataContainerDetails properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
