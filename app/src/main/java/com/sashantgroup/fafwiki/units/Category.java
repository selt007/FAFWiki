package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Category {
    ANTI_AIR, ANTI_NAVY, BOMBER, CIVILIAN, CIVILIAN_TRUCK, COMMAND, CONSTRUCTION, DEATH, DEFENSE, DIRECT_FIRE, ECONOMY, EXPERIMENTAL, FACTORY, FIGHTER, GUNSHIP, INDIRECT_FIRE, INTELLIGENCE, RESEARCH_TRUCK, SHIP, STRATEGIC, SUBMARINE, TRANSPORT, UTILITY;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ANTI_AIR: return "Anti Air";
        case ANTI_NAVY: return "Anti Navy";
        case BOMBER: return "Bomber";
        case CIVILIAN: return "Civilian";
        case CIVILIAN_TRUCK: return "Civilian Truck";
        case COMMAND: return "Command";
        case CONSTRUCTION: return "Construction";
        case DEATH: return "Death";
        case DEFENSE: return "Defense";
        case DIRECT_FIRE: return "Direct Fire";
        case ECONOMY: return "Economy";
        case EXPERIMENTAL: return "Experimental";
        case FACTORY: return "Factory";
        case FIGHTER: return "Fighter";
        case GUNSHIP: return "Gunship";
        case INDIRECT_FIRE: return "Indirect Fire";
        case INTELLIGENCE: return "Intelligence";
        case RESEARCH_TRUCK: return "Research Truck";
        case SHIP: return "Ship";
        case STRATEGIC: return "Strategic";
        case SUBMARINE: return "Submarine";
        case TRANSPORT: return "Transport";
        case UTILITY: return "Utility";
        }
        return null;
    }

    @JsonCreator
    public static Category forValue(String value) throws IOException {
        if (value.equals("Anti Air")) return ANTI_AIR;
        if (value.equals("Anti Navy")) return ANTI_NAVY;
        if (value.equals("Bomber")) return BOMBER;
        if (value.equals("Civilian")) return CIVILIAN;
        if (value.equals("Civilian Truck")) return CIVILIAN_TRUCK;
        if (value.equals("Command")) return COMMAND;
        if (value.equals("Construction")) return CONSTRUCTION;
        if (value.equals("Death")) return DEATH;
        if (value.equals("Defense")) return DEFENSE;
        if (value.equals("Direct Fire")) return DIRECT_FIRE;
        if (value.equals("Economy")) return ECONOMY;
        if (value.equals("Experimental")) return EXPERIMENTAL;
        if (value.equals("Factory")) return FACTORY;
        if (value.equals("Fighter")) return FIGHTER;
        if (value.equals("Gunship")) return GUNSHIP;
        if (value.equals("Indirect Fire")) return INDIRECT_FIRE;
        if (value.equals("Intelligence")) return INTELLIGENCE;
        if (value.equals("Research Truck")) return RESEARCH_TRUCK;
        if (value.equals("Ship")) return SHIP;
        if (value.equals("Strategic")) return STRATEGIC;
        if (value.equals("Submarine")) return SUBMARINE;
        if (value.equals("Transport")) return TRANSPORT;
        if (value.equals("Utility")) return UTILITY;
        throw new IOException("Cannot deserialize Category");
    }
}
