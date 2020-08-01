package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = LayerChangeEffectsUnion.Deserializer.class)
@JsonSerialize(using = LayerChangeEffectsUnion.Serializer.class)
public class LayerChangeEffectsUnion {
    public LayerChangeEffectsClass layerChangeEffectsClassValue;
    public String[] stringArrayValue;

    static class Deserializer extends JsonDeserializer<LayerChangeEffectsUnion> {
        @Override
        public LayerChangeEffectsUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            LayerChangeEffectsUnion value = new LayerChangeEffectsUnion();
            switch (jsonParser.getCurrentToken()) {
            case VALUE_NULL:
                break;
            case START_ARRAY:
                value.stringArrayValue = jsonParser.readValueAs(String[].class);
                break;
            case START_OBJECT:
                value.layerChangeEffectsClassValue = jsonParser.readValueAs(LayerChangeEffectsClass.class);
                break;
            default: throw new IOException("Cannot deserialize LayerChangeEffectsUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<LayerChangeEffectsUnion> {
        @Override
        public void serialize(LayerChangeEffectsUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.layerChangeEffectsClassValue != null) {
                jsonGenerator.writeObject(obj.layerChangeEffectsClassValue);
                return;
            }
            if (obj.stringArrayValue != null) {
                jsonGenerator.writeObject(obj.stringArrayValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
