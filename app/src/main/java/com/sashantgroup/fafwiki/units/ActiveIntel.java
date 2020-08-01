package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ActiveIntel {
    private Boolean omni;
    private Boolean sonar;

    @JsonProperty("Omni")
    public Boolean getOmni() { return omni; }
    @JsonProperty("Omni")
    public void setOmni(Boolean value) { this.omni = value; }

    @JsonProperty("Sonar")
    public Boolean getSonar() { return sonar; }
    @JsonProperty("Sonar")
    public void setSonar(Boolean value) { this.sonar = value; }
}
