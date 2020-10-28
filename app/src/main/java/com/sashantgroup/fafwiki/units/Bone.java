package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = Bone.Deserializer.class)
@JsonSerialize(using = Bone.Serializer.class)
public class Bone {
    public Long integerValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<Bone> {
        @Override
        public Bone deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            Bone value = new Bone();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize Bone");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<Bone> {
        @Override
        public void serialize(Bone obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("Bone must not be null");
        }
    }
}
