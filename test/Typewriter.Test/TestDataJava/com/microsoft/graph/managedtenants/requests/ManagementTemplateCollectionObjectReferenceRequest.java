// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagementTemplateCollectionObject;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Template Collection Object Reference Request.
 */
public class ManagementTemplateCollectionObjectReferenceRequest extends BaseReferenceRequest<ManagementTemplateCollectionObject> {

    /**
     * The request for the ManagementTemplateCollectionObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementTemplateCollectionObjectReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementTemplateCollectionObject.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ManagementTemplateCollectionObjectReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagementTemplateCollectionObjectReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the ManagementTemplateCollectionObject
     *
     * @param srcManagementTemplateCollectionObject the ManagementTemplateCollectionObject reference to PUT
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagementTemplateCollectionObject> putAsync(@Nonnull final ManagementTemplateCollectionObject srcManagementTemplateCollectionObject) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/managementTemplateCollections/" + srcManagementTemplateCollectionObject.id));
        return sendAsync(HttpMethod.PUT, payload);
    }

    /**
     * Puts the ManagementTemplateCollectionObject
     *
     * @param srcManagementTemplateCollectionObject the ManagementTemplateCollectionObject reference to PUT
     * @return the ManagementTemplateCollectionObject
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public ManagementTemplateCollectionObject put(@Nonnull final ManagementTemplateCollectionObject srcManagementTemplateCollectionObject) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/managementTemplateCollections/" + srcManagementTemplateCollectionObject.id));
        return send(HttpMethod.PUT, payload);
    }
}
