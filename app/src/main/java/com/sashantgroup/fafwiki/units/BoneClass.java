package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BoneClass {
    private String footBone;
    private Tread tread;
    private String kneeBone;
    private BoneType type;
    private Double maxFootFall;
    private Boolean straightLegs;
    private String hipBone;
    private Offset offset;
    private Double scale;

    @JsonProperty("FootBone")
    public String getFootBone() { return footBone; }
    @JsonProperty("FootBone")
    public void setFootBone(String value) { this.footBone = value; }

    @JsonProperty("Tread")
    public Tread getTread() { return tread; }
    @JsonProperty("Tread")
    public void setTread(Tread value) { this.tread = value; }

    @JsonProperty("KneeBone")
    public String getKneeBone() { return kneeBone; }
    @JsonProperty("KneeBone")
    public void setKneeBone(String value) { this.kneeBone = value; }

    @JsonProperty("Type")
    public BoneType getType() { return type; }
    @JsonProperty("Type")
    public void setType(BoneType value) { this.type = value; }

    @JsonProperty("MaxFootFall")
    public Double getMaxFootFall() { return maxFootFall; }
    @JsonProperty("MaxFootFall")
    public void setMaxFootFall(Double value) { this.maxFootFall = value; }

    @JsonProperty("StraightLegs")
    public Boolean getStraightLegs() { return straightLegs; }
    @JsonProperty("StraightLegs")
    public void setStraightLegs(Boolean value) { this.straightLegs = value; }

    @JsonProperty("HipBone")
    public String getHipBone() { return hipBone; }
    @JsonProperty("HipBone")
    public void setHipBone(String value) { this.hipBone = value; }

    @JsonProperty("Offset")
    public Offset getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(Offset value) { this.offset = value; }

    @JsonProperty("Scale")
    public Double getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(Double value) { this.scale = value; }
}
