package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Property118Type {
    FOOT_FALL01;

    @JsonValue
    public String toValue() {
        switch (this) {
        case FOOT_FALL01: return "FootFall01";
        }
        return null;
    }

    @JsonCreator
    public static Property118Type forValue(String value) throws IOException {
        if (value.equals("FootFall01")) return FOOT_FALL01;
        throw new IOException("Cannot deserialize Property118Type");
    }
}
