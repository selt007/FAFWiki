package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Abilities {
    private TargetLocation targetLocation;

    @JsonProperty("TargetLocation")
    public TargetLocation getTargetLocation() { return targetLocation; }
    @JsonProperty("TargetLocation")
    public void setTargetLocation(TargetLocation value) { this.targetLocation = value; }
}
