package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class WeaponProperty228 {
    private String damage;
    private Boolean damageFriendly;
    private String damageRadius;
    private ArmorType damageType;
    private String displayName;
    private Boolean dummyWeapon;
    private String label;
    private String weaponCategory;
    private Boolean aboveWaterTargetsOnly;
    private Property178Audio audio;
    private String ballisticArc;
    private Boolean collideFriendly;
    private Property1007FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private String firingRandomness;
    private String firingTolerance;
    private String headingArcCenter;
    private String headingArcRange;
    private String maxRadius;
    private String muzzleChargeDelay;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private String muzzleVelocity;
    private String projectileID;
    private Property228RackBones rackBones;
    private Boolean rackFireTogether;
    private String rackRecoilDistance;
    private String rackReloadTimeout;
    private String rackSalvoChargeTime;
    private String rackSalvoReloadTime;
    private String rackSalvoSize;
    private Boolean rackSlavedToTurret;
    private String rangeCategory;
    private String rateOfFire;
    private Boolean slavedToBody;
    private String slavedToBodyArcRange;
    private String targetCheckInterval;
    private String[] targetPriorities;
    private String targetRestrictDisallow;
    private String trackingRadius;
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
    private Boolean turreted;
    private Boolean aboveWaterFireOnly;
    private Boolean noPause;
    private String projectileLifetimeUsesMultiplier;
    private String projectilesPerOnFire;
    private Boolean useFiringSolutionInsteadOfAimBone;
    private String weaponRepackTimeout;
    private Boolean weaponUnpacks;
    private Boolean artilleryShieldBlocks;
    private Boolean bombardParticipant;
    private Boolean bombardSwingTurret;
    private String bombardTurretRotationSpeed;
    private Boolean cannotAttackGround;
    private String minRadius;
    private String muzzleVelocityReduceDistance;
    private Boolean stopOnPrimaryWeaponBusy;
    private String toggleWeapon;
    private Boolean aimsStraightOnDisable;
    private String projectileLifetime;
    private Boolean renderFireClock;
    private String weaponUnpackAnimation;
    private String weaponUnpackAnimationRate;
    private Boolean weaponUnpackLocksMotion;

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

    @JsonProperty("DummyWeapon")
    public Boolean getDummyWeapon() { return dummyWeapon; }
    @JsonProperty("DummyWeapon")
    public void setDummyWeapon(Boolean value) { this.dummyWeapon = value; }

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("WeaponCategory")
    public String getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(String value) { this.weaponCategory = value; }

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("Audio")
    public Property178Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Property178Audio value) { this.audio = value; }

    @JsonProperty("BallisticArc")
    public String getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(String value) { this.ballisticArc = value; }

    @JsonProperty("CollideFriendly")
    public Boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(Boolean value) { this.collideFriendly = value; }

    @JsonProperty("FireTargetLayerCapsTable")
    public Property1007FireTargetLayerCapsTable getFireTargetLayerCapsTable() { return fireTargetLayerCapsTable; }
    @JsonProperty("FireTargetLayerCapsTable")
    public void setFireTargetLayerCapsTable(Property1007FireTargetLayerCapsTable value) { this.fireTargetLayerCapsTable = value; }

    @JsonProperty("FiringRandomness")
    public String getFiringRandomness() { return firingRandomness; }
    @JsonProperty("FiringRandomness")
    public void setFiringRandomness(String value) { this.firingRandomness = value; }

    @JsonProperty("FiringTolerance")
    public String getFiringTolerance() { return firingTolerance; }
    @JsonProperty("FiringTolerance")
    public void setFiringTolerance(String value) { this.firingTolerance = value; }

    @JsonProperty("HeadingArcCenter")
    public String getHeadingArcCenter() { return headingArcCenter; }
    @JsonProperty("HeadingArcCenter")
    public void setHeadingArcCenter(String value) { this.headingArcCenter = value; }

    @JsonProperty("HeadingArcRange")
    public String getHeadingArcRange() { return headingArcRange; }
    @JsonProperty("HeadingArcRange")
    public void setHeadingArcRange(String value) { this.headingArcRange = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

    @JsonProperty("MuzzleChargeDelay")
    public String getMuzzleChargeDelay() { return muzzleChargeDelay; }
    @JsonProperty("MuzzleChargeDelay")
    public void setMuzzleChargeDelay(String value) { this.muzzleChargeDelay = value; }

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

    @JsonProperty("ProjectileId")
    public String getProjectileID() { return projectileID; }
    @JsonProperty("ProjectileId")
    public void setProjectileID(String value) { this.projectileID = value; }

    @JsonProperty("RackBones")
    public Property228RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property228RackBones value) { this.rackBones = value; }

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

    @JsonProperty("SlavedToBody")
    public Boolean getSlavedToBody() { return slavedToBody; }
    @JsonProperty("SlavedToBody")
    public void setSlavedToBody(Boolean value) { this.slavedToBody = value; }

    @JsonProperty("SlavedToBodyArcRange")
    public String getSlavedToBodyArcRange() { return slavedToBodyArcRange; }
    @JsonProperty("SlavedToBodyArcRange")
    public void setSlavedToBodyArcRange(String value) { this.slavedToBodyArcRange = value; }

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

    @JsonProperty("TrackingRadius")
    public String getTrackingRadius() { return trackingRadius; }
    @JsonProperty("TrackingRadius")
    public void setTrackingRadius(String value) { this.trackingRadius = value; }

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
    public Boolean getTurreted() { return turreted; }
    @JsonProperty("Turreted")
    public void setTurreted(Boolean value) { this.turreted = value; }

    @JsonProperty("AboveWaterFireOnly")
    public Boolean getAboveWaterFireOnly() { return aboveWaterFireOnly; }
    @JsonProperty("AboveWaterFireOnly")
    public void setAboveWaterFireOnly(Boolean value) { this.aboveWaterFireOnly = value; }

    @JsonProperty("NoPause")
    public Boolean getNoPause() { return noPause; }
    @JsonProperty("NoPause")
    public void setNoPause(Boolean value) { this.noPause = value; }

    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public String getProjectileLifetimeUsesMultiplier() { return projectileLifetimeUsesMultiplier; }
    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public void setProjectileLifetimeUsesMultiplier(String value) { this.projectileLifetimeUsesMultiplier = value; }

    @JsonProperty("ProjectilesPerOnFire")
    public String getProjectilesPerOnFire() { return projectilesPerOnFire; }
    @JsonProperty("ProjectilesPerOnFire")
    public void setProjectilesPerOnFire(String value) { this.projectilesPerOnFire = value; }

    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public Boolean getUseFiringSolutionInsteadOfAimBone() { return useFiringSolutionInsteadOfAimBone; }
    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public void setUseFiringSolutionInsteadOfAimBone(Boolean value) { this.useFiringSolutionInsteadOfAimBone = value; }

    @JsonProperty("WeaponRepackTimeout")
    public String getWeaponRepackTimeout() { return weaponRepackTimeout; }
    @JsonProperty("WeaponRepackTimeout")
    public void setWeaponRepackTimeout(String value) { this.weaponRepackTimeout = value; }

    @JsonProperty("WeaponUnpacks")
    public Boolean getWeaponUnpacks() { return weaponUnpacks; }
    @JsonProperty("WeaponUnpacks")
    public void setWeaponUnpacks(Boolean value) { this.weaponUnpacks = value; }

    @JsonProperty("ArtilleryShieldBlocks")
    public Boolean getArtilleryShieldBlocks() { return artilleryShieldBlocks; }
    @JsonProperty("ArtilleryShieldBlocks")
    public void setArtilleryShieldBlocks(Boolean value) { this.artilleryShieldBlocks = value; }

    @JsonProperty("BombardParticipant")
    public Boolean getBombardParticipant() { return bombardParticipant; }
    @JsonProperty("BombardParticipant")
    public void setBombardParticipant(Boolean value) { this.bombardParticipant = value; }

    @JsonProperty("BombardSwingTurret")
    public Boolean getBombardSwingTurret() { return bombardSwingTurret; }
    @JsonProperty("BombardSwingTurret")
    public void setBombardSwingTurret(Boolean value) { this.bombardSwingTurret = value; }

    @JsonProperty("BombardTurretRotationSpeed")
    public String getBombardTurretRotationSpeed() { return bombardTurretRotationSpeed; }
    @JsonProperty("BombardTurretRotationSpeed")
    public void setBombardTurretRotationSpeed(String value) { this.bombardTurretRotationSpeed = value; }

    @JsonProperty("CannotAttackGround")
    public Boolean getCannotAttackGround() { return cannotAttackGround; }
    @JsonProperty("CannotAttackGround")
    public void setCannotAttackGround(Boolean value) { this.cannotAttackGround = value; }

    @JsonProperty("MinRadius")
    public String getMinRadius() { return minRadius; }
    @JsonProperty("MinRadius")
    public void setMinRadius(String value) { this.minRadius = value; }

    @JsonProperty("MuzzleVelocityReduceDistance")
    public String getMuzzleVelocityReduceDistance() { return muzzleVelocityReduceDistance; }
    @JsonProperty("MuzzleVelocityReduceDistance")
    public void setMuzzleVelocityReduceDistance(String value) { this.muzzleVelocityReduceDistance = value; }

    @JsonProperty("StopOnPrimaryWeaponBusy")
    public Boolean getStopOnPrimaryWeaponBusy() { return stopOnPrimaryWeaponBusy; }
    @JsonProperty("StopOnPrimaryWeaponBusy")
    public void setStopOnPrimaryWeaponBusy(Boolean value) { this.stopOnPrimaryWeaponBusy = value; }

    @JsonProperty("ToggleWeapon")
    public String getToggleWeapon() { return toggleWeapon; }
    @JsonProperty("ToggleWeapon")
    public void setToggleWeapon(String value) { this.toggleWeapon = value; }

    @JsonProperty("AimsStraightOnDisable")
    public Boolean getAimsStraightOnDisable() { return aimsStraightOnDisable; }
    @JsonProperty("AimsStraightOnDisable")
    public void setAimsStraightOnDisable(Boolean value) { this.aimsStraightOnDisable = value; }

    @JsonProperty("ProjectileLifetime")
    public String getProjectileLifetime() { return projectileLifetime; }
    @JsonProperty("ProjectileLifetime")
    public void setProjectileLifetime(String value) { this.projectileLifetime = value; }

    @JsonProperty("RenderFireClock")
    public Boolean getRenderFireClock() { return renderFireClock; }
    @JsonProperty("RenderFireClock")
    public void setRenderFireClock(Boolean value) { this.renderFireClock = value; }

    @JsonProperty("WeaponUnpackAnimation")
    public String getWeaponUnpackAnimation() { return weaponUnpackAnimation; }
    @JsonProperty("WeaponUnpackAnimation")
    public void setWeaponUnpackAnimation(String value) { this.weaponUnpackAnimation = value; }

    @JsonProperty("WeaponUnpackAnimationRate")
    public String getWeaponUnpackAnimationRate() { return weaponUnpackAnimationRate; }
    @JsonProperty("WeaponUnpackAnimationRate")
    public void setWeaponUnpackAnimationRate(String value) { this.weaponUnpackAnimationRate = value; }

    @JsonProperty("WeaponUnpackLocksMotion")
    public Boolean getWeaponUnpackLocksMotion() { return weaponUnpackLocksMotion; }
    @JsonProperty("WeaponUnpackLocksMotion")
    public void setWeaponUnpackLocksMotion(Boolean value) { this.weaponUnpackLocksMotion = value; }
}