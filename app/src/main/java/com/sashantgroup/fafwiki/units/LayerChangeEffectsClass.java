package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LayerChangeEffectsClass {
    private AirLand airLand;
    private LandAir landAir;
    private SeabedLand seabedLand;
    private WaterLand waterLand;

    @JsonProperty("AirLand")
    public AirLand getAirLand() { return airLand; }
    @JsonProperty("AirLand")
    public void setAirLand(AirLand value) { this.airLand = value; }

    @JsonProperty("LandAir")
    public LandAir getLandAir() { return landAir; }
    @JsonProperty("LandAir")
    public void setLandAir(LandAir value) { this.landAir = value; }

    @JsonProperty("SeabedLand")
    public SeabedLand getSeabedLand() { return seabedLand; }
    @JsonProperty("SeabedLand")
    public void setSeabedLand(SeabedLand value) { this.seabedLand = value; }

    @JsonProperty("WaterLand")
    public WaterLand getWaterLand() { return waterLand; }
    @JsonProperty("WaterLand")
    public void setWaterLand(WaterLand value) { this.waterLand = value; }
}
