package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AirLand {
    private AirLandEffects effects;

    @JsonProperty("Effects")
    public AirLandEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(AirLandEffects value) { this.effects = value; }
}
