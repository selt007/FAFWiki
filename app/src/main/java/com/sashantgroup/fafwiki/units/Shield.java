package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Shield {
    private ImpactEffects impactEffects;
    private ImpactMesh impactMesh;
    private String mesh;
    private MeshZ meshZ;
    private String regenAssistMult;
    private String shieldEnergyDrainRechargeTime;
    private String shieldMaxHealth;
    private String shieldRechargeTime;
    private String shieldRegenRate;
    private String shieldRegenStartTime;
    private String shieldSize;
    private String shieldVerticalOffset;
    private String ownerShieldMesh;
    private Boolean personalShield;
    private Boolean personalBubble;
    private String shieldSpillOverDamageMod;
    private Boolean transportShield;
    private String beamOriginBone;

    @JsonProperty("ImpactEffects")
    public ImpactEffects getImpactEffects() { return impactEffects; }
    @JsonProperty("ImpactEffects")
    public void setImpactEffects(ImpactEffects value) { this.impactEffects = value; }

    @JsonProperty("ImpactMesh")
    public ImpactMesh getImpactMesh() { return impactMesh; }
    @JsonProperty("ImpactMesh")
    public void setImpactMesh(ImpactMesh value) { this.impactMesh = value; }

    @JsonProperty("Mesh")
    public String getMesh() { return mesh; }
    @JsonProperty("Mesh")
    public void setMesh(String value) { this.mesh = value; }

    @JsonProperty("MeshZ")
    public MeshZ getMeshZ() { return meshZ; }
    @JsonProperty("MeshZ")
    public void setMeshZ(MeshZ value) { this.meshZ = value; }

    @JsonProperty("RegenAssistMult")
    public String getRegenAssistMult() { return regenAssistMult; }
    @JsonProperty("RegenAssistMult")
    public void setRegenAssistMult(String value) { this.regenAssistMult = value; }

    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public String getShieldEnergyDrainRechargeTime() { return shieldEnergyDrainRechargeTime; }
    @JsonProperty("ShieldEnergyDrainRechargeTime")
    public void setShieldEnergyDrainRechargeTime(String value) { this.shieldEnergyDrainRechargeTime = value; }

    @JsonProperty("ShieldMaxHealth")
    public String getShieldMaxHealth() { return shieldMaxHealth; }
    @JsonProperty("ShieldMaxHealth")
    public void setShieldMaxHealth(String value) { this.shieldMaxHealth = value; }

    @JsonProperty("ShieldRechargeTime")
    public String getShieldRechargeTime() { return shieldRechargeTime; }
    @JsonProperty("ShieldRechargeTime")
    public void setShieldRechargeTime(String value) { this.shieldRechargeTime = value; }

    @JsonProperty("ShieldRegenRate")
    public String getShieldRegenRate() { return shieldRegenRate; }
    @JsonProperty("ShieldRegenRate")
    public void setShieldRegenRate(String value) { this.shieldRegenRate = value; }

    @JsonProperty("ShieldRegenStartTime")
    public String getShieldRegenStartTime() { return shieldRegenStartTime; }
    @JsonProperty("ShieldRegenStartTime")
    public void setShieldRegenStartTime(String value) { this.shieldRegenStartTime = value; }

    @JsonProperty("ShieldSize")
    public String getShieldSize() { return shieldSize; }
    @JsonProperty("ShieldSize")
    public void setShieldSize(String value) { this.shieldSize = value; }

    @JsonProperty("ShieldVerticalOffset")
    public String getShieldVerticalOffset() { return shieldVerticalOffset; }
    @JsonProperty("ShieldVerticalOffset")
    public void setShieldVerticalOffset(String value) { this.shieldVerticalOffset = value; }

    @JsonProperty("OwnerShieldMesh")
    public String getOwnerShieldMesh() { return ownerShieldMesh; }
    @JsonProperty("OwnerShieldMesh")
    public void setOwnerShieldMesh(String value) { this.ownerShieldMesh = value; }

    @JsonProperty("PersonalShield")
    public Boolean getPersonalShield() { return personalShield; }
    @JsonProperty("PersonalShield")
    public void setPersonalShield(Boolean value) { this.personalShield = value; }

    @JsonProperty("PersonalBubble")
    public Boolean getPersonalBubble() { return personalBubble; }
    @JsonProperty("PersonalBubble")
    public void setPersonalBubble(Boolean value) { this.personalBubble = value; }

    @JsonProperty("ShieldSpillOverDamageMod")
    public String getShieldSpillOverDamageMod() { return shieldSpillOverDamageMod; }
    @JsonProperty("ShieldSpillOverDamageMod")
    public void setShieldSpillOverDamageMod(String value) { this.shieldSpillOverDamageMod = value; }

    @JsonProperty("TransportShield")
    public Boolean getTransportShield() { return transportShield; }
    @JsonProperty("TransportShield")
    public void setTransportShield(Boolean value) { this.transportShield = value; }

    @JsonProperty("BeamOriginBone")
    public String getBeamOriginBone() { return beamOriginBone; }
    @JsonProperty("BeamOriginBone")
    public void setBeamOriginBone(String value) { this.beamOriginBone = value; }
}
