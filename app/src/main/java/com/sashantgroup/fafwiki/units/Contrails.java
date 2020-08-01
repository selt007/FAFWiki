package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Contrails {
    private String[] bones;
    private String zOffset;
    private String the0;
    private String the1;

    @JsonProperty("Bones")
    public String[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String[] value) { this.bones = value; }

    @JsonProperty("ZOffset")
    public String getZOffset() { return zOffset; }
    @JsonProperty("ZOffset")
    public void setZOffset(String value) { this.zOffset = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }
}
