package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class EngineeringPods {
    private Property145Class property154;
    private Property145Class property145;
    private Property145Class property151;

    @JsonProperty("Property154")
    public Property145Class getProperty154() { return property154; }
    @JsonProperty("Property154")
    public void setProperty154(Property145Class value) { this.property154 = value; }

    @JsonProperty("Property145")
    public Property145Class getProperty145() { return property145; }
    @JsonProperty("Property145")
    public void setProperty145(Property145Class value) { this.property145 = value; }

    @JsonProperty("Property151")
    public Property145Class getProperty151() { return property151; }
    @JsonProperty("Property151")
    public void setProperty151(Property145Class value) { this.property151 = value; }
}
