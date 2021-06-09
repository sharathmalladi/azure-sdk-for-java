// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.data.tables.implementation.models.OdataMetadataFormat;
import com.azure.data.tables.implementation.models.QueryOptions;
import com.azure.data.tables.implementation.models.ResponseFormat;
import com.azure.data.tables.implementation.models.SignedIdentifier;
import com.azure.data.tables.implementation.models.SignedIdentifiersWrapper;
import com.azure.data.tables.implementation.models.TableProperties;
import com.azure.data.tables.implementation.models.TableServiceErrorException;
import com.azure.data.tables.implementation.models.TablesCreateResponse;
import com.azure.data.tables.implementation.models.TablesDeleteEntityResponse;
import com.azure.data.tables.implementation.models.TablesDeleteResponse;
import com.azure.data.tables.implementation.models.TablesGetAccessPolicyResponse;
import com.azure.data.tables.implementation.models.TablesInsertEntityResponse;
import com.azure.data.tables.implementation.models.TablesMergeEntityResponse;
import com.azure.data.tables.implementation.models.TablesQueryEntitiesResponse;
import com.azure.data.tables.implementation.models.TablesQueryEntityWithPartitionAndRowKeyResponse;
import com.azure.data.tables.implementation.models.TablesQueryResponse;
import com.azure.data.tables.implementation.models.TablesSetAccessPolicyResponse;
import com.azure.data.tables.implementation.models.TablesUpdateEntityResponse;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Tables. */
public final class TablesImpl {
    /** The proxy service used to perform REST calls. */
    private final TablesService service;

    /** The service client containing this operation class. */
    private final AzureTableImpl client;

