package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Seabed {
    private SeabedEffect[] effects;
    private SeabedTreads treads;

    @JsonProperty("Effects")
    public SeabedEffect[] getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SeabedEffect[] value) { this.effects = value; }

    @JsonProperty("Treads")
    public SeabedTreads getTreads() { return treads; }
    @JsonProperty("Treads")
    public void setTreads(SeabedTreads value) { this.treads = value; }
}
