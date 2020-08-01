package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property197 {
    private Boolean aboveWaterTargetsOnly;
    private Boolean artilleryShieldBlocks;
    private Property197Audio audio;
    private String ballisticArc;
    private Boolean collideFriendly;
    private String damage;
    private Boolean damageFriendly;
    private String damageRadius;
    private ArmorType damageType;
    private String displayName;
    private String doTPulses;
    private String doTTime;
    private Property1148FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private String firingRandomness;
    private String firingTolerance;
    private String label;
    private String maxRadius;
    private String minRadius;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private String muzzleVelocity;
    private String muzzleVelocityReduceDistance;
    private String projectileID;
    private String projectilesPerOnFire;
    private Property197RackBones rackBones;
    private Boolean rackFireTogether;
    private String rackRecoilDistance;
    private String rackReloadTimeout;
    private String rackSalvoChargeTime;
    private String rackSalvoReloadTime;
    private String rackSalvoSize;
    private Boolean rackSlavedToTurret;
    private String rangeCategory;
    private String rateOfFire;
    private Boolean renderFireClock;
    private String targetCheckInterval;
    private String[] targetPriorities;
    private String targetRestrictDisallow;
    private String turretBoneMuzzle;
    private String turretBonePitch;
    private String turretBoneYaw;
    private Boolean turretDualManipulators;
    private String turretPitch;
    private String turretPitchRange;
    private String turretPitchSpeed;
    private String turretYaw;
    private String turretYawRange;
    private String turretYawSpeed;
    private boolean turreted;
    private String weaponCategory;
    private Boolean aimsStraightOnDisable;
    private String cameraShakeDuration;
    private String cameraShakeMax;
    private String cameraShakeMin;
    private String cameraShakeRadius;
    private Boolean energyChargeForFirstShot;
    private String energyDrainPerSecond;
    private String energyRequired;
    private String muzzleVelocityRandom;
    private String projectileLifetime;
    private String weaponRepackTimeout;
    private Boolean weaponUnpacks;
    private String beamCollisionDelay;
    private String beamLifetime;
    private Boolean leadTarget;
    private Boolean reTargetOnMiss;
    private String trackingRadius;
    private Boolean slavedToBody;
    private String muzzleChargeDelay;
    private String projectileLifetimeUsesMultiplier;
    private Boolean rackSalvoFiresAfterCharge;
    private Boolean useFiringSolutionInsteadOfAimBone;
    private String targetRestrictOnlyAllow;
    private String targetType;

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("ArtilleryShieldBlocks")
    public Boolean getArtilleryShieldBlocks() { return artilleryShieldBlocks; }
    @JsonProperty("ArtilleryShieldBlocks")
    public void setArtilleryShieldBlocks(Boolean value) { this.artilleryShieldBlocks = value; }

    @JsonProperty("Audio")
    public Property197Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Property197Audio value) { this.audio = value; }

    @JsonProperty("BallisticArc")
    public String getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(String value) { this.ballisticArc = value; }

    @JsonProperty("CollideFriendly")
    public Boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(Boolean value) { this.collideFriendly = value; }

    @JsonProperty("Damage")
    public String getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(String value) { this.damage = value; }

    @JsonProperty("DamageFriendly")
    public Boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(Boolean value) { this.damageFriendly = value; }

    @JsonProperty("DamageRadius")
    public String getDamageRadius() { return damageRadius; }
    @JsonProperty("DamageRadius")
    public void setDamageRadius(String value) { this.damageRadius = value; }

    @JsonProperty("DamageType")
    public ArmorType getDamageType() { return damageType; }
    @JsonProperty("DamageType")
    public void setDamageType(ArmorType value) { this.damageType = value; }

    @JsonProperty("DisplayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("DisplayName")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("DoTPulses")
    public String getDoTPulses() { return doTPulses; }
    @JsonProperty("DoTPulses")
    public void setDoTPulses(String value) { this.doTPulses = value; }

    @JsonProperty("DoTTime")
    public String getDoTTime() { return doTTime; }
    @JsonProperty("DoTTime")
    public void setDoTTime(String value) { this.doTTime = value; }

    @JsonProperty("FireTargetLayerCapsTable")
    public Property1148FireTargetLayerCapsTable getFireTargetLayerCapsTable() { return fireTargetLayerCapsTable; }
    @JsonProperty("FireTargetLayerCapsTable")
    public void setFireTargetLayerCapsTable(Property1148FireTargetLayerCapsTable value) { this.fireTargetLayerCapsTable = value; }

    @JsonProperty("FiringRandomness")
    public String getFiringRandomness() { return firingRandomness; }
    @JsonProperty("FiringRandomness")
    public void setFiringRandomness(String value) { this.firingRandomness = value; }

    @JsonProperty("FiringTolerance")
    public String getFiringTolerance() { return firingTolerance; }
    @JsonProperty("FiringTolerance")
    public void setFiringTolerance(String value) { this.firingTolerance = value; }

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

    @JsonProperty("MinRadius")
    public String getMinRadius() { return minRadius; }
    @JsonProperty("MinRadius")
    public void setMinRadius(String value) { this.minRadius = value; }

    @JsonProperty("MuzzleSalvoDelay")
    public String getMuzzleSalvoDelay() { return muzzleSalvoDelay; }
    @JsonProperty("MuzzleSalvoDelay")
    public void setMuzzleSalvoDelay(String value) { this.muzzleSalvoDelay = value; }

    @JsonProperty("MuzzleSalvoSize")
    public String getMuzzleSalvoSize() { return muzzleSalvoSize; }
    @JsonProperty("MuzzleSalvoSize")
    public void setMuzzleSalvoSize(String value) { this.muzzleSalvoSize = value; }

    @JsonProperty("MuzzleVelocity")
    public String getMuzzleVelocity() { return muzzleVelocity; }
    @JsonProperty("MuzzleVelocity")
    public void setMuzzleVelocity(String value) { this.muzzleVelocity = value; }

    @JsonProperty("MuzzleVelocityReduceDistance")
    public String getMuzzleVelocityReduceDistance() { return muzzleVelocityReduceDistance; }
    @JsonProperty("MuzzleVelocityReduceDistance")
    public void setMuzzleVelocityReduceDistance(String value) { this.muzzleVelocityReduceDistance = value; }

    @JsonProperty("ProjectileId")
    public String getProjectileID() { return projectileID; }
    @JsonProperty("ProjectileId")
    public void setProjectileID(String value) { this.projectileID = value; }

    @JsonProperty("ProjectilesPerOnFire")
    public String getProjectilesPerOnFire() { return projectilesPerOnFire; }
    @JsonProperty("ProjectilesPerOnFire")
    public void setProjectilesPerOnFire(String value) { this.projectilesPerOnFire = value; }

    @JsonProperty("RackBones")
    public Property197RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property197RackBones value) { this.rackBones = value; }

    @JsonProperty("RackFireTogether")
    public Boolean getRackFireTogether() { return rackFireTogether; }
    @JsonProperty("RackFireTogether")
    public void setRackFireTogether(Boolean value) { this.rackFireTogether = value; }

    @JsonProperty("RackRecoilDistance")
    public String getRackRecoilDistance() { return rackRecoilDistance; }
    @JsonProperty("RackRecoilDistance")
    public void setRackRecoilDistance(String value) { this.rackRecoilDistance = value; }

    @JsonProperty("RackReloadTimeout")
    public String getRackReloadTimeout() { return rackReloadTimeout; }
    @JsonProperty("RackReloadTimeout")
    public void setRackReloadTimeout(String value) { this.rackReloadTimeout = value; }

    @JsonProperty("RackSalvoChargeTime")
    public String getRackSalvoChargeTime() { return rackSalvoChargeTime; }
    @JsonProperty("RackSalvoChargeTime")
    public void setRackSalvoChargeTime(String value) { this.rackSalvoChargeTime = value; }

    @JsonProperty("RackSalvoReloadTime")
    public String getRackSalvoReloadTime() { return rackSalvoReloadTime; }
    @JsonProperty("RackSalvoReloadTime")
    public void setRackSalvoReloadTime(String value) { this.rackSalvoReloadTime = value; }

    @JsonProperty("RackSalvoSize")
    public String getRackSalvoSize() { return rackSalvoSize; }
    @JsonProperty("RackSalvoSize")
    public void setRackSalvoSize(String value) { this.rackSalvoSize = value; }

    @JsonProperty("RackSlavedToTurret")
    public Boolean getRackSlavedToTurret() { return rackSlavedToTurret; }
    @JsonProperty("RackSlavedToTurret")
    public void setRackSlavedToTurret(Boolean value) { this.rackSlavedToTurret = value; }

    @JsonProperty("RangeCategory")
    public String getRangeCategory() { return rangeCategory; }
    @JsonProperty("RangeCategory")
    public void setRangeCategory(String value) { this.rangeCategory = value; }

    @JsonProperty("RateOfFire")
    public String getRateOfFire() { return rateOfFire; }
    @JsonProperty("RateOfFire")
    public void setRateOfFire(String value) { this.rateOfFire = value; }

    @JsonProperty("RenderFireClock")
    public Boolean getRenderFireClock() { return renderFireClock; }
    @JsonProperty("RenderFireClock")
    public void setRenderFireClock(Boolean value) { this.renderFireClock = value; }

    @JsonProperty("TargetCheckInterval")
    public String getTargetCheckInterval() { return targetCheckInterval; }
    @JsonProperty("TargetCheckInterval")
    public void setTargetCheckInterval(String value) { this.targetCheckInterval = value; }

    @JsonProperty("TargetPriorities")
    public String[] getTargetPriorities() { return targetPriorities; }
    @JsonProperty("TargetPriorities")
    public void setTargetPriorities(String[] value) { this.targetPriorities = value; }

    @JsonProperty("TargetRestrictDisallow")
    public String getTargetRestrictDisallow() { return targetRestrictDisallow; }
    @JsonProperty("TargetRestrictDisallow")
    public void setTargetRestrictDisallow(String value) { this.targetRestrictDisallow = value; }

    @JsonProperty("TurretBoneMuzzle")
    public String getTurretBoneMuzzle() { return turretBoneMuzzle; }
    @JsonProperty("TurretBoneMuzzle")
    public void setTurretBoneMuzzle(String value) { this.turretBoneMuzzle = value; }

    @JsonProperty("TurretBonePitch")
    public String getTurretBonePitch() { return turretBonePitch; }
    @JsonProperty("TurretBonePitch")
    public void setTurretBonePitch(String value) { this.turretBonePitch = value; }

    @JsonProperty("TurretBoneYaw")
    public String getTurretBoneYaw() { return turretBoneYaw; }
    @JsonProperty("TurretBoneYaw")
    public void setTurretBoneYaw(String value) { this.turretBoneYaw = value; }

    @JsonProperty("TurretDualManipulators")
    public Boolean getTurretDualManipulators() { return turretDualManipulators; }
    @JsonProperty("TurretDualManipulators")
    public void setTurretDualManipulators(Boolean value) { this.turretDualManipulators = value; }

    @JsonProperty("TurretPitch")
    public String getTurretPitch() { return turretPitch; }
    @JsonProperty("TurretPitch")
    public void setTurretPitch(String value) { this.turretPitch = value; }

    @JsonProperty("TurretPitchRange")
    public String getTurretPitchRange() { return turretPitchRange; }
    @JsonProperty("TurretPitchRange")
    public void setTurretPitchRange(String value) { this.turretPitchRange = value; }

    @JsonProperty("TurretPitchSpeed")
    public String getTurretPitchSpeed() { return turretPitchSpeed; }
    @JsonProperty("TurretPitchSpeed")
    public void setTurretPitchSpeed(String value) { this.turretPitchSpeed = value; }

    @JsonProperty("TurretYaw")
    public String getTurretYaw() { return turretYaw; }
    @JsonProperty("TurretYaw")
    public void setTurretYaw(String value) { this.turretYaw = value; }

    @JsonProperty("TurretYawRange")
    public String getTurretYawRange() { return turretYawRange; }
    @JsonProperty("TurretYawRange")
    public void setTurretYawRange(String value) { this.turretYawRange = value; }

    @JsonProperty("TurretYawSpeed")
    public String getTurretYawSpeed() { return turretYawSpeed; }
    @JsonProperty("TurretYawSpeed")
    public void setTurretYawSpeed(String value) { this.turretYawSpeed = value; }

    @JsonProperty("Turreted")
    public boolean getTurreted() { return turreted; }
    @JsonProperty("Turreted")
    public void setTurreted(boolean value) { this.turreted = value; }

    @JsonProperty("WeaponCategory")
    public String getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(String value) { this.weaponCategory = value; }

    @JsonProperty("AimsStraightOnDisable")
    public Boolean getAimsStraightOnDisable() { return aimsStraightOnDisable; }
    @JsonProperty("AimsStraightOnDisable")
    public void setAimsStraightOnDisable(Boolean value) { this.aimsStraightOnDisable = value; }

    @JsonProperty("CameraShakeDuration")
    public String getCameraShakeDuration() { return cameraShakeDuration; }
    @JsonProperty("CameraShakeDuration")
    public void setCameraShakeDuration(String value) { this.cameraShakeDuration = value; }

    @JsonProperty("CameraShakeMax")
    public String getCameraShakeMax() { return cameraShakeMax; }
    @JsonProperty("CameraShakeMax")
    public void setCameraShakeMax(String value) { this.cameraShakeMax = value; }

    @JsonProperty("CameraShakeMin")
    public String getCameraShakeMin() { return cameraShakeMin; }
    @JsonProperty("CameraShakeMin")
    public void setCameraShakeMin(String value) { this.cameraShakeMin = value; }

    @JsonProperty("CameraShakeRadius")
    public String getCameraShakeRadius() { return cameraShakeRadius; }
    @JsonProperty("CameraShakeRadius")
    public void setCameraShakeRadius(String value) { this.cameraShakeRadius = value; }

    @JsonProperty("EnergyChargeForFirstShot")
    public Boolean getEnergyChargeForFirstShot() { return energyChargeForFirstShot; }
    @JsonProperty("EnergyChargeForFirstShot")
    public void setEnergyChargeForFirstShot(Boolean value) { this.energyChargeForFirstShot = value; }

    @JsonProperty("EnergyDrainPerSecond")
    public String getEnergyDrainPerSecond() { return energyDrainPerSecond; }
    @JsonProperty("EnergyDrainPerSecond")
    public void setEnergyDrainPerSecond(String value) { this.energyDrainPerSecond = value; }

    @JsonProperty("EnergyRequired")
    public String getEnergyRequired() { return energyRequired; }
    @JsonProperty("EnergyRequired")
    public void setEnergyRequired(String value) { this.energyRequired = value; }

    @JsonProperty("MuzzleVelocityRandom")
    public String getMuzzleVelocityRandom() { return muzzleVelocityRandom; }
    @JsonProperty("MuzzleVelocityRandom")
    public void setMuzzleVelocityRandom(String value) { this.muzzleVelocityRandom = value; }

    @JsonProperty("ProjectileLifetime")
    public String getProjectileLifetime() { return projectileLifetime; }
    @JsonProperty("ProjectileLifetime")
    public void setProjectileLifetime(String value) { this.projectileLifetime = value; }

    @JsonProperty("WeaponRepackTimeout")
    public String getWeaponRepackTimeout() { return weaponRepackTimeout; }
    @JsonProperty("WeaponRepackTimeout")
    public void setWeaponRepackTimeout(String value) { this.weaponRepackTimeout = value; }

    @JsonProperty("WeaponUnpacks")
    public Boolean getWeaponUnpacks() { return weaponUnpacks; }
    @JsonProperty("WeaponUnpacks")
    public void setWeaponUnpacks(Boolean value) { this.weaponUnpacks = value; }

    @JsonProperty("BeamCollisionDelay")
    public String getBeamCollisionDelay() { return beamCollisionDelay; }
    @JsonProperty("BeamCollisionDelay")
    public void setBeamCollisionDelay(String value) { this.beamCollisionDelay = value; }

    @JsonProperty("BeamLifetime")
    public String getBeamLifetime() { return beamLifetime; }
    @JsonProperty("BeamLifetime")
    public void setBeamLifetime(String value) { this.beamLifetime = value; }

    @JsonProperty("LeadTarget")
    public Boolean getLeadTarget() { return leadTarget; }
    @JsonProperty("LeadTarget")
    public void setLeadTarget(Boolean value) { this.leadTarget = value; }

    @JsonProperty("ReTargetOnMiss")
    public Boolean getReTargetOnMiss() { return reTargetOnMiss; }
    @JsonProperty("ReTargetOnMiss")
    public void setReTargetOnMiss(Boolean value) { this.reTargetOnMiss = value; }

    @JsonProperty("TrackingRadius")
    public String getTrackingRadius() { return trackingRadius; }
    @JsonProperty("TrackingRadius")
    public void setTrackingRadius(String value) { this.trackingRadius = value; }

    @JsonProperty("SlavedToBody")
    public Boolean getSlavedToBody() { return slavedToBody; }
    @JsonProperty("SlavedToBody")
    public void setSlavedToBody(Boolean value) { this.slavedToBody = value; }

    @JsonProperty("MuzzleChargeDelay")
    public String getMuzzleChargeDelay() { return muzzleChargeDelay; }
    @JsonProperty("MuzzleChargeDelay")
    public void setMuzzleChargeDelay(String value) { this.muzzleChargeDelay = value; }

    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public String getProjectileLifetimeUsesMultiplier() { return projectileLifetimeUsesMultiplier; }
    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public void setProjectileLifetimeUsesMultiplier(String value) { this.projectileLifetimeUsesMultiplier = value; }

    @JsonProperty("RackSalvoFiresAfterCharge")
    public Boolean getRackSalvoFiresAfterCharge() { return rackSalvoFiresAfterCharge; }
    @JsonProperty("RackSalvoFiresAfterCharge")
    public void setRackSalvoFiresAfterCharge(Boolean value) { this.rackSalvoFiresAfterCharge = value; }

    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public Boolean getUseFiringSolutionInsteadOfAimBone() { return useFiringSolutionInsteadOfAimBone; }
    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public void setUseFiringSolutionInsteadOfAimBone(Boolean value) { this.useFiringSolutionInsteadOfAimBone = value; }

    @JsonProperty("TargetRestrictOnlyAllow")
    public String getTargetRestrictOnlyAllow() { return targetRestrictOnlyAllow; }
    @JsonProperty("TargetRestrictOnlyAllow")
    public void setTargetRestrictOnlyAllow(String value) { this.targetRestrictOnlyAllow = value; }

    @JsonProperty("TargetType")
    public String getTargetType() { return targetType; }
    @JsonProperty("TargetType")
    public void setTargetType(String value) { this.targetType = value; }
}
