package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property407 {
    private Audio audio;
    private String ballisticArc;
    private Boolean cannotAttackGround;
    private boolean collideFriendly;
    private String damage;
    private ArmorType damageType;
    private String displayName;
    private Property1007FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private String firingTolerance;
    private String headingArcCenter;
    private String headingArcRange;
    private String label;
    private String maxRadius;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private String muzzleVelocity;
    private Boolean prefersPrimaryWeaponTarget;
    private String projectileID;
    private String projectileLifetime;
    private Property407RackBones rackBones;
    private boolean rackFireTogether;
    private String rackRecoilDistance;
    private String rackReloadTimeout;
    private String rackSalvoChargeTime;
    private String rackSalvoReloadTime;
    private String rackSalvoSize;
    private boolean rackSlavedToTurret;
    private String rangeCategory;
    private String rateOfFire;
    private String targetCheckInterval;
    private String[] targetPriorities;
    private String targetRestrictDisallow;
    private String targetRestrictOnlyAllow;
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
    private Boolean weaponUnpacks;
    private Boolean aboveWaterTargetsOnly;
    private Boolean countedProjectile;
    private Boolean damageFriendly;
    private String damageRadius;
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

    @JsonProperty("Audio")
    public Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Audio value) { this.audio = value; }

    @JsonProperty("BallisticArc")
    public String getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(String value) { this.ballisticArc = value; }

    @JsonProperty("CannotAttackGround")
    public Boolean getCannotAttackGround() { return cannotAttackGround; }
    @JsonProperty("CannotAttackGround")
    public void setCannotAttackGround(Boolean value) { this.cannotAttackGround = value; }

    @JsonProperty("CollideFriendly")
    public boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(boolean value) { this.collideFriendly = value; }

    @JsonProperty("Damage")
    public String getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(String value) { this.damage = value; }

    @JsonProperty("DamageType")
    public ArmorType getDamageType() { return damageType; }
    @JsonProperty("DamageType")
    public void setDamageType(ArmorType value) { this.damageType = value; }

    @JsonProperty("DisplayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("DisplayName")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("FireTargetLayerCapsTable")
    public Property1007FireTargetLayerCapsTable getFireTargetLayerCapsTable() { return fireTargetLayerCapsTable; }
    @JsonProperty("FireTargetLayerCapsTable")
    public void setFireTargetLayerCapsTable(Property1007FireTargetLayerCapsTable value) { this.fireTargetLayerCapsTable = value; }

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

    @JsonProperty("PrefersPrimaryWeaponTarget")
    public Boolean getPrefersPrimaryWeaponTarget() { return prefersPrimaryWeaponTarget; }
    @JsonProperty("PrefersPrimaryWeaponTarget")
    public void setPrefersPrimaryWeaponTarget(Boolean value) { this.prefersPrimaryWeaponTarget = value; }

    @JsonProperty("ProjectileId")
    public String getProjectileID() { return projectileID; }
    @JsonProperty("ProjectileId")
    public void setProjectileID(String value) { this.projectileID = value; }

    @JsonProperty("ProjectileLifetime")
    public String getProjectileLifetime() { return projectileLifetime; }
    @JsonProperty("ProjectileLifetime")
    public void setProjectileLifetime(String value) { this.projectileLifetime = value; }

    @JsonProperty("RackBones")
    public Property407RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property407RackBones value) { this.rackBones = value; }

    @JsonProperty("RackFireTogether")
    public boolean getRackFireTogether() { return rackFireTogether; }
    @JsonProperty("RackFireTogether")
    public void setRackFireTogether(boolean value) { this.rackFireTogether = value; }

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
    public boolean getRackSlavedToTurret() { return rackSlavedToTurret; }
    @JsonProperty("RackSlavedToTurret")
    public void setRackSlavedToTurret(boolean value) { this.rackSlavedToTurret = value; }

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

    @JsonProperty("TargetRestrictOnlyAllow")
    public String getTargetRestrictOnlyAllow() { return targetRestrictOnlyAllow; }
    @JsonProperty("TargetRestrictOnlyAllow")
    public void setTargetRestrictOnlyAllow(String value) { this.targetRestrictOnlyAllow = value; }

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

    @JsonProperty("WeaponUnpacks")
    public Boolean getWeaponUnpacks() { return weaponUnpacks; }
    @JsonProperty("WeaponUnpacks")
    public void setWeaponUnpacks(Boolean value) { this.weaponUnpacks = value; }

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("CountedProjectile")
    public Boolean getCountedProjectile() { return countedProjectile; }
    @JsonProperty("CountedProjectile")
    public void setCountedProjectile(Boolean value) { this.countedProjectile = value; }

    @JsonProperty("DamageFriendly")
    public Boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(Boolean value) { this.damageFriendly = value; }

    @JsonProperty("DamageRadius")
    public String getDamageRadius() { return damageRadius; }
    @JsonProperty("DamageRadius")
    public void setDamageRadius(String value) { this.damageRadius = value; }

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
}
