// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.ClusterInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Cluster. */
public interface Cluster {
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
     * Gets the systemData property: System data of Cluster resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the status property: Status of the cluster agent.
     *
     * @return the status value.
     */
    Status status();

    /**
     * Gets the cloudId property: Unique, immutable resource id.
     *
     * @return the cloudId value.
     */
    String cloudId();

    /**
     * Gets the cloudManagementEndpoint property: Endpoint configured for management from the Azure portal.
     *
     * @return the cloudManagementEndpoint value.
     */
    String cloudManagementEndpoint();

    /**
     * Gets the aadClientId property: App id of cluster AAD identity.
     *
     * @return the aadClientId value.
     */
    String aadClientId();

    /**
     * Gets the aadTenantId property: Tenant id of cluster AAD identity.
     *
     * @return the aadTenantId value.
     */
    String aadTenantId();

    /**
     * Gets the desiredProperties property: Desired properties of the cluster.
     *
     * @return the desiredProperties value.
     */
    ClusterDesiredProperties desiredProperties();

    /**
     * Gets the reportedProperties property: Properties reported by cluster agent.
     *
     * @return the reportedProperties value.
     */
    ClusterReportedProperties reportedProperties();

    /**
     * Gets the trialDaysRemaining property: Number of days remaining in the trial period.
     *
     * @return the trialDaysRemaining value.
     */
    Float trialDaysRemaining();

    /**
     * Gets the billingModel property: Type of billing applied to the resource.
     *
     * @return the billingModel value.
     */
    String billingModel();

    /**
     * Gets the registrationTimestamp property: First cluster sync timestamp.
     *
     * @return the registrationTimestamp value.
     */
    OffsetDateTime registrationTimestamp();

    /**
     * Gets the lastSyncTimestamp property: Most recent cluster sync timestamp.
     *
     * @return the lastSyncTimestamp value.
     */
    OffsetDateTime lastSyncTimestamp();

    /**
     * Gets the lastBillingTimestamp property: Most recent billing meter timestamp.
     *
     * @return the lastBillingTimestamp value.
     */
    OffsetDateTime lastBillingTimestamp();

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
     * Gets the inner com.azure.resourcemanager.azurestackhci.fluent.models.ClusterInner object.
     *
     * @return the inner object.
     */
    ClusterInner innerModel();

    /** The entirety of the Cluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Cluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the Cluster definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Cluster definition allowing to specify location. */
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
        /** The stage of the Cluster definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Cluster definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithCloudManagementEndpoint,
                DefinitionStages.WithAadClientId,
                DefinitionStages.WithAadTenantId,
                DefinitionStages.WithDesiredProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Cluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cluster create(Context context);
        }
        /** The stage of the Cluster definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Cluster definition allowing to specify cloudManagementEndpoint. */
        interface WithCloudManagementEndpoint {
            /**
             * Specifies the cloudManagementEndpoint property: Endpoint configured for management from the Azure
             * portal..
             *
             * @param cloudManagementEndpoint Endpoint configured for management from the Azure portal.
             * @return the next definition stage.
             */
            WithCreate withCloudManagementEndpoint(String cloudManagementEndpoint);
        }
        /** The stage of the Cluster definition allowing to specify aadClientId. */
        interface WithAadClientId {
            /**
             * Specifies the aadClientId property: App id of cluster AAD identity..
             *
             * @param aadClientId App id of cluster AAD identity.
             * @return the next definition stage.
             */
            WithCreate withAadClientId(String aadClientId);
        }
        /** The stage of the Cluster definition allowing to specify aadTenantId. */
        interface WithAadTenantId {
            /**
             * Specifies the aadTenantId property: Tenant id of cluster AAD identity..
             *
             * @param aadTenantId Tenant id of cluster AAD identity.
             * @return the next definition stage.
             */
            WithCreate withAadTenantId(String aadTenantId);
        }
        /** The stage of the Cluster definition allowing to specify desiredProperties. */
        interface WithDesiredProperties {
            /**
             * Specifies the desiredProperties property: Desired properties of the cluster..
             *
             * @param desiredProperties Desired properties of the cluster.
             * @return the next definition stage.
             */
            WithCreate withDesiredProperties(ClusterDesiredProperties desiredProperties);
        }
    }
    /**
     * Begins update for the Cluster resource.
     *
     * @return the stage of resource update.
     */
    Cluster.Update update();

    /** The template for Cluster update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithCloudManagementEndpoint,
            UpdateStages.WithAadClientId,
            UpdateStages.WithAadTenantId,
            UpdateStages.WithDesiredProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Cluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cluster apply(Context context);
    }
    /** The Cluster update stages. */
    interface UpdateStages {
        /** The stage of the Cluster update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Cluster update allowing to specify cloudManagementEndpoint. */
        interface WithCloudManagementEndpoint {
            /**
             * Specifies the cloudManagementEndpoint property: Endpoint configured for management from the Azure portal.
             *
             * @param cloudManagementEndpoint Endpoint configured for management from the Azure portal.
             * @return the next definition stage.
             */
            Update withCloudManagementEndpoint(String cloudManagementEndpoint);
        }
        /** The stage of the Cluster update allowing to specify aadClientId. */
        interface WithAadClientId {
            /**
             * Specifies the aadClientId property: App id of cluster AAD identity..
             *
             * @param aadClientId App id of cluster AAD identity.
             * @return the next definition stage.
             */
            Update withAadClientId(String aadClientId);
        }
        /** The stage of the Cluster update allowing to specify aadTenantId. */
        interface WithAadTenantId {
            /**
             * Specifies the aadTenantId property: Tenant id of cluster AAD identity..
             *
             * @param aadTenantId Tenant id of cluster AAD identity.
             * @return the next definition stage.
             */
            Update withAadTenantId(String aadTenantId);
        }
        /** The stage of the Cluster update allowing to specify desiredProperties. */
        interface WithDesiredProperties {
            /**
             * Specifies the desiredProperties property: Desired properties of the cluster..
             *
             * @param desiredProperties Desired properties of the cluster.
             * @return the next definition stage.
             */
            Update withDesiredProperties(ClusterDesiredProperties desiredProperties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Cluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cluster refresh(Context context);
}
