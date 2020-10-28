package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class MovementEffectsAir {
    private SubBottomUpEffect[] effects;
    private Contrails contrails;

    @JsonProperty("Effects")
    public SubBottomUpEffect[] getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SubBottomUpEffect[] value) { this.effects = value; }

    @JsonProperty("Contrails")
    public Contrails getContrails() { return contrails; }
    @JsonProperty("Contrails")
    public void setContrails(Contrails value) { this.contrails = value; }
}
