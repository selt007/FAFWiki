package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class IdleEffectsSub {
    private Map<String, Effect> effects;

    @JsonProperty("Effects")
    public Map<String, Effect> getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(Map<String, Effect> value) { this.effects = value; }
}
