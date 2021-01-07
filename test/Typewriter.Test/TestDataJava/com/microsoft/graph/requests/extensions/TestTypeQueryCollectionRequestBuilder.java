// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DerivedComplexTypeRequest;
import com.microsoft.graph.models.extensions.ResponseObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.TestTypeQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TestTypeQueryCollectionRequest;
import com.microsoft.graph.requests.extensions.TestTypeQueryCollectionResponse;
import com.microsoft.graph.models.extensions.TestTypeQueryParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Type Query Collection Request Builder.
 * @deprecated responseObject is deprecated. Please use something else.
 */
@Deprecated
public class TestTypeQueryCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<ResponseObject, TestTypeQueryCollectionRequestBuilder, TestTypeQueryCollectionResponse, TestTypeQueryCollectionPage, TestTypeQueryCollectionRequest> {

    private TestTypeQueryParameterSet body;
    /**
     * The request builder for this collection of TestType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TestTypeQueryCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TestTypeQueryParameterSet parameters) {
        super(requestUrl, client, requestOptions, TestTypeQueryCollectionRequestBuilder.class, TestTypeQueryCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TestTypeQueryCollectionRequest instance
     */
    @Override
    @Nonnull
    public TestTypeQueryCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TestTypeQueryCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
