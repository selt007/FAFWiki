package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RULEUTCProductionToggle {
    private String bitmapID;
    private String helpText;
    private String the0;

    @JsonProperty("bitmapId")
    public String getBitmapID() { return bitmapID; }
    @JsonProperty("bitmapId")
    public void setBitmapID(String value) { this.bitmapID = value; }

    @JsonProperty("helpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("helpText")
    public void setHelpText(String value) { this.helpText = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }
}
