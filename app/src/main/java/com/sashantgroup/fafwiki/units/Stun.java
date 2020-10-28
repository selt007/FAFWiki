package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Stun {
    private BuffType buffType;
    private StunAdd add;
    private double duration;
    private String targetDisallow;
    private long radius;
    private String targetAllow;
    private boolean appliedToTarget;
    private Long durationWhenCharging;

    @JsonProperty("BuffType")
    public BuffType getBuffType() { return buffType; }
    @JsonProperty("BuffType")
    public void setBuffType(BuffType value) { this.buffType = value; }

    @JsonProperty("Add")
    public StunAdd getAdd() { return add; }
    @JsonProperty("Add")
    public void setAdd(StunAdd value) { this.add = value; }

    @JsonProperty("Duration")
    public double getDuration() { return duration; }
    @JsonProperty("Duration")
    public void setDuration(double value) { this.duration = value; }

    @JsonProperty("TargetDisallow")
    public String getTargetDisallow() { return targetDisallow; }
    @JsonProperty("TargetDisallow")
    public void setTargetDisallow(String value) { this.targetDisallow = value; }

    @JsonProperty("Radius")
    public long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(long value) { this.radius = value; }

    @JsonProperty("TargetAllow")
    public String getTargetAllow() { return targetAllow; }
    @JsonProperty("TargetAllow")
    public void setTargetAllow(String value) { this.targetAllow = value; }

    @JsonProperty("AppliedToTarget")
    public boolean getAppliedToTarget() { return appliedToTarget; }
    @JsonProperty("AppliedToTarget")
    public void setAppliedToTarget(boolean value) { this.appliedToTarget = value; }

    @JsonProperty("DurationWhenCharging")
    public Long getDurationWhenCharging() { return durationWhenCharging; }
    @JsonProperty("DurationWhenCharging")
    public void setDurationWhenCharging(Long value) { this.durationWhenCharging = value; }
}
