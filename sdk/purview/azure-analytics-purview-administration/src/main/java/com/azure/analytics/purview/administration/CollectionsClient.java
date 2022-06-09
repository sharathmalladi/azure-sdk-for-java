// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewAccountClient type. */
@ServiceClient(builder = CollectionsClientBuilder.class)
public final class CollectionsClient {
    @Generated private final CollectionsAsyncClient client;

    /**
     * Initializes an instance of CollectionsClient class.
     *
     * @param client the async client.
     */
    @Generated
    CollectionsClient(CollectionsAsyncClient client) {
        this.client = client;
    }

    /**
     * Get a collection.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *     description: String
     *     friendlyName: String
     *     name: String
     *     parentCollection: {
     *         referenceName: String
     *         type: String
     *     }
     *     systemData: {
     *         createdAt: OffsetDateTime
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: OffsetDateTime
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a collection along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCollectionWithResponse(String collectionName, RequestOptions requestOptions) {
        return this.client.getCollectionWithResponse(collectionName, requestOptions).block();
    }

    /**
     * Creates or updates a collection entity.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *     description: String
     *     friendlyName: String
     *     name: String
     *     parentCollection: {
     *         referenceName: String
     *         type: String
     *     }
     *     systemData: {
     *         createdAt: OffsetDateTime
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: OffsetDateTime
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *     description: String
     *     friendlyName: String
     *     name: String
     *     parentCollection: {
     *         referenceName: String
     *         type: String
     *     }
     *     systemData: {
     *         createdAt: OffsetDateTime
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: OffsetDateTime
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param collection Collection resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return collection resource along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateCollectionWithResponse(
            String collectionName, BinaryData collection, RequestOptions requestOptions) {
        return this.client.createOrUpdateCollectionWithResponse(collectionName, collection, requestOptions).block();
    }

    /**
     * Deletes a Collection entity.
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteCollectionWithResponse(String collectionName, RequestOptions requestOptions) {
        return this.client.deleteCollectionWithResponse(collectionName, requestOptions).block();
    }

    /**
     * List the collections in the account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>$skipToken</td><td>String</td><td>No</td><td>The skipToken parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     count: Long
     *     nextLink: String
     *     value: [
     *         {
     *             collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *             description: String
     *             friendlyName: String
     *             name: String
     *             parentCollection: {
     *                 referenceName: String
     *                 type: String
     *             }
     *             systemData: {
     *                 createdAt: OffsetDateTime
     *                 createdBy: String
     *                 createdByType: String(User/Application/ManagedIdentity/Key)
     *                 lastModifiedAt: OffsetDateTime
     *                 lastModifiedBy: String
     *                 lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged list of collections as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listCollections(RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.listCollections(requestOptions));
    }

    /**
     * Lists the child collections names in the collection.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>$skipToken</td><td>String</td><td>No</td><td>The skipToken parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     count: Long
     *     nextLink: String
     *     value: [
     *         {
     *             friendlyName: String
     *             name: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged list of collections as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listChildCollectionNames(String collectionName, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.listChildCollectionNames(collectionName, requestOptions));
    }

    /**
     * Gets the parent name and parent friendly name chains that represent the collection path.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     parentFriendlyNameChain: [
     *         String
     *     ]
     *     parentNameChain: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the parent name and parent friendly name chains that represent the collection path along with {@link
     *     Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCollectionPathWithResponse(String collectionName, RequestOptions requestOptions) {
        return this.client.getCollectionPathWithResponse(collectionName, requestOptions).block();
    }
}
