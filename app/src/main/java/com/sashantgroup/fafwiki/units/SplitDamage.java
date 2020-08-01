package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SplitDamage {
    private String damageAmount;
    private String damageRadius;

    @JsonProperty("DamageAmount")
    public String getDamageAmount() { return damageAmount; }
    @JsonProperty("DamageAmount")
    public void setDamageAmount(String value) { this.damageAmount = value; }

    @JsonProperty("DamageRadius")
    public String getDamageRadius() { return damageRadius; }
    @JsonProperty("DamageRadius")
    public void setDamageRadius(String value) { this.damageRadius = value; }
}
