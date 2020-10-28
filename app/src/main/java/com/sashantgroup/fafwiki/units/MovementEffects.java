package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class MovementEffects {
    private MovementEffectsLand land;
    private MovementEffectsAir air;
    private BeamExhaust beamExhaust;
    private SubBottomUp water;
    private SubBottomUp sub;
    private Seabed seabed;

    @JsonProperty("Land")
    public MovementEffectsLand getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(MovementEffectsLand value) { this.land = value; }

    @JsonProperty("Air")
    public MovementEffectsAir getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(MovementEffectsAir value) { this.air = value; }

    @JsonProperty("BeamExhaust")
    public BeamExhaust getBeamExhaust() { return beamExhaust; }
    @JsonProperty("BeamExhaust")
    public void setBeamExhaust(BeamExhaust value) { this.beamExhaust = value; }

    @JsonProperty("Water")
    public SubBottomUp getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(SubBottomUp value) { this.water = value; }

    @JsonProperty("Sub")
    public SubBottomUp getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(SubBottomUp value) { this.sub = value; }

    @JsonProperty("Seabed")
    public Seabed getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(Seabed value) { this.seabed = value; }
}
