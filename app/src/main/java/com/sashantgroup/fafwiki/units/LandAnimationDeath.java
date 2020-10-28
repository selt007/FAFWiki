package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class LandAnimationDeath {
    private long weight;
    private String animation;

    @JsonProperty("Weight")
    public long getWeight() { return weight; }
    @JsonProperty("Weight")
    public void setWeight(long value) { this.weight = value; }

    @JsonProperty("Animation")
    public String getAnimation() { return animation; }
    @JsonProperty("Animation")
    public void setAnimation(String value) { this.animation = value; }
}
