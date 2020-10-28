package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SortCategory {
    SORTOTHER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SORTOTHER: return "SORTOTHER";
        }
        return null;
    }

    @JsonCreator
    public static SortCategory forValue(String value) throws IOException {
        if (value.equals("SORTOTHER")) return SORTOTHER;
        throw new IOException("Cannot deserialize SortCategory");
    }
}
