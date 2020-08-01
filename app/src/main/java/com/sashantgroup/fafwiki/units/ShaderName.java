package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ShaderName {
    AEON, AEON_CZAR, COMMAND_FEEDBACK4, INSECT, METAL, NOMADS_POWER_ARMOR, NOMADS_UNIT, SERAPHIM, UNIT, WRECKAGE;

    @JsonValue
    public String toValue() {
        switch (this) {
        case AEON: return "Aeon";
        case AEON_CZAR: return "AeonCZAR";
        case COMMAND_FEEDBACK4: return "CommandFeedback4";
        case INSECT: return "Insect";
        case METAL: return "Metal";
        case NOMADS_POWER_ARMOR: return "NomadsPowerArmor";
        case NOMADS_UNIT: return "NomadsUnit";
        case SERAPHIM: return "Seraphim";
        case UNIT: return "Unit";
        case WRECKAGE: return "Wreckage";
        }
        return null;
    }

    @JsonCreator
    public static ShaderName forValue(String value) throws IOException {
        if (value.equals("Aeon")) return AEON;
        if (value.equals("AeonCZAR")) return AEON_CZAR;
        if (value.equals("CommandFeedback4")) return COMMAND_FEEDBACK4;
        if (value.equals("Insect")) return INSECT;
        if (value.equals("Metal")) return METAL;
        if (value.equals("NomadsPowerArmor")) return NOMADS_POWER_ARMOR;
        if (value.equals("NomadsUnit")) return NOMADS_UNIT;
        if (value.equals("Seraphim")) return SERAPHIM;
        if (value.equals("Unit")) return UNIT;
        if (value.equals("Wreckage")) return WRECKAGE;
        throw new IOException("Cannot deserialize ShaderName");
    }
}
