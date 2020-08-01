package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SubBottomUp {
    private SubBottomUpEffects effects;

    @JsonProperty("Effects")
    public SubBottomUpEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SubBottomUpEffects value) { this.effects = value; }
}
