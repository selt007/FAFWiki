package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LookupName {
    TEXTURES_EFFECTS_NOMAD_POWER_ARMOR_LOOKUP_DDS, TEXTURES_ENVIRONMENT_FALLOFF_SERAPHIM_LOOKUP_DDS;

    @JsonValue
    public String toValue() {
        switch (this) {
        case TEXTURES_EFFECTS_NOMAD_POWER_ARMOR_LOOKUP_DDS: return "/textures/effects/NomadPowerArmorLookup.dds";
        case TEXTURES_ENVIRONMENT_FALLOFF_SERAPHIM_LOOKUP_DDS: return "/textures/environment/Falloff_seraphim_lookup.dds";
        }
        return null;
    }

    @JsonCreator
    public static LookupName forValue(String value) throws IOException {
        if (value.equals("/textures/effects/NomadPowerArmorLookup.dds")) return TEXTURES_EFFECTS_NOMAD_POWER_ARMOR_LOOKUP_DDS;
        if (value.equals("/textures/environment/Falloff_seraphim_lookup.dds")) return TEXTURES_ENVIRONMENT_FALLOFF_SERAPHIM_LOOKUP_DDS;
        throw new IOException("Cannot deserialize LookupName");
    }
}
