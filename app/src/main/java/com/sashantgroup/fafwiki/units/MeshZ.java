package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MeshZ {
    EFFECTS_ENTITIES_SHIELD01_SHIELD01_Z_MESH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EFFECTS_ENTITIES_SHIELD01_SHIELD01_Z_MESH: return "/effects/entities/Shield01/Shield01z_mesh";
        }
        return null;
    }

    @JsonCreator
    public static MeshZ forValue(String value) throws IOException {
        if (value.equals("/effects/entities/Shield01/Shield01z_mesh")) return EFFECTS_ENTITIES_SHIELD01_SHIELD01_Z_MESH;
        throw new IOException("Cannot deserialize MeshZ");
    }
}
