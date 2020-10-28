package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class PhysicsFootprint {
    private double sizeX;
    private double sizeY;
    private long sizeZ;

    @JsonProperty("SizeX")
    public double getSizeX() { return sizeX; }
    @JsonProperty("SizeX")
    public void setSizeX(double value) { this.sizeX = value; }

    @JsonProperty("SizeY")
    public double getSizeY() { return sizeY; }
    @JsonProperty("SizeY")
    public void setSizeY(double value) { this.sizeY = value; }

    @JsonProperty("SizeZ")
    public long getSizeZ() { return sizeZ; }
    @JsonProperty("SizeZ")
    public void setSizeZ(long value) { this.sizeZ = value; }
}
