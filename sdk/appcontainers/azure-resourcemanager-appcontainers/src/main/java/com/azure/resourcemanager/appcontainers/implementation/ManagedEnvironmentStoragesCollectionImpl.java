// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentStorageInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentStoragesCollectionInner;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentStorage;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentStoragesCollection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ManagedEnvironmentStoragesCollectionImpl implements ManagedEnvironmentStoragesCollection {
    private ManagedEnvironmentStoragesCollectionInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    ManagedEnvironmentStoragesCollectionImpl(
        ManagedEnvironmentStoragesCollectionInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ManagedEnvironmentStorage> value() {
        List<ManagedEnvironmentStorageInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ManagedEnvironmentStorageImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ManagedEnvironmentStoragesCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
