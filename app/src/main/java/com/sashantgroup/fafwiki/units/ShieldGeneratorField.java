package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class ShieldGeneratorField {
    private long buildCostEnergy;
    private String[] hideBones;
    private long shieldRechargeTime;
    private String mesh;
    private double shieldSpillOverDamageMod;
    private long buildCostMass;
    private String name;
    private Slot slot;
    private long shieldRegenRate;
    private String icon;
    private long buildTime;
    private long shieldVerticalOffset;
    private ImpactEffects impactEffects;
    private long shieldSize;
    private long shieldRegenStartTime;
    private MeshZ meshZ;
    private long shieldEnergyDrainRechargeTime;
    private String prerequisite;
    private long maintenanceConsumptionPerSecondEnergy;
    private long shieldMaxHealth;
    private String[] upgradeUnitAmbientBones;
    private ImpactMesh impactMesh;
    private String[] upgradeEffectBones;
    private Long shieldEnhancementNumber;

    @JsonProperty("BuildCostEnergy")
    public long getBuildCostEnergy() { return buildCostEnergy; }
    @JsonProperty("BuildCostEnergy")
    public void setBuildCostEnergy(long value) { this.buildCostEnergy = value; }

    @JsonProperty("HideBones")
    public String[] getHideBones() { return hideBones; }
    @JsonProperty("HideBones")
    public void setHideBones(String[] value) { this.hideBones = value; }

    @JsonProperty("ShieldRechargeTime")
    public long getShieldRechargeTime() { return shieldRechargeTime; }
    @JsonProperty("ShieldRechargeTime")
    public void setShieldRechargeTime(long value) { this.shieldRechargeTime = value; }

    @JsonProperty("Mesh")
    public String getMesh() { return mesh; }
    @JsonProperty("Mesh")
    public void setMesh(String value) { this.mesh = value; }

    @JsonProperty("ShieldSpillOverDamageMod")
    public double getShieldSpillOverDamageMod() { return shieldSpillOverDamageMod; }
    @JsonProperty("ShieldSpillOverDamageMod")
    public void setShieldSpillOverDamageMod(double value) { this.shieldSpillOverDamageMod = value; }

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

    @JsonProperty("ShieldRegenRate")
    public long getShieldRegenRate() { return shieldRegenRate; }
    @JsonProperty("ShieldRegenRate")
    public void setShieldRegenRate(long value) { this.shieldRegenRate = value; }

    @JsonProperty("Icon")
    public String getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(String value) { this.icon = value; }

    @JsonProperty("BuildTime")
    public long getBuildTime() { return buildTime; }
    @JsonProperty("BuildTime")
    public void setBuildTime(long value) { this.buildTime = value; }

    @JsonProperty("ShieldVerticalOffset")
    public long getShieldVerticalOffset() { return shieldVerticalOffset; }
    @JsonProperty("ShieldVerticalOffset")
    public void setShieldVerticalOffset(long value) { this.shieldVerticalOffset = value; }

    @JsonProperty("ImpactEffects")
    public ImpactEffects getImpactEffects() { return impactEffects; }
    @JsonProperty("ImpactEffects")
    public void setImpactEffects(ImpactEffects value) { this.impactEffects = value; }

    @JsonProperty("ShieldSize")
    public long getShieldSize() { return shieldSize; }
    @JsonProperty("ShieldSize")
    public void setShieldSize(long value) { this.shieldSize = value; }

    @JsonProperty("ShieldRegenStartTime")
    public long getShieldRegenStartTime() { return shieldRegenStartTime; }
    @JsonProperty("ShieldRegenStartTime")
    public void setShieldRegenStartTime(long value) { this.shieldRegenStartTime = value; }

    @JsonProperty("MeshZ")
    public MeshZ getMeshZ() { return meshZ; }
    @JsonProperty("MeshZ")
    public void setMeshZ(MeshZ value) { this.meshZ = value; }

    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public long getShieldEnergyDrainRechargeTime() { return shieldEnergyDrainRechargeTime; }
    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public void setShieldEnergyDrainRechargeTime(long value) { this.shieldEnergyDrainRechargeTime = value; }

    @JsonProperty("Prerequisite")
    public String getPrerequisite() { return prerequisite; }
    @JsonProperty("Prerequisite")
    public void setPrerequisite(String value) { this.prerequisite = value; }

    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public long getMaintenanceConsumptionPerSecondEnergy() { return maintenanceConsumptionPerSecondEnergy; }
    @JsonProperty("MaintenanceConsumptionPerSecondEnergy")
    public void setMaintenanceConsumptionPerSecondEnergy(long value) { this.maintenanceConsumptionPerSecondEnergy = value; }

    @JsonProperty("ShieldMaxHealth")
    public long getShieldMaxHealth() { return shieldMaxHealth; }
    @JsonProperty("ShieldMaxHealth")
    public void setShieldMaxHealth(long value) { this.shieldMaxHealth = value; }

    @JsonProperty("UpgradeUnitAmbientBones")
    public String[] getUpgradeUnitAmbientBones() { return upgradeUnitAmbientBones; }
    @JsonProperty("UpgradeUnitAmbientBones")
    public void setUpgradeUnitAmbientBones(String[] value) { this.upgradeUnitAmbientBones = value; }

    @JsonProperty("ImpactMesh")
    public ImpactMesh getImpactMesh() { return impactMesh; }
    @JsonProperty("ImpactMesh")
    public void setImpactMesh(ImpactMesh value) { this.impactMesh = value; }

    @JsonProperty("UpgradeEffectBones")
    public String[] getUpgradeEffectBones() { return upgradeEffectBones; }
    @JsonProperty("UpgradeEffectBones")
    public void setUpgradeEffectBones(String[] value) { this.upgradeEffectBones = value; }

    @JsonProperty("ShieldEnhancementNumber")
    public Long getShieldEnhancementNumber() { return shieldEnhancementNumber; }
    @JsonProperty("ShieldEnhancementNumber")
    public void setShieldEnhancementNumber(Long value) { this.shieldEnhancementNumber = value; }
}
