// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleEligibilityRequest;
import com.microsoft.graph.models.RoleEligibilityRequestFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Request Request.
 */
public class UnifiedRoleEligibilityRequestRequest extends BaseRequest<UnifiedRoleEligibilityRequest> {
	
    /**
     * The request for the UnifiedRoleEligibilityRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityRequest.class);
    }

    /**
     * Gets the UnifiedRoleEligibilityRequest from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityRequest> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRoleEligibilityRequest from the service
     *
     * @return the UnifiedRoleEligibilityRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilityRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityRequest> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRoleEligibilityRequest delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRoleEligibilityRequest with a source
     *
     * @param sourceUnifiedRoleEligibilityRequest the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityRequest> patchAsync(@Nonnull final UnifiedRoleEligibilityRequest sourceUnifiedRoleEligibilityRequest) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRoleEligibilityRequest);
    }

    /**
     * Patches this UnifiedRoleEligibilityRequest with a source
     *
     * @param sourceUnifiedRoleEligibilityRequest the source object with updates
     * @return the updated UnifiedRoleEligibilityRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilityRequest patch(@Nonnull final UnifiedRoleEligibilityRequest sourceUnifiedRoleEligibilityRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleEligibilityRequest);
    }

    /**
     * Creates a UnifiedRoleEligibilityRequest with a new object
     *
     * @param newUnifiedRoleEligibilityRequest the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityRequest> postAsync(@Nonnull final UnifiedRoleEligibilityRequest newUnifiedRoleEligibilityRequest) {
        return sendAsync(HttpMethod.POST, newUnifiedRoleEligibilityRequest);
    }

    /**
     * Creates a UnifiedRoleEligibilityRequest with a new object
     *
     * @param newUnifiedRoleEligibilityRequest the new object to create
     * @return the created UnifiedRoleEligibilityRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilityRequest post(@Nonnull final UnifiedRoleEligibilityRequest newUnifiedRoleEligibilityRequest) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleEligibilityRequest);
    }

    /**
     * Creates a UnifiedRoleEligibilityRequest with a new object
     *
     * @param newUnifiedRoleEligibilityRequest the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleEligibilityRequest> putAsync(@Nonnull final UnifiedRoleEligibilityRequest newUnifiedRoleEligibilityRequest) {
        return sendAsync(HttpMethod.PUT, newUnifiedRoleEligibilityRequest);
    }

    /**
     * Creates a UnifiedRoleEligibilityRequest with a new object
     *
     * @param newUnifiedRoleEligibilityRequest the object to create/update
     * @return the created UnifiedRoleEligibilityRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleEligibilityRequest put(@Nonnull final UnifiedRoleEligibilityRequest newUnifiedRoleEligibilityRequest) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleEligibilityRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRoleEligibilityRequestRequest select(@Nonnull final String value) {
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
     public UnifiedRoleEligibilityRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
