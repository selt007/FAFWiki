package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class UnitFootprint {
    private String maxSlope;
    private String sizeX;
    private String sizeZ;
    private String minWaterDepth;
    private String sizeY;

    @JsonProperty("MaxSlope")
    public String getMaxSlope() { return maxSlope; }
    @JsonProperty("MaxSlope")
    public void setMaxSlope(String value) { this.maxSlope = value; }

    @JsonProperty("SizeX")
    public String getSizeX() { return sizeX; }
    @JsonProperty("SizeX")
    public void setSizeX(String value) { this.sizeX = value; }

    @JsonProperty("SizeZ")
    public String getSizeZ() { return sizeZ; }
    @JsonProperty("SizeZ")
    public void setSizeZ(String value) { this.sizeZ = value; }

    @JsonProperty("MinWaterDepth")
    public String getMinWaterDepth() { return minWaterDepth; }
    @JsonProperty("MinWaterDepth")
    public void setMinWaterDepth(String value) { this.minWaterDepth = value; }

    @JsonProperty("SizeY")
    public String getSizeY() { return sizeY; }
    @JsonProperty("SizeY")
    public void setSizeY(String value) { this.sizeY = value; }
}
