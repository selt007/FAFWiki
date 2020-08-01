package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property178Audio {
    private Activate barrelLoop;
    private Activate barrelStart;
    private Activate fire;
    private Activate muzzleChargeStart;
    private Activate open;
    private Activate barrelStop;

    @JsonProperty("BarrelLoop")
    public Activate getBarrelLoop() { return barrelLoop; }
    @JsonProperty("BarrelLoop")
    public void setBarrelLoop(Activate value) { this.barrelLoop = value; }

    @JsonProperty("BarrelStart")
    public Activate getBarrelStart() { return barrelStart; }
    @JsonProperty("BarrelStart")
    public void setBarrelStart(Activate value) { this.barrelStart = value; }

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }

    @JsonProperty("MuzzleChargeStart")
    public Activate getMuzzleChargeStart() { return muzzleChargeStart; }
    @JsonProperty("MuzzleChargeStart")
    public void setMuzzleChargeStart(Activate value) { this.muzzleChargeStart = value; }

    @JsonProperty("Open")
    public Activate getOpen() { return open; }
    @JsonProperty("Open")
    public void setOpen(Activate value) { this.open = value; }

    @JsonProperty("BarrelStop")
    public Activate getBarrelStop() { return barrelStop; }
    @JsonProperty("BarrelStop")
    public void setBarrelStop(Activate value) { this.barrelStop = value; }
}
