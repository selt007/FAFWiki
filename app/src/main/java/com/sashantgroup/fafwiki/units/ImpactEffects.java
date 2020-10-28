package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ImpactEffects {
    AEON_SHIELD_HIT01, CYBRAN_SHIELD_HIT01, SERAPHIM_SHIELD_HIT01, UEF_SHIELD_HIT01;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AEON_SHIELD_HIT01: return "AeonShieldHit01";
            case CYBRAN_SHIELD_HIT01: return "CybranShieldHit01";
            case SERAPHIM_SHIELD_HIT01: return "SeraphimShieldHit01";
            case UEF_SHIELD_HIT01: return "UEFShieldHit01";
        }
        return null;
    }

    @JsonCreator
    public static ImpactEffects forValue(String value) throws IOException {
        if (value.equals("AeonShieldHit01")) return AEON_SHIELD_HIT01;
        if (value.equals("CybranShieldHit01")) return CYBRAN_SHIELD_HIT01;
        if (value.equals("SeraphimShieldHit01")) return SERAPHIM_SHIELD_HIT01;
        if (value.equals("UEFShieldHit01")) return UEF_SHIELD_HIT01;
        throw new IOException("Cannot deserialize ImpactEffects");
    }
}
