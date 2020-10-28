package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BuildAttachBone {
    ATTACHPOINT, ATTACHPOINT01, ATTACH_POINT, BUILD_POINT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ATTACHPOINT: return "Attachpoint";
            case ATTACHPOINT01: return "Attachpoint01";
            case ATTACH_POINT: return "AttachPoint";
            case BUILD_POINT: return "Build_Point";
        }
        return null;
    }

    @JsonCreator
    public static BuildAttachBone forValue(String value) throws IOException {
        if (value.equals("Attachpoint")) return ATTACHPOINT;
        if (value.equals("Attachpoint01")) return ATTACHPOINT01;
        if (value.equals("AttachPoint")) return ATTACH_POINT;
        if (value.equals("Build_Point")) return BUILD_POINT;
        throw new IOException("Cannot deserialize BuildAttachBone");
    }
}
