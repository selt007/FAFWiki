package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AntiMissileFlares {
    private boolean beSmart;
    private String bones;
    private String projectileBlueprint;
    private String radius;
    private String rateOfFire;
    private String speed;
    private String bone;
    private String numFlares;
    private String salvoDelay;

    @JsonProperty("BeSmart")
    public boolean getBeSmart() { return beSmart; }
    @JsonProperty("BeSmart")
    public void setBeSmart(boolean value) { this.beSmart = value; }

    @JsonProperty("Bones")
    public String getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String value) { this.bones = value; }

    @JsonProperty("ProjectileBlueprint")
    public String getProjectileBlueprint() { return projectileBlueprint; }
    @JsonProperty("ProjectileBlueprint")
    public void setProjectileBlueprint(String value) { this.projectileBlueprint = value; }

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }

    @JsonProperty("RateOfFire")
    public String getRateOfFire() { return rateOfFire; }
    @JsonProperty("RateOfFire")
    public void setRateOfFire(String value) { this.rateOfFire = value; }

    @JsonProperty("Speed")
    public String getSpeed() { return speed; }
    @JsonProperty("Speed")
    public void setSpeed(String value) { this.speed = value; }

    @JsonProperty("Bone")
    public String getBone() { return bone; }
    @JsonProperty("Bone")
    public void setBone(String value) { this.bone = value; }

    @JsonProperty("NumFlares")
    public String getNumFlares() { return numFlares; }
    @JsonProperty("NumFlares")
    public void setNumFlares(String value) { this.numFlares = value; }

    @JsonProperty("SalvoDelay")
    public String getSalvoDelay() { return salvoDelay; }
    @JsonProperty("SalvoDelay")
    public void setSalvoDelay(String value) { this.salvoDelay = value; }
}
