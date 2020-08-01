package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class FluffyEffects {
    private EffectsProperty55 property121;
    private Effect property120;
    private Effect property145;
    private EffectsProperty55 property119;
    private Effect property143;

    @JsonProperty("Property121")
    public EffectsProperty55 getProperty121() { return property121; }
    @JsonProperty("Property121")
    public void setProperty121(EffectsProperty55 value) { this.property121 = value; }

    @JsonProperty("Property120")
    public Effect getProperty120() { return property120; }
    @JsonProperty("Property120")
    public void setProperty120(Effect value) { this.property120 = value; }

    @JsonProperty("Property145")
    public Effect getProperty145() { return property145; }
    @JsonProperty("Property145")
    public void setProperty145(Effect value) { this.property145 = value; }

    @JsonProperty("Property119")
    public EffectsProperty55 getProperty119() { return property119; }
    @JsonProperty("Property119")
    public void setProperty119(EffectsProperty55 value) { this.property119 = value; }

    @JsonProperty("Property143")
    public Effect getProperty143() { return property143; }
    @JsonProperty("Property143")
    public void setProperty143(Effect value) { this.property143 = value; }
}
