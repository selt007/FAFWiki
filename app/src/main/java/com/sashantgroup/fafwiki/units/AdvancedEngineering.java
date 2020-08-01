package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AdvancedEngineering {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String buildableCategoryAdds;
    private String icon;
    private String name;
    private String newBuildRate;
    private String newHealth;
    private String newRegenRate;
    private String[] showBones;
    private Slot slot;
    private String[] upgradeUnitAmbientBones;
    private String[] upgradeEffectBones;
    private String prerequisite;
    private Boolean createsRightArm;
    private String enableWeapon;
    private String[] hideBones;
    private String newRateOfFire;
    private String newMaxRadius;
    private String zephyrDamageMod;
    private String newDamageRadius;
    private String newOmniRadius;
    private String newVisionRadius;

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

    @JsonProperty("BuildableCategoryAdds")
    public String getBuildableCategoryAdds() { return buildableCategoryAdds; }
    @JsonProperty("BuildableCategoryAdds")
    public void setBuildableCategoryAdds(String value) { this.buildableCategoryAdds = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("NewBuildRate")
    public String getNewBuildRate() { return newBuildRate; }
    @JsonProperty("NewBuildRate")
    public void setNewBuildRate(String value) { this.newBuildRate = value; }

    @JsonProperty("NewHealth")
    public String getNewHealth() { return newHealth; }
    @JsonProperty("NewHealth")
    public void setNewHealth(String value) { this.newHealth = value; }

    @JsonProperty("NewRegenRate")
    public String getNewRegenRate() { return newRegenRate; }
    @JsonProperty("NewRegenRate")
    public void setNewRegenRate(String value) { this.newRegenRate = value; }

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

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("CreatesRightArm")
    public Boolean getCreatesRightArm() { return createsRightArm; }
    @JsonProperty("CreatesRightArm")
    public void setCreatesRightArm(Boolean value) { this.createsRightArm = value; }

    @JsonProperty("EnableWeapon")
    public String getEnableWeapon() { return enableWeapon; }
    @JsonProperty("EnableWeapon")
    public void setEnableWeapon(String value) { this.enableWeapon = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("NewRateOfFire")
    public String getNewRateOfFire() { return newRateOfFire; }
    @JsonProperty("NewRateOfFire")
    public void setNewRateOfFire(String value) { this.newRateOfFire = value; }

    @JsonProperty("NewMaxRadius")
    public String getNewMaxRadius() { return newMaxRadius; }
    @JsonProperty("NewMaxRadius")
    public void setNewMaxRadius(String value) { this.newMaxRadius = value; }

    @JsonProperty("ZephyrDamageMod")
    public String getZephyrDamageMod() { return zephyrDamageMod; }
    @JsonProperty("ZephyrDamageMod")
    public void setZephyrDamageMod(String value) { this.zephyrDamageMod = value; }

    @JsonProperty("NewDamageRadius")
    public String getNewDamageRadius() { return newDamageRadius; }
    @JsonProperty("NewDamageRadius")
    public void setNewDamageRadius(String value) { this.newDamageRadius = value; }

    @JsonProperty("NewOmniRadius")
    public String getNewOmniRadius() { return newOmniRadius; }
    @JsonProperty("NewOmniRadius")
    public void setNewOmniRadius(String value) { this.newOmniRadius = value; }

    @JsonProperty("NewVisionRadius")
    public String getNewVisionRadius() { return newVisionRadius; }
    @JsonProperty("NewVisionRadius")
    public void setNewVisionRadius(String value) { this.newVisionRadius = value; }
}
