// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The string representation of the web application firewall rule state. */
public final class ApplicationGatewayWafRuleStateTypes
    extends ExpandableStringEnum<ApplicationGatewayWafRuleStateTypes> {
    /** Static value Enabled for ApplicationGatewayWafRuleStateTypes. */
    public static final ApplicationGatewayWafRuleStateTypes ENABLED = fromString("Enabled");

    /** Static value Disabled for ApplicationGatewayWafRuleStateTypes. */
    public static final ApplicationGatewayWafRuleStateTypes DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ApplicationGatewayWafRuleStateTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayWafRuleStateTypes.
     */
    @JsonCreator
    public static ApplicationGatewayWafRuleStateTypes fromString(String name) {
        return fromString(name, ApplicationGatewayWafRuleStateTypes.class);
    }

    /**
     * Gets known ApplicationGatewayWafRuleStateTypes values.
     *
     * @return known ApplicationGatewayWafRuleStateTypes values.
     */
    public static Collection<ApplicationGatewayWafRuleStateTypes> values() {
        return values(ApplicationGatewayWafRuleStateTypes.class);
    }
}
