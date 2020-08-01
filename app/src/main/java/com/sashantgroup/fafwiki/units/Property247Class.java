package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property247Class {
    private String the0;
    private String[] muzzleBones;
    private String rackBone;
    private String turretBoneDualManip;

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("MuzzleBones")
    public String[] getMuzzleBones() { return muzzleBones; }
    @JsonProperty("MuzzleBones")
    public void setMuzzleBones(String[] value) { this.muzzleBones = value; }

    @JsonProperty("RackBone")
    public String getRackBone() { return rackBone; }
    @JsonProperty("RackBone")
    public void setRackBone(String value) { this.rackBone = value; }

    @JsonProperty("TurretBoneDualManip")
    public String getTurretBoneDualManip() { return turretBoneDualManip; }
    @JsonProperty("TurretBoneDualManip")
    public void setTurretBoneDualManip(String value) { this.turretBoneDualManip = value; }
}
