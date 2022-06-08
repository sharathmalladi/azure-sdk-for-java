// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List of VerificationStatusRecord. */
@Fluent
public final class DomainPropertiesVerificationStates {
    /*
     * A class that represents a VerificationStatus record.
     */
    @JsonProperty(value = "Domain")
    private VerificationStatusRecord domain;

    /*
     * A class that represents a VerificationStatus record.
     */
    @JsonProperty(value = "SPF")
    private VerificationStatusRecord spf;

    /*
     * A class that represents a VerificationStatus record.
     */
    @JsonProperty(value = "DKIM")
    private VerificationStatusRecord dkim;

    /*
     * A class that represents a VerificationStatus record.
     */
    @JsonProperty(value = "DKIM2")
    private VerificationStatusRecord dkim2;

    /*
     * A class that represents a VerificationStatus record.
     */
    @JsonProperty(value = "DMARC")
    private VerificationStatusRecord dmarc;

    /**
     * Get the domain property: A class that represents a VerificationStatus record.
     *
     * @return the domain value.
     */
    public VerificationStatusRecord domain() {
        return this.domain;
    }

    /**
     * Set the domain property: A class that represents a VerificationStatus record.
     *
     * @param domain the domain value to set.
     * @return the DomainPropertiesVerificationStates object itself.
     */
    public DomainPropertiesVerificationStates withDomain(VerificationStatusRecord domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the spf property: A class that represents a VerificationStatus record.
     *
     * @return the spf value.
     */
    public VerificationStatusRecord spf() {
        return this.spf;
    }

    /**
     * Set the spf property: A class that represents a VerificationStatus record.
     *
     * @param spf the spf value to set.
     * @return the DomainPropertiesVerificationStates object itself.
     */
    public DomainPropertiesVerificationStates withSpf(VerificationStatusRecord spf) {
        this.spf = spf;
        return this;
    }

    /**
     * Get the dkim property: A class that represents a VerificationStatus record.
     *
     * @return the dkim value.
     */
    public VerificationStatusRecord dkim() {
        return this.dkim;
    }

    /**
     * Set the dkim property: A class that represents a VerificationStatus record.
     *
     * @param dkim the dkim value to set.
     * @return the DomainPropertiesVerificationStates object itself.
     */
    public DomainPropertiesVerificationStates withDkim(VerificationStatusRecord dkim) {
        this.dkim = dkim;
        return this;
    }

    /**
     * Get the dkim2 property: A class that represents a VerificationStatus record.
     *
     * @return the dkim2 value.
     */
    public VerificationStatusRecord dkim2() {
        return this.dkim2;
    }

    /**
     * Set the dkim2 property: A class that represents a VerificationStatus record.
     *
     * @param dkim2 the dkim2 value to set.
     * @return the DomainPropertiesVerificationStates object itself.
     */
    public DomainPropertiesVerificationStates withDkim2(VerificationStatusRecord dkim2) {
        this.dkim2 = dkim2;
        return this;
    }

    /**
     * Get the dmarc property: A class that represents a VerificationStatus record.
     *
     * @return the dmarc value.
     */
    public VerificationStatusRecord dmarc() {
        return this.dmarc;
    }

    /**
     * Set the dmarc property: A class that represents a VerificationStatus record.
     *
     * @param dmarc the dmarc value to set.
     * @return the DomainPropertiesVerificationStates object itself.
     */
    public DomainPropertiesVerificationStates withDmarc(VerificationStatusRecord dmarc) {
        this.dmarc = dmarc;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domain() != null) {
            domain().validate();
        }
        if (spf() != null) {
            spf().validate();
        }
        if (dkim() != null) {
            dkim().validate();
        }
        if (dkim2() != null) {
            dkim2().validate();
        }
        if (dmarc() != null) {
            dmarc().validate();
        }
    }
}
