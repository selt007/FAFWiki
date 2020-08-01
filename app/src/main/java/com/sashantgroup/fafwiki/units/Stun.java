package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Stun {
    private StunAdd add;
    private boolean appliedToTarget;
    private BuffType buffType;
    private String duration;
    private String radius;
    private Target targetAllow;

    @JsonProperty("Add")
    public StunAdd getAdd() { return add; }
    @JsonProperty("Add")
    public void setAdd(StunAdd value) { this.add = value; }

    @JsonProperty("AppliedToTarget")
    public boolean getAppliedToTarget() { return appliedToTarget; }
    @JsonProperty("AppliedToTarget")
    public void setAppliedToTarget(boolean value) { this.appliedToTarget = value; }

    @JsonProperty("BuffType")
    public BuffType getBuffType() { return buffType; }
    @JsonProperty("BuffType")
    public void setBuffType(BuffType value) { this.buffType = value; }

    @JsonProperty("Duration")
    public String getDuration() { return duration; }
    @JsonProperty("Duration")
    public void setDuration(String value) { this.duration = value; }

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }

    @JsonProperty("TargetAllow")
    public Target getTargetAllow() { return targetAllow; }
    @JsonProperty("TargetAllow")
    public void setTargetAllow(Target value) { this.targetAllow = value; }
}
