// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Restore file specs like file path, type and target folder path info. */
@Fluent
public final class RestoreFileSpecs {
    /*
     * Source File/Folder path
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Indicates what the Path variable stands for
     */
    @JsonProperty(value = "fileSpecType")
    private String fileSpecType;

    /*
     * Destination folder path in target FileShare
     */
    @JsonProperty(value = "targetFolderPath")
    private String targetFolderPath;

    /**
     * Get the path property: Source File/Folder path.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Source File/Folder path.
     *
     * @param path the path value to set.
     * @return the RestoreFileSpecs object itself.
     */
    public RestoreFileSpecs withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the fileSpecType property: Indicates what the Path variable stands for.
     *
     * @return the fileSpecType value.
     */
    public String fileSpecType() {
        return this.fileSpecType;
    }

    /**
     * Set the fileSpecType property: Indicates what the Path variable stands for.
     *
     * @param fileSpecType the fileSpecType value to set.
     * @return the RestoreFileSpecs object itself.
     */
    public RestoreFileSpecs withFileSpecType(String fileSpecType) {
        this.fileSpecType = fileSpecType;
        return this;
    }

    /**
     * Get the targetFolderPath property: Destination folder path in target FileShare.
     *
     * @return the targetFolderPath value.
     */
    public String targetFolderPath() {
        return this.targetFolderPath;
    }

    /**
     * Set the targetFolderPath property: Destination folder path in target FileShare.
     *
     * @param targetFolderPath the targetFolderPath value to set.
     * @return the RestoreFileSpecs object itself.
     */
    public RestoreFileSpecs withTargetFolderPath(String targetFolderPath) {
        this.targetFolderPath = targetFolderPath;
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
