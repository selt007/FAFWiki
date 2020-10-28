package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class RollOffPoint {
    private double x;
    private long unitSpin;
    private long y;
    private double z;

    @JsonProperty("X")
    public double getX() { return x; }
    @JsonProperty("X")
    public void setX(double value) { this.x = value; }

    @JsonProperty("UnitSpin")
    public long getUnitSpin() { return unitSpin; }
    @JsonProperty("UnitSpin")
    public void setUnitSpin(long value) { this.unitSpin = value; }

    @JsonProperty("Y")
    public long getY() { return y; }
    @JsonProperty("Y")
    public void setY(long value) { this.y = value; }

    @JsonProperty("Z")
    public double getZ() { return z; }
    @JsonProperty("Z")
    public void setZ(double value) { this.z = value; }
}
