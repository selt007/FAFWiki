package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MovementEffectsSub {
    private SubEffects effects;

    @JsonProperty("Effects")
    public SubEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SubEffects value) { this.effects = value; }
}
