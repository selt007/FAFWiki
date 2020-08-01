package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class BlastAttack {
    private String additionalDamage;
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String icon;
    private String name;
    private String newDamageRadius;
    private String[] showBones;
    private Slot slot;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;
    private String speedMulti;
    private String[] hideBones;
    private String newMaxRadius;
    private String newRateOfFire;
    private String prerequisite;
    private String[] removeEnhancements;
    private String newBuildRate;
    private String addBuildRate;
    private Boolean createsLeftArm;
    private Boolean removeBuildRestrictions;
    private Boolean removesLeftArm;
    private Boolean createsRightArm;
    private Boolean removesRightArm;
    private String newOmniRadius;
    private String newVisionRadius;
    private String newDamageMod;
    private String enableWeapon;
    private String the0;
    private String newDamageRadiusMod;
    private String maintenanceConsumptionPerSecondEnergy;
    private String newRegenRate;

    @JsonProperty("AdditionalDamage")
    public String getAdditionalDamage() { return additionalDamage; }
    @JsonProperty("AdditionalDamage")
    public void setAdditionalDamage(String value) { this.additionalDamage = value; }

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

    @JsonProperty("NewDamageRadius")
    public String getNewDamageRadius() { return newDamageRadius; }
    @JsonProperty("NewDamageRadius")
    public void setNewDamageRadius(String value) { this.newDamageRadius = value; }

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

    @JsonProperty("SpeedMulti")
    public String getSpeedMulti() { return speedMulti; }
    @JsonProperty("SpeedMulti")
    public void setSpeedMulti(String value) { this.speedMulti = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("NewMaxRadius")
    public String getNewMaxRadius() { return newMaxRadius; }
    @JsonProperty("NewMaxRadius")
    public void setNewMaxRadius(String value) { this.newMaxRadius = value; }

    @JsonProperty("NewRateOfFire")
    public String getNewRateOfFire() { return newRateOfFire; }
    @JsonProperty("NewRateOfFire")
    public void setNewRateOfFire(String value) { this.newRateOfFire = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("RemoveEnhancements")
    public String[] getRemoveEnhancements() { return removeEnhancements; }
    @JsonProperty("RemoveEnhancements")
    public void setRemoveEnhancements(String[] value) { this.removeEnhancements = value; }

    @JsonProperty("NewBuildRate")
    public String getNewBuildRate() { return newBuildRate; }
    @JsonProperty("NewBuildRate")
    public void setNewBuildRate(String value) { this.newBuildRate = value; }

    @JsonProperty("AddBuildRate")
    public String getAddBuildRate() { return addBuildRate; }
    @JsonProperty("AddBuildRate")
    public void setAddBuildRate(String value) { this.addBuildRate = value; }

    @JsonProperty("CreatesLeftArm")
    public Boolean getCreatesLeftArm() { return createsLeftArm; }
    @JsonProperty("CreatesLeftArm")
    public void setCreatesLeftArm(Boolean value) { this.createsLeftArm = value; }

    @JsonProperty("RemoveBuildRestrictions")
    public Boolean getRemoveBuildRestrictions() { return removeBuildRestrictions; }
    @JsonProperty("RemoveBuildRestrictions")
    public void setRemoveBuildRestrictions(Boolean value) { this.removeBuildRestrictions = value; }

    @JsonProperty("RemovesLeftArm")
    public Boolean getRemovesLeftArm() { return removesLeftArm; }
    @JsonProperty("RemovesLeftArm")
    public void setRemovesLeftArm(Boolean value) { this.removesLeftArm = value; }

    @JsonProperty("CreatesRightArm")
    public Boolean getCreatesRightArm() { return createsRightArm; }
    @JsonProperty("CreatesRightArm")
    public void setCreatesRightArm(Boolean value) { this.createsRightArm = value; }

    @JsonProperty("RemovesRightArm")
    public Boolean getRemovesRightArm() { return removesRightArm; }
    @JsonProperty("RemovesRightArm")
    public void setRemovesRightArm(Boolean value) { this.removesRightArm = value; }

    @JsonProperty("NewOmniRadius")
    public String getNewOmniRadius() { return newOmniRadius; }
    @JsonProperty("NewOmniRadius")
    public void setNewOmniRadius(String value) { this.newOmniRadius = value; }

    @JsonProperty("NewVisionRadius")
    public String getNewVisionRadius() { return newVisionRadius; }
    @JsonProperty("NewVisionRadius")
    public void setNewVisionRadius(String value) { this.newVisionRadius = value; }

    @JsonProperty("NewDamageMod")
    public String getNewDamageMod() { return newDamageMod; }
    @JsonProperty("NewDamageMod")
    public void setNewDamageMod(String value) { this.newDamageMod = value; }

    @JsonProperty("EnableWeapon")
    public String getEnableWeapon() { return enableWeapon; }
    @JsonProperty("EnableWeapon")
    public void setEnableWeapon(String value) { this.enableWeapon = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("NewDamageRadiusMod")
    public String getNewDamageRadiusMod() { return newDamageRadiusMod; }
    @JsonProperty("NewDamageRadiusMod")
    public void setNewDamageRadiusMod(String value) { this.newDamageRadiusMod = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public String getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(String value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("NewRegenRate")
    public String getNewRegenRate() { return newRegenRate; }
    @JsonProperty("NewRegenRate")
    public void setNewRegenRate(String value) { this.newRegenRate = value; }
}
