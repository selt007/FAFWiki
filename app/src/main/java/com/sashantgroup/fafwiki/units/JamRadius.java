package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class JamRadius {
    private String max;
    private String min;

    @JsonProperty("Max")
    public String getMax() { return max; }
    @JsonProperty("Max")
    public void setMax(String value) { this.max = value; }

    @JsonProperty("Min")
    public String getMin() { return min; }
    @JsonProperty("Min")
    public void setMin(String value) { this.min = value; }
}
