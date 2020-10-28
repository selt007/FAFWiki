package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class AdvancedCoolingUpgradeRemove {
    private long buildCostEnergy;
    private String[] hideBones;
    private String icon;
    private String[] removeEnhancements;
    private long buildCostMass;
    private String name;
    private Slot slot;
    private String prerequisite;
    private double buildTime;
    private String[] upgradeUnitAmbientBones;
    private Long newBuildRate;
    private String[] upgradeEffectBones;
    private Long newDamageMod;
    private Long newMaxRadius;
    private Long newRateOfFire;
    private String[] showBones;
    private Long zephyrDamageMod;
    private Long newDamageRadius;
    private Long maintenanceConsumptionPerSecondEnergy;
    private Long newJammerRadius;
    private Long productionPerSecondEnergy;
    private Long productionPerSecondMass;
    private Long newRegenRate;
    private Long newOmniRadius;
    private Long newVisionRadius;

    @JsonProperty("BuildCostEnergy")
    public long getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(long value) { this.buildCostEnergy = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("RemoveEnhancements")
    public String[] getRemoveEnhancements() { return removeEnhancements; }
    @JsonProperty("RemoveEnhancements")
    public void setRemoveEnhancements(String[] value) { this.removeEnhancements = value; }

    @JsonProperty("BuildCostMass")
    public long getBuildCostMass() { return buildCostMass; }
    @JsonProperty("BuildCostMass")
    public void setBuildCostMass(long value) { this.buildCostMass = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("BuildTime")
    public double getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(double value) { this.buildTime = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("NewBuildRate")
    public Long getNewBuildRate() { return newBuildRate; }
    @JsonProperty("NewBuildRate")
    public void setNewBuildRate(Long value) { this.newBuildRate = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("NewDamageMod")
    public Long getNewDamageMod() { return newDamageMod; }
    @JsonProperty("NewDamageMod")
    public void setNewDamageMod(Long value) { this.newDamageMod = value; }

    @JsonProperty("NewMaxRadius")
    public Long getNewMaxRadius() { return newMaxRadius; }
    @JsonProperty("NewMaxRadius")
    public void setNewMaxRadius(Long value) { this.newMaxRadius = value; }

    @JsonProperty("NewRateOfFire")
    public Long getNewRateOfFire() { return newRateOfFire; }
    @JsonProperty("NewRateOfFire")
    public void setNewRateOfFire(Long value) { this.newRateOfFire = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("ZephyrDamageMod")
    public Long getZephyrDamageMod() { return zephyrDamageMod; }
    @JsonProperty("ZephyrDamageMod")
    public void setZephyrDamageMod(Long value) { this.zephyrDamageMod = value; }

    @JsonProperty("NewDamageRadius")
    public Long getNewDamageRadius() { return newDamageRadius; }
    @JsonProperty("NewDamageRadius")
    public void setNewDamageRadius(Long value) { this.newDamageRadius = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public Long getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(Long value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("NewJammerRadius")
    public Long getNewJammerRadius() { return newJammerRadius; }
    @JsonProperty("NewJammerRadius")
    public void setNewJammerRadius(Long value) { this.newJammerRadius = value; }

    @JsonProperty("ProductionPerSecondEnergy")
    public Long getProductionPerSecondEnergy() { return productionPerSecondEnergy; }
    @JsonProperty("ProductionPerSecondEnergy")
    public void setProductionPerSecondEnergy(Long value) { this.productionPerSecondEnergy = value; }

    @JsonProperty("ProductionPerSecondMass")
    public Long getProductionPerSecondMass() { return productionPerSecondMass; }
    @JsonProperty("ProductionPerSecondMass")
    public void setProductionPerSecondMass(Long value) { this.productionPerSecondMass = value; }

    @JsonProperty("NewRegenRate")
    public Long getNewRegenRate() { return newRegenRate; }
    @JsonProperty("NewRegenRate")
    public void setNewRegenRate(Long value) { this.newRegenRate = value; }

    @JsonProperty("NewOmniRadius")
    public Long getNewOmniRadius() { return newOmniRadius; }
    @JsonProperty("NewOmniRadius")
    public void setNewOmniRadius(Long value) { this.newOmniRadius = value; }

    @JsonProperty("NewVisionRadius")
    public Long getNewVisionRadius() { return newVisionRadius; }
    @JsonProperty("NewVisionRadius")
    public void setNewVisionRadius(Long value) { this.newVisionRadius = value; }
}
