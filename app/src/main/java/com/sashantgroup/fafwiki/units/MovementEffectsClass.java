package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MovementEffectsClass {
    private MovementEffectsAir air;
    private MovementEffectsLand land;
    private MovementEffectsWater water;
    private BeamExhaust beamExhaust;
    private MovementEffectsSeabed seabed;
    private MovementEffectsSub sub;
    private String the0;
    private String headRotationMax;
    private String wheelRotationMax;
    private Crush crush;
    private String jetRotationMax;

    @JsonProperty("Air")
    public MovementEffectsAir getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(MovementEffectsAir value) { this.air = value; }

    @JsonProperty("Land")
    public MovementEffectsLand getLand() { return land; }
    @JsonProperty("Land")
    public void setLand(MovementEffectsLand value) { this.land = value; }

    @JsonProperty("Water")
    public MovementEffectsWater getWater() { return water; }
    @JsonProperty("Water")
    public void setWater(MovementEffectsWater value) { this.water = value; }

    @JsonProperty("BeamExhaust")
    public BeamExhaust getBeamExhaust() { return beamExhaust; }
    @JsonProperty("BeamExhaust")
    public void setBeamExhaust(BeamExhaust value) { this.beamExhaust = value; }

    @JsonProperty("Seabed")
    public MovementEffectsSeabed getSeabed() { return seabed; }
    @JsonProperty("Seabed")
    public void setSeabed(MovementEffectsSeabed value) { this.seabed = value; }

    @JsonProperty("Sub")
    public MovementEffectsSub getSub() { return sub; }
    @JsonProperty("Sub")
    public void setSub(MovementEffectsSub value) { this.sub = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("HeadRotationMax")
    public String getHeadRotationMax() { return headRotationMax; }
    @JsonProperty("HeadRotationMax")
    public void setHeadRotationMax(String value) { this.headRotationMax = value; }

    @JsonProperty("WheelRotationMax")
    public String getWheelRotationMax() { return wheelRotationMax; }
    @JsonProperty("WheelRotationMax")
    public void setWheelRotationMax(String value) { this.wheelRotationMax = value; }

    @JsonProperty("Crush")
    public Crush getCrush() { return crush; }
    @JsonProperty("Crush")
    public void setCrush(Crush value) { this.crush = value; }

    @JsonProperty("JetRotationMax")
    public String getJetRotationMax() { return jetRotationMax; }
    @JsonProperty("JetRotationMax")
    public void setJetRotationMax(String value) { this.jetRotationMax = value; }
}
