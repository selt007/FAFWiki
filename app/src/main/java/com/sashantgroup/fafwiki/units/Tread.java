package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Tread {
    private double[] treadOffset;
    private double treadMarksSizeZ;
    private TreadTreadMarks treadMarks;
    private double treadMarksSizeX;
    private Long treadLifeTime;

    @JsonProperty("TreadOffset")
    public double[] getTreadOffset() { return treadOffset; }
    @JsonProperty("TreadOffset")
    public void setTreadOffset(double[] value) { this.treadOffset = value; }

    @JsonProperty("TreadMarksSizeZ")
    public double getTreadMarksSizeZ() { return treadMarksSizeZ; }
    @JsonProperty("TreadMarksSizeZ")
    public void setTreadMarksSizeZ(double value) { this.treadMarksSizeZ = value; }

    @JsonProperty("TreadMarks")
    public TreadTreadMarks getTreadMarks() { return treadMarks; }
    @JsonProperty("TreadMarks")
    public void setTreadMarks(TreadTreadMarks value) { this.treadMarks = value; }

    @JsonProperty("TreadMarksSizeX")
    public double getTreadMarksSizeX() { return treadMarksSizeX; }
    @JsonProperty("TreadMarksSizeX")
    public void setTreadMarksSizeX(double value) { this.treadMarksSizeX = value; }

    @JsonProperty("TreadLifeTime")
    public Long getTreadLifeTime() { return treadLifeTime; }
    @JsonProperty("TreadLifeTime")
    public void setTreadLifeTime(Long value) { this.treadLifeTime = value; }
}
