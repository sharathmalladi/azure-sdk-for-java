// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;

/** Samples for BillingRoleAssignments GetByBillingProfile. */
public final class BillingRoleAssignmentsGetByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/BillingProfileRoleAssignment.json
     */
    /**
     * Sample code: BillingProfileRoleAssignment.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingProfileRoleAssignment(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .getByBillingProfileWithResponse(
                "{billingAccountName}", "{billingProfileName}", "{billingRoleAssignmentName}", Context.NONE);
    }
}
