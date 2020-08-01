package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class FactoryClass {
    private Boolean buildFieldReversed;
    private Boolean verticalEffect;
    private String buildFieldOffset;

    @JsonProperty("BuildFieldReversed")
    public Boolean getBuildFieldReversed() { return buildFieldReversed; }
    @JsonProperty("BuildFieldReversed")
    public void setBuildFieldReversed(Boolean value) { this.buildFieldReversed = value; }

    @JsonProperty("VerticalEffect")
    public Boolean getVerticalEffect() { return verticalEffect; }
    @JsonProperty("VerticalEffect")
    public void setVerticalEffect(Boolean value) { this.verticalEffect = value; }

    @JsonProperty("BuildFieldOffset")
    public String getBuildFieldOffset() { return buildFieldOffset; }
    @JsonProperty("BuildFieldOffset")
    public void setBuildFieldOffset(String value) { this.buildFieldOffset = value; }
}
