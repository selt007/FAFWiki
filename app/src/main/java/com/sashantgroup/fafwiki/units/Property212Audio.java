package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property212Audio {
    private Activate fire;
    private Activate fireUnderWater;

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }

    @JsonProperty("FireUnderWater")
    public Activate getFireUnderWater() { return fireUnderWater; }
    @JsonProperty("FireUnderWater")
    public void setFireUnderWater(Activate value) { this.fireUnderWater = value; }
}
