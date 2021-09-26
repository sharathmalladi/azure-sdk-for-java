// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.communication.callingserver.models.OperationStatus;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response payload for start hold music operation. */
@Fluent
public final class StopHoldMusicResult {
    /*
     * The operation id.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * The status of the operation
     */
    @JsonProperty(value = "status", required = true)
    private OperationStatus status;

    /*
     * The operation context provided by client.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * The result info for the operation.
     */
    @JsonProperty(value = "resultInfo")
    private ResultInfoInternal resultInfo;

    /**
     * Get the operationId property: The operation id.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The operation id.
     *
     * @param operationId the operationId value to set.
     * @return the StopHoldMusicResult object itself.
     */
    public StopHoldMusicResult setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the StopHoldMusicResult object itself.
     */
    public StopHoldMusicResult setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the operationContext property: The operation context provided by client.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context provided by client.
     *
     * @param operationContext the operationContext value to set.
     * @return the StopHoldMusicResult object itself.
     */
    public StopHoldMusicResult setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the resultInfo property: The result info for the operation.
     *
     * @return the resultInfo value.
     */
    public ResultInfoInternal getResultInfo() {
        return this.resultInfo;
    }

    /**
     * Set the resultInfo property: The result info for the operation.
     *
     * @param resultInfo the resultInfo value to set.
     * @return the StopHoldMusicResult object itself.
     */
    public StopHoldMusicResult setResultInfo(ResultInfoInternal resultInfo) {
        this.resultInfo = resultInfo;
        return this;
    }
}
