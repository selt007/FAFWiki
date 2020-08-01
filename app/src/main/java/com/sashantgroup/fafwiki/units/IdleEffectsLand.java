package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class IdleEffectsLand {
    private LandEffectsUnion effects;

    @JsonProperty("Effects")
    public LandEffectsUnion getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(LandEffectsUnion value) { this.effects = value; }
}
