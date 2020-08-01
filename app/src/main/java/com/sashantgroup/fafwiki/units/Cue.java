package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Cue {
    COMPUTER_COMPUTER_MISSILE_LAUNCH_01351;

    @JsonValue
    public String toValue() {
        switch (this) {
        case COMPUTER_COMPUTER_MISSILE_LAUNCH_01351: return "Computer_Computer_MissileLaunch_01351";
        }
        return null;
    }

    @JsonCreator
    public static Cue forValue(String value) throws IOException {
        if (value.equals("Computer_Computer_MissileLaunch_01351")) return COMPUTER_COMPUTER_MISSILE_LAUNCH_01351;
        throw new IOException("Cannot deserialize Cue");
    }
}
