package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DoubleGuns {
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String icon;
    private String name;
    private String newDamageDuringCapacitor;
    private String newDamageRadiusDuringCapacitor;
    private String newDoTPulsesDuringCapacitor;
    private String newDoTTimeDuringCapacitor;
    private String newInitialDamageDuringCapacitor;
    private String[] showBones;
    private Boolean overchargeIncluded;
    private String prerequisite;
    private Slot slot;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;
    private String newMaxRadius;
    private String newProjectileIDDuringCapacitor;
    private String rateOfFireMulti;
    private String newDamage;

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

    @JsonProperty("NewDamageDuringCapacitor")
    public String getNewDamageDuringCapacitor() { return newDamageDuringCapacitor; }
    @JsonProperty("NewDamageDuringCapacitor")
    public void setNewDamageDuringCapacitor(String value) { this.newDamageDuringCapacitor = value; }

    @JsonProperty("NewDamageRadiusDuringCapacitor")
    public String getNewDamageRadiusDuringCapacitor() { return newDamageRadiusDuringCapacitor; }
    @JsonProperty("NewDamageRadiusDuringCapacitor")
    public void setNewDamageRadiusDuringCapacitor(String value) { this.newDamageRadiusDuringCapacitor = value; }

    @JsonProperty("NewDoTPulsesDuringCapacitor")
    public String getNewDoTPulsesDuringCapacitor() { return newDoTPulsesDuringCapacitor; }
    @JsonProperty("NewDoTPulsesDuringCapacitor")
    public void setNewDoTPulsesDuringCapacitor(String value) { this.newDoTPulsesDuringCapacitor = value; }

    @JsonProperty("NewDoTTimeDuringCapacitor")
    public String getNewDoTTimeDuringCapacitor() { return newDoTTimeDuringCapacitor; }
    @JsonProperty("NewDoTTimeDuringCapacitor")
    public void setNewDoTTimeDuringCapacitor(String value) { this.newDoTTimeDuringCapacitor = value; }

    @JsonProperty("NewInitialDamageDuringCapacitor")
    public String getNewInitialDamageDuringCapacitor() { return newInitialDamageDuringCapacitor; }
    @JsonProperty("NewInitialDamageDuringCapacitor")
    public void setNewInitialDamageDuringCapacitor(String value) { this.newInitialDamageDuringCapacitor = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("OverchargeIncluded")
    public Boolean getOverchargeIncluded() { return overchargeIncluded; }
    @JsonProperty("OverchargeIncluded")
    public void setOverchargeIncluded(Boolean value) { this.overchargeIncluded = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

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

    @JsonProperty("NewMaxRadius")
    public String getNewMaxRadius() { return newMaxRadius; }
    @JsonProperty("NewMaxRadius")
    public void setNewMaxRadius(String value) { this.newMaxRadius = value; }

    @JsonProperty("NewProjectileIdDuringCapacitor")
    public String getNewProjectileIDDuringCapacitor() { return newProjectileIDDuringCapacitor; }
    @JsonProperty("NewProjectileIdDuringCapacitor")
    public void setNewProjectileIDDuringCapacitor(String value) { this.newProjectileIDDuringCapacitor = value; }

    @JsonProperty("RateOfFireMulti")
    public String getRateOfFireMulti() { return rateOfFireMulti; }
    @JsonProperty("RateOfFireMulti")
    public void setRateOfFireMulti(String value) { this.rateOfFireMulti = value; }

    @JsonProperty("NewDamage")
    public String getNewDamage() { return newDamage; }
    @JsonProperty("NewDamage")
    public void setNewDamage(String value) { this.newDamage = value; }
}
