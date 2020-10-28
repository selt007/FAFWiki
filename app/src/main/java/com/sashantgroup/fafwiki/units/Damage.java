package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Damage {
    private long amount;
    private String type;
    private long radius;
    private boolean damageFriendly;

    @JsonProperty("Amount")
    public long getAmount() { return amount; }
    @JsonProperty("Amount")
    public void setAmount(long value) { this.amount = value; }

    @JsonProperty("Type")
    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("Radius")
    public long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(long value) { this.radius = value; }

    @JsonProperty("DamageFriendly")
    public boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(boolean value) { this.damageFriendly = value; }
}
