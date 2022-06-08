// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerRegistrationInner;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** An immutable client-side representation of PartnerRegistration. */
public interface PartnerRegistration {
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
     * Gets the systemData property: The system metadata relating to Partner Registration resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the partner registration.
     *
     * @return the provisioningState value.
     */
    PartnerRegistrationProvisioningState provisioningState();

    /**
     * Gets the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     *
     * @return the partnerRegistrationImmutableId value.
     */
    UUID partnerRegistrationImmutableId();

    /**
     * Gets the partnerName property: Official name of the partner name. For example: "Contoso".
     *
     * @return the partnerName value.
     */
    String partnerName();

    /**
     * Gets the partnerResourceTypeName property: Name of the partner resource type.
     *
     * @return the partnerResourceTypeName value.
     */
    String partnerResourceTypeName();

    /**
     * Gets the partnerResourceTypeDisplayName property: Display name of the partner resource type.
     *
     * @return the partnerResourceTypeDisplayName value.
     */
    String partnerResourceTypeDisplayName();

    /**
     * Gets the partnerResourceTypeDescription property: Short description of the partner resource type. The length of
     * this description should not exceed 256 characters.
     *
     * @return the partnerResourceTypeDescription value.
     */
    String partnerResourceTypeDescription();

    /**
     * Gets the longDescription property: Long description for the custom scenarios and integration to be displayed in
     * the portal if needed. Length of this description should not exceed 2048 characters.
     *
     * @return the longDescription value.
     */
    String longDescription();

    /**
     * Gets the partnerCustomerServiceNumber property: The customer service number of the publisher. The expected phone
     * format should start with a '+' sign followed by the country code. The remaining digits are then followed. Only
     * digits and spaces are allowed and its length cannot exceed 16 digits including country code. Examples of valid
     * phone numbers are: +1 515 123 4567 and +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515)
     * 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43.
     *
     * @return the partnerCustomerServiceNumber value.
     */
    String partnerCustomerServiceNumber();

    /**
     * Gets the partnerCustomerServiceExtension property: The extension of the customer service number of the publisher.
     * Only digits are allowed and number of digits should not exceed 10.
     *
     * @return the partnerCustomerServiceExtension value.
     */
    String partnerCustomerServiceExtension();

    /**
     * Gets the customerServiceUri property: The extension of the customer service URI of the publisher.
     *
     * @return the customerServiceUri value.
     */
    String customerServiceUri();

    /**
     * Gets the setupUri property: URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     *
     * @return the setupUri value.
     */
    String setupUri();

    /**
     * Gets the logoUri property: URI of the logo.
     *
     * @return the logoUri value.
     */
    String logoUri();

    /**
     * Gets the visibilityState property: Visibility state of the partner registration.
     *
     * @return the visibilityState value.
     */
    PartnerRegistrationVisibilityState visibilityState();

    /**
     * Gets the authorizedAzureSubscriptionIds property: List of Azure subscription Ids that are authorized to create a
     * partner namespace associated with this partner registration. This is an optional property. Creating partner
     * namespaces is always permitted under the same Azure subscription as the one used for creating the partner
     * registration.
     *
     * @return the authorizedAzureSubscriptionIds value.
     */
    List<String> authorizedAzureSubscriptionIds();

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
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.PartnerRegistrationInner object.
     *
     * @return the inner object.
     */
    PartnerRegistrationInner innerModel();

