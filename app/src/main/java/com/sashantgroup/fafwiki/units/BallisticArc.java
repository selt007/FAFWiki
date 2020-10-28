package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BallisticArc {
    RULEUBA_HIGH_ARC, RULEUBA_LOW_ARC, RULEUBA_NONE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RULEUBA_HIGH_ARC: return "RULEUBA_HighArc";
            case RULEUBA_LOW_ARC: return "RULEUBA_LowArc";
            case RULEUBA_NONE: return "RULEUBA_None";
        }
        return null;
    }

    @JsonCreator
    public static BallisticArc forValue(String value) throws IOException {
        if (value.equals("RULEUBA_HighArc")) return RULEUBA_HIGH_ARC;
        if (value.equals("RULEUBA_LowArc")) return RULEUBA_LOW_ARC;
        if (value.equals("RULEUBA_None")) return RULEUBA_NONE;
        throw new IOException("Cannot deserialize BallisticArc");
    }
}
