/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.management.network.v2018_11_01.LoadBalancingRule;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_11_01.LoadDistribution;
import com.microsoft.azure.management.network.v2018_11_01.TransportProtocol;

class LoadBalancingRuleImpl extends IndexableRefreshableWrapperImpl<LoadBalancingRule, LoadBalancingRuleInner> implements LoadBalancingRule {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String loadBalancerName;
    private String loadBalancingRuleName;

    LoadBalancingRuleImpl(LoadBalancingRuleInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.loadBalancerName = IdParsingUtils.getValueFromIdByName(inner.id(), "loadBalancers");
        this.loadBalancingRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "loadBalancingRules");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<LoadBalancingRuleInner> getInnerAsync() {
        LoadBalancerLoadBalancingRulesInner client = this.manager().inner().loadBalancerLoadBalancingRules();
        return client.getAsync(this.resourceGroupName, this.loadBalancerName, this.loadBalancingRuleName);
    }



    @Override
    public SubResource backendAddressPool() {
        return this.inner().backendAddressPool();
    }

    @Override
    public Integer backendPort() {
        return this.inner().backendPort();
    }

    @Override
    public Boolean disableOutboundSnat() {
        return this.inner().disableOutboundSnat();
    }

    @Override
    public Boolean enableFloatingIP() {
        return this.inner().enableFloatingIP();
    }

    @Override
    public Boolean enableTcpReset() {
        return this.inner().enableTcpReset();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource frontendIPConfiguration() {
        return this.inner().frontendIPConfiguration();
    }

    @Override
    public int frontendPort() {
        return this.inner().frontendPort();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer idleTimeoutInMinutes() {
        return this.inner().idleTimeoutInMinutes();
    }

    @Override
    public LoadDistribution loadDistribution() {
        return this.inner().loadDistribution();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SubResource probe() {
        return this.inner().probe();
    }

    @Override
    public TransportProtocol protocol() {
        return this.inner().protocol();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

}
