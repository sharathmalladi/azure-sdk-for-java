// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridkubernetes.fluent.models.ConnectedClusterInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of ConnectedCluster. */
public interface ConnectedCluster {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: The identity of the connected cluster.
     *
     * @return the identity value.
     */
    ConnectedClusterIdentity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to do the
     * initial handshake to the backend services in Azure.
     *
     * @return the agentPublicKeyCertificate value.
     */
    String agentPublicKeyCertificate();

    /**
     * Gets the kubernetesVersion property: The Kubernetes version of the connected cluster resource.
     *
     * @return the kubernetesVersion value.
     */
    String kubernetesVersion();

    /**
     * Gets the totalNodeCount property: Number of nodes present in the connected cluster resource.
     *
     * @return the totalNodeCount value.
     */
    Integer totalNodeCount();

    /**
     * Gets the totalCoreCount property: Number of CPU cores present in the connected cluster resource.
     *
     * @return the totalCoreCount value.
     */
    Integer totalCoreCount();

    /**
     * Gets the agentVersion property: Version of the agent running on the connected cluster resource.
     *
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * Gets the provisioningState property: Provisioning state of the connected cluster resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the distribution property: The Kubernetes distribution running on this connected cluster.
     *
     * @return the distribution value.
     */
    String distribution();

    /**
     * Gets the infrastructure property: The infrastructure on which the Kubernetes cluster represented by this
     * connected cluster is running on.
     *
     * @return the infrastructure value.
     */
    String infrastructure();

    /**
     * Gets the offering property: Connected cluster offering.
     *
     * @return the offering value.
     */
    String offering();

    /**
     * Gets the managedIdentityCertificateExpirationTime property: Expiration time of the managed identity certificate.
     *
     * @return the managedIdentityCertificateExpirationTime value.
     */
    OffsetDateTime managedIdentityCertificateExpirationTime();

    /**
     * Gets the lastConnectivityTime property: Time representing the last instance when heart beat was received from the
     * cluster.
     *
     * @return the lastConnectivityTime value.
     */
    OffsetDateTime lastConnectivityTime();

    /**
     * Gets the connectivityStatus property: Represents the connectivity status of the connected cluster.
     *
     * @return the connectivityStatus value.
     */
    ConnectivityStatus connectivityStatus();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.hybridkubernetes.fluent.models.ConnectedClusterInner object.
     *
     * @return the inner object.
     */
    ConnectedClusterInner innerModel();

    /** The entirety of the ConnectedCluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithIdentity,
            DefinitionStages.WithAgentPublicKeyCertificate,
            DefinitionStages.WithCreate {
    }
    /** The ConnectedCluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConnectedCluster definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ConnectedCluster definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ConnectedCluster definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithIdentity withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the ConnectedCluster definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the connected cluster..
             *
             * @param identity The identity of the connected cluster.
             * @return the next definition stage.
             */
            WithAgentPublicKeyCertificate withIdentity(ConnectedClusterIdentity identity);
        }
        /** The stage of the ConnectedCluster definition allowing to specify agentPublicKeyCertificate. */
        interface WithAgentPublicKeyCertificate {
            /**
             * Specifies the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to
             * do the initial handshake to the backend services in Azure..
             *
             * @param agentPublicKeyCertificate Base64 encoded public certificate used by the agent to do the initial
             *     handshake to the backend services in Azure.
             * @return the next definition stage.
             */
            WithCreate withAgentPublicKeyCertificate(String agentPublicKeyCertificate);
        }
        /**
         * The stage of the ConnectedCluster definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithProvisioningState,
                DefinitionStages.WithDistribution,
                DefinitionStages.WithInfrastructure {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConnectedCluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConnectedCluster create(Context context);
        }
        /** The stage of the ConnectedCluster definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ConnectedCluster definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provisioning state of the connected cluster resource..
             *
             * @param provisioningState Provisioning state of the connected cluster resource.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }
        /** The stage of the ConnectedCluster definition allowing to specify distribution. */
        interface WithDistribution {
            /**
             * Specifies the distribution property: The Kubernetes distribution running on this connected cluster..
             *
             * @param distribution The Kubernetes distribution running on this connected cluster.
             * @return the next definition stage.
             */
            WithCreate withDistribution(String distribution);
        }
        /** The stage of the ConnectedCluster definition allowing to specify infrastructure. */
        interface WithInfrastructure {
            /**
             * Specifies the infrastructure property: The infrastructure on which the Kubernetes cluster represented by
             * this connected cluster is running on..
             *
             * @param infrastructure The infrastructure on which the Kubernetes cluster represented by this connected
             *     cluster is running on.
             * @return the next definition stage.
             */
            WithCreate withInfrastructure(String infrastructure);
        }
    }
    /**
     * Begins update for the ConnectedCluster resource.
     *
     * @return the stage of resource update.
     */
    ConnectedCluster.Update update();

    /** The template for ConnectedCluster update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConnectedCluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConnectedCluster apply(Context context);
    }
    /** The ConnectedCluster update stages. */
    interface UpdateStages {
        /** The stage of the ConnectedCluster update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ConnectedCluster update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Describes the connected cluster resource properties that can be
             * updated during PATCH operation..
             *
             * @param properties Describes the connected cluster resource properties that can be updated during PATCH
             *     operation.
             * @return the next definition stage.
             */
            Update withProperties(Object properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConnectedCluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConnectedCluster refresh(Context context);

    /**
     * Gets cluster user credentials of the connected cluster with a specified resource group and name.
     *
     * @param properties ListClusterUserCredential properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster user credentials of the connected cluster with a specified resource group and name.
     */
    CredentialResults listClusterUserCredential(ListClusterUserCredentialProperties properties);

    /**
     * Gets cluster user credentials of the connected cluster with a specified resource group and name.
     *
     * @param properties ListClusterUserCredential properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cluster user credentials of the connected cluster with a specified resource group and name.
     */
    Response<CredentialResults> listClusterUserCredentialWithResponse(
        ListClusterUserCredentialProperties properties, Context context);
}
