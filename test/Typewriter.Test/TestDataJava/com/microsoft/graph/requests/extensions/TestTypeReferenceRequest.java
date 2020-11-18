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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Type Reference Request.
 */
public class TestTypeReferenceRequest extends BaseReferenceRequest<TestType> {

    /**
     * The request for the TestType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TestTypeReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TestType.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public TestTypeReferenceRequest select(@Nonnull final String value) {
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
    public TestTypeReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the TestType
     *
     * @param srcTestType the TestType reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final TestType srcTestType, @Nonnull final ICallback<? super TestType> callback) {
        send(HttpMethod.PUT, callback, srcTestType);
    }

    /**
     * Puts the TestType
     *
     * @param srcTestType the TestType reference to PUT
     * @return the TestType
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public TestType put(@Nonnull final TestType srcTestType) throws ClientException {
        return send(HttpMethod.PUT, srcTestType);
    }
}
