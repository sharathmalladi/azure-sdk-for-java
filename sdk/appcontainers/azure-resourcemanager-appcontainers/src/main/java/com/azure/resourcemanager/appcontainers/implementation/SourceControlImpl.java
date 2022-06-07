// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.SourceControlInner;
import com.azure.resourcemanager.appcontainers.models.GithubActionConfiguration;
import com.azure.resourcemanager.appcontainers.models.SourceControl;
import com.azure.resourcemanager.appcontainers.models.SourceControlOperationState;

public final class SourceControlImpl implements SourceControl, SourceControl.Definition, SourceControl.Update {
    private SourceControlInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SourceControlOperationState operationState() {
        return this.innerModel().operationState();
    }

    public String repoUrl() {
        return this.innerModel().repoUrl();
    }

    public String branch() {
        return this.innerModel().branch();
    }

    public GithubActionConfiguration githubActionConfiguration() {
        return this.innerModel().githubActionConfiguration();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SourceControlInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String containerAppName;

    private String sourceControlName;

    public SourceControlImpl withExistingContainerApp(String resourceGroupName, String containerAppName) {
        this.resourceGroupName = resourceGroupName;
        this.containerAppName = containerAppName;
        return this;
    }

    public SourceControl create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerAppsSourceControls()
                .createOrUpdate(
                    resourceGroupName, containerAppName, sourceControlName, this.innerModel(), Context.NONE);
        return this;
    }

    public SourceControl create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerAppsSourceControls()
                .createOrUpdate(resourceGroupName, containerAppName, sourceControlName, this.innerModel(), context);
        return this;
    }

    SourceControlImpl(String name, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new SourceControlInner();
        this.serviceManager = serviceManager;
        this.sourceControlName = name;
    }

    public SourceControlImpl update() {
        return this;
    }

    public SourceControl apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerAppsSourceControls()
                .createOrUpdate(
                    resourceGroupName, containerAppName, sourceControlName, this.innerModel(), Context.NONE);
        return this;
    }

    public SourceControl apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerAppsSourceControls()
                .createOrUpdate(resourceGroupName, containerAppName, sourceControlName, this.innerModel(), context);
        return this;
    }

    SourceControlImpl(
        SourceControlInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.containerAppName = Utils.getValueFromIdByName(innerObject.id(), "containerApps");
        this.sourceControlName = Utils.getValueFromIdByName(innerObject.id(), "sourcecontrols");
    }

    public SourceControl refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerAppsSourceControls()
                .getWithResponse(resourceGroupName, containerAppName, sourceControlName, Context.NONE)
                .getValue();
        return this;
    }

    public SourceControl refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerAppsSourceControls()
                .getWithResponse(resourceGroupName, containerAppName, sourceControlName, context)
                .getValue();
        return this;
    }

    public SourceControlImpl withRepoUrl(String repoUrl) {
        this.innerModel().withRepoUrl(repoUrl);
        return this;
    }

    public SourceControlImpl withBranch(String branch) {
        this.innerModel().withBranch(branch);
        return this;
    }

    public SourceControlImpl withGithubActionConfiguration(GithubActionConfiguration githubActionConfiguration) {
        this.innerModel().withGithubActionConfiguration(githubActionConfiguration);
        return this;
    }
}
