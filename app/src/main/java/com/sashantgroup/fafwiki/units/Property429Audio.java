package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property429Audio {
    private Activate fire;
    private Activate fireSpecial;

    @JsonProperty("Fire")
    public Activate getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(Activate value) { this.fire = value; }

    @JsonProperty("FireSpecial")
    public Activate getFireSpecial() { return fireSpecial; }
    @JsonProperty("FireSpecial")
    public void setFireSpecial(Activate value) { this.fireSpecial = value; }
}
