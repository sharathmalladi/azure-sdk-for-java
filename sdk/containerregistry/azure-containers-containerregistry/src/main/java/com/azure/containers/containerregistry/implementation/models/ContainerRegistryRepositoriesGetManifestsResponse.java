// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getManifests operation. */
public final class ContainerRegistryRepositoriesGetManifestsResponse
        extends ResponseBase<ContainerRegistryRepositoriesGetManifestsHeaders, AcrManifests> {
    /**
     * Creates an instance of ContainerRegistryRepositoriesGetManifestsResponse.
     *
     * @param request the request which resulted in this ContainerRegistryRepositoriesGetManifestsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ContainerRegistryRepositoriesGetManifestsResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            AcrManifests value,
            ContainerRegistryRepositoriesGetManifestsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public AcrManifests getValue() {
        return super.getValue();
    }
}
