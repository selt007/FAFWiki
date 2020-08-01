package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class WarpInEffect {
    private String[] hideBones;
    private String phaseShieldMesh;

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("PhaseShieldMesh")
    public String getPhaseShieldMesh() { return phaseShieldMesh; }
    @JsonProperty("PhaseShieldMesh")
    public void setPhaseShieldMesh(String value) { this.phaseShieldMesh = value; }
}
