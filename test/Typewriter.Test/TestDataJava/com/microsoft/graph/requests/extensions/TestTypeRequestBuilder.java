// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TestType;
import com.microsoft.graph.models.extensions.DerivedComplexTypeRequest;
import com.microsoft.graph.models.extensions.ResponseObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Type Request Builder.
 */
public class TestTypeRequestBuilder extends BaseRequestBuilder<TestType> {

    /**
     * The request builder for the TestType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TestTypeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TestTypeRequest instance
     */
    @Nonnull
    public TestTypeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TestTypeRequest instance
     */
    @Nonnull
    public TestTypeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TestTypeRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param requests the requests
     */
    @Nonnull
    public TestTypeQueryCollectionRequestBuilder query(@Nullable final java.util.List<DerivedComplexTypeRequest> requests) {
        return new TestTypeQueryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.query"), getClient(), null, requests);
    }
}
