package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class RegenAura {
    private long buildTime;
    private long buildCostEnergy;
    private String[] upgradeEffectBones;
    private long acuAddHealth;
    private long regenCeilingSCU;
    private double maxHealthFactor;
    private long regenFloor;
    private String[] upgradeUnitAmbientBones;
    private long radius;
    private String unitCategory;
    private long buildCostMass;
    private Slot slot;
    private String prerequisite;
    private long regenCeilingT1;
    private long regenCeilingT4;
    private double regenPerSecond;
    private long regenCeilingT3;
    private String icon;
    private long regenCeilingT2;
    private String name;
    private String[] showBones;

    @JsonProperty("BuildTime")
    public long getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(long value) { this.buildTime = value; }

    @JsonProperty("BuildCostEnergy")
    public long getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(long value) { this.buildCostEnergy = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("ACUAddHealth")
    public long getAcuAddHealth() { return acuAddHealth; }
    @JsonProperty("ACUAddHealth")
    public void setAcuAddHealth(long value) { this.acuAddHealth = value; }

    @JsonProperty("RegenCeilingSCU")
    public long getRegenCeilingSCU() { return regenCeilingSCU; }
    @JsonProperty("RegenCeilingSCU")
    public void setRegenCeilingSCU(long value) { this.regenCeilingSCU = value; }

    @JsonProperty("MaxHealthFactor")
    public double getMaxHealthFactor() { return maxHealthFactor; }
    @JsonProperty("MaxHealthFactor")
    public void setMaxHealthFactor(double value) { this.maxHealthFactor = value; }

    @JsonProperty("RegenFloor")
    public long getRegenFloor() { return regenFloor; }
    @JsonProperty("RegenFloor")
    public void setRegenFloor(long value) { this.regenFloor = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("Radius")
    public long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(long value) { this.radius = value; }

    @JsonProperty("UnitCategory")
    public String getUnitCategory() { return unitCategory; }
    @JsonProperty("UnitCategory")
    public void setUnitCategory(String value) { this.unitCategory = value; }

    @JsonProperty("BuildCostMass")
    public long getBuildCostMass() { return buildCostMass; }
    @JsonProperty("BuildCostMass")
    public void setBuildCostMass(long value) { this.buildCostMass = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("RegenCeilingT1")
    public long getRegenCeilingT1() { return regenCeilingT1; }
    @JsonProperty("RegenCeilingT1")
    public void setRegenCeilingT1(long value) { this.regenCeilingT1 = value; }

    @JsonProperty("RegenCeilingT4")
    public long getRegenCeilingT4() { return regenCeilingT4; }
    @JsonProperty("RegenCeilingT4")
    public void setRegenCeilingT4(long value) { this.regenCeilingT4 = value; }

    @JsonProperty("RegenPerSecond")
    public double getRegenPerSecond() { return regenPerSecond; }
    @JsonProperty("RegenPerSecond")
    public void setRegenPerSecond(double value) { this.regenPerSecond = value; }

    @JsonProperty("RegenCeilingT3")
    public long getRegenCeilingT3() { return regenCeilingT3; }
    @JsonProperty("RegenCeilingT3")
    public void setRegenCeilingT3(long value) { this.regenCeilingT3 = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("RegenCeilingT2")
    public long getRegenCeilingT2() { return regenCeilingT2; }
    @JsonProperty("RegenCeilingT2")
    public void setRegenCeilingT2(long value) { this.regenCeilingT2 = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }
}
