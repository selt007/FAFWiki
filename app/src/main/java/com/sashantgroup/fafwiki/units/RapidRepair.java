package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RapidRepair {
    private String addHealth;
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String icon;
    private String name;
    private String repairDelay;
    private String repairRate;
    private Slot slot;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;
    private Boolean interruptRapidRepairByWeaponFired;
    private String[] showBones;

    @JsonProperty("AddHealth")
    public String getAddHealth() { return addHealth; }
    @JsonProperty("AddHealth")
    public void setAddHealth(String value) { this.addHealth = value; }

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

    @JsonProperty("RepairDelay")
    public String getRepairDelay() { return repairDelay; }
    @JsonProperty("RepairDelay")
    public void setRepairDelay(String value) { this.repairDelay = value; }

    @JsonProperty("RepairRate")
    public String getRepairRate() { return repairRate; }
    @JsonProperty("RepairRate")
    public void setRepairRate(String value) { this.repairRate = value; }

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

    @JsonProperty("InterruptRapidRepairByWeaponFired")
    public Boolean getInterruptRapidRepairByWeaponFired() { return interruptRapidRepairByWeaponFired; }
    @JsonProperty("InterruptRapidRepairByWeaponFired")
    public void setInterruptRapidRepairByWeaponFired(Boolean value) { this.interruptRapidRepairByWeaponFired = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }
}
