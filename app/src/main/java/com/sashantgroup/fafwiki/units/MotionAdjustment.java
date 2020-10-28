package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class MotionAdjustment {
    private long sliderstatic;
    private double slideinmotion;
    private double sliderlanding;
    private double yoffsetlanding;
    private double yoffsetinmotion;

    @JsonProperty("Sliderstatic")
    public long getSliderstatic() { return sliderstatic; }
    @JsonProperty("Sliderstatic")
    public void setSliderstatic(long value) { this.sliderstatic = value; }

    @JsonProperty("slideinmotion")
    public double getSlideinmotion() { return slideinmotion; }
    @JsonProperty("slideinmotion")
    public void setSlideinmotion(double value) { this.slideinmotion = value; }

    @JsonProperty("Sliderlanding")
    public double getSliderlanding() { return sliderlanding; }
    @JsonProperty("Sliderlanding")
    public void setSliderlanding(double value) { this.sliderlanding = value; }

    @JsonProperty("Yoffsetlanding")
    public double getYoffsetlanding() { return yoffsetlanding; }
    @JsonProperty("Yoffsetlanding")
    public void setYoffsetlanding(double value) { this.yoffsetlanding = value; }

    @JsonProperty("Yoffsetinmotion")
    public double getYoffsetinmotion() { return yoffsetinmotion; }
    @JsonProperty("Yoffsetinmotion")
    public void setYoffsetinmotion(double value) { this.yoffsetinmotion = value; }
}
