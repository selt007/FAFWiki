package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RangeCategory {
    UWRC_ANTI_AIR, UWRC_ANTI_NAVY, UWRC_COUNTERMEASURE, UWRC_DIRECT_FIRE, UWRC_INDIRECT_FIRE, UWRC_IN_DIRECT_FIRE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case UWRC_ANTI_AIR: return "UWRC_AntiAir";
            case UWRC_ANTI_NAVY: return "UWRC_AntiNavy";
            case UWRC_COUNTERMEASURE: return "UWRC_Countermeasure";
            case UWRC_DIRECT_FIRE: return "UWRC_DirectFire";
            case UWRC_INDIRECT_FIRE: return "UWRC_IndirectFire";
            case UWRC_IN_DIRECT_FIRE: return "UWRC_InDirectFire";
        }
        return null;
    }

    @JsonCreator
    public static RangeCategory forValue(String value) throws IOException {
        if (value.equals("UWRC_AntiAir")) return UWRC_ANTI_AIR;
        if (value.equals("UWRC_AntiNavy")) return UWRC_ANTI_NAVY;
        if (value.equals("UWRC_Countermeasure")) return UWRC_COUNTERMEASURE;
        if (value.equals("UWRC_DirectFire")) return UWRC_DIRECT_FIRE;
        if (value.equals("UWRC_IndirectFire")) return UWRC_INDIRECT_FIRE;
        if (value.equals("UWRC_InDirectFire")) return UWRC_IN_DIRECT_FIRE;
        throw new IOException("Cannot deserialize RangeCategory");
    }
}
