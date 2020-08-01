package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Mesh {
    private String iconFadeInZoom;
    private LODs loDs;

    @JsonProperty("IconFadeInZoom")
    public String getIconFadeInZoom() { return iconFadeInZoom; }
    @JsonProperty("IconFadeInZoom")
    public void setIconFadeInZoom(String value) { this.iconFadeInZoom = value; }

    @JsonProperty("LODs")
    public LODs getLoDs() { return loDs; }
    @JsonProperty("LODs")
    public void setLoDs(LODs value) { this.loDs = value; }
}