    /** The entirety of the PartnerRegistration definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The PartnerRegistration definition stages. */
    interface DefinitionStages {
        /** The first stage of the PartnerRegistration definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PartnerRegistration definition allowing to specify location. */
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
        /** The stage of the PartnerRegistration definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the PartnerRegistration definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithPartnerRegistrationImmutableId,
                DefinitionStages.WithPartnerName,
                DefinitionStages.WithPartnerResourceTypeName,
                DefinitionStages.WithPartnerResourceTypeDisplayName,
                DefinitionStages.WithPartnerResourceTypeDescription,
                DefinitionStages.WithLongDescription,
                DefinitionStages.WithPartnerCustomerServiceNumber,
                DefinitionStages.WithPartnerCustomerServiceExtension,
                DefinitionStages.WithCustomerServiceUri,
                DefinitionStages.WithSetupUri,
                DefinitionStages.WithLogoUri,
                DefinitionStages.WithVisibilityState,
                DefinitionStages.WithAuthorizedAzureSubscriptionIds {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PartnerRegistration create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PartnerRegistration create(Context context);
        }
        /** The stage of the PartnerRegistration definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PartnerRegistration definition allowing to specify partnerRegistrationImmutableId. */
        interface WithPartnerRegistrationImmutableId {
            /**
             * Specifies the partnerRegistrationImmutableId property: The immutableId of the corresponding partner
             * registration..
             *
             * @param partnerRegistrationImmutableId The immutableId of the corresponding partner registration.
             * @return the next definition stage.
             */
            WithCreate withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId);
        }
        /** The stage of the PartnerRegistration definition allowing to specify partnerName. */
        interface WithPartnerName {
            /**
             * Specifies the partnerName property: Official name of the partner name. For example: "Contoso"..
             *
             * @param partnerName Official name of the partner name. For example: "Contoso".
             * @return the next definition stage.
             */
            WithCreate withPartnerName(String partnerName);
        }
        /** The stage of the PartnerRegistration definition allowing to specify partnerResourceTypeName. */
        interface WithPartnerResourceTypeName {
            /**
             * Specifies the partnerResourceTypeName property: Name of the partner resource type..
             *
             * @param partnerResourceTypeName Name of the partner resource type.
             * @return the next definition stage.
             */
            WithCreate withPartnerResourceTypeName(String partnerResourceTypeName);
        }
        /** The stage of the PartnerRegistration definition allowing to specify partnerResourceTypeDisplayName. */
        interface WithPartnerResourceTypeDisplayName {
            /**
             * Specifies the partnerResourceTypeDisplayName property: Display name of the partner resource type..
             *
             * @param partnerResourceTypeDisplayName Display name of the partner resource type.
             * @return the next definition stage.
             */
            WithCreate withPartnerResourceTypeDisplayName(String partnerResourceTypeDisplayName);
        }
        /** The stage of the PartnerRegistration definition allowing to specify partnerResourceTypeDescription. */
        interface WithPartnerResourceTypeDescription {
            /**
             * Specifies the partnerResourceTypeDescription property: Short description of the partner resource type.
             * The length of this description should not exceed 256 characters..
             *
             * @param partnerResourceTypeDescription Short description of the partner resource type. The length of this
             *     description should not exceed 256 characters.
             * @return the next definition stage.
             */
            WithCreate withPartnerResourceTypeDescription(String partnerResourceTypeDescription);
        }
        /** The stage of the PartnerRegistration definition allowing to specify longDescription. */
        interface WithLongDescription {
            /**
             * Specifies the longDescription property: Long description for the custom scenarios and integration to be
             * displayed in the portal if needed. Length of this description should not exceed 2048 characters..
             *
             * @param longDescription Long description for the custom scenarios and integration to be displayed in the
             *     portal if needed. Length of this description should not exceed 2048 characters.
             * @return the next definition stage.
             */
            WithCreate withLongDescription(String longDescription);
        }
        /** The stage of the PartnerRegistration definition allowing to specify partnerCustomerServiceNumber. */
        interface WithPartnerCustomerServiceNumber {
            /**
             * Specifies the partnerCustomerServiceNumber property: The customer service number of the publisher. The
             * expected phone format should start with a '+' sign followed by the country code. The remaining digits are
             * then followed. Only digits and spaces are allowed and its length cannot exceed 16 digits including
             * country code. Examples of valid phone numbers are: +1 515 123 4567 and +966 7 5115 2471. Examples of
             * invalid phone numbers are: +1 (515) 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43.
             *
             * @param partnerCustomerServiceNumber The customer service number of the publisher. The expected phone
             *     format should start with a '+' sign followed by the country code. The remaining digits are then
             *     followed. Only digits and spaces are allowed and its length cannot exceed 16 digits including country
             *     code. Examples of valid phone numbers are: +1 515 123 4567 and +966 7 5115 2471. Examples of invalid
             *     phone numbers are: +1 (515) 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43.
             * @return the next definition stage.
             */
            WithCreate withPartnerCustomerServiceNumber(String partnerCustomerServiceNumber);
        }
        /** The stage of the PartnerRegistration definition allowing to specify partnerCustomerServiceExtension. */
        interface WithPartnerCustomerServiceExtension {
            /**
             * Specifies the partnerCustomerServiceExtension property: The extension of the customer service number of
             * the publisher. Only digits are allowed and number of digits should not exceed 10..
             *
             * @param partnerCustomerServiceExtension The extension of the customer service number of the publisher.
             *     Only digits are allowed and number of digits should not exceed 10.
             * @return the next definition stage.
             */
            WithCreate withPartnerCustomerServiceExtension(String partnerCustomerServiceExtension);
        }
        /** The stage of the PartnerRegistration definition allowing to specify customerServiceUri. */
        interface WithCustomerServiceUri {
            /**
             * Specifies the customerServiceUri property: The extension of the customer service URI of the publisher..
             *
             * @param customerServiceUri The extension of the customer service URI of the publisher.
             * @return the next definition stage.
             */
            WithCreate withCustomerServiceUri(String customerServiceUri);
        }
        /** The stage of the PartnerRegistration definition allowing to specify setupUri. */
        interface WithSetupUri {
            /**
             * Specifies the setupUri property: URI of the partner website that can be used by Azure customers to setup
             * Event Grid integration on an event source..
             *
             * @param setupUri URI of the partner website that can be used by Azure customers to setup Event Grid
             *     integration on an event source.
             * @return the next definition stage.
             */
            WithCreate withSetupUri(String setupUri);
        }
        /** The stage of the PartnerRegistration definition allowing to specify logoUri. */
        interface WithLogoUri {
            /**
             * Specifies the logoUri property: URI of the logo..
             *
             * @param logoUri URI of the logo.
             * @return the next definition stage.
             */
            WithCreate withLogoUri(String logoUri);
        }
        /** The stage of the PartnerRegistration definition allowing to specify visibilityState. */
        interface WithVisibilityState {
            /**
             * Specifies the visibilityState property: Visibility state of the partner registration..
             *
             * @param visibilityState Visibility state of the partner registration.
             * @return the next definition stage.
             */
            WithCreate withVisibilityState(PartnerRegistrationVisibilityState visibilityState);
        }
        /** The stage of the PartnerRegistration definition allowing to specify authorizedAzureSubscriptionIds. */
        interface WithAuthorizedAzureSubscriptionIds {
            /**
             * Specifies the authorizedAzureSubscriptionIds property: List of Azure subscription Ids that are authorized
             * to create a partner namespace associated with this partner registration. This is an optional property.
             * Creating partner namespaces is always permitted under the same Azure subscription as the one used for
             * creating the partner registration..
             *
             * @param authorizedAzureSubscriptionIds List of Azure subscription Ids that are authorized to create a
             *     partner namespace associated with this partner registration. This is an optional property. Creating
             *     partner namespaces is always permitted under the same Azure subscription as the one used for creating
             *     the partner registration.
             * @return the next definition stage.
             */
            WithCreate withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds);
        }
    }
    /**
     * Begins update for the PartnerRegistration resource.
     *
     * @return the stage of resource update.
     */
    PartnerRegistration.Update update();

    /** The template for PartnerRegistration update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithPartnerTopicTypeName,
            UpdateStages.WithPartnerTopicTypeDisplayName,
            UpdateStages.WithPartnerTopicTypeDescription,
            UpdateStages.WithSetupUri,
            UpdateStages.WithLogoUri,
            UpdateStages.WithAuthorizedAzureSubscriptionIds {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PartnerRegistration apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PartnerRegistration apply(Context context);
    }
    /** The PartnerRegistration update stages. */
    interface UpdateStages {
        /** The stage of the PartnerRegistration update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the partner registration resource..
             *
             * @param tags Tags of the partner registration resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the PartnerRegistration update allowing to specify partnerTopicTypeName. */
        interface WithPartnerTopicTypeName {
            /**
             * Specifies the partnerTopicTypeName property: Name of the partner topic type..
             *
             * @param partnerTopicTypeName Name of the partner topic type.
             * @return the next definition stage.
             */
            Update withPartnerTopicTypeName(String partnerTopicTypeName);
        }
        /** The stage of the PartnerRegistration update allowing to specify partnerTopicTypeDisplayName. */
        interface WithPartnerTopicTypeDisplayName {
            /**
             * Specifies the partnerTopicTypeDisplayName property: Display name of the partner topic type..
             *
             * @param partnerTopicTypeDisplayName Display name of the partner topic type.
             * @return the next definition stage.
             */
            Update withPartnerTopicTypeDisplayName(String partnerTopicTypeDisplayName);
        }
        /** The stage of the PartnerRegistration update allowing to specify partnerTopicTypeDescription. */
        interface WithPartnerTopicTypeDescription {
            /**
             * Specifies the partnerTopicTypeDescription property: Description of the partner topic type..
             *
             * @param partnerTopicTypeDescription Description of the partner topic type.
             * @return the next definition stage.
             */
            Update withPartnerTopicTypeDescription(String partnerTopicTypeDescription);
        }
        /** The stage of the PartnerRegistration update allowing to specify setupUri. */
        interface WithSetupUri {
            /**
             * Specifies the setupUri property: URI of the partner website that can be used by Azure customers to setup
             * Event Grid integration on an event source..
             *
             * @param setupUri URI of the partner website that can be used by Azure customers to setup Event Grid
             *     integration on an event source.
             * @return the next definition stage.
             */
            Update withSetupUri(String setupUri);
        }
        /** The stage of the PartnerRegistration update allowing to specify logoUri. */
        interface WithLogoUri {
            /**
             * Specifies the logoUri property: URI of the partner logo..
             *
             * @param logoUri URI of the partner logo.
             * @return the next definition stage.
             */
            Update withLogoUri(String logoUri);
        }
        /** The stage of the PartnerRegistration update allowing to specify authorizedAzureSubscriptionIds. */
        interface WithAuthorizedAzureSubscriptionIds {
            /**
             * Specifies the authorizedAzureSubscriptionIds property: List of IDs of Azure AD applications that are
             * authorized to create a partner namespace associated with this partner registration. This is an optional
             * property. Creating partner namespaces is always permitted under the same Azure subscription as the one
             * used for creating the partner registration..
             *
             * @param authorizedAzureSubscriptionIds List of IDs of Azure AD applications that are authorized to create
             *     a partner namespace associated with this partner registration. This is an optional property. Creating
             *     partner namespaces is always permitted under the same Azure subscription as the one used for creating
             *     the partner registration.
             * @return the next definition stage.
             */
            Update withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PartnerRegistration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PartnerRegistration refresh(Context context);
}
