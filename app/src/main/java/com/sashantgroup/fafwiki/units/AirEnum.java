package  com.sashantgroup.fafwiki.units;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AirEnum {
    AIR, AIR_LAND, AIR_LAND_SEABED_WATER, AIR_LAND_WATER, AIR_LAND_WATER_SEABED, LAND_SEABED_WATER, LAND_WATER, LAND_WATER_SEABED, SEABED_SUB, SEABED_SUB_WATER, SUB_WATER, SUB_WATER_SEABED, SUB_WATER_SEABED_LAND, WATER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AIR: return "Air";
            case AIR_LAND: return "Air|Land";
            case AIR_LAND_SEABED_WATER: return "Air|Land|Seabed|Water";
            case AIR_LAND_WATER: return "Air|Land|Water";
            case AIR_LAND_WATER_SEABED: return "Air|Land|Water|Seabed";
            case LAND_SEABED_WATER: return "Land|Seabed|Water";
            case LAND_WATER: return "Land|Water";
            case LAND_WATER_SEABED: return "Land|Water|Seabed";
            case SEABED_SUB: return "Seabed|Sub";
            case SEABED_SUB_WATER: return "Seabed|Sub|Water";
            case SUB_WATER: return "Sub|Water";
            case SUB_WATER_SEABED: return "Sub|Water|Seabed";
            case SUB_WATER_SEABED_LAND: return "Sub|Water|Seabed|Land";
            case WATER: return "Water";
        }
        return null;
    }

    @JsonCreator
    public static AirEnum forValue(String value) throws IOException {
        if (value.equals("Air")) return AIR;
        if (value.equals("Air|Land")) return AIR_LAND;
        if (value.equals("Air|Land|Seabed|Water")) return AIR_LAND_SEABED_WATER;
        if (value.equals("Air|Land|Water")) return AIR_LAND_WATER;
        if (value.equals("Air|Land|Water|Seabed")) return AIR_LAND_WATER_SEABED;
        if (value.equals("Land|Seabed|Water")) return LAND_SEABED_WATER;
        if (value.equals("Land|Water")) return LAND_WATER;
        if (value.equals("Land|Water|Seabed")) return LAND_WATER_SEABED;
        if (value.equals("Seabed|Sub")) return SEABED_SUB;
        if (value.equals("Seabed|Sub|Water")) return SEABED_SUB_WATER;
        if (value.equals("Sub|Water")) return SUB_WATER;
        if (value.equals("Sub|Water|Seabed")) return SUB_WATER_SEABED;
        if (value.equals("Sub|Water|Seabed|Land")) return SUB_WATER_SEABED_LAND;
        if (value.equals("Water")) return WATER;
        throw new IOException("Cannot deserialize AirEnum");
    }
}
