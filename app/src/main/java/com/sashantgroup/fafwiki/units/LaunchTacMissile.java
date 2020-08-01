package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LaunchTacMissile {
    private String areaOfEffect;
    private String maxRadius;
    private String minRadius;

    @JsonProperty("AreaOfEffect")
    public String getAreaOfEffect() { return areaOfEffect; }
    @JsonProperty("AreaOfEffect")
    public void setAreaOfEffect(String value) { this.areaOfEffect = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

    @JsonProperty("MinRadius")
    public String getMinRadius() { return minRadius; }
    @JsonProperty("MinRadius")
    public void setMinRadius(String value) { this.minRadius = value; }
}
