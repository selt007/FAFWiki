package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property407Class {
    private String[] muzzleBones;
    private String rackBone;
    private String telescopeBone;
    private String telescopeRecoilDistance;

    @JsonProperty("MuzzleBones")
    public String[] getMuzzleBones() { return muzzleBones; }
    @JsonProperty("MuzzleBones")
    public void setMuzzleBones(String[] value) { this.muzzleBones = value; }

    @JsonProperty("RackBone")
    public String getRackBone() { return rackBone; }
    @JsonProperty("RackBone")
    public void setRackBone(String value) { this.rackBone = value; }

    @JsonProperty("TelescopeBone")
    public String getTelescopeBone() { return telescopeBone; }
    @JsonProperty("TelescopeBone")
    public void setTelescopeBone(String value) { this.telescopeBone = value; }

    @JsonProperty("TelescopeRecoilDistance")
    public String getTelescopeRecoilDistance() { return telescopeRecoilDistance; }
    @JsonProperty("TelescopeRecoilDistance")
    public void setTelescopeRecoilDistance(String value) { this.telescopeRecoilDistance = value; }
}
