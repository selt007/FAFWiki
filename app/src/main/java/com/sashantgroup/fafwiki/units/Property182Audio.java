package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property182Audio {
    private Activate fire;
    private Activate muzzleChargeStart;

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }

    @JsonProperty("MuzzleChargeStart")
    public Activate getMuzzleChargeStart() { return muzzleChargeStart; }
    @JsonProperty("MuzzleChargeStart")
    public void setMuzzleChargeStart(Activate value) { this.muzzleChargeStart = value; }
}
