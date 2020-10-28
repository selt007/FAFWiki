package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Slot {
    BACK, LCH, RCH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BACK: return "Back";
            case LCH: return "LCH";
            case RCH: return "RCH";
        }
        return null;
    }

    @JsonCreator
    public static Slot forValue(String value) throws IOException {
        if (value.equals("Back")) return BACK;
        if (value.equals("LCH")) return LCH;
        if (value.equals("RCH")) return RCH;
        throw new IOException("Cannot deserialize Slot");
    }
}
