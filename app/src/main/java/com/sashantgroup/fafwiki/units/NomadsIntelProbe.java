package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class NomadsIntelProbe {
    private String maxRadius;
    private boolean noAutoEnable;

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

    @JsonProperty("NoAutoEnable")
    public boolean getNoAutoEnable() { return noAutoEnable; }
    @JsonProperty("NoAutoEnable")
    public void setNoAutoEnable(boolean value) { this.noAutoEnable = value; }
}
