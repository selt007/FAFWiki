package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Water {
    LAND_WATER_SEABED, SEABED_SUB, SEABED_SUB_WATER, SUB_WATER;

    @JsonValue
    public String toValue() {
        switch (this) {
        case LAND_WATER_SEABED: return "Land|Water|Seabed";
        case SEABED_SUB: return "Seabed|Sub";
        case SEABED_SUB_WATER: return "Seabed|Sub|Water";
        case SUB_WATER: return "Sub|Water";
        }
        return null;
    }

    @JsonCreator
    public static Water forValue(String value) throws IOException {
        if (value.equals("Land|Water|Seabed")) return LAND_WATER_SEABED;
        if (value.equals("Seabed|Sub")) return SEABED_SUB;
        if (value.equals("Seabed|Sub|Water")) return SEABED_SUB_WATER;
        if (value.equals("Sub|Water")) return SUB_WATER;
        throw new IOException("Cannot deserialize Water");
    }
}
