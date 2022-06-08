// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.redisenterprise.fluent.models.OperationStatusInner;

/** An instance of this class provides access to all the operations defined in OperationsStatusClient. */
public interface OperationsStatusClient {
    /**
     * Gets the status of operation.
     *
     * @param location The region the operation is in.
     * @param operationId The operation's unique identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner get(String location, String operationId);

    /**
     * Gets the status of operation.
     *
     * @param location The region the operation is in.
     * @param operationId The operation's unique identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationStatusInner> getWithResponse(String location, String operationId, Context context);
}
