package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Bank {
    XGG;

    @JsonValue
    public String toValue() {
        switch (this) {
        case XGG: return "XGG";
        }
        return null;
    }

    @JsonCreator
    public static Bank forValue(String value) throws IOException {
        if (value.equals("XGG")) return XGG;
        throw new IOException("Cannot deserialize Bank");
    }
}
