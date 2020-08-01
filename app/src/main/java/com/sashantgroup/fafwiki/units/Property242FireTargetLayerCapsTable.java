package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property242FireTargetLayerCapsTable {
    private Seabed air;
    private Seabed land;

    @JsonProperty("Air")
    public Seabed getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(Seabed value) { this.air = value; }

    @JsonProperty("Land")
    public Seabed getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(Seabed value) { this.land = value; }
}
