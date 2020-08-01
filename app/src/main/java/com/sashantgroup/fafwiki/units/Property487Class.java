package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property487Class {
    private Property487Add add;
    private boolean appliedToTarget;
    private BuffType buffType;
    private String duration;
    private String radius;
    private String targetAllow;
    private String targetDisallow;

    @JsonProperty("Add")
    public Property487Add getAdd() { return add; }
    @JsonProperty("Add")
    public void setAdd(Property487Add value) { this.add = value; }

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
    public String getTargetAllow() { return targetAllow; }
    @JsonProperty("TargetAllow")
    public void setTargetAllow(String value) { this.targetAllow = value; }

    @JsonProperty("TargetDisallow")
    public String getTargetDisallow() { return targetDisallow; }
    @JsonProperty("TargetDisallow")
    public void setTargetDisallow(String value) { this.targetDisallow = value; }
}
