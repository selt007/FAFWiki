package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property199Audio {
    private Activate chargeStart;
    private Activate open;

    @JsonProperty("ChargeStart")
    public Activate getChargeStart() { return chargeStart; }
    @JsonProperty("ChargeStart")
    public void setChargeStart(Activate value) { this.chargeStart = value; }

    @JsonProperty("Open")
    public Activate getOpen() { return open; }
    @JsonProperty("Open")
    public void setOpen(Activate value) { this.open = value; }
}
