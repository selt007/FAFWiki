package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MassMult {
    THE_045, THE_09, THE_45;

    @JsonValue
    public String toValue() {
        switch (this) {
        case THE_045: return "0.45";
        case THE_09: return "0.9";
        case THE_45: return ".45";
        }
        return null;
    }

    @JsonCreator
    public static MassMult forValue(String value) throws IOException {
        if (value.equals("0.45")) return THE_045;
        if (value.equals("0.9")) return THE_09;
        if (value.equals(".45")) return THE_45;
        throw new IOException("Cannot deserialize MassMult");
    }
}
