package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SeabedLandEffects {
    private Effect property188;
    private Effect property194;

    @JsonProperty("Property188")
    public Effect getProperty188() { return property188; }
    @JsonProperty("Property188")
    public void setProperty188(Effect value) { this.property188 = value; }

    @JsonProperty("Property194")
    public Effect getProperty194() { return property194; }
    @JsonProperty("Property194")
    public void setProperty194(Effect value) { this.property194 = value; }
}
