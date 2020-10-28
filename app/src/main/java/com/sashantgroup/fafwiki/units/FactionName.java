package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FactionName {
    AEON, CYBRAN, SERAPHIM, UEF;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AEON: return "Aeon";
            case CYBRAN: return "Cybran";
            case SERAPHIM: return "Seraphim";
            case UEF: return "UEF";
        }
        return null;
    }

    @JsonCreator
    public static FactionName forValue(String value) throws IOException {
        if (value.equals("Aeon")) return AEON;
        if (value.equals("Cybran")) return CYBRAN;
        if (value.equals("Seraphim")) return SERAPHIM;
        if (value.equals("UEF")) return UEF;
        throw new IOException("Cannot deserialize FactionName");
    }
}
