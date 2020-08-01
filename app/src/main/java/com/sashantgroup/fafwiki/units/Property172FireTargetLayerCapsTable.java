package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property172FireTargetLayerCapsTable {
    private Seabed land;
    private Seabed seabed;

    @JsonProperty("Land")
    public Seabed getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(Seabed value) { this.land = value; }

    @JsonProperty("Seabed")
    public Seabed getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(Seabed value) { this.seabed = value; }
}
