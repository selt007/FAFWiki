package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class PurpleEffect {
    private EffectType type;
    private Bone[] bones;

    @JsonProperty("Type")
    public EffectType getType() { return type; }
    @JsonProperty("Type")
    public void setType(EffectType value) { this.type = value; }

    @JsonProperty("Bones")
    public Bone[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(Bone[] value) { this.bones = value; }
}
