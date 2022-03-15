// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.SiteExtensionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** SiteExtensionInfo resource specific properties. */
@Fluent
public final class SiteExtensionInfoProperties {
    /*
     * Site extension ID.
     */
    @JsonProperty(value = "extension_id")
    private String extensionId;

    /*
     * The title property.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Site extension type.
     */
    @JsonProperty(value = "extension_type")
    private SiteExtensionType extensionType;

    /*
     * Summary description.
     */
    @JsonProperty(value = "summary")
    private String summary;

    /*
     * Detailed description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Version information.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Extension URL.
     */
    @JsonProperty(value = "extension_url")
    private String extensionUrl;

    /*
     * Project URL.
     */
    @JsonProperty(value = "project_url")
    private String projectUrl;

    /*
     * Icon URL.
     */
    @JsonProperty(value = "icon_url")
    private String iconUrl;

    /*
     * License URL.
     */
    @JsonProperty(value = "license_url")
    private String licenseUrl;

    /*
     * Feed URL.
     */
    @JsonProperty(value = "feed_url")
    private String feedUrl;

    /*
     * List of authors.
     */
    @JsonProperty(value = "authors")
    private List<String> authors;

    /*
     * Installer command line parameters.
     */
    @JsonProperty(value = "installer_command_line_params")
    private String installerCommandLineParams;

    /*
     * Published timestamp.
     */
    @JsonProperty(value = "published_date_time")
    private OffsetDateTime publishedDateTime;

    /*
     * Count of downloads.
     */
    @JsonProperty(value = "download_count")
    private Integer downloadCount;

    /*
     * <code>true</code> if the local version is the latest version;
     * <code>false</code> otherwise.
     */
    @JsonProperty(value = "local_is_latest_version")
    private Boolean localIsLatestVersion;

    /*
     * Local path.
     */
    @JsonProperty(value = "local_path")
    private String localPath;

    /*
     * Installed timestamp.
     */
    @JsonProperty(value = "installed_date_time")
    private OffsetDateTime installedDateTime;

    /*
     * Provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /*
     * Site Extension comment.
     */
    @JsonProperty(value = "comment")
    private String comment;

    /**
     * Get the extensionId property: Site extension ID.
     *
     * @return the extensionId value.
     */
    public String extensionId() {
        return this.extensionId;
    }

    /**
     * Set the extensionId property: Site extension ID.
     *
     * @param extensionId the extensionId value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Get the title property: The title property.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The title property.
     *
     * @param title the title value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the extensionType property: Site extension type.
     *
     * @return the extensionType value.
     */
    public SiteExtensionType extensionType() {
        return this.extensionType;
    }

    /**
     * Set the extensionType property: Site extension type.
     *
     * @param extensionType the extensionType value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withExtensionType(SiteExtensionType extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /**
     * Get the summary property: Summary description.
     *
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: Summary description.
     *
     * @param summary the summary value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the description property: Detailed description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Detailed description.
     *
     * @param description the description value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the version property: Version information.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version information.
     *
     * @param version the version value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the extensionUrl property: Extension URL.
     *
     * @return the extensionUrl value.
     */
    public String extensionUrl() {
        return this.extensionUrl;
    }

    /**
     * Set the extensionUrl property: Extension URL.
     *
     * @param extensionUrl the extensionUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withExtensionUrl(String extensionUrl) {
        this.extensionUrl = extensionUrl;
        return this;
    }

    /**
     * Get the projectUrl property: Project URL.
     *
     * @return the projectUrl value.
     */
    public String projectUrl() {
        return this.projectUrl;
    }

    /**
     * Set the projectUrl property: Project URL.
     *
     * @param projectUrl the projectUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * Get the iconUrl property: Icon URL.
     *
     * @return the iconUrl value.
     */
    public String iconUrl() {
        return this.iconUrl;
    }

