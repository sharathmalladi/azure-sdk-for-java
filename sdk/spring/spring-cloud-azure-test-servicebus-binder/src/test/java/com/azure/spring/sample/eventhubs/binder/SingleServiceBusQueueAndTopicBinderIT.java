// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.sample.eventhubs.binder;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ActiveProfiles;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {
    SingleServiceBusQueueAndTopicBinderIT.TestQueueConfig.class,
    SingleServiceBusQueueAndTopicBinderIT.TestTopicConfig.class
})
@ActiveProfiles("single")
public class SingleServiceBusQueueAndTopicBinderIT {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingleServiceBusQueueAndTopicBinderIT.class);

    private static final String MESSAGE = UUID.randomUUID().toString();

    private static final CountDownLatch LATCH = new CountDownLatch(2);

    @Autowired
    private Sinks.Many<Message<String>> manyQueue;

    @Autowired
    private Sinks.Many<Message<String>> manyTopic;

    @EnableAutoConfiguration
    public static class TestQueueConfig {

        @Bean
        public Sinks.Many<Message<String>> manyQueue() {
            return Sinks.many().unicast().onBackpressureBuffer();
        }

        @Bean
        public Supplier<Flux<Message<String>>> queueSupply(Sinks.Many<Message<String>> manyQueue) {
            return () -> manyQueue.asFlux()
                                  .doOnNext(m -> LOGGER.info("Manually sending message {}", m))
                                  .doOnError(t -> LOGGER.error("Error encountered", t));
        }

        @Bean
        public Consumer<Message<String>> queueConsume() {
            return message -> {
                LOGGER.info("---Test queue new message received: '{}'", message);
                if (message.getPayload().equals(SingleServiceBusQueueAndTopicBinderIT.MESSAGE)) {
                    LOGGER.info("---QUEUE: PAYLOADS EQUAL !!!");
                    LATCH.countDown();
                }
            };
        }
    }

    @EnableAutoConfiguration
    public static class TestTopicConfig {

        @Bean
        public Sinks.Many<Message<String>> manyTopic() {
            return Sinks.many().unicast().onBackpressureBuffer();
        }

        @Bean
        public Supplier<Flux<Message<String>>> topicSupply(Sinks.Many<Message<String>> manyTopic) {
            return () -> manyTopic.asFlux()
                                  .doOnNext(m -> LOGGER.info("Manually sending message {}", m))
                                  .doOnError(t -> LOGGER.error("Error encountered", t));
        }

        @Bean
        public Consumer<Message<String>> topicConsume() {
            return message -> {
                LOGGER.info("---Test topic new message received: '{}'", message);
                if (message.getPayload().equals(SingleServiceBusQueueAndTopicBinderIT.MESSAGE)) {
                    LOGGER.info("---TOPIC: PAYLOADS EQUAL !!!");
                    LATCH.countDown();
                }
            };
        }
    }

    @Test
    public void testSingleServiceBusSendAndReceiveMessage() throws InterruptedException {
        LOGGER.info("SingleServiceBusQueueAndTopicBinderIT begin.");
        GenericMessage<String> genericMessage = new GenericMessage<>(MESSAGE);

        LOGGER.info("Send a message:" + MESSAGE + " to the queue.");
        manyQueue.emitNext(genericMessage, Sinks.EmitFailureHandler.FAIL_FAST);
        LOGGER.info("Send a message:" + MESSAGE + " to the topic.");
        manyTopic.emitNext(genericMessage, Sinks.EmitFailureHandler.FAIL_FAST);

        assertThat(SingleServiceBusQueueAndTopicBinderIT.LATCH.await(60, TimeUnit.SECONDS)).isTrue();
        LOGGER.info("SingleServiceBusQueueAndTopicBinderIT end.");
    }

}
