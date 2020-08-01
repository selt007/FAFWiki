package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class FlashLightsFx {
    private Green green;
    private Red red;

    @JsonProperty("Green")
    public Green getGreen() { return green; }
    @JsonProperty("Green")
    public void setGreen(Green value) { this.green = value; }

    @JsonProperty("Red")
    public Red getRed() { return red; }
    @JsonProperty("Red")
    public void setRed(Red value) { this.red = value; }
}
