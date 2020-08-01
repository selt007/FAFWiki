package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property249Class {
    private boolean hideMuzzle;
    private String[] muzzleBones;
    private String rackBone;

    @JsonProperty("HideMuzzle")
    public boolean getHideMuzzle() { return hideMuzzle; }
    @JsonProperty("HideMuzzle")
    public void setHideMuzzle(boolean value) { this.hideMuzzle = value; }

    @JsonProperty("MuzzleBones")
    public String[] getMuzzleBones() { return muzzleBones; }
    @JsonProperty("MuzzleBones")
    public void setMuzzleBones(String[] value) { this.muzzleBones = value; }

    @JsonProperty("RackBone")
    public String getRackBone() { return rackBone; }
    @JsonProperty("RackBone")
    public void setRackBone(String value) { this.rackBone = value; }
}
