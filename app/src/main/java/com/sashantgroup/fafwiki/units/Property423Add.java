package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property423Add {
    private String[] impactTypeDisallow;
    private boolean onImpact;

    @JsonProperty("ImpactTypeDisallow")
    public String[] getImpactTypeDisallow() { return impactTypeDisallow; }
    @JsonProperty("ImpactTypeDisallow")
    public void setImpactTypeDisallow(String[] value) { this.impactTypeDisallow = value; }

    @JsonProperty("OnImpact")
    public boolean getOnImpact() { return onImpact; }
    @JsonProperty("OnImpact")
    public void setOnImpact(boolean value) { this.onImpact = value; }
}
