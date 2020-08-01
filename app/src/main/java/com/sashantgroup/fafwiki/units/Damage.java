package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Damage {
    private String amount;
    private boolean damageFriendly;
    private String interval;
    private String radius;
    private String type;

    @JsonProperty("Amount")
    public String getAmount() { return amount; }
    @JsonProperty("Amount")
    public void setAmount(String value) { this.amount = value; }

    @JsonProperty("DamageFriendly")
    public boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(boolean value) { this.damageFriendly = value; }

    @JsonProperty("Interval")
    public String getInterval() { return interval; }
    @JsonProperty("Interval")
    public void setInterval(String value) { this.interval = value; }

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }

    @JsonProperty("Type")
    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String value) { this.type = value; }
}
