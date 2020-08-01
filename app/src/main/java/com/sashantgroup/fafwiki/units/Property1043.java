package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1043 {
    private String[] muzzleBones;
    private String rackBone;

    @JsonProperty("MuzzleBones")
    public String[] getMuzzleBones() { return muzzleBones; }
    @JsonProperty("MuzzleBones")
    public void setMuzzleBones(String[] value) { this.muzzleBones = value; }

    @JsonProperty("RackBone")
    public String getRackBone() { return rackBone; }
    @JsonProperty("RackBone")
    public void setRackBone(String value) { this.rackBone = value; }
}
