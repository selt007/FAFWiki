package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class WarpInEffect {
    private String phaseShieldMesh;
    private String[] hideBones;

    @JsonProperty("PhaseShieldMesh")
    public String getPhaseShieldMesh() { return phaseShieldMesh; }
    @JsonProperty("PhaseShieldMesh")
    public void setPhaseShieldMesh(String value) { this.phaseShieldMesh = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }
}
