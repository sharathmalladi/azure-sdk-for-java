// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.personalizer;

import com.azure.ai.personalizer.models.PersonalizerPolicy;
import com.azure.ai.personalizer.models.PersonalizerServiceProperties;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;

import java.time.Duration;

import static com.azure.ai.personalizer.TestUtils.*;
import static com.azure.ai.personalizer.implementation.util.Constants.DEFAULT_POLL_INTERVAL;


public abstract class PersonalizerTestBase extends TestBase {

    Duration durationTestMode;

    /**
     * Use duration of nearly zero value for PLAYBACK test mode, otherwise, use default duration value for LIVE mode.
     */
    @Override
    protected void beforeTest() {
        durationTestMode = interceptorManager.isPlaybackMode() ? ONE_NANO_DURATION : DEFAULT_POLL_INTERVAL;
    }

    public PersonalizerClientBuilderBase setBuilderProperties(PersonalizerClientBuilderBase builder,
                                                        HttpClient httpClient,
                                                        PersonalizerServiceVersion serviceVersion,
                                                        boolean isSingleSlot) {
        String endpoint = getEndpoint(isSingleSlot);
        PersonalizerAudience audience = TestUtils.getAudience(endpoint);

        builder = builder
            .endpoint(endpoint)
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient)
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .serviceVersion(serviceVersion)
            .addPolicy(interceptorManager.getRecordPolicy())
            .audience(audience);

        if (getTestMode() == TestMode.PLAYBACK) {
            builder.credential(new AzureKeyCredential(INVALID_KEY));
        } else {
            if (isSingleSlot) {
                builder.credential(new AzureKeyCredential(PERSONALIZER_API_KEY_SINGLE_SLOT));
            } else {
                builder.credential(new AzureKeyCredential(PERSONALIZER_API_KEY_MULTI_SLOT));
            }
        }

        return builder;
    }

    public PersonalizerClientBuilder getPersonalizerClientBuilder(HttpClient httpClient,
                                                                  PersonalizerServiceVersion serviceVersion,
                                                                  boolean isSingleSlot) {
        PersonalizerClientBuilder builder = new PersonalizerClientBuilder();
        return (PersonalizerClientBuilder) setBuilderProperties(builder, httpClient, serviceVersion, isSingleSlot);
    }

    protected PersonalizerClient getClient(
        HttpClient httpClient,
        PersonalizerServiceVersion serviceVersion,
        boolean isSingleSlot) {
        PersonalizerAdminClient adminClient = getAdministrationClient(httpClient, serviceVersion, isSingleSlot);
        if (!isSingleSlot) {
            enableMultiSlot(adminClient);
        }

        return getPersonalizerClientBuilder(httpClient, serviceVersion, isSingleSlot)
            .buildClient();
    }

    protected PersonalizerAdminClientBuilder getAdministrationClientBuilder(
        HttpClient httpClient,
        PersonalizerServiceVersion serviceVersion,
        boolean isSingleSlot) {
        PersonalizerAdminClientBuilder builder = new PersonalizerAdminClientBuilder();
        return (PersonalizerAdminClientBuilder) setBuilderProperties(builder, httpClient, serviceVersion, isSingleSlot);
    }

    protected PersonalizerAdminAsyncClient getAdministrationAsyncClient(
        HttpClient httpClient,
        PersonalizerServiceVersion serviceVersion,
        boolean isSingleSlot) {
        return getAdministrationClientBuilder(httpClient, serviceVersion, isSingleSlot)
            .buildAdminAsyncClient();
    }

    protected PersonalizerAdminClient getAdministrationClient(
        HttpClient httpClient,
        PersonalizerServiceVersion serviceVersion,
        boolean isSingleSlot) {
        return getAdministrationClientBuilder(httpClient, serviceVersion, isSingleSlot)
            .buildAdminClient();
    }

    private void enableMultiSlot(PersonalizerAdminClient adminClient) {
        PersonalizerServiceProperties serviceProperties = adminClient.getProperties();
        serviceProperties.setIsAutoOptimizationEnabled(false);
        adminClient.updateProperties(serviceProperties);
        //sleep 30 seconds to allow settings to propagate
        sleepIfRunningAgainstService(30000);
        adminClient.updatePolicy(new PersonalizerPolicy().setName("multislot").setArguments("--ccb_explore_adf --epsilon 0.2 --power_t 0 -l 0.001 --cb_type mtr -q ::"));
        //sleep 30 seconds to allow settings to propagate
        sleepIfRunningAgainstService(30000);
    }

    private String getEndpoint(boolean isSingleSlot) {
        return interceptorManager.isPlaybackMode()
            ? "https://localhost:8080" : (isSingleSlot ? PERSONALIZER_ENDPOINT_SINGLE_SLOT : PERSONALIZER_ENDPOINT_MULTI_SLOT);
    }
}
