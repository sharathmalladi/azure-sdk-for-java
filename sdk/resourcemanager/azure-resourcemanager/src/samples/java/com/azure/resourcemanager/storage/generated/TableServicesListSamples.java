// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for TableServices List. */
public final class TableServicesListSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/TableServicesList.json
     */
    /**
     * Sample code: TableServicesList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void tableServicesList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getTableServices()
            .listWithResponse("res9290", "sto1590", Context.NONE);
    }
}
