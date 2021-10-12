// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.ClusterPrincipalAssignmentInner;
import com.azure.resourcemanager.synapse.models.ClusterPrincipalAssignment;
import com.azure.resourcemanager.synapse.models.ClusterPrincipalRole;
import com.azure.resourcemanager.synapse.models.PrincipalType;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;

public final class ClusterPrincipalAssignmentImpl
    implements ClusterPrincipalAssignment, ClusterPrincipalAssignment.Definition, ClusterPrincipalAssignment.Update {
    private ClusterPrincipalAssignmentInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

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

    public String principalId() {
        return this.innerModel().principalId();
    }

    public ClusterPrincipalRole role() {
        return this.innerModel().role();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public PrincipalType principalType() {
        return this.innerModel().principalType();
    }

    public String tenantName() {
        return this.innerModel().tenantName();
    }

    public String principalName() {
        return this.innerModel().principalName();
    }

    public ResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ClusterPrincipalAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String workspaceName;

    private String kustoPoolName;

    private String principalAssignmentName;

    private String resourceGroupName;

    public ClusterPrincipalAssignmentImpl withExistingKustoPool(
        String workspaceName, String kustoPoolName, String resourceGroupName) {
        this.workspaceName = workspaceName;
        this.kustoPoolName = kustoPoolName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ClusterPrincipalAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolPrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public ClusterPrincipalAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolPrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    context);
        return this;
    }

    ClusterPrincipalAssignmentImpl(String name, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new ClusterPrincipalAssignmentInner();
        this.serviceManager = serviceManager;
        this.principalAssignmentName = name;
    }

    public ClusterPrincipalAssignmentImpl update() {
        return this;
    }

    public ClusterPrincipalAssignment apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolPrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public ClusterPrincipalAssignment apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolPrincipalAssignments()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    principalAssignmentName,
                    resourceGroupName,
                    this.innerModel(),
                    context);
        return this;
    }

    ClusterPrincipalAssignmentImpl(
        ClusterPrincipalAssignmentInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.kustoPoolName = Utils.getValueFromIdByName(innerObject.id(), "kustoPools");
        this.principalAssignmentName = Utils.getValueFromIdByName(innerObject.id(), "principalAssignments");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public ClusterPrincipalAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolPrincipalAssignments()
                .getWithResponse(workspaceName, kustoPoolName, principalAssignmentName, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public ClusterPrincipalAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolPrincipalAssignments()
                .getWithResponse(workspaceName, kustoPoolName, principalAssignmentName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public ClusterPrincipalAssignmentImpl withPrincipalId(String principalId) {
        this.innerModel().withPrincipalId(principalId);
        return this;
    }

    public ClusterPrincipalAssignmentImpl withRole(ClusterPrincipalRole role) {
        this.innerModel().withRole(role);
        return this;
    }

    public ClusterPrincipalAssignmentImpl withTenantId(String tenantId) {
        this.innerModel().withTenantId(tenantId);
        return this;
    }

    public ClusterPrincipalAssignmentImpl withPrincipalType(PrincipalType principalType) {
        this.innerModel().withPrincipalType(principalType);
        return this;
    }
}
