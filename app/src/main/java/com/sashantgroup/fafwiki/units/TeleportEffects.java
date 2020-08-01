package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class TeleportEffects {
    private ChargeFxAtUnitBones chargeFxAtUnitBones;
    private boolean playChargeFxAtDestination;
    private boolean playChargeFxAtUnit;
    private boolean playTeleportOutFx;
    private boolean playTeleportInFx;
    private String fxOffsetX;
    private String fxOffsetY;
    private String fxOffsetZ;
    private String fxSizeX;
    private String fxSizeY;
    private String fxSizeZ;

    @JsonProperty("ChargeFxAtUnitBones")
    public ChargeFxAtUnitBones getChargeFxAtUnitBones() { return chargeFxAtUnitBones; }
    @JsonProperty("ChargeFxAtUnitBones")
    public void setChargeFxAtUnitBones(ChargeFxAtUnitBones value) { this.chargeFxAtUnitBones = value; }

    @JsonProperty("PlayChargeFxAtDestination")
    public boolean getPlayChargeFxAtDestination() { return playChargeFxAtDestination; }
    @JsonProperty("PlayChargeFxAtDestination")
    public void setPlayChargeFxAtDestination(boolean value) { this.playChargeFxAtDestination = value; }

    @JsonProperty("PlayChargeFxAtUnit")
    public boolean getPlayChargeFxAtUnit() { return playChargeFxAtUnit; }
    @JsonProperty("PlayChargeFxAtUnit")
    public void setPlayChargeFxAtUnit(boolean value) { this.playChargeFxAtUnit = value; }

    @JsonProperty("PlayTeleportOutFx")
    public boolean getPlayTeleportOutFx() { return playTeleportOutFx; }
    @JsonProperty("PlayTeleportOutFx")
    public void setPlayTeleportOutFx(boolean value) { this.playTeleportOutFx = value; }

    @JsonProperty("PlayTeleportInFx")
    public boolean getPlayTeleportInFx() { return playTeleportInFx; }
    @JsonProperty("PlayTeleportInFx")
    public void setPlayTeleportInFx(boolean value) { this.playTeleportInFx = value; }

    @JsonProperty("FxOffsetX")
    public String getFxOffsetX() { return fxOffsetX; }
    @JsonProperty("FxOffsetX")
    public void setFxOffsetX(String value) { this.fxOffsetX = value; }

    @JsonProperty("FxOffsetY")
    public String getFxOffsetY() { return fxOffsetY; }
    @JsonProperty("FxOffsetY")
    public void setFxOffsetY(String value) { this.fxOffsetY = value; }

    @JsonProperty("FxOffsetZ")
    public String getFxOffsetZ() { return fxOffsetZ; }
    @JsonProperty("FxOffsetZ")
    public void setFxOffsetZ(String value) { this.fxOffsetZ = value; }

    @JsonProperty("FxSizeX")
    public String getFxSizeX() { return fxSizeX; }
    @JsonProperty("FxSizeX")
    public void setFxSizeX(String value) { this.fxSizeX = value; }

    @JsonProperty("FxSizeY")
    public String getFxSizeY() { return fxSizeY; }
    @JsonProperty("FxSizeY")
    public void setFxSizeY(String value) { this.fxSizeY = value; }

    @JsonProperty("FxSizeZ")
    public String getFxSizeZ() { return fxSizeZ; }
    @JsonProperty("FxSizeZ")
    public void setFxSizeZ(String value) { this.fxSizeZ = value; }
}
