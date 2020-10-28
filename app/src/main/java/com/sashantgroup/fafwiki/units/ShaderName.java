package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ShaderName {
    AEON, AEON_CZAR, INSECT, SERAPHIM, UNIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AEON: return "Aeon";
            case AEON_CZAR: return "AeonCZAR";
            case INSECT: return "Insect";
            case SERAPHIM: return "Seraphim";
            case UNIT: return "Unit";
        }
        return null;
    }

    @JsonCreator
    public static ShaderName forValue(String value) throws IOException {
        if (value.equals("Aeon")) return AEON;
        if (value.equals("AeonCZAR")) return AEON_CZAR;
        if (value.equals("Insect")) return INSECT;
        if (value.equals("Seraphim")) return SERAPHIM;
        if (value.equals("Unit")) return UNIT;
        throw new IOException("Cannot deserialize ShaderName");
    }
}
