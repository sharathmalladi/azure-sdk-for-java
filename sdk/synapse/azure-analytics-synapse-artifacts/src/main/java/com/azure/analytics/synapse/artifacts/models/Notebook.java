// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Notebook. */
@Fluent
public final class Notebook {
    /*
     * The description of the notebook.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Big data pool reference.
     */
    @JsonProperty(value = "bigDataPool")
    private BigDataPoolReference bigDataPool;

    /*
     * Session properties.
     */
    @JsonProperty(value = "sessionProperties")
    private NotebookSessionProperties sessionProperties;

    /*
     * Notebook root-level metadata.
     */
    @JsonProperty(value = "metadata", required = true)
    private NotebookMetadata metadata;

    /*
     * Notebook format (major number). Incremented between backwards
     * incompatible changes to the notebook format.
     */
    @JsonProperty(value = "nbformat", required = true)
    private int nbformat;

    /*
     * Notebook format (minor number). Incremented for backward compatible
     * changes to the notebook format.
     */
    @JsonProperty(value = "nbformat_minor", required = true)
    private int nbformatMinor;

    /*
     * Array of cells of the current notebook.
     */
    @JsonProperty(value = "cells", required = true)
    private List<NotebookCell> cells;

    /*
     * The folder that this notebook is in. If not specified, this notebook
     * will appear at the root level.
     */
    @JsonProperty(value = "folder")
    private NotebookFolder folder;

    /*
     * Notebook.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the description property: The description of the notebook.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the notebook.
     *
     * @param description the description value to set.
     * @return the Notebook object itself.
     */
    public Notebook setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the bigDataPool property: Big data pool reference.
     *
     * @return the bigDataPool value.
     */
    public BigDataPoolReference getBigDataPool() {
        return this.bigDataPool;
    }

    /**
     * Set the bigDataPool property: Big data pool reference.
     *
     * @param bigDataPool the bigDataPool value to set.
     * @return the Notebook object itself.
     */
    public Notebook setBigDataPool(BigDataPoolReference bigDataPool) {
        this.bigDataPool = bigDataPool;
        return this;
    }

    /**
     * Get the sessionProperties property: Session properties.
     *
     * @return the sessionProperties value.
     */
    public NotebookSessionProperties getSessionProperties() {
        return this.sessionProperties;
    }

    /**
     * Set the sessionProperties property: Session properties.
     *
     * @param sessionProperties the sessionProperties value to set.
     * @return the Notebook object itself.
     */
    public Notebook setSessionProperties(NotebookSessionProperties sessionProperties) {
        this.sessionProperties = sessionProperties;
        return this;
    }

    /**
     * Get the metadata property: Notebook root-level metadata.
     *
     * @return the metadata value.
     */
    public NotebookMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Notebook root-level metadata.
     *
     * @param metadata the metadata value to set.
     * @return the Notebook object itself.
     */
    public Notebook setMetadata(NotebookMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the nbformat property: Notebook format (major number). Incremented between backwards incompatible changes to
     * the notebook format.
     *
     * @return the nbformat value.
     */
    public int getNbformat() {
        return this.nbformat;
    }

    /**
     * Set the nbformat property: Notebook format (major number). Incremented between backwards incompatible changes to
     * the notebook format.
     *
     * @param nbformat the nbformat value to set.
     * @return the Notebook object itself.
     */
    public Notebook setNbformat(int nbformat) {
        this.nbformat = nbformat;
        return this;
    }

    /**
     * Get the nbformatMinor property: Notebook format (minor number). Incremented for backward compatible changes to
     * the notebook format.
     *
     * @return the nbformatMinor value.
     */
    public int getNbformatMinor() {
        return this.nbformatMinor;
    }

    /**
     * Set the nbformatMinor property: Notebook format (minor number). Incremented for backward compatible changes to
     * the notebook format.
     *
     * @param nbformatMinor the nbformatMinor value to set.
     * @return the Notebook object itself.
     */
    public Notebook setNbformatMinor(int nbformatMinor) {
        this.nbformatMinor = nbformatMinor;
        return this;
    }

    /**
     * Get the cells property: Array of cells of the current notebook.
     *
     * @return the cells value.
     */
    public List<NotebookCell> getCells() {
        return this.cells;
    }

    /**
     * Set the cells property: Array of cells of the current notebook.
     *
     * @param cells the cells value to set.
     * @return the Notebook object itself.
     */
    public Notebook setCells(List<NotebookCell> cells) {
        this.cells = cells;
        return this;
    }

    /**
     * Get the folder property: The folder that this notebook is in. If not specified, this notebook will appear at the
     * root level.
     *
     * @return the folder value.
     */
    public NotebookFolder getFolder() {
        return this.folder;
    }

    /**
     * Set the folder property: The folder that this notebook is in. If not specified, this notebook will appear at the
     * root level.
     *
     * @param folder the folder value to set.
     * @return the Notebook object itself.
     */
    public Notebook setFolder(NotebookFolder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Get the additionalProperties property: Notebook.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Notebook.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Notebook object itself.
     */
    public Notebook setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
