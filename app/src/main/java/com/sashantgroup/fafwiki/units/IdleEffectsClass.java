package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class IdleEffectsClass {
    private IdleEffectsLand land;
    private IdleEffectsWater water;
    private IdleEffectsSeabed seabed;
    private IdleEffectsSub sub;
    private IdleEffectsAir air;

    @JsonProperty("Land")
    public IdleEffectsLand getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(IdleEffectsLand value) { this.land = value; }

    @JsonProperty("Water")
    public IdleEffectsWater getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(IdleEffectsWater value) { this.water = value; }

    @JsonProperty("Seabed")
    public IdleEffectsSeabed getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(IdleEffectsSeabed value) { this.seabed = value; }

    @JsonProperty("Sub")
    public IdleEffectsSub getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(IdleEffectsSub value) { this.sub = value; }

    @JsonProperty("Air")
    public IdleEffectsAir getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(IdleEffectsAir value) { this.air = value; }
}
