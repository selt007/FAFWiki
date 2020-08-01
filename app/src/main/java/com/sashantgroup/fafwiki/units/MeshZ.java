package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MeshZ {
    EFFECTS_ENTITIES_SHIELD01_SHIELD01_Z_MESH, EFFECTS_ENTITIES_SHIELD05_SHIELD05_Z_MESH, EFFECTS_ENTITIES_SHIELD05_STEALTH_SHIELD05_STEALTHZ_MESH;

    @JsonValue
    public String toValue() {
        switch (this) {
        case EFFECTS_ENTITIES_SHIELD01_SHIELD01_Z_MESH: return "/effects/entities/Shield01/Shield01z_mesh";
        case EFFECTS_ENTITIES_SHIELD05_SHIELD05_Z_MESH: return "/effects/Entities/Shield05/Shield05z_mesh";
        case EFFECTS_ENTITIES_SHIELD05_STEALTH_SHIELD05_STEALTHZ_MESH: return "/effects/Entities/Shield05_stealth/Shield05_stealthz_mesh";
        }
        return null;
    }

    @JsonCreator
    public static MeshZ forValue(String value) throws IOException {
        if (value.equals("/effects/entities/Shield01/Shield01z_mesh")) return EFFECTS_ENTITIES_SHIELD01_SHIELD01_Z_MESH;
        if (value.equals("/effects/Entities/Shield05/Shield05z_mesh")) return EFFECTS_ENTITIES_SHIELD05_SHIELD05_Z_MESH;
        if (value.equals("/effects/Entities/Shield05_stealth/Shield05_stealthz_mesh")) return EFFECTS_ENTITIES_SHIELD05_STEALTH_SHIELD05_STEALTHZ_MESH;
        throw new IOException("Cannot deserialize MeshZ");
    }
}
