// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.models.jsonflatten;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonCapable;
import com.azure.json.JsonReader;
import com.azure.json.JsonWriter;

/**
 * Model used for testing JSON flattening.
 */
@Fluent
public final class VirtualMachineScaleSetVMProfile implements JsonCapable<VirtualMachineScaleSetVMProfile> {
    private VirtualMachineScaleSetNetworkProfile networkProfile;

    public VirtualMachineScaleSetVMProfile setNetworkProfile(VirtualMachineScaleSetNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    public VirtualMachineScaleSetNetworkProfile getNetworkProfile() {
        return networkProfile;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();

        if (networkProfile != null) {
            jsonWriter.writeFieldName("networkProfile");
            networkProfile.toJson(jsonWriter);
        }

        return jsonWriter.writeEndObject().flush();
    }

    public static VirtualMachineScaleSetVMProfile fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(jsonReader, reader -> {
            VirtualMachineScaleSetVMProfile profile = new VirtualMachineScaleSetVMProfile();

            JsonUtils.readFields(reader, fieldName -> {
                if ("networkProfile".equals(fieldName)) {
                    profile.setNetworkProfile(VirtualMachineScaleSetNetworkProfile.fromJson(reader));
                }
            });

            return profile;
        });
    }
}
