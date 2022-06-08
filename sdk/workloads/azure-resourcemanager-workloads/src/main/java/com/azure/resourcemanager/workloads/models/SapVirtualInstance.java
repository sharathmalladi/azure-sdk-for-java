// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.workloads.fluent.models.SapVirtualInstanceInner;
import java.util.Map;

/** An immutable client-side representation of SapVirtualInstance. */
public interface SapVirtualInstance {
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
     * Gets the identity property: Managed service identity (user assigned identities).
     *
     * @return the identity value.
     */
    UserAssignedServiceIdentity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the environment property: Defines the environment type - Production/Non Production.
     *
     * @return the environment value.
     */
    SapEnvironmentType environment();

    /**
     * Gets the sapProduct property: Defines the SAP Product type.
     *
     * @return the sapProduct value.
     */
    SapProductType sapProduct();

    /**
     * Gets the configuration property: Defines if an existing SAP system is being registered or a new SAP system is
     * being created.
     *
     * @return the configuration value.
     */
    SapConfiguration configuration();

    /**
     * Gets the managedResourceGroupConfiguration property: Managed resource group configuration.
     *
     * @return the managedResourceGroupConfiguration value.
     */
    ManagedRGConfiguration managedResourceGroupConfiguration();

    /**
     * Gets the status property: Defines the SAP Instance status.
     *
     * @return the status value.
     */
    SapVirtualInstanceStatus status();

    /**
     * Gets the health property: Defines the SAP Instance health.
     *
     * @return the health value.
     */
    SapHealthState health();

    /**
     * Gets the state property: Defines the Virtual Instance for SAP state.
     *
     * @return the state value.
     */
    SapVirtualInstanceState state();

    /**
     * Gets the provisioningState property: Defines the provisioning states.
     *
     * @return the provisioningState value.
     */
    SapVirtualInstanceProvisioningState provisioningState();

    /**
     * Gets the errors property: Defines the Virtual Instance for SAP errors.
     *
     * @return the errors value.
     */
    SapVirtualInstanceError errors();

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
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.workloads.fluent.models.SapVirtualInstanceInner object.
     *
     * @return the inner object.
     */
    SapVirtualInstanceInner innerModel();

    /** The entirety of the SapVirtualInstance definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithEnvironment,
            DefinitionStages.WithSapProduct,
            DefinitionStages.WithConfiguration,
            DefinitionStages.WithCreate {
    }
    /** The SapVirtualInstance definition stages. */
    interface DefinitionStages {
        /** The first stage of the SapVirtualInstance definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SapVirtualInstance definition allowing to specify location. */
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
        /** The stage of the SapVirtualInstance definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithEnvironment withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the SapVirtualInstance definition allowing to specify environment. */
        interface WithEnvironment {
            /**
             * Specifies the environment property: Defines the environment type - Production/Non Production..
             *
             * @param environment Defines the environment type - Production/Non Production.
             * @return the next definition stage.
             */
            WithSapProduct withEnvironment(SapEnvironmentType environment);
        }
        /** The stage of the SapVirtualInstance definition allowing to specify sapProduct. */
        interface WithSapProduct {
            /**
             * Specifies the sapProduct property: Defines the SAP Product type..
             *
             * @param sapProduct Defines the SAP Product type.
             * @return the next definition stage.
             */
            WithConfiguration withSapProduct(SapProductType sapProduct);
        }
        /** The stage of the SapVirtualInstance definition allowing to specify configuration. */
        interface WithConfiguration {
            /**
             * Specifies the configuration property: Defines if an existing SAP system is being registered or a new SAP
             * system is being created.
             *
             * @param configuration Defines if an existing SAP system is being registered or a new SAP system is being
             *     created.
             * @return the next definition stage.
             */
            WithCreate withConfiguration(SapConfiguration configuration);
        }
        /**
         * The stage of the SapVirtualInstance definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithManagedResourceGroupConfiguration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SapVirtualInstance create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SapVirtualInstance create(Context context);
        }
        /** The stage of the SapVirtualInstance definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SapVirtualInstance definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity (user assigned identities).
             *
             * @param identity Managed service identity (user assigned identities).
             * @return the next definition stage.
             */
            WithCreate withIdentity(UserAssignedServiceIdentity identity);
        }
        /** The stage of the SapVirtualInstance definition allowing to specify managedResourceGroupConfiguration. */
        interface WithManagedResourceGroupConfiguration {
            /**
             * Specifies the managedResourceGroupConfiguration property: Managed resource group configuration.
             *
             * @param managedResourceGroupConfiguration Managed resource group configuration.
             * @return the next definition stage.
             */
            WithCreate withManagedResourceGroupConfiguration(ManagedRGConfiguration managedResourceGroupConfiguration);
        }
    }
    /**
     * Begins update for the SapVirtualInstance resource.
     *
     * @return the stage of resource update.
     */
    SapVirtualInstance.Update update();

    /** The template for SapVirtualInstance update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SapVirtualInstance apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SapVirtualInstance apply(Context context);
    }
    /** The SapVirtualInstance update stages. */
    interface UpdateStages {
        /** The stage of the SapVirtualInstance update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the Resource tags..
             *
             * @param tags Gets or sets the Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the SapVirtualInstance update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity (user assigned identities).
             *
             * @param identity Managed service identity (user assigned identities).
             * @return the next definition stage.
             */
            Update withIdentity(UserAssignedServiceIdentity identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SapVirtualInstance refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SapVirtualInstance refresh(Context context);

    /**
     * Starts the SAP System.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult start();

    /**
     * Starts the SAP System.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult start(Context context);

    /**
     * Stops the SAP System.
     *
     * @param body The Virtual Instances for SAP stop request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult stop(StopRequest body);

    /**
     * Stops the SAP System.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult stop();

    /**
     * Stops the SAP System.
     *
     * @param body The Virtual Instances for SAP stop request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult stop(StopRequest body, Context context);
}
