package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1483Audio {
    private Activate fire;
    private Activate spinningLoop;
    private Activate spinningStop;

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }

    @JsonProperty("SpinningLoop")
    public Activate getSpinningLoop() { return spinningLoop; }
    @JsonProperty("SpinningLoop")
    public void setSpinningLoop(Activate value) { this.spinningLoop = value; }

    @JsonProperty("SpinningStop")
    public Activate getSpinningStop() { return spinningStop; }
    @JsonProperty("SpinningStop")
    public void setSpinningStop(Activate value) { this.spinningStop = value; }
}
