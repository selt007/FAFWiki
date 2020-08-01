package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Property55Type {
    BACK_WAKE, HOVER02, HOVER04, LANDING01, RADAR01, UNDER_WATER01;

    @JsonValue
    public String toValue() {
        switch (this) {
        case BACK_WAKE: return "BackWake";
        case HOVER02: return "Hover02";
        case HOVER04: return "Hover04";
        case LANDING01: return "Landing01";
        case RADAR01: return "Radar01";
        case UNDER_WATER01: return "UnderWater01";
        }
        return null;
    }

    @JsonCreator
    public static Property55Type forValue(String value) throws IOException {
        if (value.equals("BackWake")) return BACK_WAKE;
        if (value.equals("Hover02")) return HOVER02;
        if (value.equals("Hover04")) return HOVER04;
        if (value.equals("Landing01")) return LANDING01;
        if (value.equals("Radar01")) return RADAR01;
        if (value.equals("UnderWater01")) return UNDER_WATER01;
        throw new IOException("Cannot deserialize Property55Type");
    }
}
