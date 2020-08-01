package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class IdleEffectsWater {
    private WaterEffectsUnion effects;

    @JsonProperty("Effects")
    public WaterEffectsUnion getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(WaterEffectsUnion value) { this.effects = value; }
}
