package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class AdvancedEngineering {
    private Long newHealth;
    private Long newBuildRate;
    private String[] showBones;
    private String icon;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;
    private double buildTime;
    private String name;
    private String buildableCategoryAdds;
    private Slot slot;
    private long buildCostEnergy;
    private long buildCostMass;
    private Long newRegenRate;
    private String prerequisite;
    private Long maintenanceConsumptionPerSecondEnergy;
    private Long newMaxRadius;
    private Long newRateOfFire;
    private Long newOmniRadius;
    private Long newVisionRadius;
    private Double newDamageRadiusMod;
    private String[] removeEnhancements;
    private String[] hideBones;

    @JsonProperty("NewHealth")
    public Long getNewHealth() { return newHealth; }
    @JsonProperty("NewHealth")
    public void setNewHealth(Long value) { this.newHealth = value; }

    @JsonProperty("NewBuildRate")
    public Long getNewBuildRate() { return newBuildRate; }
    @JsonProperty("NewBuildRate")
    public void setNewBuildRate(Long value) { this.newBuildRate = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("BuildTime")
    public double getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(double value) { this.buildTime = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("BuildableCategoryAdds")
    public String getBuildableCategoryAdds() { return buildableCategoryAdds; }
    @JsonProperty("BuildableCategoryAdds")
    public void setBuildableCategoryAdds(String value) { this.buildableCategoryAdds = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("BuildCostEnergy")
    public long getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(long value) { this.buildCostEnergy = value; }

    @JsonProperty("BuildCostMass")
    public long getBuildCostMass() { return buildCostMass; }
    @JsonProperty("BuildCostMass")
    public void setBuildCostMass(long value) { this.buildCostMass = value; }

    @JsonProperty("NewRegenRate")
    public Long getNewRegenRate() { return newRegenRate; }
    @JsonProperty("NewRegenRate")
    public void setNewRegenRate(Long value) { this.newRegenRate = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public Long getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(Long value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("NewMaxRadius")
    public Long getNewMaxRadius() { return newMaxRadius; }
    @JsonProperty("NewMaxRadius")
    public void setNewMaxRadius(Long value) { this.newMaxRadius = value; }

    @JsonProperty("NewRateOfFire")
    public Long getNewRateOfFire() { return newRateOfFire; }
    @JsonProperty("NewRateOfFire")
    public void setNewRateOfFire(Long value) { this.newRateOfFire = value; }

    @JsonProperty("NewOmniRadius")
    public Long getNewOmniRadius() { return newOmniRadius; }
    @JsonProperty("NewOmniRadius")
    public void setNewOmniRadius(Long value) { this.newOmniRadius = value; }

    @JsonProperty("NewVisionRadius")
    public Long getNewVisionRadius() { return newVisionRadius; }
    @JsonProperty("NewVisionRadius")
    public void setNewVisionRadius(Long value) { this.newVisionRadius = value; }

    @JsonProperty("NewDamageRadiusMod")
    public Double getNewDamageRadiusMod() { return newDamageRadiusMod; }
    @JsonProperty("NewDamageRadiusMod")
    public void setNewDamageRadiusMod(Double value) { this.newDamageRadiusMod = value; }

    @JsonProperty("RemoveEnhancements")
    public String[] getRemoveEnhancements() { return removeEnhancements; }
    @JsonProperty("RemoveEnhancements")
    public void setRemoveEnhancements(String[] value) { this.removeEnhancements = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }
}
