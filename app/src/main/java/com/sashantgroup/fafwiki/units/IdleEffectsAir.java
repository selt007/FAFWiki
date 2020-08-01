package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class IdleEffectsAir {
    private FluffyEffects effects;

    @JsonProperty("Effects")
    public FluffyEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(FluffyEffects value) { this.effects = value; }
}
