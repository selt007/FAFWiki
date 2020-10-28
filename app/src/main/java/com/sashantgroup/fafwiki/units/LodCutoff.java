package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LodCutoff {
    UNIT_MOVE_LOD_CUTOFF, WEAPON_BIG_LOD_CUTOFF, WEAPON_LOD_CUTOFF;

    @JsonValue
    public String toValue() {
        switch (this) {
            case UNIT_MOVE_LOD_CUTOFF: return "UnitMove_LodCutoff";
            case WEAPON_BIG_LOD_CUTOFF: return "WeaponBig_LodCutoff";
            case WEAPON_LOD_CUTOFF: return "Weapon_LodCutoff";
        }
        return null;
    }

    @JsonCreator
    public static LodCutoff forValue(String value) throws IOException {
        if (value.equals("UnitMove_LodCutoff")) return UNIT_MOVE_LOD_CUTOFF;
        if (value.equals("WeaponBig_LodCutoff")) return WEAPON_BIG_LOD_CUTOFF;
        if (value.equals("Weapon_LodCutoff")) return WEAPON_LOD_CUTOFF;
        throw new IOException("Cannot deserialize LodCutoff");
    }
}
