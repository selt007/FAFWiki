package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class ChargeFxAtUnitBone {
    private double[] offset;
    private String bone;

    @JsonProperty("Offset")
    public double[] getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(double[] value) { this.offset = value; }

    @JsonProperty("Bone")
    public String getBone() { return bone; }
    @JsonProperty("Bone")
    public void setBone(String value) { this.bone = value; }
}
