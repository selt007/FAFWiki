package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property255Class {
    private String boneName;
    private Property100TreadMarks treadMarks;
    private String treadMarksInterval;
    private String treadMarksSizeX;
    private String treadMarksSizeZ;
    private String[] treadOffset;
    private String treadLifeTime;

    @JsonProperty("BoneName")
    public String getBoneName() { return boneName; }
    @JsonProperty("BoneName")
    public void setBoneName(String value) { this.boneName = value; }

    @JsonProperty("TreadMarks")
    public Property100TreadMarks getTreadMarks() { return treadMarks; }
    @JsonProperty("TreadMarks")
    public void setTreadMarks(Property100TreadMarks value) { this.treadMarks = value; }

    @JsonProperty("TreadMarksInterval")
    public String getTreadMarksInterval() { return treadMarksInterval; }
    @JsonProperty("TreadMarksInterval")
    public void setTreadMarksInterval(String value) { this.treadMarksInterval = value; }

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

    @JsonProperty("TreadLifeTime")
    public String getTreadLifeTime() { return treadLifeTime; }
    @JsonProperty("TreadLifeTime")
    public void setTreadLifeTime(String value) { this.treadLifeTime = value; }
}
