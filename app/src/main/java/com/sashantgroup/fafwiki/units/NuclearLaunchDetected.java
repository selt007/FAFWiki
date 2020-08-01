package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class NuclearLaunchDetected {
    private Bank bank;
    private Cue cue;

    @JsonProperty("Bank")
    public Bank getBank() { return bank; }
    @JsonProperty("Bank")
    public void setBank(Bank value) { this.bank = value; }

    @JsonProperty("Cue")
    public Cue getCue() { return cue; }
    @JsonProperty("Cue")
    public void setCue(Cue value) { this.cue = value; }
}
