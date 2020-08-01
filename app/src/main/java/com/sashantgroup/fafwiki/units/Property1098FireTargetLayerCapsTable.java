package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1098FireTargetLayerCapsTable {
    private Seabed seabed;

    @JsonProperty("Seabed")
    public Seabed getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(Seabed value) { this.seabed = value; }
}
