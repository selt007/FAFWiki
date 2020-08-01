package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property254Class {
    private String animation;
    private String animationRateMax;
    private String animationRateMin;
    private String weight;

    @JsonProperty("Animation")
    public String getAnimation() { return animation; }
    @JsonProperty("Animation")
    public void setAnimation(String value) { this.animation = value; }

    @JsonProperty("AnimationRateMax")
    public String getAnimationRateMax() { return animationRateMax; }
    @JsonProperty("AnimationRateMax")
    public void setAnimationRateMax(String value) { this.animationRateMax = value; }

    @JsonProperty("AnimationRateMin")
    public String getAnimationRateMin() { return animationRateMin; }
    @JsonProperty("AnimationRateMin")
    public void setAnimationRateMin(String value) { this.animationRateMin = value; }

    @JsonProperty("Weight")
    public String getWeight() { return weight; }
    @JsonProperty("Weight")
    public void setWeight(String value) { this.weight = value; }
}
