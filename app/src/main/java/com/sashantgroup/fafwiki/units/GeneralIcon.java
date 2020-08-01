package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GeneralIcon {
    AIR, AMPH, LAND, SEA;

    @JsonValue
    public String toValue() {
        switch (this) {
        case AIR: return "air";
        case AMPH: return "amph";
        case LAND: return "land";
        case SEA: return "sea";
        }
        return null;
    }

    @JsonCreator
    public static GeneralIcon forValue(String value) throws IOException {
        if (value.equals("air")) return AIR;
        if (value.equals("amph")) return AMPH;
        if (value.equals("land")) return LAND;
        if (value.equals("sea")) return SEA;
        throw new IOException("Cannot deserialize GeneralIcon");
    }
}
