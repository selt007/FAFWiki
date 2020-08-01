package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class TargetLocation {
    private String bitmapID;
    private String helpText;
    private Boolean active;

    @JsonProperty("bitmapId")
    public String getBitmapID() { return bitmapID; }
    @JsonProperty("bitmapId")
    public void setBitmapID(String value) { this.bitmapID = value; }

    @JsonProperty("helpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("helpText")
    public void setHelpText(String value) { this.helpText = value; }

    @JsonProperty("Active")
    public Boolean getActive() { return active; }
    @JsonProperty("Active")
    public void setActive(Boolean value) { this.active = value; }
}
