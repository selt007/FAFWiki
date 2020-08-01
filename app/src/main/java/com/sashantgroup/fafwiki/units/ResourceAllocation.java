package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ResourceAllocation {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private ResourceAllocationIcon icon;
    private String name;
    private String productionPerSecondEnergy;
    private String productionPerSecondMass;
    private String[] showBones;
    private Slot slot;
    private String[] upgradeUnitAmbientBones;
    private String[] upgradeEffectBones;
    private String newDeathWeapon;
    private String storageEnergy;
    private String storageMass;
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
    public ResourceAllocationIcon getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(ResourceAllocationIcon value) { this.icon = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("ProductionPerSecondEnergy")
    public String getProductionPerSecondEnergy() { return productionPerSecondEnergy; }
    @JsonProperty("ProductionPerSecondEnergy")
    public void setProductionPerSecondEnergy(String value) { this.productionPerSecondEnergy = value; }

    @JsonProperty("ProductionPerSecondMass")
    public String getProductionPerSecondMass() { return productionPerSecondMass; }
    @JsonProperty("ProductionPerSecondMass")
    public void setProductionPerSecondMass(String value) { this.productionPerSecondMass = value; }

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

    @JsonProperty("NewDeathWeapon")
    public String getNewDeathWeapon() { return newDeathWeapon; }
    @JsonProperty("NewDeathWeapon")
    public void setNewDeathWeapon(String value) { this.newDeathWeapon = value; }

    @JsonProperty("StorageEnergy")
    public String getStorageEnergy() { return storageEnergy; }
    @JsonProperty("StorageEnergy")
    public void setStorageEnergy(String value) { this.storageEnergy = value; }

    @JsonProperty("StorageMass")
    public String getStorageMass() { return storageMass; }
    @JsonProperty("StorageMass")
    public void setStorageMass(String value) { this.storageMass = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }
}
