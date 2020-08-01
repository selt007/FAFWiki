package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RackBonesProperty228 {
    private String[] muzzleBones;

    @JsonProperty("MuzzleBones")
    public String[] getMuzzleBones() { return muzzleBones; }
    @JsonProperty("MuzzleBones")
    public void setMuzzleBones(String[] value) { this.muzzleBones = value; }
}
