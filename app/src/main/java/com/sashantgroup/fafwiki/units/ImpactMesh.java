package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ImpactMesh {
    EFFECTS_ENTITIES_SHIELD_SECTION01_SHIELD_SECTION01_B_MESH, EFFECTS_ENTITIES_SHIELD_SECTION01_SHIELD_SECTION01_MESH, EFFECTS_ENTITIES_SHIELD_SECTION05_SHIELD_SECTION05_MESH;

    @JsonValue
    public String toValue() {
        switch (this) {
        case EFFECTS_ENTITIES_SHIELD_SECTION01_SHIELD_SECTION01_B_MESH: return "/effects/entities/ShieldSection01/ShieldSection01b_mesh";
        case EFFECTS_ENTITIES_SHIELD_SECTION01_SHIELD_SECTION01_MESH: return "/effects/entities/ShieldSection01/ShieldSection01_mesh";
        case EFFECTS_ENTITIES_SHIELD_SECTION05_SHIELD_SECTION05_MESH: return "/effects/Entities/ShieldSection05/ShieldSection05_mesh";
        }
        return null;
    }

    @JsonCreator
    public static ImpactMesh forValue(String value) throws IOException {
        if (value.equals("/effects/entities/ShieldSection01/ShieldSection01b_mesh")) return EFFECTS_ENTITIES_SHIELD_SECTION01_SHIELD_SECTION01_B_MESH;
        if (value.equals("/effects/entities/ShieldSection01/ShieldSection01_mesh")) return EFFECTS_ENTITIES_SHIELD_SECTION01_SHIELD_SECTION01_MESH;
        if (value.equals("/effects/Entities/ShieldSection05/ShieldSection05_mesh")) return EFFECTS_ENTITIES_SHIELD_SECTION05_SHIELD_SECTION05_MESH;
        throw new IOException("Cannot deserialize ImpactMesh");
    }
}
