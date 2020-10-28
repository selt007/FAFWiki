package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = ManualFire.Deserializer.class)
@JsonSerialize(using = ManualFire.Serializer.class)
public class ManualFire {
    public Long integerValue;
    public Boolean boolValue;

    static class Deserializer extends JsonDeserializer<ManualFire> {
        @Override
        public ManualFire deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            ManualFire value = new ManualFire();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_TRUE:
                case VALUE_FALSE:
                    value.boolValue = jsonParser.readValueAs(Boolean.class);
                    break;
                default: throw new IOException("Cannot deserialize ManualFire");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<ManualFire> {
        @Override
        public void serialize(ManualFire obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.boolValue != null) {
                jsonGenerator.writeObject(obj.boolValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
