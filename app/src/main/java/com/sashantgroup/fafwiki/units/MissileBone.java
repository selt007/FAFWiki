package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MissileBone {
    CZAR_BEAM, DEATHNUKE, DEATH_EXPLOSION, EMP, FIRE_BEETLE_EXPLOSION, NORMAL, NUKE, OTHE_TACTICAL_BOMB, OVERCHARGE, TACTICAL_MISSILE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CZAR_BEAM: return "CzarBeam";
            case DEATHNUKE: return "Deathnuke";
            case DEATH_EXPLOSION: return "DeathExplosion";
            case EMP: return "EMP";
            case FIRE_BEETLE_EXPLOSION: return "FireBeetleExplosion";
            case NORMAL: return "Normal";
            case NUKE: return "Nuke";
            case OTHE_TACTICAL_BOMB: return "OtheTacticalBomb";
            case OVERCHARGE: return "Overcharge";
            case TACTICAL_MISSILE: return "TacticalMissile";
        }
        return null;
    }

    @JsonCreator
    public static MissileBone forValue(String value) throws IOException {
        if (value.equals("CzarBeam")) return CZAR_BEAM;
        if (value.equals("Deathnuke")) return DEATHNUKE;
        if (value.equals("DeathExplosion")) return DEATH_EXPLOSION;
        if (value.equals("EMP")) return EMP;
        if (value.equals("FireBeetleExplosion")) return FIRE_BEETLE_EXPLOSION;
        if (value.equals("Normal")) return NORMAL;
        if (value.equals("Nuke")) return NUKE;
        if (value.equals("OtheTacticalBomb")) return OTHE_TACTICAL_BOMB;
        if (value.equals("Overcharge")) return OVERCHARGE;
        if (value.equals("TacticalMissile")) return TACTICAL_MISSILE;
        throw new IOException("Cannot deserialize MissileBone");
    }
}
