package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class JamRadius {
    private long max;
    private long min;

    @JsonProperty("Max")
    public long getMax() { return max; }
    @JsonProperty("Max")
    public void setMax(long value) { this.max = value; }

    @JsonProperty("Min")
    public long getMin() { return min; }
    @JsonProperty("Min")
    public void setMin(long value) { this.min = value; }
}
