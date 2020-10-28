package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Sub {
    private PurpleEffect[] effects;

    @JsonProperty("Effects")
    public PurpleEffect[] getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(PurpleEffect[] value) { this.effects = value; }
}
