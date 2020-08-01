package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property197Audio {
    private Activate fire;
    private Activate barrelLoop;
    private Activate barrelStart;
    private Activate beamLoop;
    private Activate beamStart;
    private Activate beamStop;

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }

    @JsonProperty("BarrelLoop")
    public Activate getBarrelLoop() { return barrelLoop; }
    @JsonProperty("BarrelLoop")
    public void setBarrelLoop(Activate value) { this.barrelLoop = value; }

    @JsonProperty("BarrelStart")
    public Activate getBarrelStart() { return barrelStart; }
    @JsonProperty("BarrelStart")
    public void setBarrelStart(Activate value) { this.barrelStart = value; }

    @JsonProperty("BeamLoop")
    public Activate getBeamLoop() { return beamLoop; }
    @JsonProperty("BeamLoop")
    public void setBeamLoop(Activate value) { this.beamLoop = value; }

    @JsonProperty("BeamStart")
    public Activate getBeamStart() { return beamStart; }
    @JsonProperty("BeamStart")
    public void setBeamStart(Activate value) { this.beamStart = value; }

    @JsonProperty("BeamStop")
    public Activate getBeamStop() { return beamStop; }
    @JsonProperty("BeamStop")
    public void setBeamStop(Activate value) { this.beamStop = value; }
}
