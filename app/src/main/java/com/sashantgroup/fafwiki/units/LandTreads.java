package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class LandTreads {
    private Boolean scrollTreads;
    private TreadMark[] treadMarks;
    private Double scrollMultiplier;

    @JsonProperty("ScrollTreads")
    public Boolean getScrollTreads() { return scrollTreads; }
    @JsonProperty("ScrollTreads")
    public void setScrollTreads(Boolean value) { this.scrollTreads = value; }

    @JsonProperty("TreadMarks")
    public TreadMark[] getTreadMarks() { return treadMarks; }
    @JsonProperty("TreadMarks")
    public void setTreadMarks(TreadMark[] value) { this.treadMarks = value; }

    @JsonProperty("ScrollMultiplier")
    public Double getScrollMultiplier() { return scrollMultiplier; }
    @JsonProperty("ScrollMultiplier")
    public void setScrollMultiplier(Double value) { this.scrollMultiplier = value; }
}
