package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MovementEffectsSeabed {
    private HilariousEffects effects;
    private SeabedTreads treads;

    @JsonProperty("Effects")
    public HilariousEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(HilariousEffects value) { this.effects = value; }

    @JsonProperty("Treads")
    public SeabedTreads getTreads() { return treads; }
    @JsonProperty("Treads")
    public void setTreads(SeabedTreads value) { this.treads = value; }
}
