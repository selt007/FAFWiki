package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = MovementEffectsUnion.Deserializer.class)
@JsonSerialize(using = MovementEffectsUnion.Serializer.class)
public class MovementEffectsUnion {
    public MovementEffectsClass movementEffectsClassValue;
    public String[] stringArrayValue;

    static class Deserializer extends JsonDeserializer<MovementEffectsUnion> {
        @Override
        public MovementEffectsUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            MovementEffectsUnion value = new MovementEffectsUnion();
            switch (jsonParser.getCurrentToken()) {
            case VALUE_NULL:
                break;
            case START_ARRAY:
                value.stringArrayValue = jsonParser.readValueAs(String[].class);
                break;
            case START_OBJECT:
                value.movementEffectsClassValue = jsonParser.readValueAs(MovementEffectsClass.class);
                break;
            default: throw new IOException("Cannot deserialize MovementEffectsUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<MovementEffectsUnion> {
        @Override
        public void serialize(MovementEffectsUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.movementEffectsClassValue != null) {
                jsonGenerator.writeObject(obj.movementEffectsClassValue);
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
