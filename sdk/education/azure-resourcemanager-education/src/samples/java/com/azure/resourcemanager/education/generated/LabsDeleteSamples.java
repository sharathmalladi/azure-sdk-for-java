// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.util.Context;

/** Samples for Labs Delete. */
public final class LabsDeleteSamples {
    /*
     * x-ms-original-file: specification/education/resource-manager/Microsoft.Education/preview/2021-12-01-preview/examples/DeleteLab.json
     */
    /**
     * Sample code: DeleteLab.
     *
     * @param manager Entry point to EducationManager.
     */
    public static void deleteLab(com.azure.resourcemanager.education.EducationManager manager) {
        manager
            .labs()
            .deleteWithResponse("{billingAccountName}", "{billingProfileName}", "{invoiceSectionName}", Context.NONE);
    }
}
