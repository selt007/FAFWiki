package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class UISelectionMultiple {
    private Property135 property135;
    private Property147 property147;
    private Property154 property154;
    private UISelectionMultipleProperty181 property181;

    @JsonProperty("Property135")
    public Property135 getProperty135() { return property135; }
    @JsonProperty("Property135")
    public void setProperty135(Property135 value) { this.property135 = value; }

    @JsonProperty("Property147")
    public Property147 getProperty147() { return property147; }
    @JsonProperty("Property147")
    public void setProperty147(Property147 value) { this.property147 = value; }

    @JsonProperty("Property154")
    public Property154 getProperty154() { return property154; }
    @JsonProperty("Property154")
    public void setProperty154(Property154 value) { this.property154 = value; }

    @JsonProperty("Property181")
    public UISelectionMultipleProperty181 getProperty181() { return property181; }
    @JsonProperty("Property181")
    public void setProperty181(UISelectionMultipleProperty181 value) { this.property181 = value; }
}
