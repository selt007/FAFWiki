package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TechLevel {
    RULEUTL_ADVANCED, RULEUTL_BASIC, RULEUTL_EXPERIMENTAL, RULEUTL_SECRET;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RULEUTL_ADVANCED: return "RULEUTL_Advanced";
            case RULEUTL_BASIC: return "RULEUTL_Basic";
            case RULEUTL_EXPERIMENTAL: return "RULEUTL_Experimental";
            case RULEUTL_SECRET: return "RULEUTL_Secret";
        }
        return null;
    }

    @JsonCreator
    public static TechLevel forValue(String value) throws IOException {
        if (value.equals("RULEUTL_Advanced")) return RULEUTL_ADVANCED;
        if (value.equals("RULEUTL_Basic")) return RULEUTL_BASIC;
        if (value.equals("RULEUTL_Experimental")) return RULEUTL_EXPERIMENTAL;
        if (value.equals("RULEUTL_Secret")) return RULEUTL_SECRET;
        throw new IOException("Cannot deserialize TechLevel");
    }
}
