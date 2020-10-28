package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class TeleportEffects {
    private boolean playTeleportInFx;
    private boolean playTeleportOutFx;
    private boolean playChargeFxAtDestination;
    private boolean playChargeFxAtUnit;
    private ChargeFxAtUnitBone[] chargeFxAtUnitBones;
    private Double fxSizeY;
    private Double fxSizeZ;
    private Double fxOffsetZ;
    private Long fxOffsetX;
    private Double fxSizeX;
    private Long fxOffsetY;

    @JsonProperty("PlayTeleportInFx")
    public boolean getPlayTeleportInFx() { return playTeleportInFx; }
    @JsonProperty("PlayTeleportInFx")
    public void setPlayTeleportInFx(boolean value) { this.playTeleportInFx = value; }

    @JsonProperty("PlayTeleportOutFx")
    public boolean getPlayTeleportOutFx() { return playTeleportOutFx; }
    @JsonProperty("PlayTeleportOutFx")
    public void setPlayTeleportOutFx(boolean value) { this.playTeleportOutFx = value; }

    @JsonProperty("PlayChargeFxAtDestination")
    public boolean getPlayChargeFxAtDestination() { return playChargeFxAtDestination; }
    @JsonProperty("PlayChargeFxAtDestination")
    public void setPlayChargeFxAtDestination(boolean value) { this.playChargeFxAtDestination = value; }

    @JsonProperty("PlayChargeFxAtUnit")
    public boolean getPlayChargeFxAtUnit() { return playChargeFxAtUnit; }
    @JsonProperty("PlayChargeFxAtUnit")
    public void setPlayChargeFxAtUnit(boolean value) { this.playChargeFxAtUnit = value; }

    @JsonProperty("ChargeFxAtUnitBones")
    public ChargeFxAtUnitBone[] getChargeFxAtUnitBones() { return chargeFxAtUnitBones; }
    @JsonProperty("ChargeFxAtUnitBones")
    public void setChargeFxAtUnitBones(ChargeFxAtUnitBone[] value) { this.chargeFxAtUnitBones = value; }

    @JsonProperty("FxSizeY")
    public Double getFxSizeY() { return fxSizeY; }
    @JsonProperty("FxSizeY")
    public void setFxSizeY(Double value) { this.fxSizeY = value; }

    @JsonProperty("FxSizeZ")
    public Double getFxSizeZ() { return fxSizeZ; }
    @JsonProperty("FxSizeZ")
    public void setFxSizeZ(Double value) { this.fxSizeZ = value; }

    @JsonProperty("FxOffsetZ")
    public Double getFxOffsetZ() { return fxOffsetZ; }
    @JsonProperty("FxOffsetZ")
    public void setFxOffsetZ(Double value) { this.fxOffsetZ = value; }

    @JsonProperty("FxOffsetX")
    public Long getFxOffsetX() { return fxOffsetX; }
    @JsonProperty("FxOffsetX")
    public void setFxOffsetX(Long value) { this.fxOffsetX = value; }

    @JsonProperty("FxSizeX")
    public Double getFxSizeX() { return fxSizeX; }
    @JsonProperty("FxSizeX")
    public void setFxSizeX(Double value) { this.fxSizeX = value; }

    @JsonProperty("FxOffsetY")
    public Long getFxOffsetY() { return fxOffsetY; }
    @JsonProperty("FxOffsetY")
    public void setFxOffsetY(Long value) { this.fxOffsetY = value; }
}
