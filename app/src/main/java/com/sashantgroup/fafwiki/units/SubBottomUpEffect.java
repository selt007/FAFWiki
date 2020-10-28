package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class SubBottomUpEffect {
    private Bone[] bones;
    private String type;
    private Double scale;
    private double[] offset;

    @JsonProperty("Bones")
    public Bone[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(Bone[] value) { this.bones = value; }

    @JsonProperty("Type")
    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("Scale")
    public Double getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(Double value) { this.scale = value; }

    @JsonProperty("Offset")
    public double[] getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(double[] value) { this.offset = value; }
}
