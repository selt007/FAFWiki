package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class IdleEffectsSeabed {
    private StickyEffects effects;

    @JsonProperty("Effects")
    public StickyEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(StickyEffects value) { this.effects = value; }
}
