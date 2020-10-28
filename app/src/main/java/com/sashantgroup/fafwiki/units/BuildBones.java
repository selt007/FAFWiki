package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BuildBones {
    private Bone[] buildEffectBones;
    private AimBone aimBone;
    private String pitchBone;
    private String yawBone;
    private BuildAttachBone buildAttachBone;

    @JsonProperty("BuildEffectBones")
    public Bone[] getBuildEffectBones() { return buildEffectBones; }
    @JsonProperty("BuildEffectBones")
    public void setBuildEffectBones(Bone[] value) { this.buildEffectBones = value; }

    @JsonProperty("AimBone")
    public AimBone getAimBone() { return aimBone; }
    @JsonProperty("AimBone")
    public void setAimBone(AimBone value) { this.aimBone = value; }

    @JsonProperty("PitchBone")
    public String getPitchBone() { return pitchBone; }
    @JsonProperty("PitchBone")
    public void setPitchBone(String value) { this.pitchBone = value; }

    @JsonProperty("YawBone")
    public String getYawBone() { return yawBone; }
    @JsonProperty("YawBone")
    public void setYawBone(String value) { this.yawBone = value; }

    @JsonProperty("BuildAttachBone")
    public BuildAttachBone getBuildAttachBone() { return buildAttachBone; }
    @JsonProperty("BuildAttachBone")
    public void setBuildAttachBone(BuildAttachBone value) { this.buildAttachBone = value; }
}
