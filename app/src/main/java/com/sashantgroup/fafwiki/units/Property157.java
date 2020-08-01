package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property157 {
    private String animation;
    private String weight;

    @JsonProperty("Animation")
    public String getAnimation() { return animation; }
    @JsonProperty("Animation")
    public void setAnimation(String value) { this.animation = value; }

    @JsonProperty("Weight")
    public String getWeight() { return weight; }
    @JsonProperty("Weight")
    public void setWeight(String value) { this.weight = value; }
}
