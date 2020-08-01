package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MotionAdjustment {
    private String sliderlanding;
    private String sliderstatic;
    private String yoffsetinmotion;
    private String yoffsetlanding;
    private String slideinmotion;

    @JsonProperty("Sliderlanding")
    public String getSliderlanding() { return sliderlanding; }
    @JsonProperty("Sliderlanding")
    public void setSliderlanding(String value) { this.sliderlanding = value; }

    @JsonProperty("Sliderstatic")
    public String getSliderstatic() { return sliderstatic; }
    @JsonProperty("Sliderstatic")
    public void setSliderstatic(String value) { this.sliderstatic = value; }

    @JsonProperty("Yoffsetinmotion")
    public String getYoffsetinmotion() { return yoffsetinmotion; }
    @JsonProperty("Yoffsetinmotion")
    public void setYoffsetinmotion(String value) { this.yoffsetinmotion = value; }

    @JsonProperty("Yoffsetlanding")
    public String getYoffsetlanding() { return yoffsetlanding; }
    @JsonProperty("Yoffsetlanding")
    public void setYoffsetlanding(String value) { this.yoffsetlanding = value; }

    @JsonProperty("slideinmotion")
    public String getSlideinmotion() { return slideinmotion; }
    @JsonProperty("slideinmotion")
    public void setSlideinmotion(String value) { this.slideinmotion = value; }
}
