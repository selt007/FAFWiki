package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BoneType {
    FOOT_FALL01, FOOT_FALL02;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FOOT_FALL01: return "FootFall01";
            case FOOT_FALL02: return "FootFall02";
        }
        return null;
    }

    @JsonCreator
    public static BoneType forValue(String value) throws IOException {
        if (value.equals("FootFall01")) return FOOT_FALL01;
        if (value.equals("FootFall02")) return FOOT_FALL02;
        throw new IOException("Cannot deserialize BoneType");
    }
}
