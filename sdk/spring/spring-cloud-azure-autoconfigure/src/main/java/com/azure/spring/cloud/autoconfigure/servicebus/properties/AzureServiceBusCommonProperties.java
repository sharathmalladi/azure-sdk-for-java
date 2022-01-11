// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.servicebus.properties;

import com.azure.spring.cloud.autoconfigure.properties.core.AbstractAzureAmqpConfigurationProperties;
import com.azure.spring.core.implementation.connectionstring.ServiceBusConnectionString;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;

/**
 *
 */
public abstract class AzureServiceBusCommonProperties extends AbstractAzureAmqpConfigurationProperties {

    // https://help.boomi.com/bundle/connectors/page/r-atm-Microsoft_Azure_Service_Bus_connection.html
    // https://docs.microsoft.com/en-us/rest/api/servicebus/addressing-and-protocol
    /**
     * The domain name of a Service Bus namespace.
     */
    protected String domainName = "servicebus.windows.net";
    /**
     * The namespace of a service bus.
     */
    protected String namespace;
    /**
     * Connection string to connect to a service bus.
     */
    protected String connectionString;
    /**
     * The name of a Service Bus Queue or Topic.
     */
    private String entityName;
    /**
     * The type of Service Bus entity, which is a Queue or a Topic.
     */
    private ServiceBusEntityType entityType;

    private String extractFqdnFromConnectionString() {
        if (this.connectionString == null) {
            return null;
        }
        return new ServiceBusConnectionString(this.connectionString).getFullyQualifiedNamespace();
    }

    public String getFullyQualifiedNamespace() {
        return this.namespace == null ? extractFqdnFromConnectionString() : (this.namespace + "." + domainName);
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String name) {
        this.entityName = name;
    }

    public ServiceBusEntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(ServiceBusEntityType type) {
        this.entityType = type;
    }

}
