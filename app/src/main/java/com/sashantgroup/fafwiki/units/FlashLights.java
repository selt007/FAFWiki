package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class FlashLights {
    private BlinkingLight property118;
    private BlinkingLight property125;
    private BlinkingLight property132;
    private BlinkingLight property139;

    @JsonProperty("Property118")
    public BlinkingLight getProperty118() { return property118; }
    @JsonProperty("Property118")
    public void setProperty118(BlinkingLight value) { this.property118 = value; }

    @JsonProperty("Property125")
    public BlinkingLight getProperty125() { return property125; }
    @JsonProperty("Property125")
    public void setProperty125(BlinkingLight value) { this.property125 = value; }

    @JsonProperty("Property132")
    public BlinkingLight getProperty132() { return property132; }
    @JsonProperty("Property132")
    public void setProperty132(BlinkingLight value) { this.property132 = value; }

    @JsonProperty("Property139")
    public BlinkingLight getProperty139() { return property139; }
    @JsonProperty("Property139")
    public void setProperty139(BlinkingLight value) { this.property139 = value; }
}
