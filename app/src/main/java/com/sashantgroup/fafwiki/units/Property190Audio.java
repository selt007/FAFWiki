package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property190Audio {
    private Activate fire;
    private Activate open;

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }

    @JsonProperty("Open")
    public Activate getOpen() { return open; }
    @JsonProperty("Open")
    public void setOpen(Activate value) { this.open = value; }
}
