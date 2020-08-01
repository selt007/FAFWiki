package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property391 {
    private boolean aboveWaterTargetsOnly;
    private Audio audio;
    private String ballisticArc;
    private boolean collideFriendly;
    private boolean countedProjectile;
    private String damage;
    private boolean damageFriendly;
    private String damageRadius;
    private ArmorType damageType;
    private String displayName;
    private Property301FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private String firingTolerance;
    private String initialProjectileStorage;
    private String label;
    private String manualFire;
    private String maxProjectileStorage;
    private String maxRadius;
    private String minRadius;
    private String muzzleSalvoDelay;
    private String muzzleSalvoSize;
    private String muzzleVelocity;
    private String nukeInnerRingDamage;
    private String nukeInnerRingRadius;
    private String nukeInnerRingTicks;
    private String nukeInnerRingTotalTime;
    private String nukeOuterRingDamage;
    private String nukeOuterRingRadius;
    private String nukeOuterRingTicks;
    private String nukeOuterRingTotalTime;
    private boolean nukeWeapon;
    private String projectileID;
    private Property391RackBones rackBones;
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
    private String targetRestrictDisallow;
    private String weaponCategory;

    @JsonProperty("AboveWaterTargetsOnly")
    public boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("Audio")
    public Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Audio value) { this.audio = value; }

    @JsonProperty("BallisticArc")
    public String getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(String value) { this.ballisticArc = value; }

    @JsonProperty("CollideFriendly")
    public boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(boolean value) { this.collideFriendly = value; }

    @JsonProperty("CountedProjectile")
    public boolean getCountedProjectile() { return countedProjectile; }
    @JsonProperty("CountedProjectile")
    public void setCountedProjectile(boolean value) { this.countedProjectile = value; }

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

    @JsonProperty("FireTargetLayerCapsTable")
    public Property301FireTargetLayerCapsTable getFireTargetLayerCapsTable() { return fireTargetLayerCapsTable; }
    @JsonProperty("FireTargetLayerCapsTable")
    public void setFireTargetLayerCapsTable(Property301FireTargetLayerCapsTable value) { this.fireTargetLayerCapsTable = value; }

    @JsonProperty("FiringTolerance")
    public String getFiringTolerance() { return firingTolerance; }
    @JsonProperty("FiringTolerance")
    public void setFiringTolerance(String value) { this.firingTolerance = value; }

    @JsonProperty("InitialProjectileStorage")
    public String getInitialProjectileStorage() { return initialProjectileStorage; }
    @JsonProperty("InitialProjectileStorage")
    public void setInitialProjectileStorage(String value) { this.initialProjectileStorage = value; }

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("ManualFire")
    public String getManualFire() { return manualFire; }
    @JsonProperty("ManualFire")
    public void setManualFire(String value) { this.manualFire = value; }

    @JsonProperty("MaxProjectileStorage")
    public String getMaxProjectileStorage() { return maxProjectileStorage; }
    @JsonProperty("MaxProjectileStorage")
    public void setMaxProjectileStorage(String value) { this.maxProjectileStorage = value; }

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
    public boolean getNukeWeapon() { return nukeWeapon; }
    @JsonProperty("NukeWeapon")
    public void setNukeWeapon(boolean value) { this.nukeWeapon = value; }

    @JsonProperty("ProjectileId")
    public String getProjectileID() { return projectileID; }
    @JsonProperty("ProjectileId")
    public void setProjectileID(String value) { this.projectileID = value; }

    @JsonProperty("RackBones")
    public Property391RackBones getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(Property391RackBones value) { this.rackBones = value; }

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

    @JsonProperty("TargetRestrictDisallow")
    public String getTargetRestrictDisallow() { return targetRestrictDisallow; }
    @JsonProperty("TargetRestrictDisallow")
    public void setTargetRestrictDisallow(String value) { this.targetRestrictDisallow = value; }

    @JsonProperty("WeaponCategory")
    public String getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(String value) { this.weaponCategory = value; }
}
