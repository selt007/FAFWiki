package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AdditionalCapacitorRemove {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String[] hideBones;
    private String icon;
    private String name;
    private String prerequisite;
    private String[] removeEnhancements;
    private Slot slot;
    private Boolean removesLeftArm;
    private Boolean removesRightArm;
    private String newDamageRadius;
    private String newMaxRadius;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;
    private String[] showBones;
    private String enableWeapon;
    private String speedMulti;
    private String addHealth;
    private String addRegenRate;
    private String mesh;
    private String maintenanceConsumptionPerSecondEnergy;
    private String newJammerRadius;
    private Boolean createsLeftArm;

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

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("RemoveEnhancements")
    public String[] getRemoveEnhancements() { return removeEnhancements; }
    @JsonProperty("RemoveEnhancements")
    public void setRemoveEnhancements(String[] value) { this.removeEnhancements = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("RemovesLeftArm")
    public Boolean getRemovesLeftArm() { return removesLeftArm; }
    @JsonProperty("RemovesLeftArm")
    public void setRemovesLeftArm(Boolean value) { this.removesLeftArm = value; }

    @JsonProperty("RemovesRightArm")
    public Boolean getRemovesRightArm() { return removesRightArm; }
    @JsonProperty("RemovesRightArm")
    public void setRemovesRightArm(Boolean value) { this.removesRightArm = value; }

    @JsonProperty("NewDamageRadius")
    public String getNewDamageRadius() { return newDamageRadius; }
    @JsonProperty("NewDamageRadius")
    public void setNewDamageRadius(String value) { this.newDamageRadius = value; }

    @JsonProperty("NewMaxRadius")
    public String getNewMaxRadius() { return newMaxRadius; }
    @JsonProperty("NewMaxRadius")
    public void setNewMaxRadius(String value) { this.newMaxRadius = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("EnableWeapon")
    public String getEnableWeapon() { return enableWeapon; }
    @JsonProperty("EnableWeapon")
    public void setEnableWeapon(String value) { this.enableWeapon = value; }

    @JsonProperty("SpeedMulti")
    public String getSpeedMulti() { return speedMulti; }
    @JsonProperty("SpeedMulti")
    public void setSpeedMulti(String value) { this.speedMulti = value; }

    @JsonProperty("AddHealth")
    public String getAddHealth() { return addHealth; }
    @JsonProperty("AddHealth")
    public void setAddHealth(String value) { this.addHealth = value; }

    @JsonProperty("AddRegenRate")
    public String getAddRegenRate() { return addRegenRate; }
    @JsonProperty("AddRegenRate")
    public void setAddRegenRate(String value) { this.addRegenRate = value; }

    @JsonProperty("Mesh")
    public String getMesh() { return mesh; }
    @JsonProperty("Mesh")
    public void setMesh(String value) { this.mesh = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public String getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(String value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("NewJammerRadius")
    public String getNewJammerRadius() { return newJammerRadius; }
    @JsonProperty("NewJammerRadius")
    public void setNewJammerRadius(String value) { this.newJammerRadius = value; }

    @JsonProperty("CreatesLeftArm")
    public Boolean getCreatesLeftArm() { return createsLeftArm; }
    @JsonProperty("CreatesLeftArm")
    public void setCreatesLeftArm(Boolean value) { this.createsLeftArm = value; }
}
