// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DirectoryObjectDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectDeltaCollectionRequest;
import com.microsoft.graph.requests.DirectoryObjectDeltaCollectionResponse;
import com.microsoft.graph.models.DirectoryObjectDeltaParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Delta Collection Request Builder.
 */
public class DirectoryObjectDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<DirectoryObject, DirectoryObjectDeltaCollectionRequestBuilder, DirectoryObjectDeltaCollectionResponse, DirectoryObjectDeltaCollectionPage, DirectoryObjectDeltaCollectionRequest> {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectDeltaCollectionRequestBuilder.class, DirectoryObjectDeltaCollectionRequest.class);
    }
    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DirectoryObjectDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DirectoryObjectDeltaParameterSet parameters) {
        super(requestUrl, client, requestOptions, DirectoryObjectDeltaCollectionRequestBuilder.class, DirectoryObjectDeltaCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DirectoryObjectDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public DirectoryObjectDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DirectoryObjectDeltaCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}