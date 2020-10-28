package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class IdleEffects {
    private LandClass land;
    private SubBottomUp water;
    private Sub sub;
    private LandClass seabed;
    private LandClass air;

    @JsonProperty("Land")
    public LandClass getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(LandClass value) { this.land = value; }

    @JsonProperty("Water")
    public SubBottomUp getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(SubBottomUp value) { this.water = value; }

    @JsonProperty("Sub")
    public Sub getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(Sub value) { this.sub = value; }

    @JsonProperty("Seabed")
    public LandClass getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(LandClass value) { this.seabed = value; }

    @JsonProperty("Air")
    public LandClass getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(LandClass value) { this.air = value; }
}
