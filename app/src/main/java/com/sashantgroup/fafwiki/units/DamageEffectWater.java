package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DamageEffectWater {
    private PurpleEffects effects;

    @JsonProperty("Effects")
    public PurpleEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(PurpleEffects value) { this.effects = value; }
}
