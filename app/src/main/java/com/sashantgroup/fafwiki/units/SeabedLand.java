package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SeabedLand {
    private SeabedLandEffects effects;

    @JsonProperty("Effects")
    public SeabedLandEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SeabedLandEffects value) { this.effects = value; }
}
