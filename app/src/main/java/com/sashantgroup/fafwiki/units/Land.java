package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Land {
    private SeabedLandEffect[] effects;

    @JsonProperty("Effects")
    public SeabedLandEffect[] getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SeabedLandEffect[] value) { this.effects = value; }
}
