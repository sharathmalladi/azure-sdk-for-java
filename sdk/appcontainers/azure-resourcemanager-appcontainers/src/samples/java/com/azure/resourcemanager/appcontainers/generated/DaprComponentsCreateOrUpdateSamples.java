// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.DaprMetadata;
import com.azure.resourcemanager.appcontainers.models.Secret;
import java.util.Arrays;

/** Samples for DaprComponents CreateOrUpdate. */
public final class DaprComponentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-01-01-preview/examples/DaprComponents_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update dapr component.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateDaprComponent(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .daprComponents()
            .define("reddog")
            .withExistingManagedEnvironment("examplerg", "myenvironment")
            .withComponentType("state.azure.cosmosdb")
            .withVersion("v1")
            .withIgnoreErrors(false)
            .withInitTimeout("50s")
            .withSecrets(Arrays.asList(new Secret().withName("masterkey").withValue("keyvalue")))
            .withMetadata(
                Arrays
                    .asList(
                        new DaprMetadata().withName("url").withValue("<COSMOS-URL>"),
                        new DaprMetadata().withName("database").withValue("itemsDB"),
                        new DaprMetadata().withName("collection").withValue("items"),
                        new DaprMetadata().withName("masterkey").withSecretRef("masterkey")))
            .withScopes(Arrays.asList("container-app-1", "container-app-2"))
            .create();
    }
}
