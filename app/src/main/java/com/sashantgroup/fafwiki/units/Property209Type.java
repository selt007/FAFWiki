package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Property209Type {
    FOOT_FALL02;

    @JsonValue
    public String toValue() {
        switch (this) {
        case FOOT_FALL02: return "FootFall02";
        }
        return null;
    }

    @JsonCreator
    public static Property209Type forValue(String value) throws IOException {
        if (value.equals("FootFall02")) return FOOT_FALL02;
        throw new IOException("Cannot deserialize Property209Type");
    }
}
