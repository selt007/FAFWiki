package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ShieldGeneratorField {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String icon;
    private ImpactEffects impactEffects;
    private ImpactMesh impactMesh;
    private String maintenanceConsumptionPerSecondEnergy;
    private String mesh;
    private MeshZ meshZ;
    private String name;
    private String prerequisite;
    private String shieldEnergyDrainRechargeTime;
    private String shieldEnhancementNumber;
    private String shieldMaxHealth;
    private String shieldRechargeTime;
    private String shieldRegenRate;
    private String shieldRegenStartTime;
    private String shieldSize;
    private String shieldSpillOverDamageMod;
    private String shieldVerticalOffset;
    private Slot slot;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;
    private String[] hideBones;

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

    @JsonProperty("ImpactMesh")
    public ImpactMesh getImpactMesh() { return impactMesh; }
    @JsonProperty("ImpactMesh")
    public void setImpactMesh(ImpactMesh value) { this.impactMesh = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public String getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(String value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("Mesh")
    public String getMesh() { return mesh; }
    @JsonProperty("Mesh")
    public void setMesh(String value) { this.mesh = value; }

    @JsonProperty("MeshZ")
    public MeshZ getMeshZ() { return meshZ; }
    @JsonProperty("MeshZ")
    public void setMeshZ(MeshZ value) { this.meshZ = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public String getShieldEnergyDrainRechargeTime() { return shieldEnergyDrainRechargeTime; }
    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public void setShieldEnergyDrainRechargeTime(String value) { this.shieldEnergyDrainRechargeTime = value; }

    @JsonProperty("ShieldEnhancementNumber")
    public String getShieldEnhancementNumber() { return shieldEnhancementNumber; }
    @JsonProperty("ShieldEnhancementNumber")
    public void setShieldEnhancementNumber(String value) { this.shieldEnhancementNumber = value; }

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

    @JsonProperty("ShieldSize")
    public String getShieldSize() { return shieldSize; }
    @JsonProperty("ShieldSize")
    public void setShieldSize(String value) { this.shieldSize = value; }

    @JsonProperty("ShieldSpillOverDamageMod")
    public String getShieldSpillOverDamageMod() { return shieldSpillOverDamageMod; }
    @JsonProperty("ShieldSpillOverDamageMod")
    public void setShieldSpillOverDamageMod(String value) { this.shieldSpillOverDamageMod = value; }

    @JsonProperty("ShieldVerticalOffset")
    public String getShieldVerticalOffset() { return shieldVerticalOffset; }
    @JsonProperty("ShieldVerticalOffset")
    public void setShieldVerticalOffset(String value) { this.shieldVerticalOffset = value; }

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

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }
}
