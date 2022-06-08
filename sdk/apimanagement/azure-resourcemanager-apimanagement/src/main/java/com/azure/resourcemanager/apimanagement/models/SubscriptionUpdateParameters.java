// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.SubscriptionUpdateParameterProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Subscription update details. */
@Fluent
public final class SubscriptionUpdateParameters {
    /*
     * Subscription Update contract properties.
     */
    @JsonProperty(value = "properties")
    private SubscriptionUpdateParameterProperties innerProperties;

    /**
     * Get the innerProperties property: Subscription Update contract properties.
     *
     * @return the innerProperties value.
     */
    private SubscriptionUpdateParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the ownerId property: User identifier path: /users/{userId}.
     *
     * @return the ownerId value.
     */
    public String ownerId() {
        return this.innerProperties() == null ? null : this.innerProperties().ownerId();
    }

    /**
     * Set the ownerId property: User identifier path: /users/{userId}.
     *
     * @param ownerId the ownerId value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withOwnerId(String ownerId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withOwnerId(ownerId);
        return this;
    }

    /**
     * Get the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @param scope the scope value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the expirationDate property: Subscription expiration date. The setting is for audit purposes only and the
     * subscription is not automatically expired. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Set the expirationDate property: Subscription expiration date. The setting is for audit purposes only and the
     * subscription is not automatically expired. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withExpirationDate(OffsetDateTime expirationDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withExpirationDate(expirationDate);
        return this;
    }

    /**
     * Get the displayName property: Subscription name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Subscription name.
     *
     * @param displayName the displayName value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the primaryKey property: Primary subscription key.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryKey();
    }

    /**
     * Set the primaryKey property: Primary subscription key.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withPrimaryKey(String primaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withPrimaryKey(primaryKey);
        return this;
    }

    /**
     * Get the secondaryKey property: Secondary subscription key.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryKey();
    }

    /**
     * Set the secondaryKey property: Secondary subscription key.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withSecondaryKey(String secondaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withSecondaryKey(secondaryKey);
        return this;
    }

    /**
     * Get the state property: Subscription state. Possible states are * active – the subscription is active, *
     * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted –
     * the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected –
     * the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled
     * by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     *
     * @return the state value.
     */
    public SubscriptionState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Subscription state. Possible states are * active – the subscription is active, *
     * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted –
     * the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected –
     * the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled
     * by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     *
     * @param state the state value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withState(SubscriptionState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the stateComment property: Comments describing subscription state change by the administrator when the state
     * is changed to the 'rejected'.
     *
     * @return the stateComment value.
     */
    public String stateComment() {
        return this.innerProperties() == null ? null : this.innerProperties().stateComment();
    }

    /**
     * Set the stateComment property: Comments describing subscription state change by the administrator when the state
     * is changed to the 'rejected'.
     *
     * @param stateComment the stateComment value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withStateComment(String stateComment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withStateComment(stateComment);
        return this;
    }

    /**
     * Get the allowTracing property: Determines whether tracing can be enabled.
     *
     * @return the allowTracing value.
     */
    public Boolean allowTracing() {
        return this.innerProperties() == null ? null : this.innerProperties().allowTracing();
    }

    /**
     * Set the allowTracing property: Determines whether tracing can be enabled.
     *
     * @param allowTracing the allowTracing value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withAllowTracing(Boolean allowTracing) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParameterProperties();
        }
        this.innerProperties().withAllowTracing(allowTracing);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
