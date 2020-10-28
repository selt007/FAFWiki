package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Buff {
    private String targetDisallow;
    private String targetAllow;
    private BuffType buffType;
    private Boolean appliedToTarget;
    private Long radius;
    private double duration;
    private BuffAdd add;

    @JsonProperty("TargetDisallow")
    public String getTargetDisallow() { return targetDisallow; }
    @JsonProperty("TargetDisallow")
    public void setTargetDisallow(String value) { this.targetDisallow = value; }

    @JsonProperty("TargetAllow")
    public String getTargetAllow() { return targetAllow; }
    @JsonProperty("TargetAllow")
    public void setTargetAllow(String value) { this.targetAllow = value; }

    @JsonProperty("BuffType")
    public BuffType getBuffType() { return buffType; }
    @JsonProperty("BuffType")
    public void setBuffType(BuffType value) { this.buffType = value; }

    @JsonProperty("AppliedToTarget")
    public Boolean getAppliedToTarget() { return appliedToTarget; }
    @JsonProperty("AppliedToTarget")
    public void setAppliedToTarget(Boolean value) { this.appliedToTarget = value; }

    @JsonProperty("Radius")
    public Long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(Long value) { this.radius = value; }

    @JsonProperty("Duration")
    public double getDuration() { return duration; }
    @JsonProperty("Duration")
    public void setDuration(double value) { this.duration = value; }

    @JsonProperty("Add")
    public BuffAdd getAdd() { return add; }
    @JsonProperty("Add")
    public void setAdd(BuffAdd value) { this.add = value; }
}
