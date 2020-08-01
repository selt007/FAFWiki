package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum WeaponCategory {
    DEATH, TELEPORT;

    @JsonValue
    public String toValue() {
        switch (this) {
        case DEATH: return "Death";
        case TELEPORT: return "Teleport";
        }
        return null;
    }

    @JsonCreator
    public static WeaponCategory forValue(String value) throws IOException {
        if (value.equals("Death")) return DEATH;
        if (value.equals("Teleport")) return TELEPORT;
        throw new IOException("Cannot deserialize WeaponCategory");
    }
}
