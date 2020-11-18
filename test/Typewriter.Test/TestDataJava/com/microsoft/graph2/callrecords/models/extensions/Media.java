// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph2.callrecords.models.extensions.NetworkInfo;
import com.microsoft.graph2.callrecords.models.extensions.DeviceInfo;
import com.microsoft.graph2.callrecords.models.extensions.MediaStream;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media.
 */
public class Media implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Label.
     * 
     */
    @SerializedName(value = "label", alternate = {"Label"})
    @Expose
	@Nullable
    public String label;

    /**
     * The Caller Network.
     * 
     */
    @SerializedName(value = "callerNetwork", alternate = {"CallerNetwork"})
    @Expose
	@Nullable
    public NetworkInfo callerNetwork;

    /**
     * The Caller Device.
     * 
     */
    @SerializedName(value = "callerDevice", alternate = {"CallerDevice"})
    @Expose
	@Nullable
    public DeviceInfo callerDevice;

    /**
     * The Streams.
     * 
     */
    @SerializedName(value = "streams", alternate = {"Streams"})
    @Expose
	@Nullable
    public java.util.List<MediaStream> streams;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
