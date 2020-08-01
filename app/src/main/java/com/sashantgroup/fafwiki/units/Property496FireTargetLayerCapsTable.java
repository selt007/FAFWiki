package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property496FireTargetLayerCapsTable {
    private Seabed water;
    private Seabed seabed;

    @JsonProperty("Water")
    public Seabed getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(Seabed value) { this.water = value; }

    @JsonProperty("Seabed")
    public Seabed getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(Seabed value) { this.seabed = value; }
}
