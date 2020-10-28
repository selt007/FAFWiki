package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BuffType {
    STUN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case STUN: return "STUN";
        }
        return null;
    }

    @JsonCreator
    public static BuffType forValue(String value) throws IOException {
        if (value.equals("STUN")) return STUN;
        throw new IOException("Cannot deserialize BuffType");
    }
}
