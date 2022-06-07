// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;

/** Samples for DpsCertificate GenerateVerificationCode. */
public final class DpsCertificateGenerateVerificationCodeSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2022-02-05/examples/DPSGenerateVerificationCode.json
     */
    /**
     * Sample code: DPSGenerateVerificationCode.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGenerateVerificationCode(
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager
            .dpsCertificates()
            .generateVerificationCodeWithResponse(
                "cert",
                "AAAAAAAADGk=",
                "myResourceGroup",
                "myFirstProvisioningService",
                null,
                new byte[0],
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
