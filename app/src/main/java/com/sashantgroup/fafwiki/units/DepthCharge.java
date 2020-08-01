package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DepthCharge {
    private String radius;

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }
}
