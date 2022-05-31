// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicelinker.models.AuthType;
import com.azure.resourcemanager.servicelinker.models.ValidationResultItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The validation operation result for a linker. */
@Fluent
public final class ValidateOperationResultInner {
    /*
     * The validation result detail.
     */
    @JsonProperty(value = "properties")
    private ValidateResult innerProperties;

    /*
     * Validated linker id.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Validation operation status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get the innerProperties property: The validation result detail.
     *
     * @return the innerProperties value.
     */
    private ValidateResult innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: Validated linker id.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Validated linker id.
     *
     * @param resourceId the resourceId value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the status property: Validation operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Validation operation status.
     *
     * @param status the status value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the linkerName property: The linker name.
     *
     * @return the linkerName value.
     */
    public String linkerName() {
        return this.innerProperties() == null ? null : this.innerProperties().linkerName();
    }

    /**
     * Set the linkerName property: The linker name.
     *
     * @param linkerName the linkerName value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withLinkerName(String linkerName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withLinkerName(linkerName);
        return this;
    }

    /**
     * Get the isConnectionAvailable property: A boolean value indicating whether the connection is available or not.
     *
     * @return the isConnectionAvailable value.
     */
    public Boolean isConnectionAvailable() {
        return this.innerProperties() == null ? null : this.innerProperties().isConnectionAvailable();
    }

    /**
     * Set the isConnectionAvailable property: A boolean value indicating whether the connection is available or not.
     *
     * @param isConnectionAvailable the isConnectionAvailable value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withIsConnectionAvailable(Boolean isConnectionAvailable) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withIsConnectionAvailable(isConnectionAvailable);
        return this;
    }

    /**
     * Get the reportStartTimeUtc property: The start time of the validation report.
     *
     * @return the reportStartTimeUtc value.
     */
    public OffsetDateTime reportStartTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().reportStartTimeUtc();
    }

    /**
     * Set the reportStartTimeUtc property: The start time of the validation report.
     *
     * @param reportStartTimeUtc the reportStartTimeUtc value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withReportStartTimeUtc(OffsetDateTime reportStartTimeUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withReportStartTimeUtc(reportStartTimeUtc);
        return this;
    }

    /**
     * Get the reportEndTimeUtc property: The end time of the validation report.
     *
     * @return the reportEndTimeUtc value.
     */
    public OffsetDateTime reportEndTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().reportEndTimeUtc();
    }

    /**
     * Set the reportEndTimeUtc property: The end time of the validation report.
     *
     * @param reportEndTimeUtc the reportEndTimeUtc value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withReportEndTimeUtc(OffsetDateTime reportEndTimeUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withReportEndTimeUtc(reportEndTimeUtc);
        return this;
    }

    /**
     * Get the sourceId property: The resource id of the linker source application.
     *
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceId();
    }

    /**
     * Set the sourceId property: The resource id of the linker source application.
     *
     * @param sourceId the sourceId value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withSourceId(String sourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withSourceId(sourceId);
        return this;
    }

    /**
     * Get the targetId property: The resource Id of target service.
     *
     * @return the targetId value.
     */
    public String targetId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetId();
    }

    /**
     * Set the targetId property: The resource Id of target service.
     *
     * @param targetId the targetId value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withTargetId(String targetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withTargetId(targetId);
        return this;
    }

    /**
     * Get the authType property: The authentication type.
     *
     * @return the authType value.
     */
    public AuthType authType() {
        return this.innerProperties() == null ? null : this.innerProperties().authType();
    }

    /**
     * Set the authType property: The authentication type.
     *
     * @param authType the authType value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withAuthType(AuthType authType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withAuthType(authType);
        return this;
    }

    /**
     * Get the validationDetail property: The detail of validation result.
     *
     * @return the validationDetail value.
     */
    public List<ValidationResultItem> validationDetail() {
        return this.innerProperties() == null ? null : this.innerProperties().validationDetail();
    }

    /**
     * Set the validationDetail property: The detail of validation result.
     *
     * @param validationDetail the validationDetail value to set.
     * @return the ValidateOperationResultInner object itself.
     */
    public ValidateOperationResultInner withValidationDetail(List<ValidationResultItem> validationDetail) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ValidateResult();
        }
        this.innerProperties().withValidationDetail(validationDetail);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
