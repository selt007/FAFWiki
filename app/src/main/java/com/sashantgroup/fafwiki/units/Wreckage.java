package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Wreckage {
    private Blueprint blueprint;
    private String energyMult;
    private String healthMult;
    private MassMult massMult;
    private String reclaimTimeMultiplier;
    private WreckageLayers wreckageLayers;
    private Boolean useCustomMesh;

    @JsonProperty("Blueprint")
    public Blueprint getBlueprint() { return blueprint; }
    @JsonProperty("Blueprint")
    public void setBlueprint(Blueprint value) { this.blueprint = value; }

    @JsonProperty("EnergyMult")
    public String getEnergyMult() { return energyMult; }
    @JsonProperty("EnergyMult")
    public void setEnergyMult(String value) { this.energyMult = value; }

    @JsonProperty("HealthMult")
    public String getHealthMult() { return healthMult; }
    @JsonProperty("HealthMult")
    public void setHealthMult(String value) { this.healthMult = value; }

    @JsonProperty("MassMult")
    public MassMult getMassMult() { return massMult; }
    @JsonProperty("MassMult")
    public void setMassMult(MassMult value) { this.massMult = value; }

    @JsonProperty("ReclaimTimeMultiplier")
    public String getReclaimTimeMultiplier() { return reclaimTimeMultiplier; }
    @JsonProperty("ReclaimTimeMultiplier")
    public void setReclaimTimeMultiplier(String value) { this.reclaimTimeMultiplier = value; }

    @JsonProperty("WreckageLayers")
    public WreckageLayers getWreckageLayers() { return wreckageLayers; }
    @JsonProperty("WreckageLayers")
    public void setWreckageLayers(WreckageLayers value) { this.wreckageLayers = value; }

    @JsonProperty("UseCustomMesh")
    public Boolean getUseCustomMesh() { return useCustomMesh; }
    @JsonProperty("UseCustomMesh")
    public void setUseCustomMesh(Boolean value) { this.useCustomMesh = value; }
}
