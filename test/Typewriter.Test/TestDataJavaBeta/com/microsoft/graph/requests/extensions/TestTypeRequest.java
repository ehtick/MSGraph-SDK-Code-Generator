// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.TestType;
import com.microsoft.graph.models.extensions.DerivedComplexTypeRequest;
import com.microsoft.graph.models.extensions.ResponseObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Test Type Request.
 */
public class TestTypeRequest extends BaseRequest<TestType> {
	
    /**
     * The request for the TestType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TestTypeRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TestType.class);
    }

    /**
     * Gets the TestType from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<TestType> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the TestType from the service
     *
     * @return the TestType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TestType get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.Future<TestType> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TestType delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TestType with a source
     *
     * @param sourceTestType the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<TestType> futurePatch(@Nonnull final TestType sourceTestType) {
        return futureSend(HttpMethod.PATCH, sourceTestType);
    }

    /**
     * Patches this TestType with a source
     *
     * @param sourceTestType the source object with updates
     * @return the updated TestType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TestType patch(@Nonnull final TestType sourceTestType) throws ClientException {
        return send(HttpMethod.PATCH, sourceTestType);
    }

    /**
     * Creates a TestType with a new object
     *
     * @param newTestType the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<TestType> futurePost(@Nonnull final TestType newTestType) {
        return futureSend(HttpMethod.POST, newTestType);
    }

    /**
     * Creates a TestType with a new object
     *
     * @param newTestType the new object to create
     * @return the created TestType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TestType post(@Nonnull final TestType newTestType) throws ClientException {
        return send(HttpMethod.POST, newTestType);
    }

    /**
     * Creates a TestType with a new object
     *
     * @param newTestType the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.Future<TestType> futurePut(@Nonnull final TestType newTestType) {
        return futureSend(HttpMethod.PUT, newTestType);
    }

    /**
     * Creates a TestType with a new object
     *
     * @param newTestType the object to create/update
     * @return the created TestType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TestType put(@Nonnull final TestType newTestType) throws ClientException {
        return send(HttpMethod.PUT, newTestType);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TestTypeRequest select(@Nonnull final String value) {
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
     public TestTypeRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

