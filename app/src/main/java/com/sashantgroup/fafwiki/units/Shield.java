package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Shield {
    private long shieldRegenRate;
    private ImpactMesh impactMesh;
    private long shieldEnergyDrainRechargeTime;
    private long shieldRechargeTime;
    private long shieldMaxHealth;
    private String impactMeshBig;
    private ImpactEffects impactEffects;
    private double shieldVerticalOffset;
    private String mesh;
    private long regenAssistMult;
    private long shieldRegenStartTime;
    private double shieldSize;
    private Boolean personalShield;
    private String ownerShieldMesh;
    private Double shieldSpillOverDamageMod;
    private MeshZ meshZ;
    private Boolean personalBubble;
    private Boolean transportShield;

    @JsonProperty("ShieldRegenRate")
    public long getShieldRegenRate() { return shieldRegenRate; }
    @JsonProperty("ShieldRegenRate")
    public void setShieldRegenRate(long value) { this.shieldRegenRate = value; }

    @JsonProperty("ImpactMesh")
    public ImpactMesh getImpactMesh() { return impactMesh; }
    @JsonProperty("ImpactMesh")
    public void setImpactMesh(ImpactMesh value) { this.impactMesh = value; }

    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public long getShieldEnergyDrainRechargeTime() { return shieldEnergyDrainRechargeTime; }
    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public void setShieldEnergyDrainRechargeTime(long value) { this.shieldEnergyDrainRechargeTime = value; }

    @JsonProperty("ShieldRechargeTime")
    public long getShieldRechargeTime() { return shieldRechargeTime; }
    @JsonProperty("ShieldRechargeTime")
    public void setShieldRechargeTime(long value) { this.shieldRechargeTime = value; }

    @JsonProperty("ShieldMaxHealth")
    public long getShieldMaxHealth() { return shieldMaxHealth; }
    @JsonProperty("ShieldMaxHealth")
    public void setShieldMaxHealth(long value) { this.shieldMaxHealth = value; }

    @JsonProperty("ImpactMeshBig")
    public String getImpactMeshBig() { return impactMeshBig; }
    @JsonProperty("ImpactMeshBig")
    public void setImpactMeshBig(String value) { this.impactMeshBig = value; }

    @JsonProperty("ImpactEffects")
    public ImpactEffects getImpactEffects() { return impactEffects; }
    @JsonProperty("ImpactEffects")
    public void setImpactEffects(ImpactEffects value) { this.impactEffects = value; }

    @JsonProperty("ShieldVerticalOffset")
    public double getShieldVerticalOffset() { return shieldVerticalOffset; }
    @JsonProperty("ShieldVerticalOffset")
    public void setShieldVerticalOffset(double value) { this.shieldVerticalOffset = value; }

    @JsonProperty("Mesh")
    public String getMesh() { return mesh; }
    @JsonProperty("Mesh")
    public void setMesh(String value) { this.mesh = value; }

    @JsonProperty("RegenAssistMult")
    public long getRegenAssistMult() { return regenAssistMult; }
    @JsonProperty("RegenAssistMult")
    public void setRegenAssistMult(long value) { this.regenAssistMult = value; }

    @JsonProperty("ShieldRegenStartTime")
    public long getShieldRegenStartTime() { return shieldRegenStartTime; }
    @JsonProperty("ShieldRegenStartTime")
    public void setShieldRegenStartTime(long value) { this.shieldRegenStartTime = value; }

    @JsonProperty("ShieldSize")
    public double getShieldSize() { return shieldSize; }
    @JsonProperty("ShieldSize")
    public void setShieldSize(double value) { this.shieldSize = value; }

    @JsonProperty("PersonalShield")
    public Boolean getPersonalShield() { return personalShield; }
    @JsonProperty("PersonalShield")
    public void setPersonalShield(Boolean value) { this.personalShield = value; }

    @JsonProperty("OwnerShieldMesh")
    public String getOwnerShieldMesh() { return ownerShieldMesh; }
    @JsonProperty("OwnerShieldMesh")
    public void setOwnerShieldMesh(String value) { this.ownerShieldMesh = value; }

    @JsonProperty("ShieldSpillOverDamageMod")
    public Double getShieldSpillOverDamageMod() { return shieldSpillOverDamageMod; }
    @JsonProperty("ShieldSpillOverDamageMod")
    public void setShieldSpillOverDamageMod(Double value) { this.shieldSpillOverDamageMod = value; }

    @JsonProperty("MeshZ")
    public MeshZ getMeshZ() { return meshZ; }
    @JsonProperty("MeshZ")
    public void setMeshZ(MeshZ value) { this.meshZ = value; }

    @JsonProperty("PersonalBubble")
    public Boolean getPersonalBubble() { return personalBubble; }
    @JsonProperty("PersonalBubble")
    public void setPersonalBubble(Boolean value) { this.personalBubble = value; }

    @JsonProperty("TransportShield")
    public Boolean getTransportShield() { return transportShield; }
    @JsonProperty("TransportShield")
    public void setTransportShield(Boolean value) { this.transportShield = value; }
}
