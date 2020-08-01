package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class WaterLand {
    private WaterLandEffects effects;

    @JsonProperty("Effects")
    public WaterLandEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(WaterLandEffects value) { this.effects = value; }
}
