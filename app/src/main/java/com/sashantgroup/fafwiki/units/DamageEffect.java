package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DamageEffect {
    private String bone;
    private String offsetX;
    private String offsetY;
    private String offsetZ;
    private DamageEffectWater water;

    @JsonProperty("Bone")
    public String getBone() { return bone; }
    @JsonProperty("Bone")
    public void setBone(String value) { this.bone = value; }

    @JsonProperty("OffsetX")
    public String getOffsetX() { return offsetX; }
    @JsonProperty("OffsetX")
    public void setOffsetX(String value) { this.offsetX = value; }

    @JsonProperty("OffsetY")
    public String getOffsetY() { return offsetY; }
    @JsonProperty("OffsetY")
    public void setOffsetY(String value) { this.offsetY = value; }

    @JsonProperty("OffsetZ")
    public String getOffsetZ() { return offsetZ; }
    @JsonProperty("OffsetZ")
    public void setOffsetZ(String value) { this.offsetZ = value; }

    @JsonProperty("Water")
    public DamageEffectWater getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(DamageEffectWater value) { this.water = value; }
}
