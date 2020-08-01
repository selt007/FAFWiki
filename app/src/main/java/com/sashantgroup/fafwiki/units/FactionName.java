package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FactionName {
    AEON, CYBRAN, FACTION_NAME_AEON, NOMADS, SERAPHIM, UEF;

    @JsonValue
    public String toValue() {
        switch (this) {
        case AEON: return "Aeon";
        case CYBRAN: return "Cybran";
        case FACTION_NAME_AEON: return "AEON";
        case NOMADS: return "Nomads";
        case SERAPHIM: return "Seraphim";
        case UEF: return "UEF";
        }
        return null;
    }

    @JsonCreator
    public static FactionName forValue(String value) throws IOException {
        if (value.equals("Aeon")) return AEON;
        if (value.equals("Cybran")) return CYBRAN;
        if (value.equals("AEON")) return FACTION_NAME_AEON;
        if (value.equals("Nomads")) return NOMADS;
        if (value.equals("Seraphim")) return SERAPHIM;
        if (value.equals("UEF")) return UEF;
        throw new IOException("Cannot deserialize FactionName");
    }
}
