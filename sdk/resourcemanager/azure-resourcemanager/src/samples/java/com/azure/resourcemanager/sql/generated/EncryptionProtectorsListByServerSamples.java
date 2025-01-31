// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for EncryptionProtectors ListByServer. */
public final class EncryptionProtectorsListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2015-05-01-preview/examples/EncryptionProtectorList.json
     */
    /**
     * Sample code: List encryption protectors by server.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listEncryptionProtectorsByServer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getEncryptionProtectors()
            .listByServer("sqlcrudtest-7398", "sqlcrudtest-4645", Context.NONE);
    }
}
