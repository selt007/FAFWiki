package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class SeabedEffect {
    private String type;
    private String[] bones;
    private Double scale;
    private double[] offset;

    @JsonProperty("Type")
    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("Bones")
    public String[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String[] value) { this.bones = value; }

    @JsonProperty("Scale")
    public Double getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(Double value) { this.scale = value; }

    @JsonProperty("Offset")
    public double[] getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(double[] value) { this.offset = value; }
}
