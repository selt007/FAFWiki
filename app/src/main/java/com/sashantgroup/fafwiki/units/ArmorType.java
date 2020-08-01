package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ArmorType {
    ARMOR_TYPE_STRUCTURE, ASF, COMMANDER, EXPERIMENTAL, FIRE_BEETLE, LIGHT, NORMAL, STRUCTURE, TMD;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ARMOR_TYPE_STRUCTURE: return "STRUCTURE";
        case ASF: return "ASF";
        case COMMANDER: return "Commander";
        case EXPERIMENTAL: return "Experimental";
        case FIRE_BEETLE: return "FireBeetle";
        case LIGHT: return "Light";
        case NORMAL: return "Normal";
        case STRUCTURE: return "Structure";
        case TMD: return "TMD";
        }
        return null;
    }

    @JsonCreator
    public static ArmorType forValue(String value) throws IOException {
        if (value.equals("STRUCTURE")) return ARMOR_TYPE_STRUCTURE;
        if (value.equals("ASF")) return ASF;
        if (value.equals("Commander")) return COMMANDER;
        if (value.equals("Experimental")) return EXPERIMENTAL;
        if (value.equals("FireBeetle")) return FIRE_BEETLE;
        if (value.equals("Light")) return LIGHT;
        if (value.equals("Normal")) return NORMAL;
        if (value.equals("Structure")) return STRUCTURE;
        if (value.equals("TMD")) return TMD;
        throw new IOException("Cannot deserialize ArmorType");
    }
}
