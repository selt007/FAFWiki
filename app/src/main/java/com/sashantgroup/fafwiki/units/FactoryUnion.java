package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = FactoryUnion.Deserializer.class)
@JsonSerialize(using = FactoryUnion.Serializer.class)
public class FactoryUnion {
    public FactoryClass factoryClassValue;
    public String[] stringArrayValue;

    static class Deserializer extends JsonDeserializer<FactoryUnion> {
        @Override
        public FactoryUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            FactoryUnion value = new FactoryUnion();
            switch (jsonParser.getCurrentToken()) {
            case VALUE_NULL:
                break;
            case START_ARRAY:
                value.stringArrayValue = jsonParser.readValueAs(String[].class);
                break;
            case START_OBJECT:
                value.factoryClassValue = jsonParser.readValueAs(FactoryClass.class);
                break;
            default: throw new IOException("Cannot deserialize FactoryUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<FactoryUnion> {
        @Override
        public void serialize(FactoryUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.factoryClassValue != null) {
                jsonGenerator.writeObject(obj.factoryClassValue);
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
