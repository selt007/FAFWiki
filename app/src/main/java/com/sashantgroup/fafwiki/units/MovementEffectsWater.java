package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MovementEffectsWater {
    private AmbitiousEffects effects;

    @JsonProperty("Effects")
    public AmbitiousEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(AmbitiousEffects value) { this.effects = value; }
}
