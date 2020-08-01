package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AdvancedCoolingUpgrade {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String icon;
    private String name;
    private String newRateOfFire;
    private Slot slot;
    private String[] upgradeUnitAmbientBones;
    private String prerequisite;
    private String[] removeEnhancements;
    private String[] hideBones;
    private String[] upgradeEffectBones;
    private String newRegenRate;

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

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("NewRateOfFire")
    public String getNewRateOfFire() { return newRateOfFire; }
    @JsonProperty("NewRateOfFire")
    public void setNewRateOfFire(String value) { this.newRateOfFire = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("RemoveEnhancements")
    public String[] getRemoveEnhancements() { return removeEnhancements; }
    @JsonProperty("RemoveEnhancements")
    public void setRemoveEnhancements(String[] value) { this.removeEnhancements = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("NewRegenRate")
    public String getNewRegenRate() { return newRegenRate; }
    @JsonProperty("NewRegenRate")
    public void setNewRegenRate(String value) { this.newRegenRate = value; }
}
