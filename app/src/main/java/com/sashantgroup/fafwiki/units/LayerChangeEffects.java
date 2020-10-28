package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class LayerChangeEffects {
    private SubBottomUp landAir;
    private SubBottomUp airLand;
    private Land seabedLand;
    private Land waterLand;

    @JsonProperty("LandAir")
    public SubBottomUp getLandAir() { return landAir; }
    @JsonProperty("LandAir")
    public void setLandAir(SubBottomUp value) { this.landAir = value; }

    @JsonProperty("AirLand")
    public SubBottomUp getAirLand() { return airLand; }
    @JsonProperty("AirLand")
    public void setAirLand(SubBottomUp value) { this.airLand = value; }

    @JsonProperty("SeabedLand")
    public Land getSeabedLand() { return seabedLand; }
    @JsonProperty("SeabedLand")
    public void setSeabedLand(Land value) { this.seabedLand = value; }

    @JsonProperty("WaterLand")
    public Land getWaterLand() { return waterLand; }
    @JsonProperty("WaterLand")
    public void setWaterLand(Land value) { this.waterLand = value; }
}
