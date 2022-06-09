// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.ModelVersionDataInner;
import com.azure.resourcemanager.machinelearning.models.ModelVersionData;
import com.azure.resourcemanager.machinelearning.models.ModelVersionDetails;

public final class ModelVersionDataImpl
    implements ModelVersionData, ModelVersionData.Definition, ModelVersionData.Update {
    private ModelVersionDataInner innerObject;

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

    public ModelVersionDetails properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ModelVersionDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    private String version;

    public ModelVersionDataImpl withExistingModel(String resourceGroupName, String workspaceName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.name = name;
        return this;
    }

    public ModelVersionData create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getModelVersions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ModelVersionData create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getModelVersions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
                .getValue();
        return this;
    }

    ModelVersionDataImpl(String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new ModelVersionDataInner();
        this.serviceManager = serviceManager;
        this.version = name;
    }

    public ModelVersionDataImpl update() {
        return this;
    }

    public ModelVersionData apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getModelVersions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ModelVersionData apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getModelVersions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
                .getValue();
        return this;
    }

    ModelVersionDataImpl(
        ModelVersionDataInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "models");
        this.version = Utils.getValueFromIdByName(innerObject.id(), "versions");
    }

    public ModelVersionData refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getModelVersions()
                .getWithResponse(resourceGroupName, workspaceName, name, version, Context.NONE)
                .getValue();
        return this;
    }

    public ModelVersionData refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getModelVersions()
                .getWithResponse(resourceGroupName, workspaceName, name, version, context)
                .getValue();
        return this;
    }

    public ModelVersionDataImpl withProperties(ModelVersionDetails properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
