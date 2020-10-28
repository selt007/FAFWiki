package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BlastAttack {
    private double newDamageRadius;
    private long additionalDamage;
    private long buildCostEnergy;
    private long buildCostMass;
    private String[] showBones;
    private String name;
    private String[] upgradeEffectBones;
    private Slot slot;
    private String icon;
    private String[] upgradeUnitAmbientBones;
    private long buildTime;

    @JsonProperty("NewDamageRadius")
    public double getNewDamageRadius() { return newDamageRadius; }
    @JsonProperty("NewDamageRadius")
    public void setNewDamageRadius(double value) { this.newDamageRadius = value; }

    @JsonProperty("AdditionalDamage")
    public long getAdditionalDamage() { return additionalDamage; }
    @JsonProperty("AdditionalDamage")
    public void setAdditionalDamage(long value) { this.additionalDamage = value; }

    @JsonProperty("BuildCostEnergy")
    public long getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(long value) { this.buildCostEnergy = value; }

    @JsonProperty("BuildCostMass")
    public long getBuildCostMass() { return buildCostMass; }
    @JsonProperty("BuildCostMass")
    public void setBuildCostMass(long value) { this.buildCostMass = value; }

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("BuildTime")
    public long getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(long value) { this.buildTime = value; }
}
