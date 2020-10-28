package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Slots {
    private Back lch;
    private Back back;
    private Back rch;

    @JsonProperty("LCH")
    public Back getLch() { return lch; }
    @JsonProperty("LCH")
    public void setLch(Back value) { this.lch = value; }

    @JsonProperty("Back")
    public Back getBack() { return back; }
    @JsonProperty("Back")
    public void setBack(Back value) { this.back = value; }

    @JsonProperty("RCH")
    public Back getRch() { return rch; }
    @JsonProperty("RCH")
    public void setRch(Back value) { this.rch = value; }
}
