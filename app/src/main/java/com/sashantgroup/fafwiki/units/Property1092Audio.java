package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1092Audio {
    private Activate beamLoop;
    private Activate beamStart;
    private Activate beamStop;
    private Activate unpack;
    private Activate fire;

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

    @JsonProperty("Unpack")
    public Activate getUnpack() { return unpack; }
    @JsonProperty("Unpack")
    public void setUnpack(Activate value) { this.unpack = value; }

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }
}
