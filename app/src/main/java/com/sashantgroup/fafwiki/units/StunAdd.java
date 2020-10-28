package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class StunAdd {
    private boolean onImpact;
    private boolean onDeath;

    @JsonProperty("OnImpact")
    public boolean getOnImpact() { return onImpact; }
    @JsonProperty("OnImpact")
    public void setOnImpact(boolean value) { this.onImpact = value; }

    @JsonProperty("OnDeath")
    public boolean getOnDeath() { return onDeath; }
    @JsonProperty("OnDeath")
    public void setOnDeath(boolean value) { this.onDeath = value; }
}
