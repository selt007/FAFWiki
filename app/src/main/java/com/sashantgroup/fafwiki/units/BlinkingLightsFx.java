package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BlinkingLightsFx {
    private Red red;
    private Yellow yellow;
    private Green green;

    @JsonProperty("Red")
    public Red getRed() { return red; }
    @JsonProperty("Red")
    public void setRed(Red value) { this.red = value; }

    @JsonProperty("Yellow")
    public Yellow getYellow() { return yellow; }
    @JsonProperty("Yellow")
    public void setYellow(Yellow value) { this.yellow = value; }

    @JsonProperty("Green")
    public Green getGreen() { return green; }
    @JsonProperty("Green")
    public void setGreen(Green value) { this.green = value; }
}
