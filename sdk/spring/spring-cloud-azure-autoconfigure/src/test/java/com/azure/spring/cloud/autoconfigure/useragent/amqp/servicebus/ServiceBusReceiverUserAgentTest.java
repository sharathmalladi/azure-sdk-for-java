// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.useragent.amqp.servicebus;

import com.azure.core.util.ClientOptions;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.spring.cloud.autoconfigure.properties.AzureGlobalProperties;
import com.azure.spring.cloud.autoconfigure.servicebus.AzureServiceBusAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.useragent.util.UserAgentTestUtil;
import com.azure.spring.core.AzureSpringIdentifier;
import com.azure.spring.service.implementation.servicebus.factory.ServiceBusReceiverClientBuilderFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class ServiceBusReceiverUserAgentTest {

    @Test
    void shareServiceBusClientBuilderUserAgentTest() {
        userAgentTest(
            "spring.cloud.azure.servicebus.connection-string=Endpoint=sb://sample.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=key",
            "spring.cloud.azure.servicebus.consumer.entity-name=sample",
            "spring.cloud.azure.servicebus.consumer.entity-type=QUEUE"
        );
    }

    @Test
    void notShareServiceBusClientBuilderUserAgentTest() {
        userAgentTest(
            "spring.cloud.azure.servicebus.connection-string=Endpoint=sb://sample.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=key",
            "spring.cloud.azure.servicebus.consumer.entity-name=sample",
            "spring.cloud.azure.servicebus.consumer.entity-type=QUEUE",
            "spring.cloud.azure.servicebus.consumer.namespace=sample"
        );
    }

    void userAgentTest(String... propertyValues) {
        new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(AzureServiceBusAutoConfiguration.class))
            .withBean(AzureGlobalProperties.class, AzureGlobalProperties::new)
            .withPropertyValues(propertyValues)
            .run(context -> {
                assertThat(context).hasSingleBean(ServiceBusReceiverClientBuilderFactory.class);
                assertThat(context).hasSingleBean(ServiceBusClientBuilder.ServiceBusReceiverClientBuilder.class);

                ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverClientBuilder = context.getBean(ServiceBusClientBuilder.ServiceBusReceiverClientBuilder.class);
                ServiceBusClientBuilder builder = (ServiceBusClientBuilder) UserAgentTestUtil.getPrivateFieldValue(ServiceBusClientBuilder.ServiceBusReceiverClientBuilder.class, "this$0", receiverClientBuilder);
                ClientOptions options = (ClientOptions) UserAgentTestUtil.getPrivateFieldValue(ServiceBusClientBuilder.class, "clientOptions", builder);
                Assertions.assertNotNull(options);
                Assertions.assertEquals(AzureSpringIdentifier.AZURE_SPRING_SERVICE_BUS, options.getApplicationId());

            });
    }

}
