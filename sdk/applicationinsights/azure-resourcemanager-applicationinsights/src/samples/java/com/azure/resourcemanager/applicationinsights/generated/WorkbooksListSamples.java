// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;

/** Samples for Workbooks List. */
public final class WorkbooksListSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-04-01/examples/WorkbooksListSub.json
     */
    /**
     * Sample code: WorkbooksListSub.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksListSub(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().list(CategoryType.WORKBOOK, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-04-01/examples/WorkbooksList2.json
     */
    /**
     * Sample code: WorkbooksList2.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbooksList2(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.workbooks().list(CategoryType.WORKBOOK, null, null, Context.NONE);
    }
}
