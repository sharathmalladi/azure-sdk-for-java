// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Certificate configuration which consist of non-trusted intermediates and root certificates. */
@Fluent
public final class CertificateConfiguration {
    /*
     * Base64 Encoded certificate.
     */
    @JsonProperty(value = "encodedCertificate")
    private String encodedCertificate;

    /*
     * Certificate Password.
     */
    @JsonProperty(value = "certificatePassword")
    private String certificatePassword;

    /*
     * The System.Security.Cryptography.x509certificates.StoreName certificate
     * store location. Only Root and CertificateAuthority are valid locations.
     */
    @JsonProperty(value = "storeName", required = true)
    private CertificateConfigurationStoreName storeName;

    /*
     * Certificate information.
     */
    @JsonProperty(value = "certificate")
    private CertificateInformation certificate;

    /**
     * Get the encodedCertificate property: Base64 Encoded certificate.
     *
     * @return the encodedCertificate value.
     */
    public String encodedCertificate() {
        return this.encodedCertificate;
    }

    /**
     * Set the encodedCertificate property: Base64 Encoded certificate.
     *
     * @param encodedCertificate the encodedCertificate value to set.
     * @return the CertificateConfiguration object itself.
     */
    public CertificateConfiguration withEncodedCertificate(String encodedCertificate) {
        this.encodedCertificate = encodedCertificate;
        return this;
    }

    /**
     * Get the certificatePassword property: Certificate Password.
     *
     * @return the certificatePassword value.
     */
    public String certificatePassword() {
        return this.certificatePassword;
    }

    /**
     * Set the certificatePassword property: Certificate Password.
     *
     * @param certificatePassword the certificatePassword value to set.
     * @return the CertificateConfiguration object itself.
     */
    public CertificateConfiguration withCertificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
        return this;
    }

    /**
     * Get the storeName property: The System.Security.Cryptography.x509certificates.StoreName certificate store
     * location. Only Root and CertificateAuthority are valid locations.
     *
     * @return the storeName value.
     */
    public CertificateConfigurationStoreName storeName() {
        return this.storeName;
    }

    /**
     * Set the storeName property: The System.Security.Cryptography.x509certificates.StoreName certificate store
     * location. Only Root and CertificateAuthority are valid locations.
     *
     * @param storeName the storeName value to set.
     * @return the CertificateConfiguration object itself.
     */
    public CertificateConfiguration withStoreName(CertificateConfigurationStoreName storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * Get the certificate property: Certificate information.
     *
     * @return the certificate value.
     */
    public CertificateInformation certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: Certificate information.
     *
     * @param certificate the certificate value to set.
     * @return the CertificateConfiguration object itself.
     */
    public CertificateConfiguration withCertificate(CertificateInformation certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storeName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storeName in model CertificateConfiguration"));
        }
        if (certificate() != null) {
            certificate().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CertificateConfiguration.class);
}
