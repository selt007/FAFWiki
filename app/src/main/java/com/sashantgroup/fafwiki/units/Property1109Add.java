package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1109Add {
    private boolean onFire;

    @JsonProperty("OnFire")
    public boolean getOnFire() { return onFire; }
    @JsonProperty("OnFire")
    public void setOnFire(boolean value) { this.onFire = value; }
}
