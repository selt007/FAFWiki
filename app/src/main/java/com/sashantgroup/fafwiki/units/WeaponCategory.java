package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum WeaponCategory {
    ANTI_AIR, ANTI_NAVY, ARTILLERY, BOMB, DEATH, DEFENSE, DIRECT_FIRE, DIRECT_FIRE_EXPERIMENTAL, DIRECT_FIRE_NAVAL, EXPERIMENTAL, INDIRECT_FIRE, KAMIKAZE, MISSILE, TELEPORT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ANTI_AIR: return "Anti Air";
            case ANTI_NAVY: return "Anti Navy";
            case ARTILLERY: return "Artillery";
            case BOMB: return "Bomb";
            case DEATH: return "Death";
            case DEFENSE: return "Defense";
            case DIRECT_FIRE: return "Direct Fire";
            case DIRECT_FIRE_EXPERIMENTAL: return "Direct Fire Experimental";
            case DIRECT_FIRE_NAVAL: return "Direct Fire Naval";
            case EXPERIMENTAL: return "Experimental";
            case INDIRECT_FIRE: return "Indirect Fire";
            case KAMIKAZE: return "Kamikaze";
            case MISSILE: return "Missile";
            case TELEPORT: return "Teleport";
        }
        return null;
    }

    @JsonCreator
    public static WeaponCategory forValue(String value) throws IOException {
        if (value.equals("Anti Air")) return ANTI_AIR;
        if (value.equals("Anti Navy")) return ANTI_NAVY;
        if (value.equals("Artillery")) return ARTILLERY;
        if (value.equals("Bomb")) return BOMB;
        if (value.equals("Death")) return DEATH;
        if (value.equals("Defense")) return DEFENSE;
        if (value.equals("Direct Fire")) return DIRECT_FIRE;
        if (value.equals("Direct Fire Experimental")) return DIRECT_FIRE_EXPERIMENTAL;
        if (value.equals("Direct Fire Naval")) return DIRECT_FIRE_NAVAL;
        if (value.equals("Experimental")) return EXPERIMENTAL;
        if (value.equals("Indirect Fire")) return INDIRECT_FIRE;
        if (value.equals("Kamikaze")) return KAMIKAZE;
        if (value.equals("Missile")) return MISSILE;
        if (value.equals("Teleport")) return TELEPORT;
        throw new IOException("Cannot deserialize WeaponCategory");
    }
}
