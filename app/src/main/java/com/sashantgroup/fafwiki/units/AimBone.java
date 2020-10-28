package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = AimBone.Deserializer.class)
@JsonSerialize(using = AimBone.Serializer.class)
public class AimBone {
    public Long integerValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<AimBone> {
        @Override
        public AimBone deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            AimBone value = new AimBone();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize AimBone");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<AimBone> {
        @Override
        public void serialize(AimBone obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
