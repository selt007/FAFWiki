package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class TreadMark {
    private AimBone boneName;
    private double treadMarksInterval;
    private double treadMarksSizeZ;
    private double treadMarksSizeX;
    private TreadMarkTreadMarks treadMarks;
    private double[] treadOffset;
    private Long treadLifeTime;

    @JsonProperty("BoneName")
    public AimBone getBoneName() { return boneName; }
    @JsonProperty("BoneName")
    public void setBoneName(AimBone value) { this.boneName = value; }

    @JsonProperty("TreadMarksInterval")
    public double getTreadMarksInterval() { return treadMarksInterval; }
    @JsonProperty("TreadMarksInterval")
    public void setTreadMarksInterval(double value) { this.treadMarksInterval = value; }

    @JsonProperty("TreadMarksSizeZ")
    public double getTreadMarksSizeZ() { return treadMarksSizeZ; }
    @JsonProperty("TreadMarksSizeZ")
    public void setTreadMarksSizeZ(double value) { this.treadMarksSizeZ = value; }

    @JsonProperty("TreadMarksSizeX")
    public double getTreadMarksSizeX() { return treadMarksSizeX; }
    @JsonProperty("TreadMarksSizeX")
    public void setTreadMarksSizeX(double value) { this.treadMarksSizeX = value; }

    @JsonProperty("TreadMarks")
    public TreadMarkTreadMarks getTreadMarks() { return treadMarks; }
    @JsonProperty("TreadMarks")
    public void setTreadMarks(TreadMarkTreadMarks value) { this.treadMarks = value; }

    @JsonProperty("TreadOffset")
    public double[] getTreadOffset() { return treadOffset; }
    @JsonProperty("TreadOffset")
    public void setTreadOffset(double[] value) { this.treadOffset = value; }

    @JsonProperty("TreadLifeTime")
    public Long getTreadLifeTime() { return treadLifeTime; }
    @JsonProperty("TreadLifeTime")
    public void setTreadLifeTime(Long value) { this.treadLifeTime = value; }
}
