package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = WaterEffectsUnion.Deserializer.class)
@JsonSerialize(using = WaterEffectsUnion.Serializer.class)
public class WaterEffectsUnion {
    public IndigoEffects indigoEffectsValue;
    public Object[] anythingArrayValue;

    static class Deserializer extends JsonDeserializer<WaterEffectsUnion> {
        @Override
        public WaterEffectsUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            WaterEffectsUnion value = new WaterEffectsUnion();
            switch (jsonParser.getCurrentToken()) {
            case START_ARRAY:
                value.anythingArrayValue = jsonParser.readValueAs(Object[].class);
                break;
            case START_OBJECT:
                value.indigoEffectsValue = jsonParser.readValueAs(IndigoEffects.class);
                break;
            default: throw new IOException("Cannot deserialize WaterEffectsUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<WaterEffectsUnion> {
        @Override
        public void serialize(WaterEffectsUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.indigoEffectsValue != null) {
                jsonGenerator.writeObject(obj.indigoEffectsValue);
                return;
            }
            if (obj.anythingArrayValue != null) {
                jsonGenerator.writeObject(obj.anythingArrayValue);
                return;
            }
            throw new IOException("WaterEffectsUnion must not be null");
        }
    }
}
