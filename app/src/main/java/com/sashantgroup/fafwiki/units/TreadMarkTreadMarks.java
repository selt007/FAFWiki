package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TreadMarkTreadMarks {
    TANK_TREADS002_ALBEDO, TANK_TREADS006_ALBEDO, TANK_TREADS03_ALBEDO, TANK_TREADS06_ALBEDO, TANK_TREADS07_ALBEDO, TANK_TREADS_ALBEDO;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TANK_TREADS002_ALBEDO: return "tank_treads002_albedo";
            case TANK_TREADS006_ALBEDO: return "tank_treads006_albedo";
            case TANK_TREADS03_ALBEDO: return "tank_treads03_albedo";
            case TANK_TREADS06_ALBEDO: return "tank_treads06_albedo";
            case TANK_TREADS07_ALBEDO: return "tank_treads07_albedo";
            case TANK_TREADS_ALBEDO: return "tank_treads_albedo";
        }
        return null;
    }

    @JsonCreator
    public static TreadMarkTreadMarks forValue(String value) throws IOException {
        if (value.equals("tank_treads002_albedo")) return TANK_TREADS002_ALBEDO;
        if (value.equals("tank_treads006_albedo")) return TANK_TREADS006_ALBEDO;
        if (value.equals("tank_treads03_albedo")) return TANK_TREADS03_ALBEDO;
        if (value.equals("tank_treads06_albedo")) return TANK_TREADS06_ALBEDO;
        if (value.equals("tank_treads07_albedo")) return TANK_TREADS07_ALBEDO;
        if (value.equals("tank_treads_albedo")) return TANK_TREADS_ALBEDO;
        throw new IOException("Cannot deserialize TreadMarkTreadMarks");
    }
}
