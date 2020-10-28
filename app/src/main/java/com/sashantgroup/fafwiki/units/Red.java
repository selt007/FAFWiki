package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Red {
    EFFECTS_EMITTERS_LIGHT_RED_03__EMIT_BP, EFFECTS_EMITTERS_LIGHT_RED_BLINKING_02__EMIT_BP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EFFECTS_EMITTERS_LIGHT_RED_03__EMIT_BP: return "/effects/emitters/light_red_03_emit.bp";
            case EFFECTS_EMITTERS_LIGHT_RED_BLINKING_02__EMIT_BP: return "/effects/emitters/light_red_blinking_02_emit.bp";
        }
        return null;
    }

    @JsonCreator
    public static Red forValue(String value) throws IOException {
        if (value.equals("/effects/emitters/light_red_03_emit.bp")) return EFFECTS_EMITTERS_LIGHT_RED_03__EMIT_BP;
        if (value.equals("/effects/emitters/light_red_blinking_02_emit.bp")) return EFFECTS_EMITTERS_LIGHT_RED_BLINKING_02__EMIT_BP;
        throw new IOException("Cannot deserialize Red");
    }
}