    /**
     * Set the iconUrl property: Icon URL.
     *
     * @param iconUrl the iconUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * Get the licenseUrl property: License URL.
     *
     * @return the licenseUrl value.
     */
    public String licenseUrl() {
        return this.licenseUrl;
    }

    /**
     * Set the licenseUrl property: License URL.
     *
     * @param licenseUrl the licenseUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
        return this;
    }

    /**
     * Get the feedUrl property: Feed URL.
     *
     * @return the feedUrl value.
     */
    public String feedUrl() {
        return this.feedUrl;
    }

    /**
     * Set the feedUrl property: Feed URL.
     *
     * @param feedUrl the feedUrl value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
        return this;
    }

    /**
     * Get the authors property: List of authors.
     *
     * @return the authors value.
     */
    public List<String> authors() {
        return this.authors;
    }

    /**
     * Set the authors property: List of authors.
     *
     * @param authors the authors value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withAuthors(List<String> authors) {
        this.authors = authors;
        return this;
    }

    /**
     * Get the installerCommandLineParams property: Installer command line parameters.
     *
     * @return the installerCommandLineParams value.
     */
    public String installerCommandLineParams() {
        return this.installerCommandLineParams;
    }

    /**
     * Set the installerCommandLineParams property: Installer command line parameters.
     *
     * @param installerCommandLineParams the installerCommandLineParams value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withInstallerCommandLineParams(String installerCommandLineParams) {
        this.installerCommandLineParams = installerCommandLineParams;
        return this;
    }

    /**
     * Get the publishedDateTime property: Published timestamp.
     *
     * @return the publishedDateTime value.
     */
    public OffsetDateTime publishedDateTime() {
        return this.publishedDateTime;
    }

    /**
     * Set the publishedDateTime property: Published timestamp.
     *
     * @param publishedDateTime the publishedDateTime value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withPublishedDateTime(OffsetDateTime publishedDateTime) {
        this.publishedDateTime = publishedDateTime;
        return this;
    }

    /**
     * Get the downloadCount property: Count of downloads.
     *
     * @return the downloadCount value.
     */
    public Integer downloadCount() {
        return this.downloadCount;
    }

    /**
     * Set the downloadCount property: Count of downloads.
     *
     * @param downloadCount the downloadCount value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }

    /**
     * Get the localIsLatestVersion property: &lt;code&gt;true&lt;/code&gt; if the local version is the latest version;
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @return the localIsLatestVersion value.
     */
    public Boolean localIsLatestVersion() {
        return this.localIsLatestVersion;
    }

    /**
     * Set the localIsLatestVersion property: &lt;code&gt;true&lt;/code&gt; if the local version is the latest version;
     * &lt;code&gt;false&lt;/code&gt; otherwise.
     *
     * @param localIsLatestVersion the localIsLatestVersion value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withLocalIsLatestVersion(Boolean localIsLatestVersion) {
        this.localIsLatestVersion = localIsLatestVersion;
        return this;
    }

    /**
     * Get the localPath property: Local path.
     *
     * @return the localPath value.
     */
    public String localPath() {
        return this.localPath;
    }

    /**
     * Set the localPath property: Local path.
     *
     * @param localPath the localPath value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * Get the installedDateTime property: Installed timestamp.
     *
     * @return the installedDateTime value.
     */
    public OffsetDateTime installedDateTime() {
        return this.installedDateTime;
    }

    /**
     * Set the installedDateTime property: Installed timestamp.
     *
     * @param installedDateTime the installedDateTime value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withInstalledDateTime(OffsetDateTime installedDateTime) {
        this.installedDateTime = installedDateTime;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the comment property: Site Extension comment.
     *
     * @return the comment value.
     */
    public String comment() {
        return this.comment;
    }

    /**
     * Set the comment property: Site Extension comment.
     *
     * @param comment the comment value to set.
     * @return the SiteExtensionInfoProperties object itself.
     */
    public SiteExtensionInfoProperties withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
