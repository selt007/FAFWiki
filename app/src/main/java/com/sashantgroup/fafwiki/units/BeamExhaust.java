package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BeamExhaust {
    private Boolean landed;
    private String[] bones;
    private boolean cruise;
    private boolean idle;

    @JsonProperty("Landed")
    public Boolean getLanded() { return landed; }
    @JsonProperty("Landed")
    public void setLanded(Boolean value) { this.landed = value; }

    @JsonProperty("Bones")
    public String[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String[] value) { this.bones = value; }

    @JsonProperty("Cruise")
    public boolean getCruise() { return cruise; }
    @JsonProperty("Cruise")
    public void setCruise(boolean value) { this.cruise = value; }

    @JsonProperty("Idle")
    public boolean getIdle() { return idle; }
    @JsonProperty("Idle")
    public void setIdle(boolean value) { this.idle = value; }
}
