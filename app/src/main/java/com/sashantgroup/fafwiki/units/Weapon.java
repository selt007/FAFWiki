package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class Weapon {
    private String displayName;
    private Double damage;
    private Double firingTolerance;
    private String label;
    private WeaponCategory weaponCategory;
    private Boolean dummyWeapon;
    private Double damageRadius;
    private MissileBone damageType;
    private Boolean damageFriendly;
    private Boolean collideFriendly;
    private TargetRestrictOnlyAllow targetRestrictOnlyAllow;
    private Double muzzleVelocity;
    private FireTargetLayerCapsTable fireTargetLayerCapsTable;
    private Boolean rackFireTogether;
    private RangeCategory rangeCategory;
    private Double maxRadius;
    private Double trackingRadius;
    private Boolean slavedToBody;
    private Long turretPitchSpeed;
    private String turretBoneMuzzle;
    private Long turretYaw;
    private Long projectilesPerOnFire;
    private Long muzzleSalvoSize;
    private Long rackReloadTimeout;
    private Boolean needPrep;
    private Double rackSalvoReloadTime;
    private Boolean turreted;
    private Long slavedToBodyArcRange;
    private Double muzzleSalvoDelay;
    private Boolean turretDualManipulators;
    private TargetRestrictDisallow targetRestrictDisallow;
    private Long turretYawSpeed;
    private Long turretYawRange;
    private Long turretPitchRange;
    private Boolean autoInitiateAttackCommand;
    private Long turretPitch;
    private Double targetCheckInterval;
    private Boolean rackSlavedToTurret;
    private Boolean cannotAttackGround;
    private String turretBonePitch;
    private String[] targetPriorities;
    private Double rateOfFire;
    private String turretBoneYaw;
    private Long rackSalvoSize;
    private Map<String, UISelection> audio;
    private Boolean useFiringSolutionInsteadOfAimBone;
    private RackBone[] rackBones;
    private Double rackRecoilDistance;
    private Double rackSalvoChargeTime;
    private Double projectileLifetimeUsesMultiplier;
    private String projectileID;
    private BallisticArc ballisticArc;
    private Double projectileLifetime;
    private Boolean prefersPrimaryWeaponTarget;
    private Buff[] buffs;
    private Boolean aboveWaterTargetsOnly;
    private Boolean needToComputeBombDrop;
    private Double firingRandomness;
    private Boolean fixBombTrajectory;
    private Double bombDropThreshold;
    private Long headingArcCenter;
    private Long effectiveRadius;
    private Long headingArcRange;
    private Double minRadius;
    private String display;
    private Boolean alwaysRecheckTarget;
    private Boolean weaponUnpacks;
    private Double beamLifetime;
    private Double weaponRepackTimeout;
    private Double beamCollisionDelay;
    private Double muzzleChargeDelay;
    private Long maximumBeamLength;
    private Boolean rackSalvoFiresAfterCharge;
    private String weaponUnpackAnimation;
    private Double weaponUnpackAnimationRate;
    private Boolean detonatesAtTargetHeight;
    private Long muzzleVelocityReduceDistance;
    private Boolean artilleryShieldBlocks;
    private Double firingRandomnessWhileMoving;
    private Boolean leadTarget;
    private TargetType targetType;
    private Boolean countedProjectile;
    private Boolean renderFireClock;
    private BallisticArc ballicsticArc;
    private Flare flare;
    private Long damageToShields;
    private String[] transcendentPriorities;
    private Double doTTime;
    private Long doTPulses;
    private Boolean weaponUnpackLocksMotion;
    private String animationOpen;
    private Long nukeOuterRingTotalTime;
    private Long nukeInnerRingTicks;
    private ManualFire manualFire;
    private Long nukeOuterRingDamage;
    private Long initialProjectileStorage;
    private Long maxProjectileStorage;
    private Long nukeOuterRingTicks;
    private Long nukeOuterRingRadius;
    private Long nukeInnerRingTotalTime;
    private Long nukeInnerRingDamage;
    private Boolean nukeWeapon;
    private Long nukeInnerRingRadius;
    private Boolean yawOnlyOnTarget;
    private Double chargeDelay;
    private Boolean aboveWaterFireOnly;
    private Boolean fireOnDeath;
    private Boolean reTargetOnMiss;
    private Boolean forceSingleFire;
    private Long cameraShakeRadius;
    private Long cameraShakeMax;
    private Double cameraShakeDuration;
    private Long cameraShakeMin;
    private Long energyRequired;
    private Long energyDrainPerSecond;
    private Boolean aimsStraightOnDisable;
    private Boolean continuousBeam;
    private String muzzleSpecial;
    private Boolean notExclusive;
    private Overcharge overcharge;
    private Boolean energyChargeForFirstShot;
    private Boolean overChargeWeapon;
    private Boolean canFireFromTransport;
    private String enabledByEnhancement;
    private Long salvoSize;
    private Double salvoShotDelay;
    private Double muzzleVelocityRandom;
    private Long aimControlPrecedence;
    private Long cameraLifetime;
    private Long cameraVisionRadius;
    private String turretBoneDualMuzzle;
    private String turretBoneDualPitch;
    private Double initialDamage;
    private Boolean noPause;
    private Double muzzleVelocityRandomness;
    private Boolean skipReadyState;
    private Boolean stopOnPrimaryWeaponBusy;
    private DepthCharge depthCharge;
    private String animationReload;
    private TargetRestrictOnlyAllow[] doNotCollideList;
    private String toggleWeapon;
    private Boolean preferPrimaryWeaponTarget;
    private Boolean fireOnSelfDestruct;
    private Boolean accurate;
    private Boolean ignoreIfDisabled;
    private Long weaponUnpackTimeout;
    private Long weaponUnpackAnimatorPrecedence;
    private Long fixedSpreadRadius;
    private Boolean belowWaterFireOnly;
    private Long rackRecoilReturnSpeed;
    private Long muzzleSalvoChargeDelay;
    private BarrelLoop muzzleChargeStart;
    private BarrelLoop barrelLoop;
    private BarrelLoop barrelStart;

    @JsonProperty("DisplayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("DisplayName")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("Damage")
    public Double getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(Double value) { this.damage = value; }

    @JsonProperty("FiringTolerance")
    public Double getFiringTolerance() { return firingTolerance; }
    @JsonProperty("FiringTolerance")
    public void setFiringTolerance(Double value) { this.firingTolerance = value; }

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("WeaponCategory")
    public WeaponCategory getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(WeaponCategory value) { this.weaponCategory = value; }

    @JsonProperty("DummyWeapon")
    public Boolean getDummyWeapon() { return dummyWeapon; }
    @JsonProperty("DummyWeapon")
    public void setDummyWeapon(Boolean value) { this.dummyWeapon = value; }

    @JsonProperty("DamageRadius")
    public Double getDamageRadius() { return damageRadius; }
    @JsonProperty("DamageRadius")
    public void setDamageRadius(Double value) { this.damageRadius = value; }

    @JsonProperty("DamageType")
    public MissileBone getDamageType() { return damageType; }
    @JsonProperty("DamageType")
    public void setDamageType(MissileBone value) { this.damageType = value; }

    @JsonProperty("DamageFriendly")
    public Boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(Boolean value) { this.damageFriendly = value; }

    @JsonProperty("CollideFriendly")
    public Boolean getCollideFriendly() { return collideFriendly; }
    @JsonProperty("CollideFriendly")
    public void setCollideFriendly(Boolean value) { this.collideFriendly = value; }

    @JsonProperty("TargetRestrictOnlyAllow")
    public TargetRestrictOnlyAllow getTargetRestrictOnlyAllow() { return targetRestrictOnlyAllow; }
    @JsonProperty("TargetRestrictOnlyAllow")
    public void setTargetRestrictOnlyAllow(TargetRestrictOnlyAllow value) { this.targetRestrictOnlyAllow = value; }

    @JsonProperty("MuzzleVelocity")
    public Double getMuzzleVelocity() { return muzzleVelocity; }
    @JsonProperty("MuzzleVelocity")
    public void setMuzzleVelocity(Double value) { this.muzzleVelocity = value; }

    @JsonProperty("FireTargetLayerCapsTable")
    public FireTargetLayerCapsTable getFireTargetLayerCapsTable() { return fireTargetLayerCapsTable; }
    @JsonProperty("FireTargetLayerCapsTable")
    public void setFireTargetLayerCapsTable(FireTargetLayerCapsTable value) { this.fireTargetLayerCapsTable = value; }

    @JsonProperty("RackFireTogether")
    public Boolean getRackFireTogether() { return rackFireTogether; }
    @JsonProperty("RackFireTogether")
    public void setRackFireTogether(Boolean value) { this.rackFireTogether = value; }

    @JsonProperty("RangeCategory")
    public RangeCategory getRangeCategory() { return rangeCategory; }
    @JsonProperty("RangeCategory")
    public void setRangeCategory(RangeCategory value) { this.rangeCategory = value; }

    @JsonProperty("MaxRadius")
    public Double getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(Double value) { this.maxRadius = value; }

    @JsonProperty("TrackingRadius")
    public Double getTrackingRadius() { return trackingRadius; }
    @JsonProperty("TrackingRadius")
    public void setTrackingRadius(Double value) { this.trackingRadius = value; }

    @JsonProperty("SlavedToBody")
    public Boolean getSlavedToBody() { return slavedToBody; }
    @JsonProperty("SlavedToBody")
    public void setSlavedToBody(Boolean value) { this.slavedToBody = value; }

    @JsonProperty("TurretPitchSpeed")
    public Long getTurretPitchSpeed() { return turretPitchSpeed; }
    @JsonProperty("TurretPitchSpeed")
    public void setTurretPitchSpeed(Long value) { this.turretPitchSpeed = value; }

    @JsonProperty("TurretBoneMuzzle")
    public String getTurretBoneMuzzle() { return turretBoneMuzzle; }
    @JsonProperty("TurretBoneMuzzle")
    public void setTurretBoneMuzzle(String value) { this.turretBoneMuzzle = value; }

    @JsonProperty("TurretYaw")
    public Long getTurretYaw() { return turretYaw; }
    @JsonProperty("TurretYaw")
    public void setTurretYaw(Long value) { this.turretYaw = value; }

    @JsonProperty("ProjectilesPerOnFire")
    public Long getProjectilesPerOnFire() { return projectilesPerOnFire; }
    @JsonProperty("ProjectilesPerOnFire")
    public void setProjectilesPerOnFire(Long value) { this.projectilesPerOnFire = value; }

    @JsonProperty("MuzzleSalvoSize")
    public Long getMuzzleSalvoSize() { return muzzleSalvoSize; }
    @JsonProperty("MuzzleSalvoSize")
    public void setMuzzleSalvoSize(Long value) { this.muzzleSalvoSize = value; }

    @JsonProperty("RackReloadTimeout")
    public Long getRackReloadTimeout() { return rackReloadTimeout; }
    @JsonProperty("RackReloadTimeout")
    public void setRackReloadTimeout(Long value) { this.rackReloadTimeout = value; }

    @JsonProperty("NeedPrep")
    public Boolean getNeedPrep() { return needPrep; }
    @JsonProperty("NeedPrep")
    public void setNeedPrep(Boolean value) { this.needPrep = value; }

    @JsonProperty("RackSalvoReloadTime")
    public Double getRackSalvoReloadTime() { return rackSalvoReloadTime; }
    @JsonProperty("RackSalvoReloadTime")
    public void setRackSalvoReloadTime(Double value) { this.rackSalvoReloadTime = value; }

    @JsonProperty("Turreted")
    public Boolean getTurreted() { return turreted; }
    @JsonProperty("Turreted")
    public void setTurreted(Boolean value) { this.turreted = value; }

    @JsonProperty("SlavedToBodyArcRange")
    public Long getSlavedToBodyArcRange() { return slavedToBodyArcRange; }
    @JsonProperty("SlavedToBodyArcRange")
    public void setSlavedToBodyArcRange(Long value) { this.slavedToBodyArcRange = value; }

    @JsonProperty("MuzzleSalvoDelay")
    public Double getMuzzleSalvoDelay() { return muzzleSalvoDelay; }
    @JsonProperty("MuzzleSalvoDelay")
    public void setMuzzleSalvoDelay(Double value) { this.muzzleSalvoDelay = value; }

    @JsonProperty("TurretDualManipulators")
    public Boolean getTurretDualManipulators() { return turretDualManipulators; }
    @JsonProperty("TurretDualManipulators")
    public void setTurretDualManipulators(Boolean value) { this.turretDualManipulators = value; }

    @JsonProperty("TargetRestrictDisallow")
    public TargetRestrictDisallow getTargetRestrictDisallow() { return targetRestrictDisallow; }
    @JsonProperty("TargetRestrictDisallow")
    public void setTargetRestrictDisallow(TargetRestrictDisallow value) { this.targetRestrictDisallow = value; }

    @JsonProperty("TurretYawSpeed")
    public Long getTurretYawSpeed() { return turretYawSpeed; }
    @JsonProperty("TurretYawSpeed")
    public void setTurretYawSpeed(Long value) { this.turretYawSpeed = value; }

    @JsonProperty("TurretYawRange")
    public Long getTurretYawRange() { return turretYawRange; }
    @JsonProperty("TurretYawRange")
    public void setTurretYawRange(Long value) { this.turretYawRange = value; }

    @JsonProperty("TurretPitchRange")
    public Long getTurretPitchRange() { return turretPitchRange; }
    @JsonProperty("TurretPitchRange")
    public void setTurretPitchRange(Long value) { this.turretPitchRange = value; }

    @JsonProperty("AutoInitiateAttackCommand")
    public Boolean getAutoInitiateAttackCommand() { return autoInitiateAttackCommand; }
    @JsonProperty("AutoInitiateAttackCommand")
    public void setAutoInitiateAttackCommand(Boolean value) { this.autoInitiateAttackCommand = value; }

    @JsonProperty("TurretPitch")
    public Long getTurretPitch() { return turretPitch; }
    @JsonProperty("TurretPitch")
    public void setTurretPitch(Long value) { this.turretPitch = value; }

    @JsonProperty("TargetCheckInterval")
    public Double getTargetCheckInterval() { return targetCheckInterval; }
    @JsonProperty("TargetCheckInterval")
    public void setTargetCheckInterval(Double value) { this.targetCheckInterval = value; }

    @JsonProperty("RackSlavedToTurret")
    public Boolean getRackSlavedToTurret() { return rackSlavedToTurret; }
    @JsonProperty("RackSlavedToTurret")
    public void setRackSlavedToTurret(Boolean value) { this.rackSlavedToTurret = value; }

    @JsonProperty("CannotAttackGround")
    public Boolean getCannotAttackGround() { return cannotAttackGround; }
    @JsonProperty("CannotAttackGround")
    public void setCannotAttackGround(Boolean value) { this.cannotAttackGround = value; }

    @JsonProperty("TurretBonePitch")
    public String getTurretBonePitch() { return turretBonePitch; }
    @JsonProperty("TurretBonePitch")
    public void setTurretBonePitch(String value) { this.turretBonePitch = value; }

    @JsonProperty("TargetPriorities")
    public String[] getTargetPriorities() { return targetPriorities; }
    @JsonProperty("TargetPriorities")
    public void setTargetPriorities(String[] value) { this.targetPriorities = value; }

    @JsonProperty("RateOfFire")
    public Double getRateOfFire() { return rateOfFire; }
    @JsonProperty("RateOfFire")
    public void setRateOfFire(Double value) { this.rateOfFire = value; }

    @JsonProperty("TurretBoneYaw")
    public String getTurretBoneYaw() { return turretBoneYaw; }
    @JsonProperty("TurretBoneYaw")
    public void setTurretBoneYaw(String value) { this.turretBoneYaw = value; }

    @JsonProperty("RackSalvoSize")
    public Long getRackSalvoSize() { return rackSalvoSize; }
    @JsonProperty("RackSalvoSize")
    public void setRackSalvoSize(Long value) { this.rackSalvoSize = value; }

    @JsonProperty("Audio")
    public Map<String, UISelection> getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Map<String, UISelection> value) { this.audio = value; }

    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public Boolean getUseFiringSolutionInsteadOfAimBone() { return useFiringSolutionInsteadOfAimBone; }
    @JsonProperty("UseFiringSolutionInsteadOfAimBone")
    public void setUseFiringSolutionInsteadOfAimBone(Boolean value) { this.useFiringSolutionInsteadOfAimBone = value; }

    @JsonProperty("RackBones")
    public RackBone[] getRackBones() { return rackBones; }
    @JsonProperty("RackBones")
    public void setRackBones(RackBone[] value) { this.rackBones = value; }

    @JsonProperty("RackRecoilDistance")
    public Double getRackRecoilDistance() { return rackRecoilDistance; }
    @JsonProperty("RackRecoilDistance")
    public void setRackRecoilDistance(Double value) { this.rackRecoilDistance = value; }

    @JsonProperty("RackSalvoChargeTime")
    public Double getRackSalvoChargeTime() { return rackSalvoChargeTime; }
    @JsonProperty("RackSalvoChargeTime")
    public void setRackSalvoChargeTime(Double value) { this.rackSalvoChargeTime = value; }

    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public Double getProjectileLifetimeUsesMultiplier() { return projectileLifetimeUsesMultiplier; }
    @JsonProperty("ProjectileLifetimeUsesMultiplier")
    public void setProjectileLifetimeUsesMultiplier(Double value) { this.projectileLifetimeUsesMultiplier = value; }

    @JsonProperty("ProjectileId")
    public String getProjectileID() { return projectileID; }
    @JsonProperty("ProjectileId")
    public void setProjectileID(String value) { this.projectileID = value; }

    @JsonProperty("BallisticArc")
    public BallisticArc getBallisticArc() { return ballisticArc; }
    @JsonProperty("BallisticArc")
    public void setBallisticArc(BallisticArc value) { this.ballisticArc = value; }

    @JsonProperty("ProjectileLifetime")
    public Double getProjectileLifetime() { return projectileLifetime; }
    @JsonProperty("ProjectileLifetime")
    public void setProjectileLifetime(Double value) { this.projectileLifetime = value; }

    @JsonProperty("PrefersPrimaryWeaponTarget")
    public Boolean getPrefersPrimaryWeaponTarget() { return prefersPrimaryWeaponTarget; }
    @JsonProperty("PrefersPrimaryWeaponTarget")
    public void setPrefersPrimaryWeaponTarget(Boolean value) { this.prefersPrimaryWeaponTarget = value; }

    @JsonProperty("Buffs")
    public Buff[] getBuffs() { return buffs; }
    @JsonProperty("Buffs")
    public void setBuffs(Buff[] value) { this.buffs = value; }

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("NeedToComputeBombDrop")
    public Boolean getNeedToComputeBombDrop() { return needToComputeBombDrop; }
    @JsonProperty("NeedToComputeBombDrop")
    public void setNeedToComputeBombDrop(Boolean value) { this.needToComputeBombDrop = value; }

    @JsonProperty("FiringRandomness")
    public Double getFiringRandomness() { return firingRandomness; }
    @JsonProperty("FiringRandomness")
    public void setFiringRandomness(Double value) { this.firingRandomness = value; }

    @JsonProperty("FixBombTrajectory")
    public Boolean getFixBombTrajectory() { return fixBombTrajectory; }
    @JsonProperty("FixBombTrajectory")
    public void setFixBombTrajectory(Boolean value) { this.fixBombTrajectory = value; }

    @JsonProperty("BombDropThreshold")
    public Double getBombDropThreshold() { return bombDropThreshold; }
    @JsonProperty("BombDropThreshold")
    public void setBombDropThreshold(Double value) { this.bombDropThreshold = value; }

    @JsonProperty("HeadingArcCenter")
    public Long getHeadingArcCenter() { return headingArcCenter; }
    @JsonProperty("HeadingArcCenter")
    public void setHeadingArcCenter(Long value) { this.headingArcCenter = value; }

    @JsonProperty("EffectiveRadius")
    public Long getEffectiveRadius() { return effectiveRadius; }
    @JsonProperty("EffectiveRadius")
    public void setEffectiveRadius(Long value) { this.effectiveRadius = value; }

    @JsonProperty("HeadingArcRange")
    public Long getHeadingArcRange() { return headingArcRange; }
    @JsonProperty("HeadingArcRange")
    public void setHeadingArcRange(Long value) { this.headingArcRange = value; }

    @JsonProperty("MinRadius")
    public Double getMinRadius() { return minRadius; }
    @JsonProperty("MinRadius")
    public void setMinRadius(Double value) { this.minRadius = value; }

    @JsonProperty("Display")
    public String getDisplay() { return display; }
    @JsonProperty("Display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("AlwaysRecheckTarget")
    public Boolean getAlwaysRecheckTarget() { return alwaysRecheckTarget; }
    @JsonProperty("AlwaysRecheckTarget")
    public void setAlwaysRecheckTarget(Boolean value) { this.alwaysRecheckTarget = value; }

    @JsonProperty("WeaponUnpacks")
    public Boolean getWeaponUnpacks() { return weaponUnpacks; }
    @JsonProperty("WeaponUnpacks")
    public void setWeaponUnpacks(Boolean value) { this.weaponUnpacks = value; }

    @JsonProperty("BeamLifetime")
    public Double getBeamLifetime() { return beamLifetime; }
    @JsonProperty("BeamLifetime")
    public void setBeamLifetime(Double value) { this.beamLifetime = value; }

    @JsonProperty("WeaponRepackTimeout")
    public Double getWeaponRepackTimeout() { return weaponRepackTimeout; }
    @JsonProperty("WeaponRepackTimeout")
    public void setWeaponRepackTimeout(Double value) { this.weaponRepackTimeout = value; }

    @JsonProperty("BeamCollisionDelay")
    public Double getBeamCollisionDelay() { return beamCollisionDelay; }
    @JsonProperty("BeamCollisionDelay")
    public void setBeamCollisionDelay(Double value) { this.beamCollisionDelay = value; }

    @JsonProperty("MuzzleChargeDelay")
    public Double getMuzzleChargeDelay() { return muzzleChargeDelay; }
    @JsonProperty("MuzzleChargeDelay")
    public void setMuzzleChargeDelay(Double value) { this.muzzleChargeDelay = value; }

    @JsonProperty("MaximumBeamLength")
    public Long getMaximumBeamLength() { return maximumBeamLength; }
    @JsonProperty("MaximumBeamLength")
    public void setMaximumBeamLength(Long value) { this.maximumBeamLength = value; }

    @JsonProperty("RackSalvoFiresAfterCharge")
    public Boolean getRackSalvoFiresAfterCharge() { return rackSalvoFiresAfterCharge; }
    @JsonProperty("RackSalvoFiresAfterCharge")
    public void setRackSalvoFiresAfterCharge(Boolean value) { this.rackSalvoFiresAfterCharge = value; }

    @JsonProperty("WeaponUnpackAnimation")
    public String getWeaponUnpackAnimation() { return weaponUnpackAnimation; }
    @JsonProperty("WeaponUnpackAnimation")
    public void setWeaponUnpackAnimation(String value) { this.weaponUnpackAnimation = value; }

    @JsonProperty("WeaponUnpackAnimationRate")
    public Double getWeaponUnpackAnimationRate() { return weaponUnpackAnimationRate; }
    @JsonProperty("WeaponUnpackAnimationRate")
    public void setWeaponUnpackAnimationRate(Double value) { this.weaponUnpackAnimationRate = value; }

    @JsonProperty("DetonatesAtTargetHeight")
    public Boolean getDetonatesAtTargetHeight() { return detonatesAtTargetHeight; }
    @JsonProperty("DetonatesAtTargetHeight")
    public void setDetonatesAtTargetHeight(Boolean value) { this.detonatesAtTargetHeight = value; }

    @JsonProperty("MuzzleVelocityReduceDistance")
    public Long getMuzzleVelocityReduceDistance() { return muzzleVelocityReduceDistance; }
    @JsonProperty("MuzzleVelocityReduceDistance")
    public void setMuzzleVelocityReduceDistance(Long value) { this.muzzleVelocityReduceDistance = value; }

    @JsonProperty("ArtilleryShieldBlocks")
    public Boolean getArtilleryShieldBlocks() { return artilleryShieldBlocks; }
    @JsonProperty("ArtilleryShieldBlocks")
    public void setArtilleryShieldBlocks(Boolean value) { this.artilleryShieldBlocks = value; }

    @JsonProperty("FiringRandomnessWhileMoving")
    public Double getFiringRandomnessWhileMoving() { return firingRandomnessWhileMoving; }
    @JsonProperty("FiringRandomnessWhileMoving")
    public void setFiringRandomnessWhileMoving(Double value) { this.firingRandomnessWhileMoving = value; }

    @JsonProperty("LeadTarget")
    public Boolean getLeadTarget() { return leadTarget; }
    @JsonProperty("LeadTarget")
    public void setLeadTarget(Boolean value) { this.leadTarget = value; }

    @JsonProperty("TargetType")
    public TargetType getTargetType() { return targetType; }
    @JsonProperty("TargetType")
    public void setTargetType(TargetType value) { this.targetType = value; }

    @JsonProperty("CountedProjectile")
    public Boolean getCountedProjectile() { return countedProjectile; }
    @JsonProperty("CountedProjectile")
    public void setCountedProjectile(Boolean value) { this.countedProjectile = value; }

    @JsonProperty("RenderFireClock")
    public Boolean getRenderFireClock() { return renderFireClock; }
    @JsonProperty("RenderFireClock")
    public void setRenderFireClock(Boolean value) { this.renderFireClock = value; }

    @JsonProperty("BallicsticArc")
    public BallisticArc getBallicsticArc() { return ballicsticArc; }
    @JsonProperty("BallicsticArc")
    public void setBallicsticArc(BallisticArc value) { this.ballicsticArc = value; }

    @JsonProperty("Flare")
    public Flare getFlare() { return flare; }
    @JsonProperty("Flare")
    public void setFlare(Flare value) { this.flare = value; }

    @JsonProperty("DamageToShields")
    public Long getDamageToShields() { return damageToShields; }
    @JsonProperty("DamageToShields")
    public void setDamageToShields(Long value) { this.damageToShields = value; }

    @JsonProperty("TranscendentPriorities")
    public String[] getTranscendentPriorities() { return transcendentPriorities; }
    @JsonProperty("TranscendentPriorities")
    public void setTranscendentPriorities(String[] value) { this.transcendentPriorities = value; }

    @JsonProperty("DoTTime")
    public Double getDoTTime() { return doTTime; }
    @JsonProperty("DoTTime")
    public void setDoTTime(Double value) { this.doTTime = value; }

    @JsonProperty("DoTPulses")
    public Long getDoTPulses() { return doTPulses; }
    @JsonProperty("DoTPulses")
    public void setDoTPulses(Long value) { this.doTPulses = value; }

    @JsonProperty("WeaponUnpackLocksMotion")
    public Boolean getWeaponUnpackLocksMotion() { return weaponUnpackLocksMotion; }
    @JsonProperty("WeaponUnpackLocksMotion")
    public void setWeaponUnpackLocksMotion(Boolean value) { this.weaponUnpackLocksMotion = value; }

    @JsonProperty("AnimationOpen")
    public String getAnimationOpen() { return animationOpen; }
    @JsonProperty("AnimationOpen")
    public void setAnimationOpen(String value) { this.animationOpen = value; }

    @JsonProperty("NukeOuterRingTotalTime")
    public Long getNukeOuterRingTotalTime() { return nukeOuterRingTotalTime; }
    @JsonProperty("NukeOuterRingTotalTime")
    public void setNukeOuterRingTotalTime(Long value) { this.nukeOuterRingTotalTime = value; }

    @JsonProperty("NukeInnerRingTicks")
    public Long getNukeInnerRingTicks() { return nukeInnerRingTicks; }
    @JsonProperty("NukeInnerRingTicks")
    public void setNukeInnerRingTicks(Long value) { this.nukeInnerRingTicks = value; }

    @JsonProperty("ManualFire")
    public ManualFire getManualFire() { return manualFire; }
    @JsonProperty("ManualFire")
    public void setManualFire(ManualFire value) { this.manualFire = value; }

    @JsonProperty("NukeOuterRingDamage")
    public Long getNukeOuterRingDamage() { return nukeOuterRingDamage; }
    @JsonProperty("NukeOuterRingDamage")
    public void setNukeOuterRingDamage(Long value) { this.nukeOuterRingDamage = value; }

    @JsonProperty("InitialProjectileStorage")
    public Long getInitialProjectileStorage() { return initialProjectileStorage; }
    @JsonProperty("InitialProjectileStorage")
    public void setInitialProjectileStorage(Long value) { this.initialProjectileStorage = value; }

    @JsonProperty("MaxProjectileStorage")
    public Long getMaxProjectileStorage() { return maxProjectileStorage; }
    @JsonProperty("MaxProjectileStorage")
    public void setMaxProjectileStorage(Long value) { this.maxProjectileStorage = value; }

    @JsonProperty("NukeOuterRingTicks")
    public Long getNukeOuterRingTicks() { return nukeOuterRingTicks; }
    @JsonProperty("NukeOuterRingTicks")
    public void setNukeOuterRingTicks(Long value) { this.nukeOuterRingTicks = value; }

    @JsonProperty("NukeOuterRingRadius")
    public Long getNukeOuterRingRadius() { return nukeOuterRingRadius; }
    @JsonProperty("NukeOuterRingRadius")
    public void setNukeOuterRingRadius(Long value) { this.nukeOuterRingRadius = value; }

    @JsonProperty("NukeInnerRingTotalTime")
    public Long getNukeInnerRingTotalTime() { return nukeInnerRingTotalTime; }
    @JsonProperty("NukeInnerRingTotalTime")
    public void setNukeInnerRingTotalTime(Long value) { this.nukeInnerRingTotalTime = value; }

    @JsonProperty("NukeInnerRingDamage")
    public Long getNukeInnerRingDamage() { return nukeInnerRingDamage; }
    @JsonProperty("NukeInnerRingDamage")
    public void setNukeInnerRingDamage(Long value) { this.nukeInnerRingDamage = value; }

    @JsonProperty("NukeWeapon")
    public Boolean getNukeWeapon() { return nukeWeapon; }
    @JsonProperty("NukeWeapon")
    public void setNukeWeapon(Boolean value) { this.nukeWeapon = value; }

    @JsonProperty("NukeInnerRingRadius")
    public Long getNukeInnerRingRadius() { return nukeInnerRingRadius; }
    @JsonProperty("NukeInnerRingRadius")
    public void setNukeInnerRingRadius(Long value) { this.nukeInnerRingRadius = value; }

    @JsonProperty("YawOnlyOnTarget")
    public Boolean getYawOnlyOnTarget() { return yawOnlyOnTarget; }
    @JsonProperty("YawOnlyOnTarget")
    public void setYawOnlyOnTarget(Boolean value) { this.yawOnlyOnTarget = value; }

    @JsonProperty("ChargeDelay")
    public Double getChargeDelay() { return chargeDelay; }
    @JsonProperty("ChargeDelay")
    public void setChargeDelay(Double value) { this.chargeDelay = value; }

    @JsonProperty("AboveWaterFireOnly")
    public Boolean getAboveWaterFireOnly() { return aboveWaterFireOnly; }
    @JsonProperty("AboveWaterFireOnly")
    public void setAboveWaterFireOnly(Boolean value) { this.aboveWaterFireOnly = value; }

    @JsonProperty("FireOnDeath")
    public Boolean getFireOnDeath() { return fireOnDeath; }
    @JsonProperty("FireOnDeath")
    public void setFireOnDeath(Boolean value) { this.fireOnDeath = value; }

    @JsonProperty("ReTargetOnMiss")
    public Boolean getReTargetOnMiss() { return reTargetOnMiss; }
    @JsonProperty("ReTargetOnMiss")
    public void setReTargetOnMiss(Boolean value) { this.reTargetOnMiss = value; }

    @JsonProperty("ForceSingleFire")
    public Boolean getForceSingleFire() { return forceSingleFire; }
    @JsonProperty("ForceSingleFire")
    public void setForceSingleFire(Boolean value) { this.forceSingleFire = value; }

    @JsonProperty("CameraShakeRadius")
    public Long getCameraShakeRadius() { return cameraShakeRadius; }
    @JsonProperty("CameraShakeRadius")
    public void setCameraShakeRadius(Long value) { this.cameraShakeRadius = value; }

    @JsonProperty("CameraShakeMax")
    public Long getCameraShakeMax() { return cameraShakeMax; }
    @JsonProperty("CameraShakeMax")
    public void setCameraShakeMax(Long value) { this.cameraShakeMax = value; }

    @JsonProperty("CameraShakeDuration")
    public Double getCameraShakeDuration() { return cameraShakeDuration; }
    @JsonProperty("CameraShakeDuration")
    public void setCameraShakeDuration(Double value) { this.cameraShakeDuration = value; }

    @JsonProperty("CameraShakeMin")
    public Long getCameraShakeMin() { return cameraShakeMin; }
    @JsonProperty("CameraShakeMin")
    public void setCameraShakeMin(Long value) { this.cameraShakeMin = value; }

    @JsonProperty("EnergyRequired")
    public Long getEnergyRequired() { return energyRequired; }
    @JsonProperty("EnergyRequired")
    public void setEnergyRequired(Long value) { this.energyRequired = value; }

    @JsonProperty("EnergyDrainPerSecond")
    public Long getEnergyDrainPerSecond() { return energyDrainPerSecond; }
    @JsonProperty("EnergyDrainPerSecond")
    public void setEnergyDrainPerSecond(Long value) { this.energyDrainPerSecond = value; }

    @JsonProperty("AimsStraightOnDisable")
    public Boolean getAimsStraightOnDisable() { return aimsStraightOnDisable; }
    @JsonProperty("AimsStraightOnDisable")
    public void setAimsStraightOnDisable(Boolean value) { this.aimsStraightOnDisable = value; }

    @JsonProperty("ContinuousBeam")
    public Boolean getContinuousBeam() { return continuousBeam; }
    @JsonProperty("ContinuousBeam")
    public void setContinuousBeam(Boolean value) { this.continuousBeam = value; }

    @JsonProperty("MuzzleSpecial")
    public String getMuzzleSpecial() { return muzzleSpecial; }
    @JsonProperty("MuzzleSpecial")
    public void setMuzzleSpecial(String value) { this.muzzleSpecial = value; }

    @JsonProperty("NotExclusive")
    public Boolean getNotExclusive() { return notExclusive; }
    @JsonProperty("NotExclusive")
    public void setNotExclusive(Boolean value) { this.notExclusive = value; }

    @JsonProperty("Overcharge")
    public Overcharge getOvercharge() { return overcharge; }
    @JsonProperty("Overcharge")
    public void setOvercharge(Overcharge value) { this.overcharge = value; }

    @JsonProperty("EnergyChargeForFirstShot")
    public Boolean getEnergyChargeForFirstShot() { return energyChargeForFirstShot; }
    @JsonProperty("EnergyChargeForFirstShot")
    public void setEnergyChargeForFirstShot(Boolean value) { this.energyChargeForFirstShot = value; }

    @JsonProperty("OverChargeWeapon")
    public Boolean getOverChargeWeapon() { return overChargeWeapon; }
    @JsonProperty("OverChargeWeapon")
    public void setOverChargeWeapon(Boolean value) { this.overChargeWeapon = value; }

    @JsonProperty("CanFireFromTransport")
    public Boolean getCanFireFromTransport() { return canFireFromTransport; }
    @JsonProperty("CanFireFromTransport")
    public void setCanFireFromTransport(Boolean value) { this.canFireFromTransport = value; }

    @JsonProperty("EnabledByEnhancement")
    public String getEnabledByEnhancement() { return enabledByEnhancement; }
    @JsonProperty("EnabledByEnhancement")
    public void setEnabledByEnhancement(String value) { this.enabledByEnhancement = value; }

    @JsonProperty("SalvoSize")
    public Long getSalvoSize() { return salvoSize; }
    @JsonProperty("SalvoSize")
    public void setSalvoSize(Long value) { this.salvoSize = value; }

    @JsonProperty("SalvoShotDelay")
    public Double getSalvoShotDelay() { return salvoShotDelay; }
    @JsonProperty("SalvoShotDelay")
    public void setSalvoShotDelay(Double value) { this.salvoShotDelay = value; }

    @JsonProperty("MuzzleVelocityRandom")
    public Double getMuzzleVelocityRandom() { return muzzleVelocityRandom; }
    @JsonProperty("MuzzleVelocityRandom")
    public void setMuzzleVelocityRandom(Double value) { this.muzzleVelocityRandom = value; }

    @JsonProperty("AimControlPrecedence")
    public Long getAimControlPrecedence() { return aimControlPrecedence; }
    @JsonProperty("AimControlPrecedence")
    public void setAimControlPrecedence(Long value) { this.aimControlPrecedence = value; }

    @JsonProperty("CameraLifetime")
    public Long getCameraLifetime() { return cameraLifetime; }
    @JsonProperty("CameraLifetime")
    public void setCameraLifetime(Long value) { this.cameraLifetime = value; }

    @JsonProperty("CameraVisionRadius")
    public Long getCameraVisionRadius() { return cameraVisionRadius; }
    @JsonProperty("CameraVisionRadius")
    public void setCameraVisionRadius(Long value) { this.cameraVisionRadius = value; }

    @JsonProperty("TurretBoneDualMuzzle")
    public String getTurretBoneDualMuzzle() { return turretBoneDualMuzzle; }
    @JsonProperty("TurretBoneDualMuzzle")
    public void setTurretBoneDualMuzzle(String value) { this.turretBoneDualMuzzle = value; }

    @JsonProperty("TurretBoneDualPitch")
    public String getTurretBoneDualPitch() { return turretBoneDualPitch; }
    @JsonProperty("TurretBoneDualPitch")
    public void setTurretBoneDualPitch(String value) { this.turretBoneDualPitch = value; }

    @JsonProperty("InitialDamage")
    public Double getInitialDamage() { return initialDamage; }
    @JsonProperty("InitialDamage")
    public void setInitialDamage(Double value) { this.initialDamage = value; }

    @JsonProperty("NoPause")
    public Boolean getNoPause() { return noPause; }
    @JsonProperty("NoPause")
    public void setNoPause(Boolean value) { this.noPause = value; }

    @JsonProperty("MuzzleVelocityRandomness")
    public Double getMuzzleVelocityRandomness() { return muzzleVelocityRandomness; }
    @JsonProperty("MuzzleVelocityRandomness")
    public void setMuzzleVelocityRandomness(Double value) { this.muzzleVelocityRandomness = value; }

    @JsonProperty("SkipReadyState")
    public Boolean getSkipReadyState() { return skipReadyState; }
    @JsonProperty("SkipReadyState")
    public void setSkipReadyState(Boolean value) { this.skipReadyState = value; }

    @JsonProperty("StopOnPrimaryWeaponBusy")
    public Boolean getStopOnPrimaryWeaponBusy() { return stopOnPrimaryWeaponBusy; }
    @JsonProperty("StopOnPrimaryWeaponBusy")
    public void setStopOnPrimaryWeaponBusy(Boolean value) { this.stopOnPrimaryWeaponBusy = value; }

    @JsonProperty("DepthCharge")
    public DepthCharge getDepthCharge() { return depthCharge; }
    @JsonProperty("DepthCharge")
    public void setDepthCharge(DepthCharge value) { this.depthCharge = value; }

    @JsonProperty("AnimationReload")
    public String getAnimationReload() { return animationReload; }
    @JsonProperty("AnimationReload")
    public void setAnimationReload(String value) { this.animationReload = value; }

    @JsonProperty("DoNotCollideList")
    public TargetRestrictOnlyAllow[] getDoNotCollideList() { return doNotCollideList; }
    @JsonProperty("DoNotCollideList")
    public void setDoNotCollideList(TargetRestrictOnlyAllow[] value) { this.doNotCollideList = value; }

    @JsonProperty("ToggleWeapon")
    public String getToggleWeapon() { return toggleWeapon; }
    @JsonProperty("ToggleWeapon")
    public void setToggleWeapon(String value) { this.toggleWeapon = value; }

    @JsonProperty("PreferPrimaryWeaponTarget")
    public Boolean getPreferPrimaryWeaponTarget() { return preferPrimaryWeaponTarget; }
    @JsonProperty("PreferPrimaryWeaponTarget")
    public void setPreferPrimaryWeaponTarget(Boolean value) { this.preferPrimaryWeaponTarget = value; }

    @JsonProperty("FireOnSelfDestruct")
    public Boolean getFireOnSelfDestruct() { return fireOnSelfDestruct; }
    @JsonProperty("FireOnSelfDestruct")
    public void setFireOnSelfDestruct(Boolean value) { this.fireOnSelfDestruct = value; }

    @JsonProperty("Accurate")
    public Boolean getAccurate() { return accurate; }
    @JsonProperty("Accurate")
    public void setAccurate(Boolean value) { this.accurate = value; }

    @JsonProperty("IgnoreIfDisabled")
    public Boolean getIgnoreIfDisabled() { return ignoreIfDisabled; }
    @JsonProperty("IgnoreIfDisabled")
    public void setIgnoreIfDisabled(Boolean value) { this.ignoreIfDisabled = value; }

    @JsonProperty("WeaponUnpackTimeout")
    public Long getWeaponUnpackTimeout() { return weaponUnpackTimeout; }
    @JsonProperty("WeaponUnpackTimeout")
    public void setWeaponUnpackTimeout(Long value) { this.weaponUnpackTimeout = value; }

    @JsonProperty("WeaponUnpackAnimatorPrecedence")
    public Long getWeaponUnpackAnimatorPrecedence() { return weaponUnpackAnimatorPrecedence; }
    @JsonProperty("WeaponUnpackAnimatorPrecedence")
    public void setWeaponUnpackAnimatorPrecedence(Long value) { this.weaponUnpackAnimatorPrecedence = value; }

    @JsonProperty("FixedSpreadRadius")
    public Long getFixedSpreadRadius() { return fixedSpreadRadius; }
    @JsonProperty("FixedSpreadRadius")
    public void setFixedSpreadRadius(Long value) { this.fixedSpreadRadius = value; }

    @JsonProperty("BelowWaterFireOnly")
    public Boolean getBelowWaterFireOnly() { return belowWaterFireOnly; }
    @JsonProperty("BelowWaterFireOnly")
    public void setBelowWaterFireOnly(Boolean value) { this.belowWaterFireOnly = value; }

    @JsonProperty("RackRecoilReturnSpeed")
    public Long getRackRecoilReturnSpeed() { return rackRecoilReturnSpeed; }
    @JsonProperty("RackRecoilReturnSpeed")
    public void setRackRecoilReturnSpeed(Long value) { this.rackRecoilReturnSpeed = value; }

    @JsonProperty("MuzzleSalvoChargeDelay")
    public Long getMuzzleSalvoChargeDelay() { return muzzleSalvoChargeDelay; }
    @JsonProperty("MuzzleSalvoChargeDelay")
    public void setMuzzleSalvoChargeDelay(Long value) { this.muzzleSalvoChargeDelay = value; }

    @JsonProperty("MuzzleChargeStart")
    public BarrelLoop getMuzzleChargeStart() { return muzzleChargeStart; }
    @JsonProperty("MuzzleChargeStart")
    public void setMuzzleChargeStart(BarrelLoop value) { this.muzzleChargeStart = value; }

    @JsonProperty("BarrelLoop")
    public BarrelLoop getBarrelLoop() { return barrelLoop; }
    @JsonProperty("BarrelLoop")
    public void setBarrelLoop(BarrelLoop value) { this.barrelLoop = value; }

    @JsonProperty("BarrelStart")
    public BarrelLoop getBarrelStart() { return barrelStart; }
    @JsonProperty("BarrelStart")
    public void setBarrelStart(BarrelLoop value) { this.barrelStart = value; }
}
