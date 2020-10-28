package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TargetRestrictOnlyAllow {
    AIR, STRATEGIC_MISSILE, TACTICAL_MISSILE, TARGET_RESTRICT_ONLY_ALLOW_TACTICAL_MISSILE, TORPEDO;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR: return "AIR";
            case STRATEGIC_MISSILE: return "STRATEGIC MISSILE";
            case TACTICAL_MISSILE: return "TACTICAL,MISSILE";
            case TARGET_RESTRICT_ONLY_ALLOW_TACTICAL_MISSILE: return "TACTICAL MISSILE";
            case TORPEDO: return "TORPEDO";
        }
        return null;
    }

    @JsonCreator
    public static TargetRestrictOnlyAllow forValue(String value) throws IOException {
        if (value.equals("AIR")) return AIR;
        if (value.equals("STRATEGIC MISSILE")) return STRATEGIC_MISSILE;
        if (value.equals("TACTICAL,MISSILE")) return TACTICAL_MISSILE;
        if (value.equals("TACTICAL MISSILE")) return TARGET_RESTRICT_ONLY_ALLOW_TACTICAL_MISSILE;
        if (value.equals("TORPEDO")) return TORPEDO;
        throw new IOException("Cannot deserialize TargetRestrictOnlyAllow");
    }
}
