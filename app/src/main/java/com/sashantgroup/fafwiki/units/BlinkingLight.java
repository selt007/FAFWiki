package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BlinkingLight {
    private Bone blBone;
    private double blOffsetX;
    private double blOffsetZ;
    private double blScale;
    private double blOffsetY;

    @JsonProperty("BLBone")
    public Bone getBlBone() { return blBone; }
    @JsonProperty("BLBone")
    public void setBlBone(Bone value) { this.blBone = value; }

    @JsonProperty("BLOffsetX")
    public double getBlOffsetX() { return blOffsetX; }
    @JsonProperty("BLOffsetX")
    public void setBlOffsetX(double value) { this.blOffsetX = value; }

    @JsonProperty("BLOffsetZ")
    public double getBlOffsetZ() { return blOffsetZ; }
    @JsonProperty("BLOffsetZ")
    public void setBlOffsetZ(double value) { this.blOffsetZ = value; }

    @JsonProperty("BLScale")
    public double getBlScale() { return blScale; }
    @JsonProperty("BLScale")
    public void setBlScale(double value) { this.blScale = value; }

    @JsonProperty("BLOffsetY")
    public double getBlOffsetY() { return blOffsetY; }
    @JsonProperty("BLOffsetY")
    public void setBlOffsetY(double value) { this.blOffsetY = value; }
}
