package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class PhysicsFootprint {
    private String sizeX;
    private String sizeY;
    private String sizeZ;

    @JsonProperty("SizeX")
    public String getSizeX() { return sizeX; }
    @JsonProperty("SizeX")
    public void setSizeX(String value) { this.sizeX = value; }

    @JsonProperty("SizeY")
    public String getSizeY() { return sizeY; }
    @JsonProperty("SizeY")
    public void setSizeY(String value) { this.sizeY = value; }

    @JsonProperty("SizeZ")
    public String getSizeZ() { return sizeZ; }
    @JsonProperty("SizeZ")
    public void setSizeZ(String value) { this.sizeZ = value; }
}
