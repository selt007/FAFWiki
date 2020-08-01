package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property354 {
    private Boolean aboveWaterTargetsOnly;
    private String damage;
    private boolean damageFriendly;
    private String damageRadius;
    private ArmorType damageType;
    private String displayName;
    private Boolean dummyWeapon;
    private String firingTolerance;
    private String label;
    private Category weaponCategory;
    private Audio audio;
    private Boolean autoInitiateAttackCommand;
    private String ballisticArc;
    private Boolean cannotAttackGround;
    private Boolean collideFriendly;
    private Property242FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private String minRadius;
    private String maxRadius;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private String muzzleVelocity;
    private Boolean notExclusive;
    private String projectileID;
    private String projectileLifetime;
    private String projectilesPerOnFire;
    private Property354RackBones rackBones;
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
    private String targetRestrictOnlyAllow;
    private String trackingRadius;
    private Boolean turreted;
    private Boolean useFiringSolutionInsteadOfAimBone;

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("Damage")
    public String getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(String value) { this.damage = value; }

    @JsonProperty("DamageFriendly")
    public boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(boolean value) { this.damageFriendly = value; }

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

    @JsonProperty("FiringTolerance")
    public String getFiringTolerance() { return firingTolerance; }
    @JsonProperty("FiringTolerance")
    public void setFiringTolerance(String value) { this.firingTolerance = value; }

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("WeaponCategory")
    public Category getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(Category value) { this.weaponCategory = value; }

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

    @JsonProperty("CannotAttackGround")
    public Boolean getCannotAttackGround() { return cannotAttackGround; }
    @JsonProperty("CannotAttackGround")
    public void setCannotAttackGround(Boolean value) { this.cannotAttackGround = value; }

    @JsonProperty("CollideFriendly")
    public Boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(Boolean value) { this.collideFriendly = value; }

    @JsonProperty("FireTargetLayerCapsTable")
    public Property242FireTargetLayerCapsTable getFireTargetLayerCapsTable() { return fireTargetLayerCapsTable; }
    @JsonProperty("FireTargetLayerCapsTable")
    public void setFireTargetLayerCapsTable(Property242FireTargetLayerCapsTable value) { this.fireTargetLayerCapsTable = value; }

    @JsonProperty("MinRadius")
    public String getMinRadius() { return minRadius; }
    @JsonProperty("MinRadius")
    public void setMinRadius(String value) { this.minRadius = value; }

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

    @JsonProperty("NotExclusive")
    public Boolean getNotExclusive() { return notExclusive; }
    @JsonProperty("NotExclusive")
    public void setNotExclusive(Boolean value) { this.notExclusive = value; }

    @JsonProperty("ProjectileId")
    public String getProjectileID() { return projectileID; }
    @JsonProperty("ProjectileId")
    public void setProjectileID(String value) { this.projectileID = value; }

    @JsonProperty("ProjectileLifetime")
    public String getProjectileLifetime() { return projectileLifetime; }
    @JsonProperty("ProjectileLifetime")
    public void setProjectileLifetime(String value) { this.projectileLifetime = value; }

    @JsonProperty("ProjectilesPerOnFire")
    public String getProjectilesPerOnFire() { return projectilesPerOnFire; }
    @JsonProperty("ProjectilesPerOnFire")
    public void setProjectilesPerOnFire(String value) { this.projectilesPerOnFire = value; }

    @JsonProperty("RackBones")
    public Property354RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property354RackBones value) { this.rackBones = value; }

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

    @JsonProperty("TargetRestrictOnlyAllow")
    public String getTargetRestrictOnlyAllow() { return targetRestrictOnlyAllow; }
    @JsonProperty("TargetRestrictOnlyAllow")
    public void setTargetRestrictOnlyAllow(String value) { this.targetRestrictOnlyAllow = value; }

    @JsonProperty("TrackingRadius")
    public String getTrackingRadius() { return trackingRadius; }
    @JsonProperty("TrackingRadius")
    public void setTrackingRadius(String value) { this.trackingRadius = value; }

    @JsonProperty("Turreted")
    public Boolean getTurreted() { return turreted; }
    @JsonProperty("Turreted")
    public void setTurreted(Boolean value) { this.turreted = value; }

    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public Boolean getUseFiringSolutionInsteadOfAimBone() { return useFiringSolutionInsteadOfAimBone; }
    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public void setUseFiringSolutionInsteadOfAimBone(Boolean value) { this.useFiringSolutionInsteadOfAimBone = value; }
}
