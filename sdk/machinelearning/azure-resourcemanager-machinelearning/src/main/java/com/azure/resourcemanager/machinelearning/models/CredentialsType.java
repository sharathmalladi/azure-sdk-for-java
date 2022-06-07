// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CredentialsType. */
public final class CredentialsType extends ExpandableStringEnum<CredentialsType> {
    /** Static value AccountKey for CredentialsType. */
    public static final CredentialsType ACCOUNT_KEY = fromString("AccountKey");

    /** Static value Certificate for CredentialsType. */
    public static final CredentialsType CERTIFICATE = fromString("Certificate");

    /** Static value None for CredentialsType. */
    public static final CredentialsType NONE = fromString("None");

    /** Static value Sas for CredentialsType. */
    public static final CredentialsType SAS = fromString("Sas");

    /** Static value ServicePrincipal for CredentialsType. */
    public static final CredentialsType SERVICE_PRINCIPAL = fromString("ServicePrincipal");

    /** Static value KerberosKeytab for CredentialsType. */
    public static final CredentialsType KERBEROS_KEYTAB = fromString("KerberosKeytab");

    /** Static value KerberosPassword for CredentialsType. */
    public static final CredentialsType KERBEROS_PASSWORD = fromString("KerberosPassword");

    /**
     * Creates or finds a CredentialsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CredentialsType.
     */
    @JsonCreator
    public static CredentialsType fromString(String name) {
        return fromString(name, CredentialsType.class);
    }

    /**
     * Gets known CredentialsType values.
     *
     * @return known CredentialsType values.
     */
    public static Collection<CredentialsType> values() {
        return values(CredentialsType.class);
    }
}
