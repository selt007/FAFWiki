package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Name {
    LOC_BACK, LOC_LCH, LOC_RCH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LOC_BACK: return "<LOC _Back>";
            case LOC_LCH: return "<LOC _LCH>";
            case LOC_RCH: return "<LOC _RCH>";
        }
        return null;
    }

    @JsonCreator
    public static Name forValue(String value) throws IOException {
        if (value.equals("<LOC _Back>")) return LOC_BACK;
        if (value.equals("<LOC _LCH>")) return LOC_LCH;
        if (value.equals("<LOC _RCH>")) return LOC_RCH;
        throw new IOException("Cannot deserialize Name");
    }
}
