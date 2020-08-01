package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LandTreads {
    private Boolean scrollTreads;
    private TreadMarksClass treadMarks;
    private String scrollMultiplier;

    @JsonProperty("ScrollTreads")
    public Boolean getScrollTreads() { return scrollTreads; }
    @JsonProperty("ScrollTreads")
    public void setScrollTreads(Boolean value) { this.scrollTreads = value; }

    @JsonProperty("TreadMarks")
    public TreadMarksClass getTreadMarks() { return treadMarks; }
    @JsonProperty("TreadMarks")
    public void setTreadMarks(TreadMarksClass value) { this.treadMarks = value; }

    @JsonProperty("ScrollMultiplier")
    public String getScrollMultiplier() { return scrollMultiplier; }
    @JsonProperty("ScrollMultiplier")
    public void setScrollMultiplier(String value) { this.scrollMultiplier = value; }
}
