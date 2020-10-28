package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = TarmacGlowDecal.Deserializer.class)
@JsonSerialize(using = TarmacGlowDecal.Serializer.class)
public class TarmacGlowDecal {
    public Double doubleValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<TarmacGlowDecal> {
        @Override
        public TarmacGlowDecal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            TarmacGlowDecal value = new TarmacGlowDecal();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case VALUE_NUMBER_INT:
                case VALUE_NUMBER_FLOAT:
                    value.doubleValue = jsonParser.readValueAs(Double.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize TarmacGlowDecal");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<TarmacGlowDecal> {
        @Override
        public void serialize(TarmacGlowDecal obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.doubleValue != null) {
                jsonGenerator.writeObject(obj.doubleValue);
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
