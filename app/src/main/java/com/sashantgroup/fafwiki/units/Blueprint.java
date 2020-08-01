package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Blueprint {
    ENV_WRECKAGE_PROPS_WALLS_UEB5101_PROP_BP, PROPS_DEFAULT_WRECKAGE_DEFAULT_WRECKAGE_PROP_BP;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ENV_WRECKAGE_PROPS_WALLS_UEB5101_PROP_BP: return "/env/Wreckage/props/Walls/UEB5101_prop.bp";
        case PROPS_DEFAULT_WRECKAGE_DEFAULT_WRECKAGE_PROP_BP: return "/props/DefaultWreckage/DefaultWreckage_prop.bp";
        }
        return null;
    }

    @JsonCreator
    public static Blueprint forValue(String value) throws IOException {
        if (value.equals("/env/Wreckage/props/Walls/UEB5101_prop.bp")) return ENV_WRECKAGE_PROPS_WALLS_UEB5101_PROP_BP;
        if (value.equals("/props/DefaultWreckage/DefaultWreckage_prop.bp")) return PROPS_DEFAULT_WRECKAGE_DEFAULT_WRECKAGE_PROP_BP;
        throw new IOException("Cannot deserialize Blueprint");
    }
}
