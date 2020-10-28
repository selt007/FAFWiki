package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class CameraShake {
    private long radius;
    private double interval;
    private double maxShakeEpicenter;
    private long minShakeAtRadius;

    @JsonProperty("Radius")
    public long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(long value) { this.radius = value; }

    @JsonProperty("Interval")
    public double getInterval() { return interval; }
    @JsonProperty("Interval")
    public void setInterval(double value) { this.interval = value; }

    @JsonProperty("MaxShakeEpicenter")
    public double getMaxShakeEpicenter() { return maxShakeEpicenter; }
    @JsonProperty("MaxShakeEpicenter")
    public void setMaxShakeEpicenter(double value) { this.maxShakeEpicenter = value; }

    @JsonProperty("MinShakeAtRadius")
    public long getMinShakeAtRadius() { return minShakeAtRadius; }
    @JsonProperty("MinShakeAtRadius")
    public void setMinShakeAtRadius(long value) { this.minShakeAtRadius = value; }
}
