package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class SplitDamage {
    private long damageAmount;
    private double damageRadius;

    @JsonProperty("DamageAmount")
    public long getDamageAmount() { return damageAmount; }
    @JsonProperty("DamageAmount")
    public void setDamageAmount(long value) { this.damageAmount = value; }

    @JsonProperty("DamageRadius")
    public double getDamageRadius() { return damageRadius; }
    @JsonProperty("DamageRadius")
    public void setDamageRadius(double value) { this.damageRadius = value; }
}
