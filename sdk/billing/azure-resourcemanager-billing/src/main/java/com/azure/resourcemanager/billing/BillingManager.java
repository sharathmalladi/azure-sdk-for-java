// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.BillingManagementClient;
import com.azure.resourcemanager.billing.implementation.AddressImpl;
import com.azure.resourcemanager.billing.implementation.AgreementsImpl;
import com.azure.resourcemanager.billing.implementation.AvailableBalancesImpl;
import com.azure.resourcemanager.billing.implementation.BillingAccountsImpl;
import com.azure.resourcemanager.billing.implementation.BillingManagementClientBuilder;
import com.azure.resourcemanager.billing.implementation.BillingPeriodsImpl;
import com.azure.resourcemanager.billing.implementation.BillingPermissionsImpl;
import com.azure.resourcemanager.billing.implementation.BillingProfilesImpl;
import com.azure.resourcemanager.billing.implementation.BillingPropertiesImpl;
import com.azure.resourcemanager.billing.implementation.BillingRoleAssignmentsImpl;
import com.azure.resourcemanager.billing.implementation.BillingRoleDefinitionsImpl;
import com.azure.resourcemanager.billing.implementation.BillingSubscriptionsImpl;
import com.azure.resourcemanager.billing.implementation.CustomersImpl;
import com.azure.resourcemanager.billing.implementation.EnrollmentAccountsImpl;
import com.azure.resourcemanager.billing.implementation.InstructionsImpl;
import com.azure.resourcemanager.billing.implementation.InvoiceSectionsImpl;
import com.azure.resourcemanager.billing.implementation.InvoicesImpl;
import com.azure.resourcemanager.billing.implementation.OperationsImpl;
import com.azure.resourcemanager.billing.implementation.PoliciesImpl;
import com.azure.resourcemanager.billing.implementation.ProductsImpl;
import com.azure.resourcemanager.billing.implementation.ReservationsImpl;
import com.azure.resourcemanager.billing.implementation.TransactionsImpl;
import com.azure.resourcemanager.billing.models.Address;
import com.azure.resourcemanager.billing.models.Agreements;
import com.azure.resourcemanager.billing.models.AvailableBalances;
import com.azure.resourcemanager.billing.models.BillingAccounts;
import com.azure.resourcemanager.billing.models.BillingPeriods;
import com.azure.resourcemanager.billing.models.BillingPermissions;
import com.azure.resourcemanager.billing.models.BillingProfiles;
import com.azure.resourcemanager.billing.models.BillingProperties;
import com.azure.resourcemanager.billing.models.BillingRoleAssignments;
import com.azure.resourcemanager.billing.models.BillingRoleDefinitions;
import com.azure.resourcemanager.billing.models.BillingSubscriptions;
import com.azure.resourcemanager.billing.models.Customers;
import com.azure.resourcemanager.billing.models.EnrollmentAccounts;
import com.azure.resourcemanager.billing.models.Instructions;
import com.azure.resourcemanager.billing.models.InvoiceSections;
import com.azure.resourcemanager.billing.models.Invoices;
import com.azure.resourcemanager.billing.models.Operations;
import com.azure.resourcemanager.billing.models.Policies;
import com.azure.resourcemanager.billing.models.Products;
import com.azure.resourcemanager.billing.models.Reservations;
import com.azure.resourcemanager.billing.models.Transactions;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to BillingManager. Billing client provides access to billing resources for Azure subscriptions. */
public final class BillingManager {
    private BillingAccounts billingAccounts;

    private Address address;

    private AvailableBalances availableBalances;

    private Instructions instructions;

    private BillingProfiles billingProfiles;

    private Customers customers;

    private InvoiceSections invoiceSections;

    private BillingPermissions billingPermissions;

    private BillingSubscriptions billingSubscriptions;

    private Products products;

    private Invoices invoices;

    private Transactions transactions;

    private Policies policies;

    private BillingProperties billingProperties;

    private Operations operations;

    private BillingRoleDefinitions billingRoleDefinitions;

    private BillingRoleAssignments billingRoleAssignments;

    private Agreements agreements;

    private Reservations reservations;

    private EnrollmentAccounts enrollmentAccounts;

    private BillingPeriods billingPeriods;

    private final BillingManagementClient clientObject;

    private BillingManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new BillingManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Billing service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Billing service API instance.
     */
    public static BillingManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create BillingManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new BillingManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of Billing service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Billing service API instance.
         */
        public BillingManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.billing")
                .append("/")
                .append("1.0.0-beta.2");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new BillingManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of BillingAccounts. */
    public BillingAccounts billingAccounts() {
        if (this.billingAccounts == null) {
            this.billingAccounts = new BillingAccountsImpl(clientObject.getBillingAccounts(), this);
        }
        return billingAccounts;
    }

