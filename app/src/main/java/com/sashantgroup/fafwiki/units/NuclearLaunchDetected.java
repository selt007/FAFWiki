package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class NuclearLaunchDetected {
    private String bank;
    private String cue;

    @JsonProperty("Bank")
    public String getBank() { return bank; }
    @JsonProperty("Bank")
    public void setBank(String value) { this.bank = value; }

    @JsonProperty("Cue")
    public String getCue() { return cue; }
    @JsonProperty("Cue")
    public void setCue(String value) { this.cue = value; }
}
