package com.sashantgroup.fafwiki.units;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Shader {
    T_MESH_ALPHA, T_MESH_GLOW;

    @JsonValue
    public String toValue() {
        switch (this) {
        case T_MESH_ALPHA: return "TMeshAlpha";
        case T_MESH_GLOW: return "TMeshGlow";
        }
        return null;
    }

    @JsonCreator
    public static Shader forValue(String value) throws IOException {
        if (value.equals("TMeshAlpha")) return T_MESH_ALPHA;
        if (value.equals("TMeshGlow")) return T_MESH_GLOW;
        throw new IOException("Cannot deserialize Shader");
    }
}
