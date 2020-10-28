package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class ShieldHeavyClass {
    private String[] showBones;
    private String icon;
    private String ownerShieldMesh;
    private long shieldEnergyDrainRechargeTime;
    private long buildCostMass;
    private long buildCostEnergy;
    private long shieldRegenRate;
    private Long regenAssistMult;
    private ImpactEffects impactEffects;
    private long buildTime;
    private Slot slot;
    private String name;
    private String[] upgradeUnitAmbientBones;
    private long maintenanceConsumptionPerSecondEnergy;
    private String[] upgradeEffectBones;
    private long shieldRegenStartTime;
    private long shieldMaxHealth;
    private long shieldRechargeTime;
    private boolean personalShield;
    private Long shieldVerticalOffset;
    private Long shieldSize;
    private String prerequisite;

    @JsonProperty("ShowBones")
    public String[] getShowBones() { return showBones; }
    @JsonProperty("ShowBones")
    public void setShowBones(String[] value) { this.showBones = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("OwnerShieldMesh")
    public String getOwnerShieldMesh() { return ownerShieldMesh; }
    @JsonProperty("OwnerShieldMesh")
    public void setOwnerShieldMesh(String value) { this.ownerShieldMesh = value; }

    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public long getShieldEnergyDrainRechargeTime() { return shieldEnergyDrainRechargeTime; }
    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public void setShieldEnergyDrainRechargeTime(long value) { this.shieldEnergyDrainRechargeTime = value; }

    @JsonProperty("BuildCostMass")
    public long getBuildCostMass() { return buildCostMass; }
    @JsonProperty("BuildCostMass")
    public void setBuildCostMass(long value) { this.buildCostMass = value; }

    @JsonProperty("BuildCostEnergy")
    public long getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(long value) { this.buildCostEnergy = value; }

    @JsonProperty("ShieldRegenRate")
    public long getShieldRegenRate() { return shieldRegenRate; }
    @JsonProperty("ShieldRegenRate")
    public void setShieldRegenRate(long value) { this.shieldRegenRate = value; }

    @JsonProperty("RegenAssistMult")
    public Long getRegenAssistMult() { return regenAssistMult; }
    @JsonProperty("RegenAssistMult")
    public void setRegenAssistMult(Long value) { this.regenAssistMult = value; }

    @JsonProperty("ImpactEffects")
    public ImpactEffects getImpactEffects() { return impactEffects; }
    @JsonProperty("ImpactEffects")
    public void setImpactEffects(ImpactEffects value) { this.impactEffects = value; }

    @JsonProperty("BuildTime")
    public long getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(long value) { this.buildTime = value; }

    @JsonProperty("Slot")
    public Slot getSlot() { return slot; }
    @JsonProperty("Slot")
    public void setSlot(Slot value) { this.slot = value; }

    @JsonProperty("Name")
    public String getName() { return name; }
    @JsonProperty("Name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public long getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(long value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("ShieldRegenStartTime")
    public long getShieldRegenStartTime() { return shieldRegenStartTime; }
    @JsonProperty("ShieldRegenStartTime")
    public void setShieldRegenStartTime(long value) { this.shieldRegenStartTime = value; }

    @JsonProperty("ShieldMaxHealth")
    public long getShieldMaxHealth() { return shieldMaxHealth; }
    @JsonProperty("ShieldMaxHealth")
    public void setShieldMaxHealth(long value) { this.shieldMaxHealth = value; }

    @JsonProperty("ShieldRechargeTime")
    public long getShieldRechargeTime() { return shieldRechargeTime; }
    @JsonProperty("ShieldRechargeTime")
    public void setShieldRechargeTime(long value) { this.shieldRechargeTime = value; }

    @JsonProperty("PersonalShield")
    public boolean getPersonalShield() { return personalShield; }
    @JsonProperty("PersonalShield")
    public void setPersonalShield(boolean value) { this.personalShield = value; }

    @JsonProperty("ShieldVerticalOffset")
    public Long getShieldVerticalOffset() { return shieldVerticalOffset; }
    @JsonProperty("ShieldVerticalOffset")
    public void setShieldVerticalOffset(Long value) { this.shieldVerticalOffset = value; }

    @JsonProperty("ShieldSize")
    public Long getShieldSize() { return shieldSize; }
    @JsonProperty("ShieldSize")
    public void setShieldSize(Long value) { this.shieldSize = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }
}
