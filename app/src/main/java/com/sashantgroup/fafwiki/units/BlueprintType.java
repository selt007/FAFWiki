package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BlueprintType {
    UNIT_BLUEPRINT;

    @JsonValue
    public String toValue() {
        switch (this) {
        case UNIT_BLUEPRINT: return "UnitBlueprint";
        }
        return null;
    }

    @JsonCreator
    public static BlueprintType forValue(String value) throws IOException {
        if (value.equals("UnitBlueprint")) return UNIT_BLUEPRINT;
        throw new IOException("Cannot deserialize BlueprintType");
    }
}
