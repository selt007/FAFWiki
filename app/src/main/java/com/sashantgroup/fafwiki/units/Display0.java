package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Display0 {
    EMPTY, THE_0_;

    @JsonValue
    public String toValue() {
        switch (this) {
        case EMPTY: return "";
        case THE_0_: return "},]]";
        }
        return null;
    }

    @JsonCreator
    public static Display0 forValue(String value) throws IOException {
        if (value.equals("")) return EMPTY;
        if (value.equals("},]]")) return THE_0_;
        throw new IOException("Cannot deserialize Display0");
    }
}
