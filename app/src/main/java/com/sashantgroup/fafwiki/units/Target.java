package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Target {
    ALLUNITS, MOBILE, MOBILE_TECH1_NAVAL_SHIELD, NAVAL_TECH3_TECH1_MOBILE_MOBILE_TECH2;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ALLUNITS: return "ALLUNITS";
        case MOBILE: return "MOBILE";
        case MOBILE_TECH1_NAVAL_SHIELD: return "MOBILE TECH1 -NAVAL,SHIELD";
        case NAVAL_TECH3_TECH1_MOBILE_MOBILE_TECH2: return "NAVAL -TECH3,TECH1 -MOBILE,MOBILE TECH2";
        }
        return null;
    }

    @JsonCreator
    public static Target forValue(String value) throws IOException {
        if (value.equals("ALLUNITS")) return ALLUNITS;
        if (value.equals("MOBILE")) return MOBILE;
        if (value.equals("MOBILE TECH1 -NAVAL,SHIELD")) return MOBILE_TECH1_NAVAL_SHIELD;
        if (value.equals("NAVAL -TECH3,TECH1 -MOBILE,MOBILE TECH2")) return NAVAL_TECH3_TECH1_MOBILE_MOBILE_TECH2;
        throw new IOException("Cannot deserialize Target");
    }
}
