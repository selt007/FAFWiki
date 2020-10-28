package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class SubBottomUp {
    private SubBottomUpEffect[] effects;

    @JsonProperty("Effects")
    public SubBottomUpEffect[] getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SubBottomUpEffect[] value) { this.effects = value; }
}
