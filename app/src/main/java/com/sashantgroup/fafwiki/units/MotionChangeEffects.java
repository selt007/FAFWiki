package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class MotionChangeEffects {
    private SubBottomUp subBottomUp;
    private SubBottomUp waterTopDown;

    @JsonProperty("SubBottomUp")
    public SubBottomUp getSubBottomUp() { return subBottomUp; }
    @JsonProperty("SubBottomUp")
    public void setSubBottomUp(SubBottomUp value) { this.subBottomUp = value; }

    @JsonProperty("WaterTopDown")
    public SubBottomUp getWaterTopDown() { return waterTopDown; }
    @JsonProperty("WaterTopDown")
    public void setWaterTopDown(SubBottomUp value) { this.waterTopDown = value; }
}
