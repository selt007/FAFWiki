package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class CameraShake {
    private String interval;
    private String maxShakeEpicenter;
    private String minShakeAtRadius;
    private String radius;

    @JsonProperty("Interval")
    public String getInterval() { return interval; }
    @JsonProperty("Interval")
    public void setInterval(String value) { this.interval = value; }

    @JsonProperty("MaxShakeEpicenter")
    public String getMaxShakeEpicenter() { return maxShakeEpicenter; }
    @JsonProperty("MaxShakeEpicenter")
    public void setMaxShakeEpicenter(String value) { this.maxShakeEpicenter = value; }

    @JsonProperty("MinShakeAtRadius")
    public String getMinShakeAtRadius() { return minShakeAtRadius; }
    @JsonProperty("MinShakeAtRadius")
    public void setMinShakeAtRadius(String value) { this.minShakeAtRadius = value; }

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }
}
