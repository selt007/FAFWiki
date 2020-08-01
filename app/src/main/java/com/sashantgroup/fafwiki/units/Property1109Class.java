package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1109Class {
    private Property1109Add add;
    private BuffType buffType;
    private String duration;
    private String radius;
    private Target targetAllow;
    private TargetDisallow targetDisallow;
    private Boolean applyToFriendly;

    @JsonProperty("Add")
    public Property1109Add getAdd() { return add; }
    @JsonProperty("Add")
    public void setAdd(Property1109Add value) { this.add = value; }

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

    @JsonProperty("TargetDisallow")
    public TargetDisallow getTargetDisallow() { return targetDisallow; }
    @JsonProperty("TargetDisallow")
    public void setTargetDisallow(TargetDisallow value) { this.targetDisallow = value; }

    @JsonProperty("ApplyToFriendly")
    public Boolean getApplyToFriendly() { return applyToFriendly; }
    @JsonProperty("ApplyToFriendly")
    public void setApplyToFriendly(Boolean value) { this.applyToFriendly = value; }
}
