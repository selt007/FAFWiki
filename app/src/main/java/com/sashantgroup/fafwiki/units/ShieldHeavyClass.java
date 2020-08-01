package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ShieldHeavyClass {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String icon;
    private ImpactEffects impactEffects;
    private String maintenanceConsumptionPerSecondEnergy;
    private String name;
    private String ownerShieldMesh;
    private boolean personalShield;
    private String regenAssistMult;
    private String shieldEnergyDrainRechargeTime;
    private String shieldMaxHealth;
    private String shieldRechargeTime;
    private String shieldRegenRate;
    private String shieldRegenStartTime;
    private String[] showBones;
    private Slot slot;
    private String[] upgradeUnitAmbientBones;
    private String[] upgradeEffectBones;
    private String shieldSize;
    private String shieldVerticalOffset;
    private String prerequisite;

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

    @JsonProperty("ImpactEffects")
    public ImpactEffects getImpactEffects() { return impactEffects; }
    @JsonProperty("ImpactEffects")
    public void setImpactEffects(ImpactEffects value) { this.impactEffects = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public String getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(String value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("OwnerShieldMesh")
    public String getOwnerShieldMesh() { return ownerShieldMesh; }
    @JsonProperty("OwnerShieldMesh")
    public void setOwnerShieldMesh(String value) { this.ownerShieldMesh = value; }

    @JsonProperty("PersonalShield")
    public boolean getPersonalShield() { return personalShield; }
    @JsonProperty("PersonalShield")
    public void setPersonalShield(boolean value) { this.personalShield = value; }

    @JsonProperty("RegenAssistMult")
    public String getRegenAssistMult() { return regenAssistMult; }
    @JsonProperty("RegenAssistMult")
    public void setRegenAssistMult(String value) { this.regenAssistMult = value; }

    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public String getShieldEnergyDrainRechargeTime() { return shieldEnergyDrainRechargeTime; }
    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public void setShieldEnergyDrainRechargeTime(String value) { this.shieldEnergyDrainRechargeTime = value; }

    @JsonProperty("ShieldMaxHealth")
    public String getShieldMaxHealth() { return shieldMaxHealth; }
    @JsonProperty("ShieldMaxHealth")
    public void setShieldMaxHealth(String value) { this.shieldMaxHealth = value; }

    @JsonProperty("ShieldRechargeTime")
    public String getShieldRechargeTime() { return shieldRechargeTime; }
    @JsonProperty("ShieldRechargeTime")
    public void setShieldRechargeTime(String value) { this.shieldRechargeTime = value; }

    @JsonProperty("ShieldRegenRate")
    public String getShieldRegenRate() { return shieldRegenRate; }
    @JsonProperty("ShieldRegenRate")
    public void setShieldRegenRate(String value) { this.shieldRegenRate = value; }

    @JsonProperty("ShieldRegenStartTime")
    public String getShieldRegenStartTime() { return shieldRegenStartTime; }
    @JsonProperty("ShieldRegenStartTime")
    public void setShieldRegenStartTime(String value) { this.shieldRegenStartTime = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("ShieldSize")
    public String getShieldSize() { return shieldSize; }
    @JsonProperty("ShieldSize")
    public void setShieldSize(String value) { this.shieldSize = value; }

    @JsonProperty("ShieldVerticalOffset")
    public String getShieldVerticalOffset() { return shieldVerticalOffset; }
    @JsonProperty("ShieldVerticalOffset")
    public void setShieldVerticalOffset(String value) { this.shieldVerticalOffset = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }
}
