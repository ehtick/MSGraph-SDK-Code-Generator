// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Segment;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.EntityType3WithReferenceRequest;
import com.microsoft.graph.requests.extensions.EntityType3ReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType3WithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType3CollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.EntityType3CollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.EntityType3;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type3Collection Reference Request.
 * @deprecated entityType3 is deprecated. Please use singletonEntity1.
 */
@Deprecated
public class EntityType3CollectionReferenceRequest extends BaseCollectionWithReferencesRequest<EntityType3, EntityType3WithReferenceRequest, EntityType3ReferenceRequestBuilder, EntityType3WithReferenceRequestBuilder, EntityType3CollectionResponse, EntityType3CollectionWithReferencesPage, EntityType3CollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of EntityType3
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType3CollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntityType3CollectionResponse.class, EntityType3CollectionWithReferencesPage.class, EntityType3CollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new EntityType3
     * @param newEntityType3 the EntityType3 to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final EntityType3 newEntityType3, @Nonnull final ICallback<? super EntityType3> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/testTypes/" + newEntityType3.id);
        new EntityType3WithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEntityType3, body, callback);
    }

    /**
     * Creates a new EntityType3
     * @param newEntityType3 the EntityType3 to create
     * @return the newly created object
     */
    @Nonnull
    public EntityType3 post(@Nonnull final EntityType3 newEntityType3) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/testTypes/" + newEntityType3.id);
        return new EntityType3WithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newEntityType3, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EntityType3CollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
