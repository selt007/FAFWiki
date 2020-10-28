package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TargetRestrictDisallow {
    HIGHALTAIR_UNTARGETABLE, TARGET_RESTRICT_DISALLOW_UNTARGETABLE_AIR, UNTARGETABLE, UNTARGETABLE_AIR, UNTARGETABLE_HOVER, UNTARGETABLE_LAND_POD_STRUCTURE_NAVAL, UNTARGETABLE_LAND_STRUCTURE_NAVAL, UNTARGETABLE_STRATEGIC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HIGHALTAIR_UNTARGETABLE: return "HIGHALTAIR, UNTARGETABLE";
            case TARGET_RESTRICT_DISALLOW_UNTARGETABLE_AIR: return "UNTARGETABLE, AIR";
            case UNTARGETABLE: return "UNTARGETABLE";
            case UNTARGETABLE_AIR: return "UNTARGETABLE AIR";
            case UNTARGETABLE_HOVER: return "UNTARGETABLE, HOVER";
            case UNTARGETABLE_LAND_POD_STRUCTURE_NAVAL: return "UNTARGETABLE,LAND,POD,STRUCTURE,NAVAL";
            case UNTARGETABLE_LAND_STRUCTURE_NAVAL: return "UNTARGETABLE,LAND,STRUCTURE,NAVAL";
            case UNTARGETABLE_STRATEGIC: return "UNTARGETABLE,STRATEGIC";
        }
        return null;
    }

    @JsonCreator
    public static TargetRestrictDisallow forValue(String value) throws IOException {
        if (value.equals("HIGHALTAIR, UNTARGETABLE")) return HIGHALTAIR_UNTARGETABLE;
        if (value.equals("UNTARGETABLE, AIR")) return TARGET_RESTRICT_DISALLOW_UNTARGETABLE_AIR;
        if (value.equals("UNTARGETABLE")) return UNTARGETABLE;
        if (value.equals("UNTARGETABLE AIR")) return UNTARGETABLE_AIR;
        if (value.equals("UNTARGETABLE, HOVER")) return UNTARGETABLE_HOVER;
        if (value.equals("UNTARGETABLE,LAND,POD,STRUCTURE,NAVAL")) return UNTARGETABLE_LAND_POD_STRUCTURE_NAVAL;
        if (value.equals("UNTARGETABLE,LAND,STRUCTURE,NAVAL")) return UNTARGETABLE_LAND_STRUCTURE_NAVAL;
        if (value.equals("UNTARGETABLE,STRATEGIC")) return UNTARGETABLE_STRATEGIC;
        throw new IOException("Cannot deserialize TargetRestrictDisallow");
    }
}
