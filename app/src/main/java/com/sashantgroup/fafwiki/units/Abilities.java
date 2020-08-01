package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Abilities {
    private TargetLocation targetLocation;
    private ArtillerySupport artillerySupport;
    private Capacitor capacitor;
    private Anchor anchor;
    private Anchor bombardMode;

    @JsonProperty("TargetLocation")
    public TargetLocation getTargetLocation() { return targetLocation; }
    @JsonProperty("TargetLocation")
    public void setTargetLocation(TargetLocation value) { this.targetLocation = value; }

    @JsonProperty("ArtillerySupport")
    public ArtillerySupport getArtillerySupport() { return artillerySupport; }
    @JsonProperty("ArtillerySupport")
    public void setArtillerySupport(ArtillerySupport value) { this.artillerySupport = value; }

    @JsonProperty("Capacitor")
    public Capacitor getCapacitor() { return capacitor; }
    @JsonProperty("Capacitor")
    public void setCapacitor(Capacitor value) { this.capacitor = value; }

    @JsonProperty("Anchor")
    public Anchor getAnchor() { return anchor; }
    @JsonProperty("Anchor")
    public void setAnchor(Anchor value) { this.anchor = value; }

    @JsonProperty("BombardMode")
    public Anchor getBombardMode() { return bombardMode; }
    @JsonProperty("BombardMode")
    public void setBombardMode(Anchor value) { this.bombardMode = value; }
}