    /**
     * Initializes an instance of TablesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TablesImpl(AzureTableImpl client) {
        this.service = RestProxy.create(TablesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureTableTables to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureTableTables")
    public interface TablesService {
        @Get("/Tables")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesQueryResponse> query(
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @QueryParam("$top") Integer top,
                @QueryParam("$select") String select,
                @QueryParam("$filter") String filter,
                @QueryParam("NextTableName") String nextTableName,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/Tables")
        @ExpectedResponses({201, 204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesCreateResponse> create(
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @HeaderParam("Prefer") ResponseFormat responsePreference,
                @BodyParam("application/json;odata=nometadata") TableProperties tableProperties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/Tables('{table}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesDeleteResponse> delete(
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @PathParam("table") String table,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{table}()")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesQueryEntitiesResponse> queryEntities(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @QueryParam("$top") Integer top,
                @QueryParam("$select") String select,
                @QueryParam("$filter") String filter,
                @PathParam("table") String table,
                @QueryParam("NextPartitionKey") String nextPartitionKey,
                @QueryParam("NextRowKey") String nextRowKey,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesQueryEntityWithPartitionAndRowKeyResponse> queryEntityWithPartitionAndRowKey(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @QueryParam("$select") String select,
                @QueryParam("$filter") String filter,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesUpdateEntityResponse> updateEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey,
                @HeaderParam("If-Match") String ifMatch,
                @BodyParam("application/json") Map<String, Object> tableEntityProperties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Patch("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesMergeEntityResponse> mergeEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey,
                @HeaderParam("If-Match") String ifMatch,
                @BodyParam("application/json") Map<String, Object> tableEntityProperties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesDeleteEntityResponse> deleteEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/{table}")
        @ExpectedResponses({201, 204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesInsertEntityResponse> insertEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @HeaderParam("Prefer") ResponseFormat responsePreference,
                @BodyParam("application/json;odata=nometadata") Map<String, Object> tableEntityProperties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{table}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesGetAccessPolicyResponse> getAccessPolicy(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @PathParam("table") String table,
                @QueryParam("comp") String comp,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/{table}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesSetAccessPolicyResponse> setAccessPolicy(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @PathParam("table") String table,
                @QueryParam("comp") String comp,
                @BodyParam("application/xml") SignedIdentifiersWrapper tableAcl,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Queries tables under the given account.
     *
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param nextTableName A table query continuation token from a previous call.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesQueryResponse> queryWithResponseAsync(
            String requestId, String nextTableName, QueryOptions queryOptions, Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json;odata=minimalmetadata";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        Integer topInternal = null;
        if (queryOptions != null) {
            topInternal = queryOptions.getTop();
        }
        Integer top = topInternal;
        String selectInternal = null;
        if (queryOptions != null) {
            selectInternal = queryOptions.getSelect();
        }
        String select = selectInternal;
        String filterInternal = null;
        if (queryOptions != null) {
            filterInternal = queryOptions.getFilter();
        }
        String filter = filterInternal;
        return service.query(
                this.client.getUrl(),
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                top,
                select,
                filter,
                nextTableName,
                accept,
                context);
    }

    /**
     * Creates a new table under the given account.
     *
     * @param tableProperties The Table properties.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param responsePreference Specifies whether the response should include the inserted entity in the payload.
     *     Possible values are return-no-content and return-content.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response for a single table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesCreateResponse> createWithResponseAsync(
            TableProperties tableProperties,
            String requestId,
            ResponseFormat responsePreference,
            QueryOptions queryOptions,
            Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json;odata=minimalmetadata";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.create(
                this.client.getUrl(),
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                responsePreference,
                tableProperties,
                accept,
                context);
    }

    /**
     * Operation permanently deletes the specified table.
     *
     * @param table The name of the table.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesDeleteResponse> deleteWithResponseAsync(String table, String requestId, Context context) {
        final String accept = "application/json";
        return service.delete(this.client.getUrl(), this.client.getVersion(), requestId, table, accept, context);
    }

    /**
     * Queries entities in a table.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param nextPartitionKey An entity query continuation token from a previous call.
     * @param nextRowKey An entity query continuation token from a previous call.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table entity query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesQueryEntitiesResponse> queryEntitiesWithResponseAsync(
            String table,
            Integer timeout,
            String requestId,
            String nextPartitionKey,
            String nextRowKey,
            QueryOptions queryOptions,
            Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json;odata=minimalmetadata";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        Integer topInternal = null;
        if (queryOptions != null) {
            topInternal = queryOptions.getTop();
        }
        Integer top = topInternal;
        String selectInternal = null;
        if (queryOptions != null) {
            selectInternal = queryOptions.getSelect();
        }
        String select = selectInternal;
        String filterInternal = null;
        if (queryOptions != null) {
            filterInternal = queryOptions.getFilter();
        }
        String filter = filterInternal;
        return service.queryEntities(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                top,
                select,
                filter,
                table,
                nextPartitionKey,
                nextRowKey,
                accept,
                context);
    }

    /**
     * Queries a single entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the other properties of the table entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesQueryEntityWithPartitionAndRowKeyResponse> queryEntityWithPartitionAndRowKeyWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            QueryOptions queryOptions,
            Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json;odata=minimalmetadata";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        String selectInternal = null;
        if (queryOptions != null) {
            selectInternal = queryOptions.getSelect();
        }
        String select = selectInternal;
        String filterInternal = null;
        if (queryOptions != null) {
            filterInternal = queryOptions.getFilter();
        }
        String filter = filterInternal;
        return service.queryEntityWithPartitionAndRowKey(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                select,
                filter,
                table,
                partitionKey,
                rowKey,
                accept,
                context);
    }

    /**
     * Update entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param ifMatch Match condition for an entity to be updated. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional update, set to the wildcard character (*). If not specified,
     *     an insert will be performed when no existing entity is found to update and a replace will be performed if an
     *     existing entity is found.
     * @param tableEntityProperties The properties for the table entity.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesUpdateEntityResponse> updateEntityWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            String ifMatch,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions,
            Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.updateEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                partitionKey,
                rowKey,
                ifMatch,
                tableEntityProperties,
                accept,
                context);
    }

    /**
     * Merge entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param ifMatch Match condition for an entity to be updated. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional update, set to the wildcard character (*). If not specified,
     *     an insert will be performed when no existing entity is found to update and a merge will be performed if an
     *     existing entity is found.
     * @param tableEntityProperties The properties for the table entity.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesMergeEntityResponse> mergeEntityWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            String ifMatch,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions,
            Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.mergeEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                partitionKey,
                rowKey,
                ifMatch,
                tableEntityProperties,
                accept,
                context);
    }

    /**
     * Deletes the specified entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param ifMatch Match condition for an entity to be deleted. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional delete, set to the wildcard character (*).
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesDeleteEntityResponse> deleteEntityWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            String ifMatch,
            Integer timeout,
            String requestId,
            QueryOptions queryOptions,
            Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json;odata=minimalmetadata";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.deleteEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                partitionKey,
                rowKey,
                ifMatch,
                accept,
                context);
    }

    /**
     * Insert entity in a table.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param responsePreference Specifies whether the response should include the inserted entity in the payload.
     *     Possible values are return-no-content and return-content.
     * @param tableEntityProperties The properties for the table entity.
     * @param queryOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the other properties of the table entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesInsertEntityResponse> insertEntityWithResponseAsync(
            String table,
            Integer timeout,
            String requestId,
            ResponseFormat responsePreference,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions,
            Context context) {
        final String dataServiceVersion = "3.0";
        final String accept = "application/json;odata=minimalmetadata";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.insertEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                responsePreference,
                tableEntityProperties,
                accept,
                context);
    }

    /**
     * Retrieves details about any stored access policies specified on the table that may be used with Shared Access
     * Signatures.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of signed identifiers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesGetAccessPolicyResponse> getAccessPolicyWithResponseAsync(
            String table, Integer timeout, String requestId, Context context) {
        final String comp = "acl";
        final String accept = "application/xml";
        return service.getAccessPolicy(
                this.client.getUrl(), timeout, this.client.getVersion(), requestId, table, comp, accept, context);
    }

    /**
     * Sets stored access policies for the table that may be used with Shared Access Signatures.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param tableAcl The acls for the table.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesSetAccessPolicyResponse> setAccessPolicyWithResponseAsync(
            String table, Integer timeout, String requestId, List<SignedIdentifier> tableAcl, Context context) {
        final String comp = "acl";
        final String accept = "application/xml";

        SignedIdentifiersWrapper tableAclConverted = new SignedIdentifiersWrapper(tableAcl);

        return service.setAccessPolicy(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                table,
                comp,
                tableAclConverted,
                accept,
                context);
    }
}
