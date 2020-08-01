package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Activate {
    private String bank;
    private String cue;
    private LodCutoff lodCutoff;
    private String the0;
    private String the1;

    @JsonProperty("Bank")
    public String getBank() { return bank; }
    @JsonProperty("Bank")
    public void setBank(String value) { this.bank = value; }

    @JsonProperty("Cue")
    public String getCue() { return cue; }
    @JsonProperty("Cue")
    public void setCue(String value) { this.cue = value; }

    @JsonProperty("LodCutoff")
    public LodCutoff getLodCutoff() { return lodCutoff; }
    @JsonProperty("LodCutoff")
    public void setLodCutoff(LodCutoff value) { this.lodCutoff = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }
}
