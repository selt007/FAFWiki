package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Display {
    private String[] abilities;
    private LayerChangeEffectsUnion layerChangeEffects;
    private Mesh mesh;
    private MovementEffectsUnion movementEffects;
    private String placeholderMeshName;
    private Boolean spawnRandomRotation;
    private String uniformScale;
    private IdleEffectsUnion idleEffects;
    private String attackReticuleSize;
    private AnimationDeath animationDeath;
    private String animationWalk;
    private String animationWalkRate;
    private Map<String, Property157> transportAnimation;
    private Map<String, Property157> transportDropAnimation;
    private Map<String, Tarmac> tarmacs;
    private String animationPermOpen;
    private String forcedBuildSpin;
    private String animationOpen;
    private String animationUpgrade;
    private Map<String, BlinkingLight> blinkingLights;
    private BlinkingLightsFx blinkingLightsFx;
    private BuildAttachBone buildAttachBone;
    private Map<String, DamageEffect> damageEffects;
    private String animationActivate;
    private String meshBlueprint;
    private TeleportEffects teleportEffects;
    private WarpInEffect warpInEffect;
    private String animationBuild;
    private MotionChangeEffects motionChangeEffects;
    private String animationSurface;
    private PingPongScroller pingPongScroller;
    private String animationLand;
    private String animationFinishBuildLand;
    private String buildMeshBlueprint;
    private String attackReticleSize;
    private String animationBuildRate;
    private String animationWater;
    private String maxRockSpeed;
    private Display0 the0;
    private String[] aiNames;
    private String animationIdle;
    private String animationTakeOff;
    private String attackReticle;
    private String olderMeshName;
    private String the1;
    private String the2;
    private String the3;
    private String animationTransform;
    private LandAnimationDeath landAnimationDeath;
    private WaterAnimationDeath waterAnimationDeath;
    private MotionAdjustment motionAdjustment;
    private String animationDeploy;
    private Boolean hideLifebars;
    private String loopingAnimation;
    private String missileBone;
    private String cannonOpenAnimation;
    private BuildEffect buildEffect;
    private String the4;
    private String the5;
    private String the6;
    private String the7;
    private String the8;
    private String the9;
    private String the10;
    private String the11;
    private String the12;
    private String the13;
    private String sequenceAnimation;
    private String animationPermOpenAlt;
    private FlashLights flashLights;
    private FlashLightsFx flashLightsFx;
    private String shieldOnRotatingBone;
    private String shieldEmitterScale;
    private DisplayProperty100 property106;
    private DisplayProperty100 property111;
    private DisplayProperty100 property90;
    private Boolean miniRailgunsExtend;
    private DisplayProperty100 property95;
    private DisplayProperty100 property100;
    private DisplayProperty100 property105;
    private DisplayProperty100 property110;
    private DisplayProperty100 property81;
    private DisplayProperty100 property86;
    private DisplayProperty100 property91;
    private DisplayProperty100 property96;
    private DisplayProperty100 property101;
    private DisplayProperty100 property116;
    private DisplayProperty100 property121;
    private DisplayProperty100 property126;
    private DisplayProperty100 property131;
    private DisplayProperty100 property136;
    private DisplayProperty100 property103;
    private DisplayProperty100 property108;
    private DisplayProperty100 property113;
    private DisplayProperty100 property118;
    private DisplayProperty100 property123;
    private DisplayProperty100 property128;
    private DisplayProperty100 property133;
    private DisplayProperty100 property138;
    private DisplayProperty100 property143;
    private DisplayProperty100 property148;
    private DisplayProperty100 property153;
    private DisplayProperty100 property158;
    private DisplayProperty100 property141;
    private DisplayProperty100 property146;
    private DisplayProperty100 property151;
    private DisplayProperty100 property156;
    private DisplayProperty100 property161;
    private DisplayProperty100 property166;
    private DisplayProperty100 property171;
    private DisplayProperty100 property176;
    private DisplayProperty100 property115;
    private DisplayProperty100 property120;
    private DisplayProperty100 property125;
    private DisplayProperty100 property130;
    private DisplayProperty100 property135;
    private String animationRun;
    private String animationRunRate;
    private String enhancementBoneEmitter;
    private AkimboControl akimboControl;
    private String animationAlert;
    private String numberOfBuildBeams;
    private String weaponExhaustAnimation;
    private String animationOpenHatch;

    @JsonProperty("Abilities")
    public String[] getAbilities() { return abilities; }
    @JsonProperty("Abilities")
    public void setAbilities(String[] value) { this.abilities = value; }

    @JsonProperty("LayerChangeEffects")
    public LayerChangeEffectsUnion getLayerChangeEffects() { return layerChangeEffects; }
    @JsonProperty("LayerChangeEffects")
    public void setLayerChangeEffects(LayerChangeEffectsUnion value) { this.layerChangeEffects = value; }

    @JsonProperty("Mesh")
    public Mesh getMesh() { return mesh; }
    @JsonProperty("Mesh")
    public void setMesh(Mesh value) { this.mesh = value; }

    @JsonProperty("MovementEffects")
    public MovementEffectsUnion getMovementEffects() { return movementEffects; }
    @JsonProperty("MovementEffects")
    public void setMovementEffects(MovementEffectsUnion value) { this.movementEffects = value; }

    @JsonProperty("PlaceholderMeshName")
    public String getPlaceholderMeshName() { return placeholderMeshName; }
    @JsonProperty("PlaceholderMeshName")
    public void setPlaceholderMeshName(String value) { this.placeholderMeshName = value; }

    @JsonProperty("SpawnRandomRotation")
    public Boolean getSpawnRandomRotation() { return spawnRandomRotation; }
    @JsonProperty("SpawnRandomRotation")
    public void setSpawnRandomRotation(Boolean value) { this.spawnRandomRotation = value; }

    @JsonProperty("UniformScale")
    public String getUniformScale() { return uniformScale; }
    @JsonProperty("UniformScale")
    public void setUniformScale(String value) { this.uniformScale = value; }

    @JsonProperty("IdleEffects")
    public IdleEffectsUnion getIdleEffects() { return idleEffects; }
    @JsonProperty("IdleEffects")
    public void setIdleEffects(IdleEffectsUnion value) { this.idleEffects = value; }

    @JsonProperty("AttackReticuleSize")
    public String getAttackReticuleSize() { return attackReticuleSize; }
    @JsonProperty("AttackReticuleSize")
    public void setAttackReticuleSize(String value) { this.attackReticuleSize = value; }

    @JsonProperty("AnimationDeath")
    public AnimationDeath getAnimationDeath() { return animationDeath; }
    @JsonProperty("AnimationDeath")
    public void setAnimationDeath(AnimationDeath value) { this.animationDeath = value; }

    @JsonProperty("AnimationWalk")
    public String getAnimationWalk() { return animationWalk; }
    @JsonProperty("AnimationWalk")
    public void setAnimationWalk(String value) { this.animationWalk = value; }

    @JsonProperty("AnimationWalkRate")
    public String getAnimationWalkRate() { return animationWalkRate; }
    @JsonProperty("AnimationWalkRate")
    public void setAnimationWalkRate(String value) { this.animationWalkRate = value; }

    @JsonProperty("TransportAnimation")
    public Map<String, Property157> getTransportAnimation() { return transportAnimation; }
    @JsonProperty("TransportAnimation")
    public void setTransportAnimation(Map<String, Property157> value) { this.transportAnimation = value; }

    @JsonProperty("TransportDropAnimation")
    public Map<String, Property157> getTransportDropAnimation() { return transportDropAnimation; }
    @JsonProperty("TransportDropAnimation")
    public void setTransportDropAnimation(Map<String, Property157> value) { this.transportDropAnimation = value; }

    @JsonProperty("Tarmacs")
    public Map<String, Tarmac> getTarmacs() { return tarmacs; }
    @JsonProperty("Tarmacs")
    public void setTarmacs(Map<String, Tarmac> value) { this.tarmacs = value; }

    @JsonProperty("AnimationPermOpen")
    public String getAnimationPermOpen() { return animationPermOpen; }
    @JsonProperty("AnimationPermOpen")
    public void setAnimationPermOpen(String value) { this.animationPermOpen = value; }

    @JsonProperty("ForcedBuildSpin")
    public String getForcedBuildSpin() { return forcedBuildSpin; }
    @JsonProperty("ForcedBuildSpin")
    public void setForcedBuildSpin(String value) { this.forcedBuildSpin = value; }

    @JsonProperty("AnimationOpen")
    public String getAnimationOpen() { return animationOpen; }
    @JsonProperty("AnimationOpen")
    public void setAnimationOpen(String value) { this.animationOpen = value; }

    @JsonProperty("AnimationUpgrade")
    public String getAnimationUpgrade() { return animationUpgrade; }
    @JsonProperty("AnimationUpgrade")
    public void setAnimationUpgrade(String value) { this.animationUpgrade = value; }

    @JsonProperty("BlinkingLights")
    public Map<String, BlinkingLight> getBlinkingLights() { return blinkingLights; }
    @JsonProperty("BlinkingLights")
    public void setBlinkingLights(Map<String, BlinkingLight> value) { this.blinkingLights = value; }

    @JsonProperty("BlinkingLightsFx")
    public BlinkingLightsFx getBlinkingLightsFx() { return blinkingLightsFx; }
    @JsonProperty("BlinkingLightsFx")
    public void setBlinkingLightsFx(BlinkingLightsFx value) { this.blinkingLightsFx = value; }

    @JsonProperty("BuildAttachBone")
    public BuildAttachBone getBuildAttachBone() { return buildAttachBone; }
    @JsonProperty("BuildAttachBone")
    public void setBuildAttachBone(BuildAttachBone value) { this.buildAttachBone = value; }

    @JsonProperty("DamageEffects")
    public Map<String, DamageEffect> getDamageEffects() { return damageEffects; }
    @JsonProperty("DamageEffects")
    public void setDamageEffects(Map<String, DamageEffect> value) { this.damageEffects = value; }

    @JsonProperty("AnimationActivate")
    public String getAnimationActivate() { return animationActivate; }
    @JsonProperty("AnimationActivate")
    public void setAnimationActivate(String value) { this.animationActivate = value; }

    @JsonProperty("MeshBlueprint")
    public String getMeshBlueprint() { return meshBlueprint; }
    @JsonProperty("MeshBlueprint")
    public void setMeshBlueprint(String value) { this.meshBlueprint = value; }

    @JsonProperty("TeleportEffects")
    public TeleportEffects getTeleportEffects() { return teleportEffects; }
    @JsonProperty("TeleportEffects")
    public void setTeleportEffects(TeleportEffects value) { this.teleportEffects = value; }

    @JsonProperty("WarpInEffect")
    public WarpInEffect getWarpInEffect() { return warpInEffect; }
    @JsonProperty("WarpInEffect")
    public void setWarpInEffect(WarpInEffect value) { this.warpInEffect = value; }

    @JsonProperty("AnimationBuild")
    public String getAnimationBuild() { return animationBuild; }
    @JsonProperty("AnimationBuild")
    public void setAnimationBuild(String value) { this.animationBuild = value; }

    @JsonProperty("MotionChangeEffects")
    public MotionChangeEffects getMotionChangeEffects() { return motionChangeEffects; }
    @JsonProperty("MotionChangeEffects")
    public void setMotionChangeEffects(MotionChangeEffects value) { this.motionChangeEffects = value; }

    @JsonProperty("AnimationSurface")
    public String getAnimationSurface() { return animationSurface; }
    @JsonProperty("AnimationSurface")
    public void setAnimationSurface(String value) { this.animationSurface = value; }

    @JsonProperty("PingPongScroller")
    public PingPongScroller getPingPongScroller() { return pingPongScroller; }
    @JsonProperty("PingPongScroller")
    public void setPingPongScroller(PingPongScroller value) { this.pingPongScroller = value; }

    @JsonProperty("AnimationLand")
    public String getAnimationLand() { return animationLand; }
    @JsonProperty("AnimationLand")
    public void setAnimationLand(String value) { this.animationLand = value; }

    @JsonProperty("AnimationFinishBuildLand")
    public String getAnimationFinishBuildLand() { return animationFinishBuildLand; }
    @JsonProperty("AnimationFinishBuildLand")
    public void setAnimationFinishBuildLand(String value) { this.animationFinishBuildLand = value; }

    @JsonProperty("BuildMeshBlueprint")
    public String getBuildMeshBlueprint() { return buildMeshBlueprint; }
    @JsonProperty("BuildMeshBlueprint")
    public void setBuildMeshBlueprint(String value) { this.buildMeshBlueprint = value; }

    @JsonProperty("AttackReticleSize")
    public String getAttackReticleSize() { return attackReticleSize; }
    @JsonProperty("AttackReticleSize")
    public void setAttackReticleSize(String value) { this.attackReticleSize = value; }

    @JsonProperty("AnimationBuildRate")
    public String getAnimationBuildRate() { return animationBuildRate; }
    @JsonProperty("AnimationBuildRate")
    public void setAnimationBuildRate(String value) { this.animationBuildRate = value; }

    @JsonProperty("AnimationWater")
    public String getAnimationWater() { return animationWater; }
    @JsonProperty("AnimationWater")
    public void setAnimationWater(String value) { this.animationWater = value; }

    @JsonProperty("MaxRockSpeed")
    public String getMaxRockSpeed() { return maxRockSpeed; }
    @JsonProperty("MaxRockSpeed")
    public void setMaxRockSpeed(String value) { this.maxRockSpeed = value; }

    @JsonProperty("0")
    public Display0 getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(Display0 value) { this.the0 = value; }

    @JsonProperty("AINames")
    public String[] getAINames() { return aiNames; }
    @JsonProperty("AINames")
    public void setAINames(String[] value) { this.aiNames = value; }

    @JsonProperty("AnimationIdle")
    public String getAnimationIdle() { return animationIdle; }
    @JsonProperty("AnimationIdle")
    public void setAnimationIdle(String value) { this.animationIdle = value; }

    @JsonProperty("AnimationTakeOff")
    public String getAnimationTakeOff() { return animationTakeOff; }
    @JsonProperty("AnimationTakeOff")
    public void setAnimationTakeOff(String value) { this.animationTakeOff = value; }

    @JsonProperty("AttackReticle")
    public String getAttackReticle() { return attackReticle; }
    @JsonProperty("AttackReticle")
    public void setAttackReticle(String value) { this.attackReticle = value; }

    @JsonProperty("olderMeshName")
    public String getOlderMeshName() { return olderMeshName; }
    @JsonProperty("olderMeshName")
    public void setOlderMeshName(String value) { this.olderMeshName = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }

    @JsonProperty("2")
    public String getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(String value) { this.the2 = value; }

    @JsonProperty("3")
    public String getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(String value) { this.the3 = value; }

    @JsonProperty("AnimationTransform")
    public String getAnimationTransform() { return animationTransform; }
    @JsonProperty("AnimationTransform")
    public void setAnimationTransform(String value) { this.animationTransform = value; }

    @JsonProperty("LandAnimationDeath")
    public LandAnimationDeath getLandAnimationDeath() { return landAnimationDeath; }
    @JsonProperty("LandAnimationDeath")
    public void setLandAnimationDeath(LandAnimationDeath value) { this.landAnimationDeath = value; }

    @JsonProperty("WaterAnimationDeath")
    public WaterAnimationDeath getWaterAnimationDeath() { return waterAnimationDeath; }
    @JsonProperty("WaterAnimationDeath")
    public void setWaterAnimationDeath(WaterAnimationDeath value) { this.waterAnimationDeath = value; }

    @JsonProperty("MotionAdjustment")
    public MotionAdjustment getMotionAdjustment() { return motionAdjustment; }
    @JsonProperty("MotionAdjustment")
    public void setMotionAdjustment(MotionAdjustment value) { this.motionAdjustment = value; }

    @JsonProperty("AnimationDeploy")
    public String getAnimationDeploy() { return animationDeploy; }
    @JsonProperty("AnimationDeploy")
    public void setAnimationDeploy(String value) { this.animationDeploy = value; }

    @JsonProperty("HideLifebars")
    public Boolean getHideLifebars() { return hideLifebars; }
    @JsonProperty("HideLifebars")
    public void setHideLifebars(Boolean value) { this.hideLifebars = value; }

    @JsonProperty("LoopingAnimation")
    public String getLoopingAnimation() { return loopingAnimation; }
    @JsonProperty("LoopingAnimation")
    public void setLoopingAnimation(String value) { this.loopingAnimation = value; }

    @JsonProperty("MissileBone")
    public String getMissileBone() { return missileBone; }
    @JsonProperty("MissileBone")
    public void setMissileBone(String value) { this.missileBone = value; }

    @JsonProperty("CannonOpenAnimation")
    public String getCannonOpenAnimation() { return cannonOpenAnimation; }
    @JsonProperty("CannonOpenAnimation")
    public void setCannonOpenAnimation(String value) { this.cannonOpenAnimation = value; }

    @JsonProperty("BuildEffect")
    public BuildEffect getBuildEffect() { return buildEffect; }
    @JsonProperty("BuildEffect")
    public void setBuildEffect(BuildEffect value) { this.buildEffect = value; }

    @JsonProperty("4")
    public String getThe4() { return the4; }
    @JsonProperty("4")
    public void setThe4(String value) { this.the4 = value; }

    @JsonProperty("5")
    public String getThe5() { return the5; }
    @JsonProperty("5")
    public void setThe5(String value) { this.the5 = value; }

    @JsonProperty("6")
    public String getThe6() { return the6; }
    @JsonProperty("6")
    public void setThe6(String value) { this.the6 = value; }

    @JsonProperty("7")
    public String getThe7() { return the7; }
    @JsonProperty("7")
    public void setThe7(String value) { this.the7 = value; }

    @JsonProperty("8")
    public String getThe8() { return the8; }
    @JsonProperty("8")
    public void setThe8(String value) { this.the8 = value; }

    @JsonProperty("9")
    public String getThe9() { return the9; }
    @JsonProperty("9")
    public void setThe9(String value) { this.the9 = value; }

    @JsonProperty("10")
    public String getThe10() { return the10; }
    @JsonProperty("10")
    public void setThe10(String value) { this.the10 = value; }

    @JsonProperty("11")
    public String getThe11() { return the11; }
    @JsonProperty("11")
    public void setThe11(String value) { this.the11 = value; }

    @JsonProperty("12")
    public String getThe12() { return the12; }
    @JsonProperty("12")
    public void setThe12(String value) { this.the12 = value; }

    @JsonProperty("13")
    public String getThe13() { return the13; }
    @JsonProperty("13")
    public void setThe13(String value) { this.the13 = value; }

    @JsonProperty("SequenceAnimation")
    public String getSequenceAnimation() { return sequenceAnimation; }
    @JsonProperty("SequenceAnimation")
    public void setSequenceAnimation(String value) { this.sequenceAnimation = value; }

    @JsonProperty("AnimationPermOpenAlt")
    public String getAnimationPermOpenAlt() { return animationPermOpenAlt; }
    @JsonProperty("AnimationPermOpenAlt")
    public void setAnimationPermOpenAlt(String value) { this.animationPermOpenAlt = value; }

    @JsonProperty("FlashLights")
    public FlashLights getFlashLights() { return flashLights; }
    @JsonProperty("FlashLights")
    public void setFlashLights(FlashLights value) { this.flashLights = value; }

    @JsonProperty("FlashLightsFx")
    public FlashLightsFx getFlashLightsFx() { return flashLightsFx; }
    @JsonProperty("FlashLightsFx")
    public void setFlashLightsFx(FlashLightsFx value) { this.flashLightsFx = value; }

    @JsonProperty("ShieldOnRotatingBone")
    public String getShieldOnRotatingBone() { return shieldOnRotatingBone; }
    @JsonProperty("ShieldOnRotatingBone")
    public void setShieldOnRotatingBone(String value) { this.shieldOnRotatingBone = value; }

    @JsonProperty("ShieldEmitterScale")
    public String getShieldEmitterScale() { return shieldEmitterScale; }
    @JsonProperty("ShieldEmitterScale")
    public void setShieldEmitterScale(String value) { this.shieldEmitterScale = value; }

    @JsonProperty("Property106")
    public DisplayProperty100 getProperty106() { return property106; }
    @JsonProperty("Property106")
    public void setProperty106(DisplayProperty100 value) { this.property106 = value; }

    @JsonProperty("Property111")
    public DisplayProperty100 getProperty111() { return property111; }
    @JsonProperty("Property111")
    public void setProperty111(DisplayProperty100 value) { this.property111 = value; }

    @JsonProperty("Property90")
    public DisplayProperty100 getProperty90() { return property90; }
    @JsonProperty("Property90")
    public void setProperty90(DisplayProperty100 value) { this.property90 = value; }

    @JsonProperty("MiniRailgunsExtend")
    public Boolean getMiniRailgunsExtend() { return miniRailgunsExtend; }
    @JsonProperty("MiniRailgunsExtend")
    public void setMiniRailgunsExtend(Boolean value) { this.miniRailgunsExtend = value; }

    @JsonProperty("Property95")
    public DisplayProperty100 getProperty95() { return property95; }
    @JsonProperty("Property95")
    public void setProperty95(DisplayProperty100 value) { this.property95 = value; }

    @JsonProperty("Property100")
    public DisplayProperty100 getProperty100() { return property100; }
    @JsonProperty("Property100")
    public void setProperty100(DisplayProperty100 value) { this.property100 = value; }

    @JsonProperty("Property105")
    public DisplayProperty100 getProperty105() { return property105; }
    @JsonProperty("Property105")
    public void setProperty105(DisplayProperty100 value) { this.property105 = value; }

    @JsonProperty("Property110")
    public DisplayProperty100 getProperty110() { return property110; }
    @JsonProperty("Property110")
    public void setProperty110(DisplayProperty100 value) { this.property110 = value; }

    @JsonProperty("Property81")
    public DisplayProperty100 getProperty81() { return property81; }
    @JsonProperty("Property81")
    public void setProperty81(DisplayProperty100 value) { this.property81 = value; }

    @JsonProperty("Property86")
    public DisplayProperty100 getProperty86() { return property86; }
    @JsonProperty("Property86")
    public void setProperty86(DisplayProperty100 value) { this.property86 = value; }

    @JsonProperty("Property91")
    public DisplayProperty100 getProperty91() { return property91; }
    @JsonProperty("Property91")
    public void setProperty91(DisplayProperty100 value) { this.property91 = value; }

    @JsonProperty("Property96")
    public DisplayProperty100 getProperty96() { return property96; }
    @JsonProperty("Property96")
    public void setProperty96(DisplayProperty100 value) { this.property96 = value; }

    @JsonProperty("Property101")
    public DisplayProperty100 getProperty101() { return property101; }
    @JsonProperty("Property101")
    public void setProperty101(DisplayProperty100 value) { this.property101 = value; }

    @JsonProperty("Property116")
    public DisplayProperty100 getProperty116() { return property116; }
    @JsonProperty("Property116")
    public void setProperty116(DisplayProperty100 value) { this.property116 = value; }

    @JsonProperty("Property121")
    public DisplayProperty100 getProperty121() { return property121; }
    @JsonProperty("Property121")
    public void setProperty121(DisplayProperty100 value) { this.property121 = value; }

    @JsonProperty("Property126")
    public DisplayProperty100 getProperty126() { return property126; }
    @JsonProperty("Property126")
    public void setProperty126(DisplayProperty100 value) { this.property126 = value; }

    @JsonProperty("Property131")
    public DisplayProperty100 getProperty131() { return property131; }
    @JsonProperty("Property131")
    public void setProperty131(DisplayProperty100 value) { this.property131 = value; }

    @JsonProperty("Property136")
    public DisplayProperty100 getProperty136() { return property136; }
    @JsonProperty("Property136")
    public void setProperty136(DisplayProperty100 value) { this.property136 = value; }

    @JsonProperty("Property103")
    public DisplayProperty100 getProperty103() { return property103; }
    @JsonProperty("Property103")
    public void setProperty103(DisplayProperty100 value) { this.property103 = value; }

    @JsonProperty("Property108")
    public DisplayProperty100 getProperty108() { return property108; }
    @JsonProperty("Property108")
    public void setProperty108(DisplayProperty100 value) { this.property108 = value; }

    @JsonProperty("Property113")
    public DisplayProperty100 getProperty113() { return property113; }
    @JsonProperty("Property113")
    public void setProperty113(DisplayProperty100 value) { this.property113 = value; }

    @JsonProperty("Property118")
    public DisplayProperty100 getProperty118() { return property118; }
    @JsonProperty("Property118")
    public void setProperty118(DisplayProperty100 value) { this.property118 = value; }

    @JsonProperty("Property123")
    public DisplayProperty100 getProperty123() { return property123; }
    @JsonProperty("Property123")
    public void setProperty123(DisplayProperty100 value) { this.property123 = value; }

    @JsonProperty("Property128")
    public DisplayProperty100 getProperty128() { return property128; }
    @JsonProperty("Property128")
    public void setProperty128(DisplayProperty100 value) { this.property128 = value; }

    @JsonProperty("Property133")
    public DisplayProperty100 getProperty133() { return property133; }
    @JsonProperty("Property133")
    public void setProperty133(DisplayProperty100 value) { this.property133 = value; }

    @JsonProperty("Property138")
    public DisplayProperty100 getProperty138() { return property138; }
    @JsonProperty("Property138")
    public void setProperty138(DisplayProperty100 value) { this.property138 = value; }

    @JsonProperty("Property143")
    public DisplayProperty100 getProperty143() { return property143; }
    @JsonProperty("Property143")
    public void setProperty143(DisplayProperty100 value) { this.property143 = value; }

    @JsonProperty("Property148")
    public DisplayProperty100 getProperty148() { return property148; }
    @JsonProperty("Property148")
    public void setProperty148(DisplayProperty100 value) { this.property148 = value; }

    @JsonProperty("Property153")
    public DisplayProperty100 getProperty153() { return property153; }
    @JsonProperty("Property153")
    public void setProperty153(DisplayProperty100 value) { this.property153 = value; }

    @JsonProperty("Property158")
    public DisplayProperty100 getProperty158() { return property158; }
    @JsonProperty("Property158")
    public void setProperty158(DisplayProperty100 value) { this.property158 = value; }

    @JsonProperty("Property141")
    public DisplayProperty100 getProperty141() { return property141; }
    @JsonProperty("Property141")
    public void setProperty141(DisplayProperty100 value) { this.property141 = value; }

    @JsonProperty("Property146")
    public DisplayProperty100 getProperty146() { return property146; }
    @JsonProperty("Property146")
    public void setProperty146(DisplayProperty100 value) { this.property146 = value; }

    @JsonProperty("Property151")
    public DisplayProperty100 getProperty151() { return property151; }
    @JsonProperty("Property151")
    public void setProperty151(DisplayProperty100 value) { this.property151 = value; }

    @JsonProperty("Property156")
    public DisplayProperty100 getProperty156() { return property156; }
    @JsonProperty("Property156")
    public void setProperty156(DisplayProperty100 value) { this.property156 = value; }

    @JsonProperty("Property161")
    public DisplayProperty100 getProperty161() { return property161; }
    @JsonProperty("Property161")
    public void setProperty161(DisplayProperty100 value) { this.property161 = value; }

    @JsonProperty("Property166")
    public DisplayProperty100 getProperty166() { return property166; }
    @JsonProperty("Property166")
    public void setProperty166(DisplayProperty100 value) { this.property166 = value; }

    @JsonProperty("Property171")
    public DisplayProperty100 getProperty171() { return property171; }
    @JsonProperty("Property171")
    public void setProperty171(DisplayProperty100 value) { this.property171 = value; }

    @JsonProperty("Property176")
    public DisplayProperty100 getProperty176() { return property176; }
    @JsonProperty("Property176")
    public void setProperty176(DisplayProperty100 value) { this.property176 = value; }

    @JsonProperty("Property115")
    public DisplayProperty100 getProperty115() { return property115; }
    @JsonProperty("Property115")
    public void setProperty115(DisplayProperty100 value) { this.property115 = value; }

    @JsonProperty("Property120")
    public DisplayProperty100 getProperty120() { return property120; }
    @JsonProperty("Property120")
    public void setProperty120(DisplayProperty100 value) { this.property120 = value; }

    @JsonProperty("Property125")
    public DisplayProperty100 getProperty125() { return property125; }
    @JsonProperty("Property125")
    public void setProperty125(DisplayProperty100 value) { this.property125 = value; }

    @JsonProperty("Property130")
    public DisplayProperty100 getProperty130() { return property130; }
    @JsonProperty("Property130")
    public void setProperty130(DisplayProperty100 value) { this.property130 = value; }

    @JsonProperty("Property135")
    public DisplayProperty100 getProperty135() { return property135; }
    @JsonProperty("Property135")
    public void setProperty135(DisplayProperty100 value) { this.property135 = value; }

    @JsonProperty("AnimationRun")
    public String getAnimationRun() { return animationRun; }
    @JsonProperty("AnimationRun")
    public void setAnimationRun(String value) { this.animationRun = value; }

    @JsonProperty("AnimationRunRate")
    public String getAnimationRunRate() { return animationRunRate; }
    @JsonProperty("AnimationRunRate")
    public void setAnimationRunRate(String value) { this.animationRunRate = value; }

    @JsonProperty("EnhancementBoneEmitter")
    public String getEnhancementBoneEmitter() { return enhancementBoneEmitter; }
    @JsonProperty("EnhancementBoneEmitter")
    public void setEnhancementBoneEmitter(String value) { this.enhancementBoneEmitter = value; }

    @JsonProperty("AkimboControl")
    public AkimboControl getAkimboControl() { return akimboControl; }
    @JsonProperty("AkimboControl")
    public void setAkimboControl(AkimboControl value) { this.akimboControl = value; }

    @JsonProperty("AnimationAlert")
    public String getAnimationAlert() { return animationAlert; }
    @JsonProperty("AnimationAlert")
    public void setAnimationAlert(String value) { this.animationAlert = value; }

    @JsonProperty("NumberOfBuildBeams")
    public String getNumberOfBuildBeams() { return numberOfBuildBeams; }
    @JsonProperty("NumberOfBuildBeams")
    public void setNumberOfBuildBeams(String value) { this.numberOfBuildBeams = value; }

    @JsonProperty("WeaponExhaustAnimation")
    public String getWeaponExhaustAnimation() { return weaponExhaustAnimation; }
    @JsonProperty("WeaponExhaustAnimation")
    public void setWeaponExhaustAnimation(String value) { this.weaponExhaustAnimation = value; }

    @JsonProperty("AnimationOpenHatch")
    public String getAnimationOpenHatch() { return animationOpenHatch; }
    @JsonProperty("AnimationOpenHatch")
    public void setAnimationOpenHatch(String value) { this.animationOpenHatch = value; }
}
