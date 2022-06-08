// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a Machine Extension. This object mirrors the definition in HybridCompute. */
@Fluent
public final class ExtensionParameters {
    /*
     * How the extension handler should be forced to update even if the
     * extension configuration has not changed.
     */
    @JsonProperty(value = "forceUpdateTag")
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension
     * will not upgrade minor versions unless redeployed, even with this
     * property set to true.
     */
    @JsonProperty(value = "autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * Json formatted public settings for the extension.
     */
    @JsonProperty(value = "settings")
    private Object settings;

    /*
     * Protected settings (may contain secrets).
     */
    @JsonProperty(value = "protectedSettings")
    private Object protectedSettings;

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param type the type value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     *
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: Protected settings (may contain secrets).
     *
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: Protected settings (may contain secrets).
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
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
