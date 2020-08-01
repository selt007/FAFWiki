package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = LandEffectsUnion.Deserializer.class)
@JsonSerialize(using = LandEffectsUnion.Serializer.class)
public class LandEffectsUnion {
    public TentacledEffects tentacledEffectsValue;
    public Object[] anythingArrayValue;

    static class Deserializer extends JsonDeserializer<LandEffectsUnion> {
        @Override
        public LandEffectsUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            LandEffectsUnion value = new LandEffectsUnion();
            switch (jsonParser.getCurrentToken()) {
            case START_ARRAY:
                value.anythingArrayValue = jsonParser.readValueAs(Object[].class);
                break;
            case START_OBJECT:
                value.tentacledEffectsValue = jsonParser.readValueAs(TentacledEffects.class);
                break;
            default: throw new IOException("Cannot deserialize LandEffectsUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<LandEffectsUnion> {
        @Override
        public void serialize(LandEffectsUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.tentacledEffectsValue != null) {
                jsonGenerator.writeObject(obj.tentacledEffectsValue);
                return;
            }
            if (obj.anythingArrayValue != null) {
                jsonGenerator.writeObject(obj.anythingArrayValue);
                return;
            }
            throw new IOException("LandEffectsUnion must not be null");
        }
    }
}
