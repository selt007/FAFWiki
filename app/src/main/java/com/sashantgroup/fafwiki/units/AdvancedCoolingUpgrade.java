package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class AdvancedCoolingUpgrade {
    private long buildCostEnergy;
    private String[] upgradeUnitAmbientBones;
    private String icon;
    private long buildCostMass;
    private String name;
    private Slot slot;
    private Double newRateOfFire;
    private double buildTime;
    private String prerequisite;
    private String[] removeEnhancements;
    private String[] hideBones;

    @JsonProperty("BuildCostEnergy")
    public long getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(long value) { this.buildCostEnergy = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

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

    @JsonProperty("NewRateOfFire")
    public Double getNewRateOfFire() { return newRateOfFire; }
    @JsonProperty("NewRateOfFire")
    public void setNewRateOfFire(Double value) { this.newRateOfFire = value; }

    @JsonProperty("BuildTime")
    public double getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(double value) { this.buildTime = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("RemoveEnhancements")
    public String[] getRemoveEnhancements() { return removeEnhancements; }
    @JsonProperty("RemoveEnhancements")
    public void setRemoveEnhancements(String[] value) { this.removeEnhancements = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }
}
