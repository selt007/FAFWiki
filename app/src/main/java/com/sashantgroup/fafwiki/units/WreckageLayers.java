package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class WreckageLayers {
    private boolean land;
    private boolean water;
    private Boolean sub;
    private boolean seabed;
    private boolean air;

    @JsonProperty("Land")
    public boolean getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(boolean value) { this.land = value; }

    @JsonProperty("Water")
    public boolean getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(boolean value) { this.water = value; }

    @JsonProperty("Sub")
    public Boolean getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(Boolean value) { this.sub = value; }

    @JsonProperty("Seabed")
    public boolean getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(boolean value) { this.seabed = value; }

    @JsonProperty("Air")
    public boolean getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(boolean value) { this.air = value; }
}
