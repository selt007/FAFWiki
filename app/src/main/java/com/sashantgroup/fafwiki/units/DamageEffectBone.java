package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = DamageEffectBone.Deserializer.class)
@JsonSerialize(using = DamageEffectBone.Serializer.class)
public class DamageEffectBone {
    public Long integerValue;
    public ArmorType enumValue;

    static class Deserializer extends JsonDeserializer<DamageEffectBone> {
        @Override
        public DamageEffectBone deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            DamageEffectBone value = new DamageEffectBone();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = ArmorType.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                default: throw new IOException("Cannot deserialize DamageEffectBone");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<DamageEffectBone> {
        @Override
        public void serialize(DamageEffectBone obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            throw new IOException("DamageEffectBone must not be null");
        }
    }
}
