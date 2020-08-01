package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TargetDisallow {
    EXPERIMENTAL_COMMAND, UNSTUNABLE_EXPERIMENTAL_COMMAND_SHIELD_WALL, UNSTUNABLE_EXPERIMENTAL_COMMAND_WALL, UNSTUNABLE_TECH1_EXPERIMENTAL_COMMAND_SHIELD_WALL;

    @JsonValue
    public String toValue() {
        switch (this) {
        case EXPERIMENTAL_COMMAND: return "EXPERIMENTAL, COMMAND";
        case UNSTUNABLE_EXPERIMENTAL_COMMAND_SHIELD_WALL: return "UNSTUNABLE,EXPERIMENTAL,COMMAND,SHIELD,WALL";
        case UNSTUNABLE_EXPERIMENTAL_COMMAND_WALL: return "UNSTUNABLE,EXPERIMENTAL,COMMAND,WALL";
        case UNSTUNABLE_TECH1_EXPERIMENTAL_COMMAND_SHIELD_WALL: return "UNSTUNABLE,TECH1,EXPERIMENTAL,COMMAND,SHIELD,WALL";
        }
        return null;
    }

    @JsonCreator
    public static TargetDisallow forValue(String value) throws IOException {
        if (value.equals("EXPERIMENTAL, COMMAND")) return EXPERIMENTAL_COMMAND;
        if (value.equals("UNSTUNABLE,EXPERIMENTAL,COMMAND,SHIELD,WALL")) return UNSTUNABLE_EXPERIMENTAL_COMMAND_SHIELD_WALL;
        if (value.equals("UNSTUNABLE,EXPERIMENTAL,COMMAND,WALL")) return UNSTUNABLE_EXPERIMENTAL_COMMAND_WALL;
        if (value.equals("UNSTUNABLE,TECH1,EXPERIMENTAL,COMMAND,SHIELD,WALL")) return UNSTUNABLE_TECH1_EXPERIMENTAL_COMMAND_SHIELD_WALL;
        throw new IOException("Cannot deserialize TargetDisallow");
    }
}
