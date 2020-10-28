package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class DamageEffect {
    private double offsetZ;
    private double offsetX;
    private DamageEffectBone bone;
    private double offsetY;

    @JsonProperty("OffsetZ")
    public double getOffsetZ() { return offsetZ; }
    @JsonProperty("OffsetZ")
    public void setOffsetZ(double value) { this.offsetZ = value; }

    @JsonProperty("OffsetX")
    public double getOffsetX() { return offsetX; }
    @JsonProperty("OffsetX")
    public void setOffsetX(double value) { this.offsetX = value; }

    @JsonProperty("Bone")
    public DamageEffectBone getBone() { return bone; }
    @JsonProperty("Bone")
    public void setBone(DamageEffectBone value) { this.bone = value; }

    @JsonProperty("OffsetY")
    public double getOffsetY() { return offsetY; }
    @JsonProperty("OffsetY")
    public void setOffsetY(double value) { this.offsetY = value; }
}
