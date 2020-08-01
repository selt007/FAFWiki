package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Tread {
    private String treadLifeTime;
    private TreadTreadMarks treadMarks;
    private String treadMarksSizeX;
    private String treadMarksSizeZ;
    private String[] treadOffset;

    @JsonProperty("TreadLifeTime")
    public String getTreadLifeTime() { return treadLifeTime; }
    @JsonProperty("TreadLifeTime")
    public void setTreadLifeTime(String value) { this.treadLifeTime = value; }

    @JsonProperty("TreadMarks")
    public TreadTreadMarks getTreadMarks() { return treadMarks; }
    @JsonProperty("TreadMarks")
    public void setTreadMarks(TreadTreadMarks value) { this.treadMarks = value; }

    @JsonProperty("TreadMarksSizeX")
    public String getTreadMarksSizeX() { return treadMarksSizeX; }
    @JsonProperty("TreadMarksSizeX")
    public void setTreadMarksSizeX(String value) { this.treadMarksSizeX = value; }

    @JsonProperty("TreadMarksSizeZ")
    public String getTreadMarksSizeZ() { return treadMarksSizeZ; }
    @JsonProperty("TreadMarksSizeZ")
    public void setTreadMarksSizeZ(String value) { this.treadMarksSizeZ = value; }

    @JsonProperty("TreadOffset")
    public String[] getTreadOffset() { return treadOffset; }
    @JsonProperty("TreadOffset")
    public void setTreadOffset(String[] value) { this.treadOffset = value; }
}
