package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MovementEffectsAir {
    private Contrails contrails;
    private IndecentEffects effects;

    @JsonProperty("Contrails")
    public Contrails getContrails() { return contrails; }
    @JsonProperty("Contrails")
    public void setContrails(Contrails value) { this.contrails = value; }

    @JsonProperty("Effects")
    public IndecentEffects getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(IndecentEffects value) { this.effects = value; }
}
