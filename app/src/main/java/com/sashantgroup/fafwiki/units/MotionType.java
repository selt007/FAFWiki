package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MotionType {
    RULEUMT_AIR, RULEUMT_AMPHIBIOUS, RULEUMT_AMPHIBIOUS_FLOATING, RULEUMT_HOVER, RULEUMT_LAND, RULEUMT_NONE, RULEUMT_SURFACING_SUB, RULEUMT_WATER;

    @JsonValue
    public String toValue() {
        switch (this) {
        case RULEUMT_AIR: return "RULEUMT_Air";
        case RULEUMT_AMPHIBIOUS: return "RULEUMT_Amphibious";
        case RULEUMT_AMPHIBIOUS_FLOATING: return "RULEUMT_AmphibiousFloating";
        case RULEUMT_HOVER: return "RULEUMT_Hover";
        case RULEUMT_LAND: return "RULEUMT_Land";
        case RULEUMT_NONE: return "RULEUMT_None";
        case RULEUMT_SURFACING_SUB: return "RULEUMT_SurfacingSub";
        case RULEUMT_WATER: return "RULEUMT_Water";
        }
        return null;
    }

    @JsonCreator
    public static MotionType forValue(String value) throws IOException {
        if (value.equals("RULEUMT_Air")) return RULEUMT_AIR;
        if (value.equals("RULEUMT_Amphibious")) return RULEUMT_AMPHIBIOUS;
        if (value.equals("RULEUMT_AmphibiousFloating")) return RULEUMT_AMPHIBIOUS_FLOATING;
        if (value.equals("RULEUMT_Hover")) return RULEUMT_HOVER;
        if (value.equals("RULEUMT_Land")) return RULEUMT_LAND;
        if (value.equals("RULEUMT_None")) return RULEUMT_NONE;
        if (value.equals("RULEUMT_SurfacingSub")) return RULEUMT_SURFACING_SUB;
        if (value.equals("RULEUMT_Water")) return RULEUMT_WATER;
        throw new IOException("Cannot deserialize MotionType");
    }
}
