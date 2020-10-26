/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18.implementation;

import com.microsoft.azure.management.kusto.v2020_09_18.FollowerDatabaseDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class FollowerDatabaseDefinitionImpl extends WrapperImpl<FollowerDatabaseDefinitionInner> implements FollowerDatabaseDefinition {
    private final KustoManager manager;
    FollowerDatabaseDefinitionImpl(FollowerDatabaseDefinitionInner inner, KustoManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public String attachedDatabaseConfigurationName() {
        return this.inner().attachedDatabaseConfigurationName();
    }

    @Override
    public String clusterResourceId() {
        return this.inner().clusterResourceId();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

}
