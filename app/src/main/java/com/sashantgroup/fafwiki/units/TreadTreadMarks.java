package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TreadTreadMarks {
    COLLOSUS_TREAD_01, COLLOSUS_TREAD_02, COMMANDER_PRINT_ALBEDO;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COLLOSUS_TREAD_01: return "collosus_tread_01";
            case COLLOSUS_TREAD_02: return "collosus_tread_02";
            case COMMANDER_PRINT_ALBEDO: return "CommanderPrint_albedo";
        }
        return null;
    }

    @JsonCreator
    public static TreadTreadMarks forValue(String value) throws IOException {
        if (value.equals("collosus_tread_01")) return COLLOSUS_TREAD_01;
        if (value.equals("collosus_tread_02")) return COLLOSUS_TREAD_02;
        if (value.equals("CommanderPrint_albedo")) return COMMANDER_PRINT_ALBEDO;
        throw new IOException("Cannot deserialize TreadTreadMarks");
    }
}
