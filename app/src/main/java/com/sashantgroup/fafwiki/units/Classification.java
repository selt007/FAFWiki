package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Classification {
    RULEUC_COMMANDER, RULEUC_COUNTER_MEASURE, RULEUC_ENGINEER, RULEUC_FACTORY, RULEUC_MILITARY_AIRCRAFT, RULEUC_MILITARY_SHIP, RULEUC_MILITARY_SUB, RULEUC_MILITARY_VEHICLE, RULEUC_MISC_SUPPORT, RULEUC_RESOURCE, RULEUC_SENSOR, RULEUC_WEAPON, RULEUMT_AMPHIBIOUS;

    @JsonValue
    public String toValue() {
        switch (this) {
        case RULEUC_COMMANDER: return "RULEUC_Commander";
        case RULEUC_COUNTER_MEASURE: return "RULEUC_CounterMeasure";
        case RULEUC_ENGINEER: return "RULEUC_Engineer";
        case RULEUC_FACTORY: return "RULEUC_Factory";
        case RULEUC_MILITARY_AIRCRAFT: return "RULEUC_MilitaryAircraft";
        case RULEUC_MILITARY_SHIP: return "RULEUC_MilitaryShip";
        case RULEUC_MILITARY_SUB: return "RULEUC_MilitarySub";
        case RULEUC_MILITARY_VEHICLE: return "RULEUC_MilitaryVehicle";
        case RULEUC_MISC_SUPPORT: return "RULEUC_MiscSupport";
        case RULEUC_RESOURCE: return "RULEUC_Resource";
        case RULEUC_SENSOR: return "RULEUC_Sensor";
        case RULEUC_WEAPON: return "RULEUC_Weapon";
        case RULEUMT_AMPHIBIOUS: return "RULEUMT_Amphibious";
        }
        return null;
    }

    @JsonCreator
    public static Classification forValue(String value) throws IOException {
        if (value.equals("RULEUC_Commander")) return RULEUC_COMMANDER;
        if (value.equals("RULEUC_CounterMeasure")) return RULEUC_COUNTER_MEASURE;
        if (value.equals("RULEUC_Engineer")) return RULEUC_ENGINEER;
        if (value.equals("RULEUC_Factory")) return RULEUC_FACTORY;
        if (value.equals("RULEUC_MilitaryAircraft")) return RULEUC_MILITARY_AIRCRAFT;
        if (value.equals("RULEUC_MilitaryShip")) return RULEUC_MILITARY_SHIP;
        if (value.equals("RULEUC_MilitarySub")) return RULEUC_MILITARY_SUB;
        if (value.equals("RULEUC_MilitaryVehicle")) return RULEUC_MILITARY_VEHICLE;
        if (value.equals("RULEUC_MiscSupport")) return RULEUC_MISC_SUPPORT;
        if (value.equals("RULEUC_Resource")) return RULEUC_RESOURCE;
        if (value.equals("RULEUC_Sensor")) return RULEUC_SENSOR;
        if (value.equals("RULEUC_Weapon")) return RULEUC_WEAPON;
        if (value.equals("RULEUMT_Amphibious")) return RULEUMT_AMPHIBIOUS;
        throw new IOException("Cannot deserialize Classification");
    }
}
