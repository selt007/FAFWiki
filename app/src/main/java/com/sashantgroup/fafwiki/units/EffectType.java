package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EffectType {
    UNDER_WATER01;

    @JsonValue
    public String toValue() {
        switch (this) {
            case UNDER_WATER01: return "UnderWater01";
        }
        return null;
    }

    @JsonCreator
    public static EffectType forValue(String value) throws IOException {
        if (value.equals("UnderWater01")) return UNDER_WATER01;
        throw new IOException("Cannot deserialize EffectType");
    }
}
