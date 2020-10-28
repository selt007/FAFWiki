package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class DepthCharge {
    private long radius;

    @JsonProperty("Radius")
    public long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(long value) { this.radius = value; }
}
