package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class BlinkingLight {
    private String blBone;
    private String blOffsetX;
    private String blOffsetY;
    private String blOffsetZ;
    private String blScale;

    @JsonProperty("BLBone")
    public String getBlBone() { return blBone; }
    @JsonProperty("BLBone")
    public void setBlBone(String value) { this.blBone = value; }

    @JsonProperty("BLOffsetX")
    public String getBlOffsetX() { return blOffsetX; }
    @JsonProperty("BLOffsetX")
    public void setBlOffsetX(String value) { this.blOffsetX = value; }

    @JsonProperty("BLOffsetY")
    public String getBlOffsetY() { return blOffsetY; }
    @JsonProperty("BLOffsetY")
    public void setBlOffsetY(String value) { this.blOffsetY = value; }

    @JsonProperty("BLOffsetZ")
    public String getBlOffsetZ() { return blOffsetZ; }
    @JsonProperty("BLOffsetZ")
    public void setBlOffsetZ(String value) { this.blOffsetZ = value; }

    @JsonProperty("BLScale")
    public String getBlScale() { return blScale; }
    @JsonProperty("BLScale")
    public void setBlScale(String value) { this.blScale = value; }
}
