package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TargetType {
    RULEWTT_PROJECTILE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RULEWTT_PROJECTILE: return "RULEWTT_Projectile";
        }
        return null;
    }

    @JsonCreator
    public static TargetType forValue(String value) throws IOException {
        if (value.equals("RULEWTT_Projectile")) return RULEWTT_PROJECTILE;
        throw new IOException("Cannot deserialize TargetType");
    }
}
