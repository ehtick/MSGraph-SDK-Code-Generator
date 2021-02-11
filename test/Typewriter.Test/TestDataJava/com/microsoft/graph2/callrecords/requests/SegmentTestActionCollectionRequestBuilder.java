// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph2.callrecords.models.Session;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph2.callrecords.requests.SegmentTestActionCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.SegmentTestActionCollectionRequest;
import com.microsoft.graph2.callrecords.requests.SegmentTestActionCollectionResponse;
import com.microsoft.graph2.callrecords.models.SegmentTestActionParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment Test Action Collection Request Builder.
 */
public class SegmentTestActionCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<Session, SegmentTestActionCollectionRequestBuilder, SegmentTestActionCollectionResponse, SegmentTestActionCollectionPage, SegmentTestActionCollectionRequest> {

    /**
     * The request builder for this collection of Segment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SegmentTestActionCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SegmentTestActionCollectionRequestBuilder.class, SegmentTestActionCollectionRequest.class);
    }
    private SegmentTestActionParameterSet body;
    /**
     * The request builder for this collection of Segment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SegmentTestActionCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SegmentTestActionParameterSet parameters) {
        super(requestUrl, client, requestOptions, SegmentTestActionCollectionRequestBuilder.class, SegmentTestActionCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SegmentTestActionCollectionRequest instance
     */
    @Override
    @Nonnull
    public SegmentTestActionCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SegmentTestActionCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
