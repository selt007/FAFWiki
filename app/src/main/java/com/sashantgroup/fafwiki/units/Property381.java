package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property381 {
    private Boolean aboveWaterTargetsOnly;
    private Boolean accurate;
    private String ballisticArc;
    private boolean collideFriendly;
    private String damage;
    private Boolean damageFriendly;
    private String damageRadius;
    private String damageType;
    private String displayName;
    private Property1007FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private Boolean fireOnDeath;
    private String firingTolerance;
    private Boolean ignoreIfDisabled;
    private String label;
    private String maxRadius;
    private String muzzleVelocity;
    private String projectileID;
    private String projectileLifetimeUsesMultiplier;
    private Property381RackBones rackBones;
    private String rangeCategory;
    private String rateOfFire;
    private String salvoSize;
    private Boolean slavedToBody;
    private String targetCheckInterval;
    private String targetRestrictDisallow;
    private Category weaponCategory;
    private Boolean aimsStraightOnDisable;
    private Property161Audio audio;
    private String beamCollisionDelay;
    private String beamLifetime;
    private String firingRandomness;
    private String maximumBeamLength;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private Boolean needPrep;
    private String projectilesPerOnFire;
    private Boolean rackFireTogether;
    private String rackRecoilDistance;
    private String rackReloadTimeout;
    private String rackSalvoChargeTime;
    private String rackSalvoReloadTime;
    private String rackSalvoSize;
    private String targetRestrictOnlyAllow;
    private String targetType;
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
    private String weaponRepackTimeout;
    private Boolean weaponUnpacks;

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("Accurate")
    public Boolean getAccurate() { return accurate; }
    @JsonProperty("Accurate")
    public void setAccurate(Boolean value) { this.accurate = value; }

    @JsonProperty("BallisticArc")
    public String getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(String value) { this.ballisticArc = value; }

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

    @JsonProperty("FireOnDeath")
    public Boolean getFireOnDeath() { return fireOnDeath; }
    @JsonProperty("FireOnDeath")
    public void setFireOnDeath(Boolean value) { this.fireOnDeath = value; }

    @JsonProperty("FiringTolerance")
    public String getFiringTolerance() { return firingTolerance; }
    @JsonProperty("FiringTolerance")
    public void setFiringTolerance(String value) { this.firingTolerance = value; }

    @JsonProperty("IgnoreIfDisabled")
    public Boolean getIgnoreIfDisabled() { return ignoreIfDisabled; }
    @JsonProperty("IgnoreIfDisabled")
    public void setIgnoreIfDisabled(Boolean value) { this.ignoreIfDisabled = value; }

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

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

    @JsonProperty("RackBones")
    public Property381RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property381RackBones value) { this.rackBones = value; }

    @JsonProperty("RangeCategory")
    public String getRangeCategory() { return rangeCategory; }
    @JsonProperty("RangeCategory")
    public void setRangeCategory(String value) { this.rangeCategory = value; }

    @JsonProperty("RateOfFire")
    public String getRateOfFire() { return rateOfFire; }
    @JsonProperty("RateOfFire")
    public void setRateOfFire(String value) { this.rateOfFire = value; }

    @JsonProperty("SalvoSize")
    public String getSalvoSize() { return salvoSize; }
    @JsonProperty("SalvoSize")
    public void setSalvoSize(String value) { this.salvoSize = value; }

    @JsonProperty("SlavedToBody")
    public Boolean getSlavedToBody() { return slavedToBody; }
    @JsonProperty("SlavedToBody")
    public void setSlavedToBody(Boolean value) { this.slavedToBody = value; }

    @JsonProperty("TargetCheckInterval")
    public String getTargetCheckInterval() { return targetCheckInterval; }
    @JsonProperty("TargetCheckInterval")
    public void setTargetCheckInterval(String value) { this.targetCheckInterval = value; }

    @JsonProperty("TargetRestrictDisallow")
    public String getTargetRestrictDisallow() { return targetRestrictDisallow; }
    @JsonProperty("TargetRestrictDisallow")
    public void setTargetRestrictDisallow(String value) { this.targetRestrictDisallow = value; }

    @JsonProperty("WeaponCategory")
    public Category getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(Category value) { this.weaponCategory = value; }

    @JsonProperty("AimsStraightOnDisable")
    public Boolean getAimsStraightOnDisable() { return aimsStraightOnDisable; }
    @JsonProperty("AimsStraightOnDisable")
    public void setAimsStraightOnDisable(Boolean value) { this.aimsStraightOnDisable = value; }

    @JsonProperty("Audio")
    public Property161Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Property161Audio value) { this.audio = value; }

    @JsonProperty("BeamCollisionDelay")
    public String getBeamCollisionDelay() { return beamCollisionDelay; }
    @JsonProperty("BeamCollisionDelay")
    public void setBeamCollisionDelay(String value) { this.beamCollisionDelay = value; }

    @JsonProperty("BeamLifetime")
    public String getBeamLifetime() { return beamLifetime; }
    @JsonProperty("BeamLifetime")
    public void setBeamLifetime(String value) { this.beamLifetime = value; }

    @JsonProperty("FiringRandomness")
    public String getFiringRandomness() { return firingRandomness; }
    @JsonProperty("FiringRandomness")
    public void setFiringRandomness(String value) { this.firingRandomness = value; }

    @JsonProperty("MaximumBeamLength")
    public String getMaximumBeamLength() { return maximumBeamLength; }
    @JsonProperty("MaximumBeamLength")
    public void setMaximumBeamLength(String value) { this.maximumBeamLength = value; }

    @JsonProperty("MuzzleSalvoDelay")
    public String getMuzzleSalvoDelay() { return muzzleSalvoDelay; }
    @JsonProperty("MuzzleSalvoDelay")
    public void setMuzzleSalvoDelay(String value) { this.muzzleSalvoDelay = value; }

    @JsonProperty("MuzzleSalvoSize")
    public String getMuzzleSalvoSize() { return muzzleSalvoSize; }
    @JsonProperty("MuzzleSalvoSize")
    public void setMuzzleSalvoSize(String value) { this.muzzleSalvoSize = value; }

    @JsonProperty("NeedPrep")
    public Boolean getNeedPrep() { return needPrep; }
    @JsonProperty("NeedPrep")
    public void setNeedPrep(Boolean value) { this.needPrep = value; }

    @JsonProperty("ProjectilesPerOnFire")
    public String getProjectilesPerOnFire() { return projectilesPerOnFire; }
    @JsonProperty("ProjectilesPerOnFire")
    public void setProjectilesPerOnFire(String value) { this.projectilesPerOnFire = value; }

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

    @JsonProperty("TargetRestrictOnlyAllow")
    public String getTargetRestrictOnlyAllow() { return targetRestrictOnlyAllow; }
    @JsonProperty("TargetRestrictOnlyAllow")
    public void setTargetRestrictOnlyAllow(String value) { this.targetRestrictOnlyAllow = value; }

    @JsonProperty("TargetType")
    public String getTargetType() { return targetType; }
    @JsonProperty("TargetType")
    public void setTargetType(String value) { this.targetType = value; }

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

    @JsonProperty("WeaponRepackTimeout")
    public String getWeaponRepackTimeout() { return weaponRepackTimeout; }
    @JsonProperty("WeaponRepackTimeout")
    public void setWeaponRepackTimeout(String value) { this.weaponRepackTimeout = value; }

    @JsonProperty("WeaponUnpacks")
    public Boolean getWeaponUnpacks() { return weaponUnpacks; }
    @JsonProperty("WeaponUnpacks")
    public void setWeaponUnpacks(Boolean value) { this.weaponUnpacks = value; }
}