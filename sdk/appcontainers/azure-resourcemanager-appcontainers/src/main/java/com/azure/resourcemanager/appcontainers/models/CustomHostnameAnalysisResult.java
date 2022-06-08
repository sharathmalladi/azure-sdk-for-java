// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcontainers.fluent.models.CustomHostnameAnalysisResultInner;
import java.util.List;

/** An immutable client-side representation of CustomHostnameAnalysisResult. */
public interface CustomHostnameAnalysisResult {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the hostname property: Host name that was analyzed.
     *
     * @return the hostname value.
     */
    String hostname();

    /**
     * Gets the isHostnameAlreadyVerified property: &lt;code&gt;true&lt;/code&gt; if hostname is already verified;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isHostnameAlreadyVerified value.
     */
    Boolean isHostnameAlreadyVerified();

    /**
     * Gets the customDomainVerificationTest property: DNS verification test result.
     *
     * @return the customDomainVerificationTest value.
     */
    DnsVerificationTestResult customDomainVerificationTest();

    /**
     * Gets the customDomainVerificationFailureInfo property: Raw failure information if DNS verification fails.
     *
     * @return the customDomainVerificationFailureInfo value.
     */
    DefaultErrorResponseError customDomainVerificationFailureInfo();

    /**
     * Gets the hasConflictOnManagedEnvironment property: &lt;code&gt;true&lt;/code&gt; if there is a conflict on the
     * Container App's managed environment; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the hasConflictOnManagedEnvironment value.
     */
    Boolean hasConflictOnManagedEnvironment();

    /**
     * Gets the conflictingContainerAppResourceId property: Name of the conflicting Container App on the Managed
     * Environment if it's within the same subscription.
     *
     * @return the conflictingContainerAppResourceId value.
     */
    String conflictingContainerAppResourceId();

    /**
     * Gets the cNameRecords property: CName records visible for this hostname.
     *
     * @return the cNameRecords value.
     */
    List<String> cNameRecords();

    /**
     * Gets the txtRecords property: TXT records visible for this hostname.
     *
     * @return the txtRecords value.
     */
    List<String> txtRecords();

    /**
     * Gets the aRecords property: A records visible for this hostname.
     *
     * @return the aRecords value.
     */
    List<String> aRecords();

    /**
     * Gets the alternateCNameRecords property: Alternate CName records visible for this hostname.
     *
     * @return the alternateCNameRecords value.
     */
    List<String> alternateCNameRecords();

    /**
     * Gets the alternateTxtRecords property: Alternate TXT records visible for this hostname.
     *
     * @return the alternateTxtRecords value.
     */
    List<String> alternateTxtRecords();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.CustomHostnameAnalysisResultInner object.
     *
     * @return the inner object.
     */
    CustomHostnameAnalysisResultInner innerModel();
}
