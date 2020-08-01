package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SortCategory {
    SORTCONSTRUCTION, SORTOTHER, SORTSTRATEGIC;

    @JsonValue
    public String toValue() {
        switch (this) {
        case SORTCONSTRUCTION: return "SORTCONSTRUCTION";
        case SORTOTHER: return "SORTOTHER";
        case SORTSTRATEGIC: return "SORTSTRATEGIC";
        }
        return null;
    }

    @JsonCreator
    public static SortCategory forValue(String value) throws IOException {
        if (value.equals("SORTCONSTRUCTION")) return SORTCONSTRUCTION;
        if (value.equals("SORTOTHER")) return SORTOTHER;
        if (value.equals("SORTSTRATEGIC")) return SORTSTRATEGIC;
        throw new IOException("Cannot deserialize SortCategory");
    }
}
