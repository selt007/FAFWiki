package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MotionChangeEffects {
    private SubBottomUp subBottomUp;
    private WaterTopDown waterTopDown;

    @JsonProperty("SubBottomUp")
    public SubBottomUp getSubBottomUp() { return subBottomUp; }
    @JsonProperty("SubBottomUp")
    public void setSubBottomUp(SubBottomUp value) { this.subBottomUp = value; }

    @JsonProperty("WaterTopDown")
    public WaterTopDown getWaterTopDown() { return waterTopDown; }
    @JsonProperty("WaterTopDown")
    public void setWaterTopDown(WaterTopDown value) { this.waterTopDown = value; }
}
