// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceResourceInner;
import com.azure.resourcemanager.apimanagement.models.AdditionalLocation;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceApplyNetworkConfigurationParameters;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceBackupRestoreParameters;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceGetSsoTokenResult;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceIdentity;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceResource;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceSkuProperties;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceUpdateParameters;
import com.azure.resourcemanager.apimanagement.models.ApiVersionConstraint;
import com.azure.resourcemanager.apimanagement.models.CertificateConfiguration;
import com.azure.resourcemanager.apimanagement.models.HostnameConfiguration;
import com.azure.resourcemanager.apimanagement.models.VirtualNetworkConfiguration;
import com.azure.resourcemanager.apimanagement.models.VirtualNetworkType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApiManagementServiceResourceImpl
    implements ApiManagementServiceResource,
        ApiManagementServiceResource.Definition,
        ApiManagementServiceResource.Update {
    private ApiManagementServiceResourceInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ApiManagementServiceSkuProperties sku() {
        return this.innerModel().sku();
    }

    public ApiManagementServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String notificationSenderEmail() {
        return this.innerModel().notificationSenderEmail();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String targetProvisioningState() {
        return this.innerModel().targetProvisioningState();
    }

    public OffsetDateTime createdAtUtc() {
        return this.innerModel().createdAtUtc();
    }

    public String gatewayUrl() {
        return this.innerModel().gatewayUrl();
    }

    public String gatewayRegionalUrl() {
        return this.innerModel().gatewayRegionalUrl();
    }

    public String portalUrl() {
        return this.innerModel().portalUrl();
    }

    public String managementApiUrl() {
        return this.innerModel().managementApiUrl();
    }

    public String scmUrl() {
        return this.innerModel().scmUrl();
    }

    public String developerPortalUrl() {
        return this.innerModel().developerPortalUrl();
    }

    public List<HostnameConfiguration> hostnameConfigurations() {
        List<HostnameConfiguration> inner = this.innerModel().hostnameConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> publicIpAddresses() {
        List<String> inner = this.innerModel().publicIpAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> privateIpAddresses() {
        List<String> inner = this.innerModel().privateIpAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualNetworkConfiguration virtualNetworkConfiguration() {
        return this.innerModel().virtualNetworkConfiguration();
    }

    public List<AdditionalLocation> additionalLocations() {
        List<AdditionalLocation> inner = this.innerModel().additionalLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, String> customProperties() {
        Map<String, String> inner = this.innerModel().customProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<CertificateConfiguration> certificates() {
        List<CertificateConfiguration> inner = this.innerModel().certificates();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableClientCertificate() {
        return this.innerModel().enableClientCertificate();
    }

    public Boolean disableGateway() {
        return this.innerModel().disableGateway();
    }

    public VirtualNetworkType virtualNetworkType() {
        return this.innerModel().virtualNetworkType();
    }

    public ApiVersionConstraint apiVersionConstraint() {
        return this.innerModel().apiVersionConstraint();
    }

    public Boolean restore() {
        return this.innerModel().restore();
    }

    public String publisherEmail() {
        return this.innerModel().publisherEmail();
    }

    public String publisherName() {
        return this.innerModel().publisherName();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ApiManagementServiceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private ApiManagementServiceUpdateParameters updateParameters;

    public ApiManagementServiceResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ApiManagementServiceResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiManagementServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ApiManagementServiceResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiManagementServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), context);
        return this;
    }

    ApiManagementServiceResourceImpl(
        String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new ApiManagementServiceResourceInner();
        this.serviceManager = serviceManager;
        this.serviceName = name;
    }

    public ApiManagementServiceResourceImpl update() {
        this.updateParameters = new ApiManagementServiceUpdateParameters();
        return this;
    }

    public ApiManagementServiceResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiManagementServices()
                .update(resourceGroupName, serviceName, updateParameters, Context.NONE);
        return this;
    }

    public ApiManagementServiceResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiManagementServices()
                .update(resourceGroupName, serviceName, updateParameters, context);
        return this;
    }

    ApiManagementServiceResourceImpl(
        ApiManagementServiceResourceInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
    }

    public ApiManagementServiceResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiManagementServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, Context.NONE)
                .getValue();
        return this;
    }

    public ApiManagementServiceResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiManagementServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, context)
                .getValue();
        return this;
    }

    public ApiManagementServiceResource backup(ApiManagementServiceBackupRestoreParameters parameters) {
        return serviceManager.apiManagementServices().backup(resourceGroupName, serviceName, parameters);
    }

    public ApiManagementServiceResource backup(
        ApiManagementServiceBackupRestoreParameters parameters, Context context) {
        return serviceManager.apiManagementServices().backup(resourceGroupName, serviceName, parameters, context);
    }

    public ApiManagementServiceGetSsoTokenResult getSsoToken() {
        return serviceManager.apiManagementServices().getSsoToken(resourceGroupName, serviceName);
    }

    public Response<ApiManagementServiceGetSsoTokenResult> getSsoTokenWithResponse(Context context) {
        return serviceManager.apiManagementServices().getSsoTokenWithResponse(resourceGroupName, serviceName, context);
    }

    public ApiManagementServiceResource applyNetworkConfigurationUpdates(
        ApiManagementServiceApplyNetworkConfigurationParameters parameters) {
        return serviceManager
            .apiManagementServices()
            .applyNetworkConfigurationUpdates(resourceGroupName, serviceName, parameters);
    }

    public ApiManagementServiceResource applyNetworkConfigurationUpdates() {
        return serviceManager.apiManagementServices().applyNetworkConfigurationUpdates(resourceGroupName, serviceName);
    }

    public ApiManagementServiceResource applyNetworkConfigurationUpdates(
        ApiManagementServiceApplyNetworkConfigurationParameters parameters, Context context) {
        return serviceManager
            .apiManagementServices()
            .applyNetworkConfigurationUpdates(resourceGroupName, serviceName, parameters, context);
    }

    public ApiManagementServiceResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApiManagementServiceResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApiManagementServiceResourceImpl withSku(ApiManagementServiceSkuProperties sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withPublisherEmail(String publisherEmail) {
        if (isInCreateMode()) {
            this.innerModel().withPublisherEmail(publisherEmail);
            return this;
        } else {
            this.updateParameters.withPublisherEmail(publisherEmail);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withPublisherName(String publisherName) {
        if (isInCreateMode()) {
            this.innerModel().withPublisherName(publisherName);
            return this;
        } else {
            this.updateParameters.withPublisherName(publisherName);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withIdentity(ApiManagementServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public ApiManagementServiceResourceImpl withNotificationSenderEmail(String notificationSenderEmail) {
        if (isInCreateMode()) {
            this.innerModel().withNotificationSenderEmail(notificationSenderEmail);
            return this;
        } else {
            this.updateParameters.withNotificationSenderEmail(notificationSenderEmail);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withHostnameConfigurations(
        List<HostnameConfiguration> hostnameConfigurations) {
        if (isInCreateMode()) {
            this.innerModel().withHostnameConfigurations(hostnameConfigurations);
            return this;
        } else {
            this.updateParameters.withHostnameConfigurations(hostnameConfigurations);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withVirtualNetworkConfiguration(
        VirtualNetworkConfiguration virtualNetworkConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withVirtualNetworkConfiguration(virtualNetworkConfiguration);
            return this;
        } else {
            this.updateParameters.withVirtualNetworkConfiguration(virtualNetworkConfiguration);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withAdditionalLocations(List<AdditionalLocation> additionalLocations) {
        if (isInCreateMode()) {
            this.innerModel().withAdditionalLocations(additionalLocations);
            return this;
        } else {
            this.updateParameters.withAdditionalLocations(additionalLocations);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withCustomProperties(Map<String, String> customProperties) {
        if (isInCreateMode()) {
            this.innerModel().withCustomProperties(customProperties);
            return this;
        } else {
            this.updateParameters.withCustomProperties(customProperties);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withCertificates(List<CertificateConfiguration> certificates) {
        if (isInCreateMode()) {
            this.innerModel().withCertificates(certificates);
            return this;
        } else {
            this.updateParameters.withCertificates(certificates);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withEnableClientCertificate(Boolean enableClientCertificate) {
        if (isInCreateMode()) {
            this.innerModel().withEnableClientCertificate(enableClientCertificate);
            return this;
        } else {
            this.updateParameters.withEnableClientCertificate(enableClientCertificate);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withDisableGateway(Boolean disableGateway) {
        if (isInCreateMode()) {
            this.innerModel().withDisableGateway(disableGateway);
            return this;
        } else {
            this.updateParameters.withDisableGateway(disableGateway);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withVirtualNetworkType(VirtualNetworkType virtualNetworkType) {
        if (isInCreateMode()) {
            this.innerModel().withVirtualNetworkType(virtualNetworkType);
            return this;
        } else {
            this.updateParameters.withVirtualNetworkType(virtualNetworkType);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withApiVersionConstraint(ApiVersionConstraint apiVersionConstraint) {
        if (isInCreateMode()) {
            this.innerModel().withApiVersionConstraint(apiVersionConstraint);
            return this;
        } else {
            this.updateParameters.withApiVersionConstraint(apiVersionConstraint);
            return this;
        }
    }

    public ApiManagementServiceResourceImpl withRestore(Boolean restore) {
        if (isInCreateMode()) {
            this.innerModel().withRestore(restore);
            return this;
        } else {
            this.updateParameters.withRestore(restore);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
