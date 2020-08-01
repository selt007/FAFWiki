package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RegenAura {
    private String acuAddHealth;
    private String buildCostEnergy;
    private String buildCostMass;
    private String buildTime;
    private String icon;
    private String name;
    private String prerequisite;
    private String radius;
    private String maxHealthFactor;
    private String regenCeiling;
    private String regenPerSecond;
    private Slot slot;
    private String unitCategory;
    private String[] upgradeEffectBones;
    private String[] upgradeUnitAmbientBones;
    private String[] showBones;

    @JsonProperty("ACUAddHealth")
    public String getAcuAddHealth() { return acuAddHealth; }
    @JsonProperty("ACUAddHealth")
    public void setAcuAddHealth(String value) { this.acuAddHealth = value; }

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

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }

    @JsonProperty("MaxHealthFactor")
    public String getMaxHealthFactor() { return maxHealthFactor; }
    @JsonProperty("MaxHealthFactor")
    public void setMaxHealthFactor(String value) { this.maxHealthFactor = value; }

    @JsonProperty("RegenCeiling")
    public String getRegenCeiling() { return regenCeiling; }
    @JsonProperty("RegenCeiling")
    public void setRegenCeiling(String value) { this.regenCeiling = value; }

    @JsonProperty("RegenPerSecond")
    public String getRegenPerSecond() { return regenPerSecond; }
    @JsonProperty("RegenPerSecond")
    public void setRegenPerSecond(String value) { this.regenPerSecond = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("UnitCategory")
    public String getUnitCategory() { return unitCategory; }
    @JsonProperty("UnitCategory")
    public void setUnitCategory(String value) { this.unitCategory = value; }

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
}
