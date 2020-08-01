package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property301FireTargetLayerCapsTable {
    private Water sub;
    private Water water;

    @JsonProperty("Sub")
    public Water getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(Water value) { this.sub = value; }

    @JsonProperty("Water")
    public Water getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(Water value) { this.water = value; }
}
