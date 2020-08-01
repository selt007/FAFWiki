package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RollOffPoint {
    private String x;
    private String y;
    private String z;
    private String unitSpin;

    @JsonProperty("X")
    public String getX() { return x; }
    @JsonProperty("X")
    public void setX(String value) { this.x = value; }

    @JsonProperty("Y")
    public String getY() { return y; }
    @JsonProperty("Y")
    public void setY(String value) { this.y = value; }

    @JsonProperty("Z")
    public String getZ() { return z; }
    @JsonProperty("Z")
    public void setZ(String value) { this.z = value; }

    @JsonProperty("UnitSpin")
    public String getUnitSpin() { return unitSpin; }
    @JsonProperty("UnitSpin")
    public void setUnitSpin(String value) { this.unitSpin = value; }
}
