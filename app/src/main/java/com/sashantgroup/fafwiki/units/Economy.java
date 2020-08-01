package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Economy {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String teleportEnergyMod;
    private String teleportMassMod;
    private String teleportTimeMod;
    private String buildRate;
    private String[] buildableCategory;
    private String[] rebuildBonusIDS;
    private String storageEnergy;
    private String storageMass;
    private String initialRallyX;
    private String initialRallyZ;
    private Boolean differentialUpgradeCostCalculation;
    private String adjacentStructureEnergyMod;
    private String productionPerSecondEnergy;
    private String maintenanceConsumptionPerSecondEnergy;
    private String productionPerSecondMass;
    private String adjacentEnergyProductionMod;
    private String adjacentMassProductionMod;
    private String the0;
    private String maxBuildDistance;
    private Boolean naturalProducer;
    private Boolean needToFaceTargetToBuild;
    private String sacrificeEnergyMult;
    private String sacrificeMassMult;
    private String buildRadius;
    private String minBuildTime;
    private String consumptionPerSecondEnergy;
    private String consumptionPerSecondMass;
    private String maxEnergy;
    private String maxMass;
    private String initialRemoteViewingEnergyDrain;
    private EngineeringPods engineeringPods;
    private String buildUnit;

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

    @JsonProperty("TeleportEnergyMod")
    public String getTeleportEnergyMod() { return teleportEnergyMod; }
    @JsonProperty("TeleportEnergyMod")
    public void setTeleportEnergyMod(String value) { this.teleportEnergyMod = value; }

    @JsonProperty("TeleportMassMod")
    public String getTeleportMassMod() { return teleportMassMod; }
    @JsonProperty("TeleportMassMod")
    public void setTeleportMassMod(String value) { this.teleportMassMod = value; }

    @JsonProperty("TeleportTimeMod")
    public String getTeleportTimeMod() { return teleportTimeMod; }
    @JsonProperty("TeleportTimeMod")
    public void setTeleportTimeMod(String value) { this.teleportTimeMod = value; }

    @JsonProperty("BuildRate")
    public String getBuildRate() { return buildRate; }
    @JsonProperty("BuildRate")
    public void setBuildRate(String value) { this.buildRate = value; }

    @JsonProperty("BuildableCategory")
    public String[] getBuildableCategory() { return buildableCategory; }
    @JsonProperty("BuildableCategory")
    public void setBuildableCategory(String[] value) { this.buildableCategory = value; }

    @JsonProperty("RebuildBonusIds")
    public String[] getRebuildBonusIDS() { return rebuildBonusIDS; }
    @JsonProperty("RebuildBonusIds")
    public void setRebuildBonusIDS(String[] value) { this.rebuildBonusIDS = value; }

    @JsonProperty("StorageEnergy")
    public String getStorageEnergy() { return storageEnergy; }
    @JsonProperty("StorageEnergy")
    public void setStorageEnergy(String value) { this.storageEnergy = value; }

    @JsonProperty("StorageMass")
    public String getStorageMass() { return storageMass; }
    @JsonProperty("StorageMass")
    public void setStorageMass(String value) { this.storageMass = value; }

    @JsonProperty("InitialRallyX")
    public String getInitialRallyX() { return initialRallyX; }
    @JsonProperty("InitialRallyX")
    public void setInitialRallyX(String value) { this.initialRallyX = value; }

    @JsonProperty("InitialRallyZ")
    public String getInitialRallyZ() { return initialRallyZ; }
    @JsonProperty("InitialRallyZ")
    public void setInitialRallyZ(String value) { this.initialRallyZ = value; }

    @JsonProperty("DifferentialUpgradeCostCalculation")
    public Boolean getDifferentialUpgradeCostCalculation() { return differentialUpgradeCostCalculation; }
    @JsonProperty("DifferentialUpgradeCostCalculation")
    public void setDifferentialUpgradeCostCalculation(Boolean value) { this.differentialUpgradeCostCalculation = value; }

    @JsonProperty("AdjacentStructureEnergyMod")
    public String getAdjacentStructureEnergyMod() { return adjacentStructureEnergyMod; }
    @JsonProperty("AdjacentStructureEnergyMod")
    public void setAdjacentStructureEnergyMod(String value) { this.adjacentStructureEnergyMod = value; }

    @JsonProperty("ProductionPerSecondEnergy")
    public String getProductionPerSecondEnergy() { return productionPerSecondEnergy; }
    @JsonProperty("ProductionPerSecondEnergy")
    public void setProductionPerSecondEnergy(String value) { this.productionPerSecondEnergy = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public String getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(String value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("ProductionPerSecondMass")
    public String getProductionPerSecondMass() { return productionPerSecondMass; }
    @JsonProperty("ProductionPerSecondMass")
    public void setProductionPerSecondMass(String value) { this.productionPerSecondMass = value; }

    @JsonProperty("AdjacentEnergyProductionMod")
    public String getAdjacentEnergyProductionMod() { return adjacentEnergyProductionMod; }
    @JsonProperty("AdjacentEnergyProductionMod")
    public void setAdjacentEnergyProductionMod(String value) { this.adjacentEnergyProductionMod = value; }

    @JsonProperty("AdjacentMassProductionMod")
    public String getAdjacentMassProductionMod() { return adjacentMassProductionMod; }
    @JsonProperty("AdjacentMassProductionMod")
    public void setAdjacentMassProductionMod(String value) { this.adjacentMassProductionMod = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("MaxBuildDistance")
    public String getMaxBuildDistance() { return maxBuildDistance; }
    @JsonProperty("MaxBuildDistance")
    public void setMaxBuildDistance(String value) { this.maxBuildDistance = value; }

    @JsonProperty("NaturalProducer")
    public Boolean getNaturalProducer() { return naturalProducer; }
    @JsonProperty("NaturalProducer")
    public void setNaturalProducer(Boolean value) { this.naturalProducer = value; }

    @JsonProperty("NeedToFaceTargetToBuild")
    public Boolean getNeedToFaceTargetToBuild() { return needToFaceTargetToBuild; }
    @JsonProperty("NeedToFaceTargetToBuild")
    public void setNeedToFaceTargetToBuild(Boolean value) { this.needToFaceTargetToBuild = value; }

    @JsonProperty("SacrificeEnergyMult")
    public String getSacrificeEnergyMult() { return sacrificeEnergyMult; }
    @JsonProperty("SacrificeEnergyMult")
    public void setSacrificeEnergyMult(String value) { this.sacrificeEnergyMult = value; }

    @JsonProperty("SacrificeMassMult")
    public String getSacrificeMassMult() { return sacrificeMassMult; }
    @JsonProperty("SacrificeMassMult")
    public void setSacrificeMassMult(String value) { this.sacrificeMassMult = value; }

    @JsonProperty("BuildRadius")
    public String getBuildRadius() { return buildRadius; }
    @JsonProperty("BuildRadius")
    public void setBuildRadius(String value) { this.buildRadius = value; }

    @JsonProperty("MinBuildTime")
    public String getMinBuildTime() { return minBuildTime; }
    @JsonProperty("MinBuildTime")
    public void setMinBuildTime(String value) { this.minBuildTime = value; }

    @JsonProperty("ConsumptionPerSecondEnergy")
    public String getConsumptionPerSecondEnergy() { return consumptionPerSecondEnergy; }
    @JsonProperty("ConsumptionPerSecondEnergy")
    public void setConsumptionPerSecondEnergy(String value) { this.consumptionPerSecondEnergy = value; }

    @JsonProperty("ConsumptionPerSecondMass")
    public String getConsumptionPerSecondMass() { return consumptionPerSecondMass; }
    @JsonProperty("ConsumptionPerSecondMass")
    public void setConsumptionPerSecondMass(String value) { this.consumptionPerSecondMass = value; }

    @JsonProperty("MaxEnergy")
    public String getMaxEnergy() { return maxEnergy; }
    @JsonProperty("MaxEnergy")
    public void setMaxEnergy(String value) { this.maxEnergy = value; }

    @JsonProperty("MaxMass")
    public String getMaxMass() { return maxMass; }
    @JsonProperty("MaxMass")
    public void setMaxMass(String value) { this.maxMass = value; }

    @JsonProperty("InitialRemoteViewingEnergyDrain")
    public String getInitialRemoteViewingEnergyDrain() { return initialRemoteViewingEnergyDrain; }
    @JsonProperty("InitialRemoteViewingEnergyDrain")
    public void setInitialRemoteViewingEnergyDrain(String value) { this.initialRemoteViewingEnergyDrain = value; }

    @JsonProperty("EngineeringPods")
    public EngineeringPods getEngineeringPods() { return engineeringPods; }
    @JsonProperty("EngineeringPods")
    public void setEngineeringPods(EngineeringPods value) { this.engineeringPods = value; }

    @JsonProperty("BuildUnit")
    public String getBuildUnit() { return buildUnit; }
    @JsonProperty("BuildUnit")
    public void setBuildUnit(String value) { this.buildUnit = value; }
}
