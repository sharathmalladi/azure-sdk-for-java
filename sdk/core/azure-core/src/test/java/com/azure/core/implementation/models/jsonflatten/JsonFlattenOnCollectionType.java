// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.models.jsonflatten;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonCapable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.util.List;

/**
 * Model used for testing JSON flattening.
 */
@Fluent
public final class JsonFlattenOnCollectionType implements JsonCapable<JsonFlattenOnCollectionType> {
    private List<String> jsonFlattenCollection;

    public JsonFlattenOnCollectionType setJsonFlattenCollection(List<String> jsonFlattenCollection) {
        this.jsonFlattenCollection = jsonFlattenCollection;
        return this;
    }

    public List<String> getJsonFlattenCollection() {
        return jsonFlattenCollection;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();

        if (jsonFlattenCollection != null) {
            jsonWriter.writeFieldName("jsonflatten")
                .writeStartObject();

            JsonUtils.writeArray(jsonWriter, "collection", jsonFlattenCollection, JsonWriter::writeString)
                .writeEndObject();
        }

        return jsonWriter.writeEndObject().flush();
    }

    public static JsonFlattenOnCollectionType fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(jsonReader, reader -> {
            JsonFlattenOnCollectionType flatten = new JsonFlattenOnCollectionType();

            JsonUtils.readFields(reader, fieldName -> {
                if ("jsonflatten".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    JsonUtils.readFields(reader, fieldName2 -> {
                        flatten.setJsonFlattenCollection(JsonUtils.readArray(reader, JsonReader::getStringValue));
                    });
                }
            });

            return flatten;
        });
    }
}
