package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class FireTargetLayerCapsTable {
    private AirEnum land;
    private AirEnum air;
    private AirEnum water;
    private AirEnum sub;
    private AirEnum seabed;

    @JsonProperty("Land")
    public AirEnum getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(AirEnum value) { this.land = value; }

    @JsonProperty("Air")
    public AirEnum getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(AirEnum value) { this.air = value; }

    @JsonProperty("Water")
    public AirEnum getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(AirEnum value) { this.water = value; }

    @JsonProperty("Sub")
    public AirEnum getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(AirEnum value) { this.sub = value; }

    @JsonProperty("Seabed")
    public AirEnum getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(AirEnum value) { this.seabed = value; }
}
