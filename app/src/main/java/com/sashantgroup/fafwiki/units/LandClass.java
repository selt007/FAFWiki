package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class LandClass {
    private SeabedEffect[] effects;

    @JsonProperty("Effects")
    public SeabedEffect[] getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SeabedEffect[] value) { this.effects = value; }
}
