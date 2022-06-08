// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A request to compute additional statistics (facets) over the query results. */
@Fluent
public final class FacetRequest {
    /*
     * The column or list of columns to summarize by
     */
    @JsonProperty(value = "expression", required = true)
    private String expression;

    /*
     * The options for facet evaluation
     */
    @JsonProperty(value = "options")
    private FacetRequestOptions options;

    /**
     * Get the expression property: The column or list of columns to summarize by.
     *
     * @return the expression value.
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression property: The column or list of columns to summarize by.
     *
     * @param expression the expression value to set.
     * @return the FacetRequest object itself.
     */
    public FacetRequest withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get the options property: The options for facet evaluation.
     *
     * @return the options value.
     */
    public FacetRequestOptions options() {
        return this.options;
    }

    /**
     * Set the options property: The options for facet evaluation.
     *
     * @param options the options value to set.
     * @return the FacetRequest object itself.
     */
    public FacetRequest withOptions(FacetRequestOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expression() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property expression in model FacetRequest"));
        }
        if (options() != null) {
            options().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FacetRequest.class);
}
