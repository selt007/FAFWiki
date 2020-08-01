package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AdditionalCapacitor {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String[] hideBones;
    private String icon;
    private String name;
    private String prerequisite;
    private String capacitorNewDuration;
    private String capacitorNewChargeTime;
    private String capacitorNewChargeEnergyCost;
    private String[] showBones;
    private Slot slot;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;

    @JsonProperty("BuildCostEnergy")
    public String getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(String value) { this.buildCostEnergy = value; }

    @JsonProperty("BuildCostMass")
    public String getBuildCostMass() { return buildCostMass; }
    @JsonProperty("BuildCostMass")
    public void setBuildCostMass(String value) { this.buildCostMass = value; }

    @JsonProperty("BuildTime")
    public String getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(String value) { this.buildTime = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("CapacitorNewDuration")
    public String getCapacitorNewDuration() { return capacitorNewDuration; }
    @JsonProperty("CapacitorNewDuration")
    public void setCapacitorNewDuration(String value) { this.capacitorNewDuration = value; }

    @JsonProperty("CapacitorNewChargeTime")
    public String getCapacitorNewChargeTime() { return capacitorNewChargeTime; }
    @JsonProperty("CapacitorNewChargeTime")
    public void setCapacitorNewChargeTime(String value) { this.capacitorNewChargeTime = value; }

    @JsonProperty("CapacitorNewChargeEnergyCost")
    public String getCapacitorNewChargeEnergyCost() { return capacitorNewChargeEnergyCost; }
    @JsonProperty("CapacitorNewChargeEnergyCost")
    public void setCapacitorNewChargeEnergyCost(String value) { this.capacitorNewChargeEnergyCost = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }
}
