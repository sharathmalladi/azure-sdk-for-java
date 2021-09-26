// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.communication.callingserver.models.CallConnectionState;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The call connection state changed event. */
@Fluent
public final class CallConnectionStateChangedEventInternal {
    /*
     * The locator used for joining or taking action on a call.
     */
    @JsonProperty(value = "callLocator")
    private CallLocatorModel callLocator;

    /*
     * The call connection id.
     */
    @JsonProperty(value = "callConnectionId")
    private String callConnectionId;

    /*
     * The state of the call connection.
     */
    @JsonProperty(value = "callConnectionState", required = true)
    private CallConnectionState callConnectionState;

    /**
     * Get the callLocator property: The locator used for joining or taking action on a call.
     *
     * @return the callLocator value.
     */
    public CallLocatorModel getCallLocator() {
        return this.callLocator;
    }

    /**
     * Set the callLocator property: The locator used for joining or taking action on a call.
     *
     * @param callLocator the callLocator value to set.
     * @return the CallConnectionStateChangedEventInternal object itself.
     */
    public CallConnectionStateChangedEventInternal setCallLocator(CallLocatorModel callLocator) {
        this.callLocator = callLocator;
        return this;
    }

    /**
     * Get the callConnectionId property: The call connection id.
     *
     * @return the callConnectionId value.
     */
    public String getCallConnectionId() {
        return this.callConnectionId;
    }

    /**
     * Set the callConnectionId property: The call connection id.
     *
     * @param callConnectionId the callConnectionId value to set.
     * @return the CallConnectionStateChangedEventInternal object itself.
     */
    public CallConnectionStateChangedEventInternal setCallConnectionId(String callConnectionId) {
        this.callConnectionId = callConnectionId;
        return this;
    }

    /**
     * Get the callConnectionState property: The state of the call connection.
     *
     * @return the callConnectionState value.
     */
    public CallConnectionState getCallConnectionState() {
        return this.callConnectionState;
    }

    /**
     * Set the callConnectionState property: The state of the call connection.
     *
     * @param callConnectionState the callConnectionState value to set.
     * @return the CallConnectionStateChangedEventInternal object itself.
     */
    public CallConnectionStateChangedEventInternal setCallConnectionState(CallConnectionState callConnectionState) {
        this.callConnectionState = callConnectionState;
        return this;
    }
}
