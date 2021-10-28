// Template Source: BaseEntityCollectionReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CloudCommunications;
import com.microsoft.graph.models.Call;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Collection Reference Request Builder.
 */
public class CallCollectionReferenceRequestBuilder extends BaseCollectionReferenceRequestBuilder<Call, CallReferenceRequestBuilder, CallCollectionResponse, CallCollectionWithReferencesPage, CallCollectionReferenceRequest> {

    /**
     * The request builder for this collection of Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallCollectionReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CallReferenceRequestBuilder.class, CallCollectionReferenceRequest.class);
    }
}