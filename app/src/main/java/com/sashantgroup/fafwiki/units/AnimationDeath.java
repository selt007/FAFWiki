package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class AnimationDeath {
    private String animation;
    private Double animationRateMax;
    private Long weight;
    private Double animationRateMin;
    private HitBox hitBox;

    @JsonProperty("Animation")
    public String getAnimation() { return animation; }
    @JsonProperty("Animation")
    public void setAnimation(String value) { this.animation = value; }

    @JsonProperty("AnimationRateMax")
    public Double getAnimationRateMax() { return animationRateMax; }
    @JsonProperty("AnimationRateMax")
    public void setAnimationRateMax(Double value) { this.animationRateMax = value; }

    @JsonProperty("Weight")
    public Long getWeight() { return weight; }
    @JsonProperty("Weight")
    public void setWeight(Long value) { this.weight = value; }

    @JsonProperty("AnimationRateMin")
    public Double getAnimationRateMin() { return animationRateMin; }
    @JsonProperty("AnimationRateMin")
    public void setAnimationRateMin(Double value) { this.animationRateMin = value; }

    @JsonProperty("HitBox")
    public HitBox getHitBox() { return hitBox; }
    @JsonProperty("HitBox")
    public void setHitBox(HitBox value) { this.hitBox = value; }
}
