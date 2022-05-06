// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Cognitive Services account deployment. */
@Fluent
public final class DeploymentProperties {
    /*
     * Gets the status of the resource at the time the operation was called.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentProvisioningState provisioningState;

    /*
     * Properties of Cognitive Services account deployment model.
     */
    @JsonProperty(value = "model")
    private DeploymentModel model;

    /*
     * Properties of Cognitive Services account deployment model.
     */
    @JsonProperty(value = "scaleSettings")
    private DeploymentScaleSettings scaleSettings;

    /**
     * Get the provisioningState property: Gets the status of the resource at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public DeploymentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the model property: Properties of Cognitive Services account deployment model.
     *
     * @return the model value.
     */
    public DeploymentModel model() {
        return this.model;
    }

    /**
     * Set the model property: Properties of Cognitive Services account deployment model.
     *
     * @param model the model value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withModel(DeploymentModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get the scaleSettings property: Properties of Cognitive Services account deployment model.
     *
     * @return the scaleSettings value.
     */
    public DeploymentScaleSettings scaleSettings() {
        return this.scaleSettings;
    }

    /**
     * Set the scaleSettings property: Properties of Cognitive Services account deployment model.
     *
     * @param scaleSettings the scaleSettings value to set.
     * @return the DeploymentProperties object itself.
     */
    public DeploymentProperties withScaleSettings(DeploymentScaleSettings scaleSettings) {
        this.scaleSettings = scaleSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (model() != null) {
            model().validate();
        }
        if (scaleSettings() != null) {
            scaleSettings().validate();
        }
    }
}
