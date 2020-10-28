package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Economy {
    private long buildCostMass;
    private double buildCostEnergy;
    private long buildTime;
    private Double buildRate;
    private String[] buildableCategory;
    private Long maintenanceConsumptionPerSecondEnergy;
    private Boolean differentialUpgradeCostCalculation;
    private String[] rebuildBonusIDS;
    private Long storageEnergy;
    private Long storageMass;
    private Long teleportMassMod;
    private Double teleportTimeMod;
    private Double teleportEnergyMod;
    private Double sacrificeEnergyMult;
    private Double sacrificeMassMult;
    private Boolean needToFaceTargetToBuild;
    private Long maxBuildDistance;
    private Long initialRallyX;
    private Long initialRallyZ;
    private Long productionPerSecondEnergy;
    private Boolean naturalProducer;
    private Long productionPerSecondMass;
    private Long adjacentStructureEnergyMod;
    private Long adjacentEnergyProductionMod;
    private Double adjacentMassProductionMod;
    private Long maxMass;
    private Long maxEnergy;
    private Long initialRemoteViewingEnergyDrain;
    private Long buildRadius;
    private EngineeringPod[] engineeringPods;
    private Long minBuildTime;
    private Long consumptionPerSecondMass;
    private Long consumptionPerSecondEnergy;
    private String buildUnit;

    @JsonProperty("BuildCostMass")
    public long getBuildCostMass() { return buildCostMass; }
    @JsonProperty("BuildCostMass")
    public void setBuildCostMass(long value) { this.buildCostMass = value; }

    @JsonProperty("BuildCostEnergy")
    public double getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(double value) { this.buildCostEnergy = value; }

    @JsonProperty("BuildTime")
    public long getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(long value) { this.buildTime = value; }

    @JsonProperty("BuildRate")
    public Double getBuildRate() { return buildRate; }
    @JsonProperty("BuildRate")
    public void setBuildRate(Double value) { this.buildRate = value; }

    @JsonProperty("BuildableCategory")
    public String[] getBuildableCategory() { return buildableCategory; }
    @JsonProperty("BuildableCategory")
    public void setBuildableCategory(String[] value) { this.buildableCategory = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public Long getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(Long value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("DifferentialUpgradeCostCalculation")
    public Boolean getDifferentialUpgradeCostCalculation() { return differentialUpgradeCostCalculation; }
    @JsonProperty("DifferentialUpgradeCostCalculation")
    public void setDifferentialUpgradeCostCalculation(Boolean value) { this.differentialUpgradeCostCalculation = value; }

    @JsonProperty("RebuildBonusIds")
    public String[] getRebuildBonusIDS() { return rebuildBonusIDS; }
    @JsonProperty("RebuildBonusIds")
    public void setRebuildBonusIDS(String[] value) { this.rebuildBonusIDS = value; }

    @JsonProperty("StorageEnergy")
    public Long getStorageEnergy() { return storageEnergy; }
    @JsonProperty("StorageEnergy")
    public void setStorageEnergy(Long value) { this.storageEnergy = value; }

    @JsonProperty("StorageMass")
    public Long getStorageMass() { return storageMass; }
    @JsonProperty("StorageMass")
    public void setStorageMass(Long value) { this.storageMass = value; }

    @JsonProperty("TeleportMassMod")
    public Long getTeleportMassMod() { return teleportMassMod; }
    @JsonProperty("TeleportMassMod")
    public void setTeleportMassMod(Long value) { this.teleportMassMod = value; }

    @JsonProperty("TeleportTimeMod")
    public Double getTeleportTimeMod() { return teleportTimeMod; }
    @JsonProperty("TeleportTimeMod")
    public void setTeleportTimeMod(Double value) { this.teleportTimeMod = value; }

    @JsonProperty("TeleportEnergyMod")
    public Double getTeleportEnergyMod() { return teleportEnergyMod; }
    @JsonProperty("TeleportEnergyMod")
    public void setTeleportEnergyMod(Double value) { this.teleportEnergyMod = value; }

    @JsonProperty("SacrificeEnergyMult")
    public Double getSacrificeEnergyMult() { return sacrificeEnergyMult; }
    @JsonProperty("SacrificeEnergyMult")
    public void setSacrificeEnergyMult(Double value) { this.sacrificeEnergyMult = value; }

    @JsonProperty("SacrificeMassMult")
    public Double getSacrificeMassMult() { return sacrificeMassMult; }
    @JsonProperty("SacrificeMassMult")
    public void setSacrificeMassMult(Double value) { this.sacrificeMassMult = value; }

    @JsonProperty("NeedToFaceTargetToBuild")
    public Boolean getNeedToFaceTargetToBuild() { return needToFaceTargetToBuild; }
    @JsonProperty("NeedToFaceTargetToBuild")
    public void setNeedToFaceTargetToBuild(Boolean value) { this.needToFaceTargetToBuild = value; }

    @JsonProperty("MaxBuildDistance")
    public Long getMaxBuildDistance() { return maxBuildDistance; }
    @JsonProperty("MaxBuildDistance")
    public void setMaxBuildDistance(Long value) { this.maxBuildDistance = value; }

    @JsonProperty("InitialRallyX")
    public Long getInitialRallyX() { return initialRallyX; }
    @JsonProperty("InitialRallyX")
    public void setInitialRallyX(Long value) { this.initialRallyX = value; }

    @JsonProperty("InitialRallyZ")
    public Long getInitialRallyZ() { return initialRallyZ; }
    @JsonProperty("InitialRallyZ")
    public void setInitialRallyZ(Long value) { this.initialRallyZ = value; }

    @JsonProperty("ProductionPerSecondEnergy")
    public Long getProductionPerSecondEnergy() { return productionPerSecondEnergy; }
    @JsonProperty("ProductionPerSecondEnergy")
    public void setProductionPerSecondEnergy(Long value) { this.productionPerSecondEnergy = value; }

    @JsonProperty("NaturalProducer")
    public Boolean getNaturalProducer() { return naturalProducer; }
    @JsonProperty("NaturalProducer")
    public void setNaturalProducer(Boolean value) { this.naturalProducer = value; }

    @JsonProperty("ProductionPerSecondMass")
    public Long getProductionPerSecondMass() { return productionPerSecondMass; }
    @JsonProperty("ProductionPerSecondMass")
    public void setProductionPerSecondMass(Long value) { this.productionPerSecondMass = value; }

    @JsonProperty("AdjacentStructureEnergyMod")
    public Long getAdjacentStructureEnergyMod() { return adjacentStructureEnergyMod; }
    @JsonProperty("AdjacentStructureEnergyMod")
    public void setAdjacentStructureEnergyMod(Long value) { this.adjacentStructureEnergyMod = value; }

    @JsonProperty("AdjacentEnergyProductionMod")
    public Long getAdjacentEnergyProductionMod() { return adjacentEnergyProductionMod; }
    @JsonProperty("AdjacentEnergyProductionMod")
    public void setAdjacentEnergyProductionMod(Long value) { this.adjacentEnergyProductionMod = value; }

    @JsonProperty("AdjacentMassProductionMod")
    public Double getAdjacentMassProductionMod() { return adjacentMassProductionMod; }
    @JsonProperty("AdjacentMassProductionMod")
    public void setAdjacentMassProductionMod(Double value) { this.adjacentMassProductionMod = value; }

    @JsonProperty("MaxMass")
    public Long getMaxMass() { return maxMass; }
    @JsonProperty("MaxMass")
    public void setMaxMass(Long value) { this.maxMass = value; }

    @JsonProperty("MaxEnergy")
    public Long getMaxEnergy() { return maxEnergy; }
    @JsonProperty("MaxEnergy")
    public void setMaxEnergy(Long value) { this.maxEnergy = value; }

    @JsonProperty("InitialRemoteViewingEnergyDrain")
    public Long getInitialRemoteViewingEnergyDrain() { return initialRemoteViewingEnergyDrain; }
    @JsonProperty("InitialRemoteViewingEnergyDrain")
    public void setInitialRemoteViewingEnergyDrain(Long value) { this.initialRemoteViewingEnergyDrain = value; }

    @JsonProperty("BuildRadius")
    public Long getBuildRadius() { return buildRadius; }
    @JsonProperty("BuildRadius")
    public void setBuildRadius(Long value) { this.buildRadius = value; }

    @JsonProperty("EngineeringPods")
    public EngineeringPod[] getEngineeringPods() { return engineeringPods; }
    @JsonProperty("EngineeringPods")
    public void setEngineeringPods(EngineeringPod[] value) { this.engineeringPods = value; }

    @JsonProperty("MinBuildTime")
    public Long getMinBuildTime() { return minBuildTime; }
    @JsonProperty("MinBuildTime")
    public void setMinBuildTime(Long value) { this.minBuildTime = value; }

    @JsonProperty("ConsumptionPerSecondMass")
    public Long getConsumptionPerSecondMass() { return consumptionPerSecondMass; }
    @JsonProperty("ConsumptionPerSecondMass")
    public void setConsumptionPerSecondMass(Long value) { this.consumptionPerSecondMass = value; }

    @JsonProperty("ConsumptionPerSecondEnergy")
    public Long getConsumptionPerSecondEnergy() { return consumptionPerSecondEnergy; }
    @JsonProperty("ConsumptionPerSecondEnergy")
    public void setConsumptionPerSecondEnergy(Long value) { this.consumptionPerSecondEnergy = value; }

    @JsonProperty("BuildUnit")
    public String getBuildUnit() { return buildUnit; }
    @JsonProperty("BuildUnit")
    public void setBuildUnit(String value) { this.buildUnit = value; }
}
