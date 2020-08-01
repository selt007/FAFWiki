package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Offset {
    private String z;

    @JsonProperty("z")
    public String getZ() { return z; }
    @JsonProperty("z")
    public void setZ(String value) { this.z = value; }
}
