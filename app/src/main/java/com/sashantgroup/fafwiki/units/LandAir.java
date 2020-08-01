package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LandAir {
    private LandAirEffects effects;

    @JsonProperty("Effects")
    public LandAirEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(LandAirEffects value) { this.effects = value; }
}
