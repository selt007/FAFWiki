package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Back {
    private Name name;
    private String x;
    private String y;

    @JsonProperty("name")
    public Name getName() { return name; }
    @JsonProperty("name")
    public void setName(Name value) { this.name = value; }

    @JsonProperty("x")
    public String getX() { return x; }
    @JsonProperty("x")
    public void setX(String value) { this.x = value; }

    @JsonProperty("y")
    public String getY() { return y; }
    @JsonProperty("y")
    public void setY(String value) { this.y = value; }
}
