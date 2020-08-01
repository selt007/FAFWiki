package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Interface {
    private String helpText;
    private Boolean selectable;

    @JsonProperty("HelpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("HelpText")
    public void setHelpText(String value) { this.helpText = value; }

    @JsonProperty("Selectable")
    public Boolean getSelectable() { return selectable; }
    @JsonProperty("Selectable")
    public void setSelectable(Boolean value) { this.selectable = value; }
}
