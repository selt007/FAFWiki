package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum The2_Enum {
    EMPTY, UNIT_BLUEPRINT;

    @JsonValue
    public String toValue() {
        switch (this) {
        case EMPTY: return "";
        case UNIT_BLUEPRINT: return "UnitBlueprint {";
        }
        return null;
    }

    @JsonCreator
    public static The2_Enum forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("UnitBlueprint {")) return UNIT_BLUEPRINT;
        throw new IOException("Cannot deserialize The2_Enum");
    }
}