    /** @return Resource collection API of Address. */
    public Address address() {
        if (this.address == null) {
            this.address = new AddressImpl(clientObject.getAddress(), this);
        }
        return address;
    }

    /** @return Resource collection API of AvailableBalances. */
    public AvailableBalances availableBalances() {
        if (this.availableBalances == null) {
            this.availableBalances = new AvailableBalancesImpl(clientObject.getAvailableBalances(), this);
        }
        return availableBalances;
    }

    /** @return Resource collection API of Instructions. */
    public Instructions instructions() {
        if (this.instructions == null) {
            this.instructions = new InstructionsImpl(clientObject.getInstructions(), this);
        }
        return instructions;
    }

    /** @return Resource collection API of BillingProfiles. */
    public BillingProfiles billingProfiles() {
        if (this.billingProfiles == null) {
            this.billingProfiles = new BillingProfilesImpl(clientObject.getBillingProfiles(), this);
        }
        return billingProfiles;
    }

    /** @return Resource collection API of Customers. */
    public Customers customers() {
        if (this.customers == null) {
            this.customers = new CustomersImpl(clientObject.getCustomers(), this);
        }
        return customers;
    }

    /** @return Resource collection API of InvoiceSections. */
    public InvoiceSections invoiceSections() {
        if (this.invoiceSections == null) {
            this.invoiceSections = new InvoiceSectionsImpl(clientObject.getInvoiceSections(), this);
        }
        return invoiceSections;
    }

    /** @return Resource collection API of BillingPermissions. */
    public BillingPermissions billingPermissions() {
        if (this.billingPermissions == null) {
            this.billingPermissions = new BillingPermissionsImpl(clientObject.getBillingPermissions(), this);
        }
        return billingPermissions;
    }

    /** @return Resource collection API of BillingSubscriptions. */
    public BillingSubscriptions billingSubscriptions() {
        if (this.billingSubscriptions == null) {
            this.billingSubscriptions = new BillingSubscriptionsImpl(clientObject.getBillingSubscriptions(), this);
        }
        return billingSubscriptions;
    }

    /** @return Resource collection API of Products. */
    public Products products() {
        if (this.products == null) {
            this.products = new ProductsImpl(clientObject.getProducts(), this);
        }
        return products;
    }

    /** @return Resource collection API of Invoices. */
    public Invoices invoices() {
        if (this.invoices == null) {
            this.invoices = new InvoicesImpl(clientObject.getInvoices(), this);
        }
        return invoices;
    }

    /** @return Resource collection API of Transactions. */
    public Transactions transactions() {
        if (this.transactions == null) {
            this.transactions = new TransactionsImpl(clientObject.getTransactions(), this);
        }
        return transactions;
    }

    /** @return Resource collection API of Policies. */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(clientObject.getPolicies(), this);
        }
        return policies;
    }

    /** @return Resource collection API of BillingProperties. */
    public BillingProperties billingProperties() {
        if (this.billingProperties == null) {
            this.billingProperties = new BillingPropertiesImpl(clientObject.getBillingProperties(), this);
        }
        return billingProperties;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of BillingRoleDefinitions. */
    public BillingRoleDefinitions billingRoleDefinitions() {
        if (this.billingRoleDefinitions == null) {
            this.billingRoleDefinitions =
                new BillingRoleDefinitionsImpl(clientObject.getBillingRoleDefinitions(), this);
        }
        return billingRoleDefinitions;
    }

    /** @return Resource collection API of BillingRoleAssignments. */
    public BillingRoleAssignments billingRoleAssignments() {
        if (this.billingRoleAssignments == null) {
            this.billingRoleAssignments =
                new BillingRoleAssignmentsImpl(clientObject.getBillingRoleAssignments(), this);
        }
        return billingRoleAssignments;
    }

    /** @return Resource collection API of Agreements. */
    public Agreements agreements() {
        if (this.agreements == null) {
            this.agreements = new AgreementsImpl(clientObject.getAgreements(), this);
        }
        return agreements;
    }

    /** @return Resource collection API of Reservations. */
    public Reservations reservations() {
        if (this.reservations == null) {
            this.reservations = new ReservationsImpl(clientObject.getReservations(), this);
        }
        return reservations;
    }

    /** @return Resource collection API of EnrollmentAccounts. */
    public EnrollmentAccounts enrollmentAccounts() {
        if (this.enrollmentAccounts == null) {
            this.enrollmentAccounts = new EnrollmentAccountsImpl(clientObject.getEnrollmentAccounts(), this);
        }
        return enrollmentAccounts;
    }

    /** @return Resource collection API of BillingPeriods. */
    public BillingPeriods billingPeriods() {
        if (this.billingPeriods == null) {
            this.billingPeriods = new BillingPeriodsImpl(clientObject.getBillingPeriods(), this);
        }
        return billingPeriods;
    }

    /**
     * @return Wrapped service client BillingManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public BillingManagementClient serviceClient() {
        return this.clientObject;
    }
}
