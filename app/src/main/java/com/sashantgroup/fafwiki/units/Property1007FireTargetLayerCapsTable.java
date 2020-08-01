package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1007FireTargetLayerCapsTable {
    private Seabed land;
    private Seabed seabed;
    private Seabed water;
    private Seabed sub;
    private Seabed air;

    @JsonProperty("Land")
    public Seabed getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(Seabed value) { this.land = value; }

    @JsonProperty("Seabed")
    public Seabed getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(Seabed value) { this.seabed = value; }

    @JsonProperty("Water")
    public Seabed getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(Seabed value) { this.water = value; }

    @JsonProperty("Sub")
    public Seabed getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(Seabed value) { this.sub = value; }

    @JsonProperty("Air")
    public Seabed getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(Seabed value) { this.air = value; }
}
