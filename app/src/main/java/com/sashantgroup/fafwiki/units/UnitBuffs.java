package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class UnitBuffs {
    private Veteran regen;
    private Stun stun;

    @JsonProperty("Regen")
    public Veteran getRegen() { return regen; }
    @JsonProperty("Regen")
    public void setRegen(Veteran value) { this.regen = value; }

    @JsonProperty("Stun")
    public Stun getStun() { return stun; }
    @JsonProperty("Stun")
    public void setStun(Stun value) { this.stun = value; }
}
