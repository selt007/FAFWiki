package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class WaterTopDown {
    private WaterTopDownEffects effects;

    @JsonProperty("Effects")
    public WaterTopDownEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(WaterTopDownEffects value) { this.effects = value; }
}
