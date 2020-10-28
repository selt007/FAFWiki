package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Yellow {
    EFFECTS_EMITTERS_LIGHT_YELLOW_02__EMIT_BP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EFFECTS_EMITTERS_LIGHT_YELLOW_02__EMIT_BP: return "/effects/emitters/light_yellow_02_emit.bp";
        }
        return null;
    }

    @JsonCreator
    public static Yellow forValue(String value) throws IOException {
        if (value.equals("/effects/emitters/light_yellow_02_emit.bp")) return EFFECTS_EMITTERS_LIGHT_YELLOW_02__EMIT_BP;
        throw new IOException("Cannot deserialize Yellow");
    }
}
