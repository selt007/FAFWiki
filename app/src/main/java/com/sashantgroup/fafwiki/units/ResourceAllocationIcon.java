package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ResourceAllocationIcon {
    ERAS, ISB, RAS;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ERAS: return "eras";
        case ISB: return "isb";
        case RAS: return "ras";
        }
        return null;
    }

    @JsonCreator
    public static ResourceAllocationIcon forValue(String value) throws IOException {
        if (value.equals("eras")) return ERAS;
        if (value.equals("isb")) return ISB;
        if (value.equals("ras")) return RAS;
        throw new IOException("Cannot deserialize ResourceAllocationIcon");
    }
}
