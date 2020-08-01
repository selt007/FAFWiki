package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class StunAdd {
    private boolean onDeath;
    private boolean onImpact;

    @JsonProperty("OnDeath")
    public boolean getOnDeath() { return onDeath; }
    @JsonProperty("OnDeath")
    public void setOnDeath(boolean value) { this.onDeath = value; }

    @JsonProperty("OnImpact")
    public boolean getOnImpact() { return onImpact; }
    @JsonProperty("OnImpact")
    public void setOnImpact(boolean value) { this.onImpact = value; }
}
