package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1148FireTargetLayerCapsTable {
    private Seabed land;
    private Seabed water;

    @JsonProperty("Land")
    public Seabed getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(Seabed value) { this.land = value; }

    @JsonProperty("Water")
    public Seabed getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(Seabed value) { this.water = value; }
}
