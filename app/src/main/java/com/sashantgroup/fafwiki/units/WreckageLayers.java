package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class WreckageLayers {
    private boolean air;
    private boolean land;
    private boolean seabed;
    private Boolean sub;
    private boolean water;
    private String the0;

    @JsonProperty("Air")
    public boolean getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(boolean value) { this.air = value; }

    @JsonProperty("Land")
    public boolean getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(boolean value) { this.land = value; }

    @JsonProperty("Seabed")
    public boolean getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(boolean value) { this.seabed = value; }

    @JsonProperty("Sub")
    public Boolean getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(Boolean value) { this.sub = value; }

    @JsonProperty("Water")
    public boolean getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(boolean value) { this.water = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }
}
