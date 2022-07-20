// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.personalizer;

import com.azure.ai.personalizer.implementation.util.Utility;
import com.azure.ai.personalizer.implementation.PersonalizerClientV1Preview3Impl;
import com.azure.ai.personalizer.implementation.PersonalizerClientV1Preview3ImplBuilder;
import com.azure.ai.personalizer.implementation.util.Utility;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.*;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.*;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.HttpClientOptions;
import com.azure.core.util.logging.ClientLogger;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ServiceClientBuilder(serviceClients = {PersonalizerAsyncClient.class, PersonalizerClient.class})
public final class PersonalizerClientBuilder implements
    AzureKeyCredentialTrait<PersonalizerClientBuilder>,
    ConfigurationTrait<PersonalizerClientBuilder>,
    EndpointTrait<PersonalizerClientBuilder>,
    HttpTrait<PersonalizerClientBuilder>,
    TokenCredentialTrait<PersonalizerClientBuilder> {
    private final ClientLogger logger = new ClientLogger(PersonalizerClientBuilder.class);

    private final List<HttpPipelinePolicy> perCallPolicies = new ArrayList<>();
    private final List<HttpPipelinePolicy> perRetryPolicies = new ArrayList<>();

    private ClientOptions clientOptions;
    private String endpoint;
    private AzureKeyCredential azureKeyCredential;
    private HttpClient httpClient;
    private HttpLogOptions httpLogOptions;
    private HttpPipeline httpPipeline;
    private Configuration configuration;
    private RetryPolicy retryPolicy;
    private RetryOptions retryOptions;
    private TokenCredential tokenCredential;
    private PersonalizerServiceVersion version;
    private PersonalizerAudience audience;

    public PersonalizerClient buildClient() {
        return new PersonalizerClient(buildAsyncClient());
    }

    public PersonalizerAsyncClient buildAsyncClient() {
        // Endpoint cannot be null, which is required in request authentication
        Objects.requireNonNull(endpoint, "'Endpoint' is required and can not be null.");
        if (audience == null) {
            audience = PersonalizerAudience.AZURE_RESOURCE_MANAGER_PUBLIC_CLOUD;
        }
        // Global Env configuration store
        final Configuration buildConfiguration = (configuration == null)
            ? Configuration.getGlobalConfiguration().clone() : configuration;

        // Service Version
        final PersonalizerServiceVersion serviceVersion =
            version != null ? version : PersonalizerServiceVersion.getLatest();

        HttpPipeline pipeline = httpPipeline;
        // Create a default Pipeline if it is not given
        if (pipeline == null) {
            pipeline = Utility.buildHttpPipeline(
                clientOptions,
                httpLogOptions,
                buildConfiguration,
                retryPolicy,
                retryOptions,
                azureKeyCredential,
                tokenCredential,
                audience,
                perCallPolicies,
                perRetryPolicies,
                httpClient);
        }

        final PersonalizerClientV1Preview3Impl PersonalizerAPI = new PersonalizerClientV1Preview3ImplBuilder()
            .endpoint(endpoint)
            .pipeline(pipeline)
            .buildClient();

        return new PersonalizerAsyncClient(PersonalizerAPI);
    }

    @Override
    public PersonalizerClientBuilder endpoint(String endpoint) {
        Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");

        try {
            new URL(endpoint);
        } catch (MalformedURLException ex) {
            throw logger.logExceptionAsWarning(new IllegalArgumentException("'endpoint' must be a valid URL.", ex));
        }

        if (endpoint.endsWith("/")) {
            this.endpoint = endpoint.substring(0, endpoint.length() - 1);
        } else {
            this.endpoint = endpoint;
        }

        return this;
    }

    @Override
    public PersonalizerClientBuilder credential(AzureKeyCredential azureKeyCredential) {
        this.azureKeyCredential = Objects.requireNonNull(azureKeyCredential, "'azureKeyCredential' cannot be null.");
        return this;
    }

    @Override
    public PersonalizerClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = Objects.requireNonNull(tokenCredential, "'tokenCredential' cannot be null.");
        return this;
    }

    @Override
    public PersonalizerClientBuilder httpLogOptions(HttpLogOptions logOptions) {
        this.httpLogOptions = logOptions;
        return this;
    }

    @Override
    public PersonalizerClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    @Override
    public PersonalizerClientBuilder addPolicy(HttpPipelinePolicy policy) {
        Objects.requireNonNull(policy, "'policy' cannot be null.");

        if (policy.getPipelinePosition() == HttpPipelinePosition.PER_CALL) {
            perCallPolicies.add(policy);
        } else {
            perRetryPolicies.add(policy);
        }
        return this;
    }

    @Override
    public PersonalizerClientBuilder httpClient(HttpClient client) {
        if (this.httpClient != null && client == null) {
            logger.info("HttpClient is being set to 'null' when it was previously configured.");
        }

        this.httpClient = client;
        return this;
    }

    @Override
    public PersonalizerClientBuilder pipeline(HttpPipeline httpPipeline) {
        if (this.httpPipeline != null && httpPipeline == null) {
            logger.info("HttpPipeline is being set to 'null' when it was previously configured.");
        }

        this.httpPipeline = httpPipeline;
        return this;
    }

    @Override
    public PersonalizerClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    public PersonalizerClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    @Override
    public PersonalizerClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    public PersonalizerClientBuilder serviceVersion(PersonalizerServiceVersion version) {
        this.version = version;
        return this;
    }

    public PersonalizerClientBuilder audience(PersonalizerAudience audience) {
        Objects.requireNonNull(audience, "'audience' is required and can not be null");
        this.audience = audience;
        return this;
    }
}
