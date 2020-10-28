package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Wreckage {
    private long energyMult;
    private Blueprint blueprint;
    private double massMult;
    private double healthMult;
    private WreckageLayers wreckageLayers;
    private long reclaimTimeMultiplier;
    private Boolean useCustomMesh;

    @JsonProperty("EnergyMult")
    public long getEnergyMult() { return energyMult; }
    @JsonProperty("EnergyMult")
    public void setEnergyMult(long value) { this.energyMult = value; }

    @JsonProperty("Blueprint")
    public Blueprint getBlueprint() { return blueprint; }
    @JsonProperty("Blueprint")
    public void setBlueprint(Blueprint value) { this.blueprint = value; }

    @JsonProperty("MassMult")
    public double getMassMult() { return massMult; }
    @JsonProperty("MassMult")
    public void setMassMult(double value) { this.massMult = value; }

    @JsonProperty("HealthMult")
    public double getHealthMult() { return healthMult; }
    @JsonProperty("HealthMult")
    public void setHealthMult(double value) { this.healthMult = value; }

    @JsonProperty("WreckageLayers")
    public WreckageLayers getWreckageLayers() { return wreckageLayers; }
    @JsonProperty("WreckageLayers")
    public void setWreckageLayers(WreckageLayers value) { this.wreckageLayers = value; }

    @JsonProperty("ReclaimTimeMultiplier")
    public long getReclaimTimeMultiplier() { return reclaimTimeMultiplier; }
    @JsonProperty("ReclaimTimeMultiplier")
    public void setReclaimTimeMultiplier(long value) { this.reclaimTimeMultiplier = value; }

    @JsonProperty("UseCustomMesh")
    public Boolean getUseCustomMesh() { return useCustomMesh; }
    @JsonProperty("UseCustomMesh")
    public void setUseCustomMesh(Boolean value) { this.useCustomMesh = value; }
}
