package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class BuildBonesAlt1 {
    private String aimBone;
    private String pitchBone;
    private String yawBone;

    @JsonProperty("AimBone")
    public String getAimBone() { return aimBone; }
    @JsonProperty("AimBone")
    public void setAimBone(String value) { this.aimBone = value; }

    @JsonProperty("PitchBone")
    public String getPitchBone() { return pitchBone; }
    @JsonProperty("PitchBone")
    public void setPitchBone(String value) { this.pitchBone = value; }

    @JsonProperty("YawBone")
    public String getYawBone() { return yawBone; }
    @JsonProperty("YawBone")
    public void setYawBone(String value) { this.yawBone = value; }
}
