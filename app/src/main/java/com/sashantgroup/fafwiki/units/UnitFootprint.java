package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class UnitFootprint {
    private Double maxSlope;
    private Long sizeX;
    private Long sizeZ;
    private Double minWaterDepth;
    private Double sizeY;

    @JsonProperty("MaxSlope")
    public Double getMaxSlope() { return maxSlope; }
    @JsonProperty("MaxSlope")
    public void setMaxSlope(Double value) { this.maxSlope = value; }

    @JsonProperty("SizeX")
    public Long getSizeX() { return sizeX; }
    @JsonProperty("SizeX")
    public void setSizeX(Long value) { this.sizeX = value; }

    @JsonProperty("SizeZ")
    public Long getSizeZ() { return sizeZ; }
    @JsonProperty("SizeZ")
    public void setSizeZ(Long value) { this.sizeZ = value; }

    @JsonProperty("MinWaterDepth")
    public Double getMinWaterDepth() { return minWaterDepth; }
    @JsonProperty("MinWaterDepth")
    public void setMinWaterDepth(Double value) { this.minWaterDepth = value; }

    @JsonProperty("SizeY")
    public Double getSizeY() { return sizeY; }
    @JsonProperty("SizeY")
    public void setSizeY(Double value) { this.sizeY = value; }
}
