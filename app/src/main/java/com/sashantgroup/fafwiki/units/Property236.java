package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property236 {
    private Boolean alwaysRecheckTarget;
    private Property227Audio audio;
    private String ballisticArc;
    private Boolean cannotAttackGround;
    private Boolean collideFriendly;
    private String damage;
    private String damageType;
    private String displayName;
    private Property1007FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private String firingRandomness;
    private String firingTolerance;
    private String label;
    private String maxRadius;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private String muzzleVelocity;
    private String projectileID;
    private String projectileLifetimeUsesMultiplier;
    private String projectilesPerOnFire;
    private Property236RackBones rackBones;
    private Boolean rackFireTogether;
    private String rackRecoilDistance;
    private String rackReloadTimeout;
    private String rackSalvoChargeTime;
    private String rackSalvoReloadTime;
    private String rackSalvoSize;
    private Boolean rackSlavedToTurret;
    private String rangeCategory;
    private String rateOfFire;
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
    private String weaponCategory;
    private Boolean aboveWaterTargetsOnly;
    private String animationOpen;
    private String damageRadius;
    private String headingArcCenter;
    private String headingArcRange;
    private String muzzleChargeDelay;
    private Boolean slavedToBody;
    private String slavedToBodyArcRange;
    private Boolean damageFriendly;
    private Boolean dummyWeapon;
    private Property236Buffs buffs;
    private Boolean countedProjectile;
    private String energyDrainPerSecond;
    private String energyRequired;
    private Boolean forceSingleFire;
    private String initialProjectileStorage;
    private String manualFire;
    private String maxProjectileStorage;
    private String minRadius;
    private String nukeInnerRingDamage;
    private String nukeInnerRingRadius;
    private String nukeInnerRingTicks;
    private String nukeInnerRingTotalTime;
    private String nukeOuterRingDamage;
    private String nukeOuterRingRadius;
    private String nukeOuterRingTicks;
    private String nukeOuterRingTotalTime;
    private Boolean nukeWeapon;
    private String weaponRepackTimeout;
    private String weaponUnpackAnimation;
    private String weaponUnpackAnimationRate;
    private Boolean weaponUnpacks;
    private String projectileLifetime;
    private Boolean fireOnDeath;
    private Boolean renderFireClock;
    private Boolean yawOnlyOnTarget;
    private Boolean rackSalvoFiresAfterCharge;

    @JsonProperty("AlwaysRecheckTarget")
    public Boolean getAlwaysRecheckTarget() { return alwaysRecheckTarget; }
    @JsonProperty("AlwaysRecheckTarget")
    public void setAlwaysRecheckTarget(Boolean value) { this.alwaysRecheckTarget = value; }

    @JsonProperty("Audio")
    public Property227Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Property227Audio value) { this.audio = value; }

    @JsonProperty("BallisticArc")
    public String getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(String value) { this.ballisticArc = value; }

    @JsonProperty("CannotAttackGround")
    public Boolean getCannotAttackGround() { return cannotAttackGround; }
    @JsonProperty("CannotAttackGround")
    public void setCannotAttackGround(Boolean value) { this.cannotAttackGround = value; }

    @JsonProperty("CollideFriendly")
    public Boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(Boolean value) { this.collideFriendly = value; }

    @JsonProperty("Damage")
    public String getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(String value) { this.damage = value; }

    @JsonProperty("DamageType")
    public String getDamageType() { return damageType; }
    @JsonProperty("DamageType")
    public void setDamageType(String value) { this.damageType = value; }

    @JsonProperty("DisplayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("DisplayName")
    public void setDisplayName(String value) { this.displayName = value; }

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

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

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

    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public String getProjectileLifetimeUsesMultiplier() { return projectileLifetimeUsesMultiplier; }
    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public void setProjectileLifetimeUsesMultiplier(String value) { this.projectileLifetimeUsesMultiplier = value; }

    @JsonProperty("ProjectilesPerOnFire")
    public String getProjectilesPerOnFire() { return projectilesPerOnFire; }
    @JsonProperty("ProjectilesPerOnFire")
    public void setProjectilesPerOnFire(String value) { this.projectilesPerOnFire = value; }

    @JsonProperty("RackBones")
    public Property236RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property236RackBones value) { this.rackBones = value; }

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

    @JsonProperty("WeaponCategory")
    public String getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(String value) { this.weaponCategory = value; }

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("AnimationOpen")
    public String getAnimationOpen() { return animationOpen; }
    @JsonProperty("AnimationOpen")
    public void setAnimationOpen(String value) { this.animationOpen = value; }

    @JsonProperty("DamageRadius")
    public String getDamageRadius() { return damageRadius; }
    @JsonProperty("DamageRadius")
    public void setDamageRadius(String value) { this.damageRadius = value; }

    @JsonProperty("HeadingArcCenter")
    public String getHeadingArcCenter() { return headingArcCenter; }
    @JsonProperty("HeadingArcCenter")
    public void setHeadingArcCenter(String value) { this.headingArcCenter = value; }

    @JsonProperty("HeadingArcRange")
    public String getHeadingArcRange() { return headingArcRange; }
    @JsonProperty("HeadingArcRange")
    public void setHeadingArcRange(String value) { this.headingArcRange = value; }

    @JsonProperty("MuzzleChargeDelay")
    public String getMuzzleChargeDelay() { return muzzleChargeDelay; }
    @JsonProperty("MuzzleChargeDelay")
    public void setMuzzleChargeDelay(String value) { this.muzzleChargeDelay = value; }

    @JsonProperty("SlavedToBody")
    public Boolean getSlavedToBody() { return slavedToBody; }
    @JsonProperty("SlavedToBody")
    public void setSlavedToBody(Boolean value) { this.slavedToBody = value; }

    @JsonProperty("SlavedToBodyArcRange")
    public String getSlavedToBodyArcRange() { return slavedToBodyArcRange; }
    @JsonProperty("SlavedToBodyArcRange")
    public void setSlavedToBodyArcRange(String value) { this.slavedToBodyArcRange = value; }

    @JsonProperty("DamageFriendly")
    public Boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(Boolean value) { this.damageFriendly = value; }

    @JsonProperty("DummyWeapon")
    public Boolean getDummyWeapon() { return dummyWeapon; }
    @JsonProperty("DummyWeapon")
    public void setDummyWeapon(Boolean value) { this.dummyWeapon = value; }

    @JsonProperty("Buffs")
    public Property236Buffs getBuffs() { return buffs; }
    @JsonProperty("Buffs")
    public void setBuffs(Property236Buffs value) { this.buffs = value; }

    @JsonProperty("CountedProjectile")
    public Boolean getCountedProjectile() { return countedProjectile; }
    @JsonProperty("CountedProjectile")
    public void setCountedProjectile(Boolean value) { this.countedProjectile = value; }

    @JsonProperty("EnergyDrainPerSecond")
    public String getEnergyDrainPerSecond() { return energyDrainPerSecond; }
    @JsonProperty("EnergyDrainPerSecond")
    public void setEnergyDrainPerSecond(String value) { this.energyDrainPerSecond = value; }

    @JsonProperty("EnergyRequired")
    public String getEnergyRequired() { return energyRequired; }
    @JsonProperty("EnergyRequired")
    public void setEnergyRequired(String value) { this.energyRequired = value; }

    @JsonProperty("ForceSingleFire")
    public Boolean getForceSingleFire() { return forceSingleFire; }
    @JsonProperty("ForceSingleFire")
    public void setForceSingleFire(Boolean value) { this.forceSingleFire = value; }

    @JsonProperty("InitialProjectileStorage")
    public String getInitialProjectileStorage() { return initialProjectileStorage; }
    @JsonProperty("InitialProjectileStorage")
    public void setInitialProjectileStorage(String value) { this.initialProjectileStorage = value; }

    @JsonProperty("ManualFire")
    public String getManualFire() { return manualFire; }
    @JsonProperty("ManualFire")
    public void setManualFire(String value) { this.manualFire = value; }

    @JsonProperty("MaxProjectileStorage")
    public String getMaxProjectileStorage() { return maxProjectileStorage; }
    @JsonProperty("MaxProjectileStorage")
    public void setMaxProjectileStorage(String value) { this.maxProjectileStorage = value; }

    @JsonProperty("MinRadius")
    public String getMinRadius() { return minRadius; }
    @JsonProperty("MinRadius")
    public void setMinRadius(String value) { this.minRadius = value; }

    @JsonProperty("NukeInnerRingDamage")
    public String getNukeInnerRingDamage() { return nukeInnerRingDamage; }
    @JsonProperty("NukeInnerRingDamage")
    public void setNukeInnerRingDamage(String value) { this.nukeInnerRingDamage = value; }

    @JsonProperty("NukeInnerRingRadius")
    public String getNukeInnerRingRadius() { return nukeInnerRingRadius; }
    @JsonProperty("NukeInnerRingRadius")
    public void setNukeInnerRingRadius(String value) { this.nukeInnerRingRadius = value; }

    @JsonProperty("NukeInnerRingTicks")
    public String getNukeInnerRingTicks() { return nukeInnerRingTicks; }
    @JsonProperty("NukeInnerRingTicks")
    public void setNukeInnerRingTicks(String value) { this.nukeInnerRingTicks = value; }

    @JsonProperty("NukeInnerRingTotalTime")
    public String getNukeInnerRingTotalTime() { return nukeInnerRingTotalTime; }
    @JsonProperty("NukeInnerRingTotalTime")
    public void setNukeInnerRingTotalTime(String value) { this.nukeInnerRingTotalTime = value; }

    @JsonProperty("NukeOuterRingDamage")
    public String getNukeOuterRingDamage() { return nukeOuterRingDamage; }
    @JsonProperty("NukeOuterRingDamage")
    public void setNukeOuterRingDamage(String value) { this.nukeOuterRingDamage = value; }

    @JsonProperty("NukeOuterRingRadius")
    public String getNukeOuterRingRadius() { return nukeOuterRingRadius; }
    @JsonProperty("NukeOuterRingRadius")
    public void setNukeOuterRingRadius(String value) { this.nukeOuterRingRadius = value; }

    @JsonProperty("NukeOuterRingTicks")
    public String getNukeOuterRingTicks() { return nukeOuterRingTicks; }
    @JsonProperty("NukeOuterRingTicks")
    public void setNukeOuterRingTicks(String value) { this.nukeOuterRingTicks = value; }

    @JsonProperty("NukeOuterRingTotalTime")
    public String getNukeOuterRingTotalTime() { return nukeOuterRingTotalTime; }
    @JsonProperty("NukeOuterRingTotalTime")
    public void setNukeOuterRingTotalTime(String value) { this.nukeOuterRingTotalTime = value; }

    @JsonProperty("NukeWeapon")
    public Boolean getNukeWeapon() { return nukeWeapon; }
    @JsonProperty("NukeWeapon")
    public void setNukeWeapon(Boolean value) { this.nukeWeapon = value; }

    @JsonProperty("WeaponRepackTimeout")
    public String getWeaponRepackTimeout() { return weaponRepackTimeout; }
    @JsonProperty("WeaponRepackTimeout")
    public void setWeaponRepackTimeout(String value) { this.weaponRepackTimeout = value; }

    @JsonProperty("WeaponUnpackAnimation")
    public String getWeaponUnpackAnimation() { return weaponUnpackAnimation; }
    @JsonProperty("WeaponUnpackAnimation")
    public void setWeaponUnpackAnimation(String value) { this.weaponUnpackAnimation = value; }

    @JsonProperty("WeaponUnpackAnimationRate")
    public String getWeaponUnpackAnimationRate() { return weaponUnpackAnimationRate; }
    @JsonProperty("WeaponUnpackAnimationRate")
    public void setWeaponUnpackAnimationRate(String value) { this.weaponUnpackAnimationRate = value; }

    @JsonProperty("WeaponUnpacks")
    public Boolean getWeaponUnpacks() { return weaponUnpacks; }
    @JsonProperty("WeaponUnpacks")
    public void setWeaponUnpacks(Boolean value) { this.weaponUnpacks = value; }

    @JsonProperty("ProjectileLifetime")
    public String getProjectileLifetime() { return projectileLifetime; }
    @JsonProperty("ProjectileLifetime")
    public void setProjectileLifetime(String value) { this.projectileLifetime = value; }

    @JsonProperty("FireOnDeath")
    public Boolean getFireOnDeath() { return fireOnDeath; }
    @JsonProperty("FireOnDeath")
    public void setFireOnDeath(Boolean value) { this.fireOnDeath = value; }

    @JsonProperty("RenderFireClock")
    public Boolean getRenderFireClock() { return renderFireClock; }
    @JsonProperty("RenderFireClock")
    public void setRenderFireClock(Boolean value) { this.renderFireClock = value; }

    @JsonProperty("YawOnlyOnTarget")
    public Boolean getYawOnlyOnTarget() { return yawOnlyOnTarget; }
    @JsonProperty("YawOnlyOnTarget")
    public void setYawOnlyOnTarget(Boolean value) { this.yawOnlyOnTarget = value; }

    @JsonProperty("RackSalvoFiresAfterCharge")
    public Boolean getRackSalvoFiresAfterCharge() { return rackSalvoFiresAfterCharge; }
    @JsonProperty("RackSalvoFiresAfterCharge")
    public void setRackSalvoFiresAfterCharge(Boolean value) { this.rackSalvoFiresAfterCharge = value; }
}