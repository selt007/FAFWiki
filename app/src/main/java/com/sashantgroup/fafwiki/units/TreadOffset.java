package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = TreadOffset.Deserializer.class)
@JsonSerialize(using = TreadOffset.Serializer.class)
public class TreadOffset {
    public String[] stringArrayValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<TreadOffset> {
        @Override
        public TreadOffset deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            TreadOffset value = new TreadOffset();
            switch (jsonParser.getCurrentToken()) {
            case VALUE_STRING:
                value.stringValue = jsonParser.readValueAs(String.class);
                break;
            case START_ARRAY:
                value.stringArrayValue = jsonParser.readValueAs(String[].class);
                break;
            default: throw new IOException("Cannot deserialize TreadOffset");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<TreadOffset> {
        @Override
        public void serialize(TreadOffset obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.stringArrayValue != null) {
                jsonGenerator.writeObject(obj.stringArrayValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("TreadOffset must not be null");
        }
    }
}
