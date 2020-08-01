package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = IdleEffectsUnion.Deserializer.class)
@JsonSerialize(using = IdleEffectsUnion.Serializer.class)
public class IdleEffectsUnion {
    public IdleEffectsClass idleEffectsClassValue;
    public String[] stringArrayValue;

    static class Deserializer extends JsonDeserializer<IdleEffectsUnion> {
        @Override
        public IdleEffectsUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            IdleEffectsUnion value = new IdleEffectsUnion();
            switch (jsonParser.getCurrentToken()) {
            case VALUE_NULL:
                break;
            case START_ARRAY:
                value.stringArrayValue = jsonParser.readValueAs(String[].class);
                break;
            case START_OBJECT:
                value.idleEffectsClassValue = jsonParser.readValueAs(IdleEffectsClass.class);
                break;
            default: throw new IOException("Cannot deserialize IdleEffectsUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<IdleEffectsUnion> {
        @Override
        public void serialize(IdleEffectsUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.idleEffectsClassValue != null) {
                jsonGenerator.writeObject(obj.idleEffectsClassValue);
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
