package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property227Audio {
    private Activate muzzleChargeStart;
    private String the0;
    private String the1;
    private String the2;
    private String the3;
    private String the4;
    private Activate barrelLoop;
    private Activate barrelStart;
    private Activate fire;

    @JsonProperty("MuzzleChargeStart")
    public Activate getMuzzleChargeStart() { return muzzleChargeStart; }
    @JsonProperty("MuzzleChargeStart")
    public void setMuzzleChargeStart(Activate value) { this.muzzleChargeStart = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }

    @JsonProperty("2")
    public String getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(String value) { this.the2 = value; }

    @JsonProperty("3")
    public String getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(String value) { this.the3 = value; }

    @JsonProperty("4")
    public String getThe4() { return the4; }
    @JsonProperty("4")
    public void setThe4(String value) { this.the4 = value; }

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
}
