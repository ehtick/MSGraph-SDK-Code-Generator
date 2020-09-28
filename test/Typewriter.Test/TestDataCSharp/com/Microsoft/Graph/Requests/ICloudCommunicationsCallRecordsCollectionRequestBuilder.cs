// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\IEntityCollectionRequestBuilder.cs.tt
namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;

    /// <summary>
    /// The interface ICloudCommunicationsCallRecordsCollectionRequestBuilder.
    /// </summary>
    public partial interface ICloudCommunicationsCallRecordsCollectionRequestBuilder : IBaseRequestBuilder
    {
        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <returns>The built request.</returns>
        ICloudCommunicationsCallRecordsCollectionRequest Request();

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>The built request.</returns>
        ICloudCommunicationsCallRecordsCollectionRequest Request(IEnumerable<Option> options);

        /// <summary>
        /// Gets an <see cref="Microsoft.Graph2.CallRecords.ICallRecordRequestBuilder"/> for the specified Microsoft.Graph2.CallRecords.CallRecord.
        /// </summary>
        /// <param name="id">The ID for the Microsoft.Graph2.CallRecords.CallRecord.</param>
        /// <returns>The <see cref="Microsoft.Graph2.CallRecords.ICallRecordRequestBuilder"/>.</returns>
        [System.Runtime.CompilerServices.IndexerName("ThisItem")]
        Microsoft.Graph2.CallRecords.ICallRecordRequestBuilder this[string id] { get; }

        /// <summary>
        /// Gets the request builder for CallRecordItem.
        /// </summary>
        /// <returns>The <see cref="ICallRecordItemRequestBuilder"/>.</returns>
        ICallRecordItemRequestBuilder Item(
            string name = null);
    }
}