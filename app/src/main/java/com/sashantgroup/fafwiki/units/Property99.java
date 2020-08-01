package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property99 {
    private Property100TreadMarks treadMarks;
    private String treadMarksInterval;
    private String treadMarksSizeX;
    private String treadMarksSizeZ;
    private TreadOffset treadOffset;
    private String boneName;

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
    public TreadOffset getTreadOffset() { return treadOffset; }
    @JsonProperty("TreadOffset")
    public void setTreadOffset(TreadOffset value) { this.treadOffset = value; }

    @JsonProperty("BoneName")
    public String getBoneName() { return boneName; }
    @JsonProperty("BoneName")
    public void setBoneName(String value) { this.boneName = value; }
}
