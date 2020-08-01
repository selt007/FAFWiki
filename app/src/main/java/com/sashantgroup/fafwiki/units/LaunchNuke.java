package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LaunchNuke {
    private String areaOfEffect;
    private String maxRadius;

    @JsonProperty("AreaOfEffect")
    public String getAreaOfEffect() { return areaOfEffect; }
    @JsonProperty("AreaOfEffect")
    public void setAreaOfEffect(String value) { this.areaOfEffect = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }
}
