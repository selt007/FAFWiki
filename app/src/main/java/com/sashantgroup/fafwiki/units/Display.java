package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Display {
    private MovementEffects movementEffects;
    private double uniformScale;
    private String[] abilities;
    private Boolean spawnRandomRotation;
    private String placeholderMeshName;
    private Mesh mesh;
    private LayerChangeEffects layerChangeEffects;
    private BuildAttachBone buildAttachBone;
    private BlinkingLightsFx blinkingLightsFx;
    private Tarmac[] tarmacs;
    private BlinkingLight[] blinkingLights;
    private String animationUpgrade;
    private IdleEffects idleEffects;
    private String animationBuild;
    private String animationWalk;
    private LandAnimationDeath[] transportAnimation;
    private AnimationDeath[] animationDeath;
    private Double animationWalkRate;
    private DamageEffect[] damageEffects;
    private String animationOpen;
    private MotionChangeEffects motionChangeEffects;
    private Long forcedBuildSpin;
    private String animationPermOpen;
    private TeleportEffects teleportEffects;
    private WarpInEffect warpInEffect;
    private LandAnimationDeath[] transportDropAnimation;
    private String animationActivate;
    private String animationSurface;
    private String animationFinishBuildLand;
    private String buildMeshBlueprint;
    private String[] aiNames;
    private Long animationBuildRate;
    private String animationWater;
    private PingPongScroller pingPongScroller;
    private String animationLand;
    private Long attackReticuleSize;
    private Long maxRockSpeed;
    private Long attackReticleSize;
    private String animationIdle;
    private String animationTakeOff;
    private String animationTransform;
    private AnimationDeath[] waterAnimationDeath;
    private LandAnimationDeath[] landAnimationDeath;
    private MotionAdjustment motionAdjustment;
    private Long attackReticle;
    private String olderMeshName;
    private String animationDeploy;
    private String cannonOpenAnimation;
    private String loopingAnimation;
    private MissileBone missileBone;

    @JsonProperty("MovementEffects")
    public MovementEffects getMovementEffects() { return movementEffects; }
    @JsonProperty("MovementEffects")
    public void setMovementEffects(MovementEffects value) { this.movementEffects = value; }

    @JsonProperty("UniformScale")
    public double getUniformScale() { return uniformScale; }
    @JsonProperty("UniformScale")
    public void setUniformScale(double value) { this.uniformScale = value; }

    @JsonProperty("Abilities")
    public String[] getAbilities() { return abilities; }
    @JsonProperty("Abilities")
    public void setAbilities(String[] value) { this.abilities = value; }

    @JsonProperty("SpawnRandomRotation")
    public Boolean getSpawnRandomRotation() { return spawnRandomRotation; }
    @JsonProperty("SpawnRandomRotation")
    public void setSpawnRandomRotation(Boolean value) { this.spawnRandomRotation = value; }

    @JsonProperty("PlaceholderMeshName")
    public String getPlaceholderMeshName() { return placeholderMeshName; }
    @JsonProperty("PlaceholderMeshName")
    public void setPlaceholderMeshName(String value) { this.placeholderMeshName = value; }

    @JsonProperty("Mesh")
    public Mesh getMesh() { return mesh; }
    @JsonProperty("Mesh")
    public void setMesh(Mesh value) { this.mesh = value; }

    @JsonProperty("LayerChangeEffects")
    public LayerChangeEffects getLayerChangeEffects() { return layerChangeEffects; }
    @JsonProperty("LayerChangeEffects")
    public void setLayerChangeEffects(LayerChangeEffects value) { this.layerChangeEffects = value; }

    @JsonProperty("BuildAttachBone")
    public BuildAttachBone getBuildAttachBone() { return buildAttachBone; }
    @JsonProperty("BuildAttachBone")
    public void setBuildAttachBone(BuildAttachBone value) { this.buildAttachBone = value; }

    @JsonProperty("BlinkingLightsFx")
    public BlinkingLightsFx getBlinkingLightsFx() { return blinkingLightsFx; }
    @JsonProperty("BlinkingLightsFx")
    public void setBlinkingLightsFx(BlinkingLightsFx value) { this.blinkingLightsFx = value; }

    @JsonProperty("Tarmacs")
    public Tarmac[] getTarmacs() { return tarmacs; }
    @JsonProperty("Tarmacs")
    public void setTarmacs(Tarmac[] value) { this.tarmacs = value; }

    @JsonProperty("BlinkingLights")
    public BlinkingLight[] getBlinkingLights() { return blinkingLights; }
    @JsonProperty("BlinkingLights")
    public void setBlinkingLights(BlinkingLight[] value) { this.blinkingLights = value; }

    @JsonProperty("AnimationUpgrade")
    public String getAnimationUpgrade() { return animationUpgrade; }
    @JsonProperty("AnimationUpgrade")
    public void setAnimationUpgrade(String value) { this.animationUpgrade = value; }

    @JsonProperty("IdleEffects")
    public IdleEffects getIdleEffects() { return idleEffects; }
    @JsonProperty("IdleEffects")
    public void setIdleEffects(IdleEffects value) { this.idleEffects = value; }

    @JsonProperty("AnimationBuild")
    public String getAnimationBuild() { return animationBuild; }
    @JsonProperty("AnimationBuild")
    public void setAnimationBuild(String value) { this.animationBuild = value; }

    @JsonProperty("AnimationWalk")
    public String getAnimationWalk() { return animationWalk; }
    @JsonProperty("AnimationWalk")
    public void setAnimationWalk(String value) { this.animationWalk = value; }

    @JsonProperty("TransportAnimation")
    public LandAnimationDeath[] getTransportAnimation() { return transportAnimation; }
    @JsonProperty("TransportAnimation")
    public void setTransportAnimation(LandAnimationDeath[] value) { this.transportAnimation = value; }

    @JsonProperty("AnimationDeath")
    public AnimationDeath[] getAnimationDeath() { return animationDeath; }
    @JsonProperty("AnimationDeath")
    public void setAnimationDeath(AnimationDeath[] value) { this.animationDeath = value; }

    @JsonProperty("AnimationWalkRate")
    public Double getAnimationWalkRate() { return animationWalkRate; }
    @JsonProperty("AnimationWalkRate")
    public void setAnimationWalkRate(Double value) { this.animationWalkRate = value; }

    @JsonProperty("DamageEffects")
    public DamageEffect[] getDamageEffects() { return damageEffects; }
    @JsonProperty("DamageEffects")
    public void setDamageEffects(DamageEffect[] value) { this.damageEffects = value; }

    @JsonProperty("AnimationOpen")
    public String getAnimationOpen() { return animationOpen; }
    @JsonProperty("AnimationOpen")
    public void setAnimationOpen(String value) { this.animationOpen = value; }

    @JsonProperty("MotionChangeEffects")
    public MotionChangeEffects getMotionChangeEffects() { return motionChangeEffects; }
    @JsonProperty("MotionChangeEffects")
    public void setMotionChangeEffects(MotionChangeEffects value) { this.motionChangeEffects = value; }

    @JsonProperty("ForcedBuildSpin")
    public Long getForcedBuildSpin() { return forcedBuildSpin; }
    @JsonProperty("ForcedBuildSpin")
    public void setForcedBuildSpin(Long value) { this.forcedBuildSpin = value; }

    @JsonProperty("AnimationPermOpen")
    public String getAnimationPermOpen() { return animationPermOpen; }
    @JsonProperty("AnimationPermOpen")
    public void setAnimationPermOpen(String value) { this.animationPermOpen = value; }

    @JsonProperty("TeleportEffects")
    public TeleportEffects getTeleportEffects() { return teleportEffects; }
    @JsonProperty("TeleportEffects")
    public void setTeleportEffects(TeleportEffects value) { this.teleportEffects = value; }

    @JsonProperty("WarpInEffect")
    public WarpInEffect getWarpInEffect() { return warpInEffect; }
    @JsonProperty("WarpInEffect")
    public void setWarpInEffect(WarpInEffect value) { this.warpInEffect = value; }

    @JsonProperty("TransportDropAnimation")
    public LandAnimationDeath[] getTransportDropAnimation() { return transportDropAnimation; }
    @JsonProperty("TransportDropAnimation")
    public void setTransportDropAnimation(LandAnimationDeath[] value) { this.transportDropAnimation = value; }

    @JsonProperty("AnimationActivate")
    public String getAnimationActivate() { return animationActivate; }
    @JsonProperty("AnimationActivate")
    public void setAnimationActivate(String value) { this.animationActivate = value; }

    @JsonProperty("AnimationSurface")
    public String getAnimationSurface() { return animationSurface; }
    @JsonProperty("AnimationSurface")
    public void setAnimationSurface(String value) { this.animationSurface = value; }

    @JsonProperty("AnimationFinishBuildLand")
    public String getAnimationFinishBuildLand() { return animationFinishBuildLand; }
    @JsonProperty("AnimationFinishBuildLand")
    public void setAnimationFinishBuildLand(String value) { this.animationFinishBuildLand = value; }

    @JsonProperty("BuildMeshBlueprint")
    public String getBuildMeshBlueprint() { return buildMeshBlueprint; }
    @JsonProperty("BuildMeshBlueprint")
    public void setBuildMeshBlueprint(String value) { this.buildMeshBlueprint = value; }

    @JsonProperty("AINames")
    public String[] getAINames() { return aiNames; }
    @JsonProperty("AINames")
    public void setAINames(String[] value) { this.aiNames = value; }

    @JsonProperty("AnimationBuildRate")
    public Long getAnimationBuildRate() { return animationBuildRate; }
    @JsonProperty("AnimationBuildRate")
    public void setAnimationBuildRate(Long value) { this.animationBuildRate = value; }

    @JsonProperty("AnimationWater")
    public String getAnimationWater() { return animationWater; }
    @JsonProperty("AnimationWater")
    public void setAnimationWater(String value) { this.animationWater = value; }

    @JsonProperty("PingPongScroller")
    public PingPongScroller getPingPongScroller() { return pingPongScroller; }
    @JsonProperty("PingPongScroller")
    public void setPingPongScroller(PingPongScroller value) { this.pingPongScroller = value; }

    @JsonProperty("AnimationLand")
    public String getAnimationLand() { return animationLand; }
    @JsonProperty("AnimationLand")
    public void setAnimationLand(String value) { this.animationLand = value; }

    @JsonProperty("AttackReticuleSize")
    public Long getAttackReticuleSize() { return attackReticuleSize; }
    @JsonProperty("AttackReticuleSize")
    public void setAttackReticuleSize(Long value) { this.attackReticuleSize = value; }

    @JsonProperty("MaxRockSpeed")
    public Long getMaxRockSpeed() { return maxRockSpeed; }
    @JsonProperty("MaxRockSpeed")
    public void setMaxRockSpeed(Long value) { this.maxRockSpeed = value; }

    @JsonProperty("AttackReticleSize")
    public Long getAttackReticleSize() { return attackReticleSize; }
    @JsonProperty("AttackReticleSize")
    public void setAttackReticleSize(Long value) { this.attackReticleSize = value; }

    @JsonProperty("AnimationIdle")
    public String getAnimationIdle() { return animationIdle; }
    @JsonProperty("AnimationIdle")
    public void setAnimationIdle(String value) { this.animationIdle = value; }

    @JsonProperty("AnimationTakeOff")
    public String getAnimationTakeOff() { return animationTakeOff; }
    @JsonProperty("AnimationTakeOff")
    public void setAnimationTakeOff(String value) { this.animationTakeOff = value; }

    @JsonProperty("AnimationTransform")
    public String getAnimationTransform() { return animationTransform; }
    @JsonProperty("AnimationTransform")
    public void setAnimationTransform(String value) { this.animationTransform = value; }

    @JsonProperty("WaterAnimationDeath")
    public AnimationDeath[] getWaterAnimationDeath() { return waterAnimationDeath; }
    @JsonProperty("WaterAnimationDeath")
    public void setWaterAnimationDeath(AnimationDeath[] value) { this.waterAnimationDeath = value; }

    @JsonProperty("LandAnimationDeath")
    public LandAnimationDeath[] getLandAnimationDeath() { return landAnimationDeath; }
    @JsonProperty("LandAnimationDeath")
    public void setLandAnimationDeath(LandAnimationDeath[] value) { this.landAnimationDeath = value; }

    @JsonProperty("MotionAdjustment")
    public MotionAdjustment getMotionAdjustment() { return motionAdjustment; }
    @JsonProperty("MotionAdjustment")
    public void setMotionAdjustment(MotionAdjustment value) { this.motionAdjustment = value; }

    @JsonProperty("AttackReticle")
    public Long getAttackReticle() { return attackReticle; }
    @JsonProperty("AttackReticle")
    public void setAttackReticle(Long value) { this.attackReticle = value; }

    @JsonProperty("olderMeshName")
    public String getOlderMeshName() { return olderMeshName; }
    @JsonProperty("olderMeshName")
    public void setOlderMeshName(String value) { this.olderMeshName = value; }

    @JsonProperty("AnimationDeploy")
    public String getAnimationDeploy() { return animationDeploy; }
    @JsonProperty("AnimationDeploy")
    public void setAnimationDeploy(String value) { this.animationDeploy = value; }

    @JsonProperty("CannonOpenAnimation")
    public String getCannonOpenAnimation() { return cannonOpenAnimation; }
    @JsonProperty("CannonOpenAnimation")
    public void setCannonOpenAnimation(String value) { this.cannonOpenAnimation = value; }

    @JsonProperty("LoopingAnimation")
    public String getLoopingAnimation() { return loopingAnimation; }
    @JsonProperty("LoopingAnimation")
    public void setLoopingAnimation(String value) { this.loopingAnimation = value; }

    @JsonProperty("MissileBone")
    public MissileBone getMissileBone() { return missileBone; }
    @JsonProperty("MissileBone")
    public void setMissileBone(MissileBone value) { this.missileBone = value; }
}
