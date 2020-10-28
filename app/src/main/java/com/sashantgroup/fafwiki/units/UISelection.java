package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class UISelection {
    private String bank;
    private LodCutoff lodCutoff;
    private String cue;

    @JsonProperty("Bank")
    public String getBank() { return bank; }
    @JsonProperty("Bank")
    public void setBank(String value) { this.bank = value; }

    @JsonProperty("LodCutoff")
    public LodCutoff getLodCutoff() { return lodCutoff; }
    @JsonProperty("LodCutoff")
    public void setLodCutoff(LodCutoff value) { this.lodCutoff = value; }

    @JsonProperty("Cue")
    public String getCue() { return cue; }
    @JsonProperty("Cue")
    public void setCue(String value) { this.cue = value; }
}
