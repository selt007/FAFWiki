package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Flare {
    private String category;
    private String radius;
    private boolean stack;
    private String offsetMult;

    @JsonProperty("Category")
    public String getCategory() { return category; }
    @JsonProperty("Category")
    public void setCategory(String value) { this.category = value; }

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }

    @JsonProperty("Stack")
    public boolean getStack() { return stack; }
    @JsonProperty("Stack")
    public void setStack(boolean value) { this.stack = value; }

    @JsonProperty("OffsetMult")
    public String getOffsetMult() { return offsetMult; }
    @JsonProperty("OffsetMult")
    public void setOffsetMult(String value) { this.offsetMult = value; }
}
