package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property283 {
    private Boolean aboveWaterTargetsOnly;
    private Audio audio;
    private Boolean autoInitiateAttackCommand;
    private String ballisticArc;
    private String bombDropThreshold;
    private boolean collideFriendly;
    private String damage;
    private Boolean damageFriendly;
    private String damageRadius;
    private ArmorType damageType;
    private String displayName;
    private String effectiveRadius;
    private Property1007FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private String firingRandomness;
    private String firingTolerance;
    private Boolean fixBombTrajectory;
    private String label;
    private String maxRadius;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private String muzzleVelocity;
    private Boolean needToComputeBombDrop;
    private String projectileID;
    private String projectilesPerOnFire;
    private Property283RackBones rackBones;
    private boolean rackFireTogether;
    private String rackRecoilDistance;
    private String rackReloadTimeout;
    private String rackSalvoChargeTime;
    private String rackSalvoReloadTime;
    private String rackSalvoSize;
    private boolean rackSlavedToTurret;
    private String rateOfFire;
    private String targetCheckInterval;
    private String[] targetPriorities;
    private String targetRestrictDisallow;
    private String trackingRadius;
    private boolean turretDualManipulators;
    private boolean turreted;
    private String weaponCategory;
    private String weaponRepackTimeout;
    private boolean weaponUnpacks;
    private DepthCharge depthCharge;
    private String minRadius;
    private String projectileLifetime;
    private String rangeCategory;
    private String targetRestrictOnlyAllow;
    private String targetType;
    private String turretPitch;
    private String turretPitchRange;
    private String turretPitchSpeed;
    private String turretYaw;
    private String turretYawRange;
    private String turretYawSpeed;

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("Audio")
    public Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Audio value) { this.audio = value; }

    @JsonProperty("AutoInitiateAttackCommand")
    public Boolean getAutoInitiateAttackCommand() { return autoInitiateAttackCommand; }
    @JsonProperty("AutoInitiateAttackCommand")
    public void setAutoInitiateAttackCommand(Boolean value) { this.autoInitiateAttackCommand = value; }

    @JsonProperty("BallisticArc")
    public String getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(String value) { this.ballisticArc = value; }

    @JsonProperty("BombDropThreshold")
    public String getBombDropThreshold() { return bombDropThreshold; }
    @JsonProperty("BombDropThreshold")
    public void setBombDropThreshold(String value) { this.bombDropThreshold = value; }

    @JsonProperty("CollideFriendly")
    public boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(boolean value) { this.collideFriendly = value; }

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

    @JsonProperty("EffectiveRadius")
    public String getEffectiveRadius() { return effectiveRadius; }
    @JsonProperty("EffectiveRadius")
    public void setEffectiveRadius(String value) { this.effectiveRadius = value; }

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

    @JsonProperty("FixBombTrajectory")
    public Boolean getFixBombTrajectory() { return fixBombTrajectory; }
    @JsonProperty("FixBombTrajectory")
    public void setFixBombTrajectory(Boolean value) { this.fixBombTrajectory = value; }

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

    @JsonProperty("NeedToComputeBombDrop")
    public Boolean getNeedToComputeBombDrop() { return needToComputeBombDrop; }
    @JsonProperty("NeedToComputeBombDrop")
    public void setNeedToComputeBombDrop(Boolean value) { this.needToComputeBombDrop = value; }

    @JsonProperty("ProjectileId")
    public String getProjectileID() { return projectileID; }
    @JsonProperty("ProjectileId")
    public void setProjectileID(String value) { this.projectileID = value; }

    @JsonProperty("ProjectilesPerOnFire")
    public String getProjectilesPerOnFire() { return projectilesPerOnFire; }
    @JsonProperty("ProjectilesPerOnFire")
    public void setProjectilesPerOnFire(String value) { this.projectilesPerOnFire = value; }

    @JsonProperty("RackBones")
    public Property283RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property283RackBones value) { this.rackBones = value; }

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

    @JsonProperty("TurretDualManipulators")
    public boolean getTurretDualManipulators() { return turretDualManipulators; }
    @JsonProperty("TurretDualManipulators")
    public void setTurretDualManipulators(boolean value) { this.turretDualManipulators = value; }

    @JsonProperty("Turreted")
    public boolean getTurreted() { return turreted; }
    @JsonProperty("Turreted")
    public void setTurreted(boolean value) { this.turreted = value; }

    @JsonProperty("WeaponCategory")
    public String getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(String value) { this.weaponCategory = value; }

    @JsonProperty("WeaponRepackTimeout")
    public String getWeaponRepackTimeout() { return weaponRepackTimeout; }
    @JsonProperty("WeaponRepackTimeout")
    public void setWeaponRepackTimeout(String value) { this.weaponRepackTimeout = value; }

    @JsonProperty("WeaponUnpacks")
    public boolean getWeaponUnpacks() { return weaponUnpacks; }
    @JsonProperty("WeaponUnpacks")
    public void setWeaponUnpacks(boolean value) { this.weaponUnpacks = value; }

    @JsonProperty("DepthCharge")
    public DepthCharge getDepthCharge() { return depthCharge; }
    @JsonProperty("DepthCharge")
    public void setDepthCharge(DepthCharge value) { this.depthCharge = value; }

    @JsonProperty("MinRadius")
    public String getMinRadius() { return minRadius; }
    @JsonProperty("MinRadius")
    public void setMinRadius(String value) { this.minRadius = value; }

    @JsonProperty("ProjectileLifetime")
    public String getProjectileLifetime() { return projectileLifetime; }
    @JsonProperty("ProjectileLifetime")
    public void setProjectileLifetime(String value) { this.projectileLifetime = value; }

    @JsonProperty("RangeCategory")
    public String getRangeCategory() { return rangeCategory; }
    @JsonProperty("RangeCategory")
    public void setRangeCategory(String value) { this.rangeCategory = value; }

    @JsonProperty("TargetRestrictOnlyAllow")
    public String getTargetRestrictOnlyAllow() { return targetRestrictOnlyAllow; }
    @JsonProperty("TargetRestrictOnlyAllow")
    public void setTargetRestrictOnlyAllow(String value) { this.targetRestrictOnlyAllow = value; }

    @JsonProperty("TargetType")
    public String getTargetType() { return targetType; }
    @JsonProperty("TargetType")
    public void setTargetType(String value) { this.targetType = value; }

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
}