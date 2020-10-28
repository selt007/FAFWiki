package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BuildBonesAlt1 {
    private String aimBone;
    private String yawBone;
    private String pitchBone;

    @JsonProperty("AimBone")
    public String getAimBone() { return aimBone; }
    @JsonProperty("AimBone")
    public void setAimBone(String value) { this.aimBone = value; }

    @JsonProperty("YawBone")
    public String getYawBone() { return yawBone; }
    @JsonProperty("YawBone")
    public void setYawBone(String value) { this.yawBone = value; }

    @JsonProperty("PitchBone")
    public String getPitchBone() { return pitchBone; }
    @JsonProperty("PitchBone")
    public void setPitchBone(String value) { this.pitchBone = value; }
}
