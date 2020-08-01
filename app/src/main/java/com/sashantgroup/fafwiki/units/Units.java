package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Units {
    private The2_Enum the0;
    private UnitAir air;
    private UnitAudio audio;
    private String buildIconSortPriority;
    private String[] categories;
    private String[] contrailEffects;
    private Defense defense;
    private String description;
    private Display display;
    private Economy economy;
    private UnitFootprint footprint;
    private General general;
    private Intel intel;
    private Interface unitInterface;
    private String lifeBarHeight;
    private String lifeBarOffset;
    private String lifeBarSize;
    private Physics physics;
    private String selectionSizeX;
    private String selectionSizeZ;
    private String selectionThickness;
    private String sizeSphere;
    private String sizeX;
    private String sizeY;
    private String sizeZ;
    private String strategicIconName;
    private String strategicIconSortPriority;
    private Transport transport;
    private Weapon weapon;
    private String id;
    private BlueprintType blueprintType;
    private UnitBuffs buffs;
    private String collisionOffsetZ;
    private Veteran veteran;
    private Wreckage wreckage;
    private AI ai;
    private String collisionOffsetY;
    private String selectionCenterOffsetX;
    private String selectionCenterOffsetZ;
    private String collisionOffsetX;
    private String averageDensity;
    private String useOOBTestZoom;
    private String veteranMassMult;
    private String adjacency;
    private Boolean lifeBarRender;
    private String selectionYOffset;
    private String the1;
    private Enhancements enhancements;
    private String[] veteranHealingMult;
    private String selectionCenterOffsetY;
    private EnhancementPresets enhancementPresets;
    private String strategicIconSize;
    private String selectionMeshScaleX;
    private String selectionMeshScaleZ;
    private String selectionMeshUseTopAmount;
    private String upgradeDesc;
    private String watchBone;
    private SplitDamage splitDamage;
    private Abilities abilities;
    private BuffFields buffFields;
    private Boolean resolvePath;
    private String lifetime;
    private String maxMoveRange;
    private The2_Enum the2;
    private String sizeXContracted;
    private String sizeYContracted;
    private String sizeZContracted;
    private SpecialAbilities specialAbilities;
    private Rotators rotators;
    private String the3;
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
    private String selectionSizey;

    @JsonProperty("0")
    public The2_Enum getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(The2_Enum value) { this.the0 = value; }

    @JsonProperty("Air")
    public UnitAir getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(UnitAir value) { this.air = value; }

    @JsonProperty("Audio")
    public UnitAudio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(UnitAudio value) { this.audio = value; }

    @JsonProperty("BuildIconSortPriority")
    public String getBuildIconSortPriority() { return buildIconSortPriority; }
    @JsonProperty("BuildIconSortPriority")
    public void setBuildIconSortPriority(String value) { this.buildIconSortPriority = value; }

    @JsonProperty("Categories")
    public String[] getCategories() { return categories; }
    @JsonProperty("Categories")
    public void setCategories(String[] value) { this.categories = value; }

    @JsonProperty("ContrailEffects")
    public String[] getContrailEffects() { return contrailEffects; }
    @JsonProperty("ContrailEffects")
    public void setContrailEffects(String[] value) { this.contrailEffects = value; }

    @JsonProperty("Defense")
    public Defense getDefense() { return defense; }
    @JsonProperty("Defense")
    public void setDefense(Defense value) { this.defense = value; }

    @JsonProperty("Description")
    public String getDescription() { return description; }
    @JsonProperty("Description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("Display")
    public Display getDisplay() { return display; }
    @JsonProperty("Display")
    public void setDisplay(Display value) { this.display = value; }

    @JsonProperty("Economy")
    public Economy getEconomy() { return economy; }
    @JsonProperty("Economy")
    public void setEconomy(Economy value) { this.economy = value; }

    @JsonProperty("Footprint")
    public UnitFootprint getFootprint() { return footprint; }
    @JsonProperty("Footprint")
    public void setFootprint(UnitFootprint value) { this.footprint = value; }

    @JsonProperty("General")
    public General getGeneral() { return general; }
    @JsonProperty("General")
    public void setGeneral(General value) { this.general = value; }

    @JsonProperty("Intel")
    public Intel getIntel() { return intel; }
    @JsonProperty("Intel")
    public void setIntel(Intel value) { this.intel = value; }

    @JsonProperty("Interface")
    public Interface getUnitInterface() { return unitInterface; }
    @JsonProperty("Interface")
    public void setUnitInterface(Interface value) { this.unitInterface = value; }

    @JsonProperty("LifeBarHeight")
    public String getLifeBarHeight() { return lifeBarHeight; }
    @JsonProperty("LifeBarHeight")
    public void setLifeBarHeight(String value) { this.lifeBarHeight = value; }

    @JsonProperty("LifeBarOffset")
    public String getLifeBarOffset() { return lifeBarOffset; }
    @JsonProperty("LifeBarOffset")
    public void setLifeBarOffset(String value) { this.lifeBarOffset = value; }

    @JsonProperty("LifeBarSize")
    public String getLifeBarSize() { return lifeBarSize; }
    @JsonProperty("LifeBarSize")
    public void setLifeBarSize(String value) { this.lifeBarSize = value; }

    @JsonProperty("Physics")
    public Physics getPhysics() { return physics; }
    @JsonProperty("Physics")
    public void setPhysics(Physics value) { this.physics = value; }

    @JsonProperty("SelectionSizeX")
    public String getSelectionSizeX() { return selectionSizeX; }
    @JsonProperty("SelectionSizeX")
    public void setSelectionSizeX(String value) { this.selectionSizeX = value; }

    @JsonProperty("SelectionSizeZ")
    public String getSelectionSizeZ() { return selectionSizeZ; }
    @JsonProperty("SelectionSizeZ")
    public void setSelectionSizeZ(String value) { this.selectionSizeZ = value; }

    @JsonProperty("SelectionThickness")
    public String getSelectionThickness() { return selectionThickness; }
    @JsonProperty("SelectionThickness")
    public void setSelectionThickness(String value) { this.selectionThickness = value; }

    @JsonProperty("SizeSphere")
    public String getSizeSphere() { return sizeSphere; }
    @JsonProperty("SizeSphere")
    public void setSizeSphere(String value) { this.sizeSphere = value; }

    @JsonProperty("SizeX")
    public String getSizeX() { return sizeX; }
    @JsonProperty("SizeX")
    public void setSizeX(String value) { this.sizeX = value; }

    @JsonProperty("SizeY")
    public String getSizeY() { return sizeY; }
    @JsonProperty("SizeY")
    public void setSizeY(String value) { this.sizeY = value; }

    @JsonProperty("SizeZ")
    public String getSizeZ() { return sizeZ; }
    @JsonProperty("SizeZ")
    public void setSizeZ(String value) { this.sizeZ = value; }

    @JsonProperty("StrategicIconName")
    public String getStrategicIconName() { return strategicIconName; }
    @JsonProperty("StrategicIconName")
    public void setStrategicIconName(String value) { this.strategicIconName = value; }

    @JsonProperty("StrategicIconSortPriority")
    public String getStrategicIconSortPriority() { return strategicIconSortPriority; }
    @JsonProperty("StrategicIconSortPriority")
    public void setStrategicIconSortPriority(String value) { this.strategicIconSortPriority = value; }

    @JsonProperty("Transport")
    public Transport getTransport() { return transport; }
    @JsonProperty("Transport")
    public void setTransport(Transport value) { this.transport = value; }

    @JsonProperty("Weapon")
    public Weapon getWeapon() { return weapon; }
    @JsonProperty("Weapon")
    public void setWeapon(Weapon value) { this.weapon = value; }

    @JsonProperty("Id")
    public String getID() { return id; }
    @JsonProperty("Id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("BlueprintType")
    public BlueprintType getBlueprintType() { return blueprintType; }
    @JsonProperty("BlueprintType")
    public void setBlueprintType(BlueprintType value) { this.blueprintType = value; }

    @JsonProperty("Buffs")
    public UnitBuffs getBuffs() { return buffs; }
    @JsonProperty("Buffs")
    public void setBuffs(UnitBuffs value) { this.buffs = value; }

    @JsonProperty("CollisionOffsetZ")
    public String getCollisionOffsetZ() { return collisionOffsetZ; }
    @JsonProperty("CollisionOffsetZ")
    public void setCollisionOffsetZ(String value) { this.collisionOffsetZ = value; }

    @JsonProperty("Veteran")
    public Veteran getVeteran() { return veteran; }
    @JsonProperty("Veteran")
    public void setVeteran(Veteran value) { this.veteran = value; }

    @JsonProperty("Wreckage")
    public Wreckage getWreckage() { return wreckage; }
    @JsonProperty("Wreckage")
    public void setWreckage(Wreckage value) { this.wreckage = value; }

    @JsonProperty("AI")
    public AI getAI() { return ai; }
    @JsonProperty("AI")
    public void setAI(AI value) { this.ai = value; }

    @JsonProperty("CollisionOffsetY")
    public String getCollisionOffsetY() { return collisionOffsetY; }
    @JsonProperty("CollisionOffsetY")
    public void setCollisionOffsetY(String value) { this.collisionOffsetY = value; }

    @JsonProperty("SelectionCenterOffsetX")
    public String getSelectionCenterOffsetX() { return selectionCenterOffsetX; }
    @JsonProperty("SelectionCenterOffsetX")
    public void setSelectionCenterOffsetX(String value) { this.selectionCenterOffsetX = value; }

    @JsonProperty("SelectionCenterOffsetZ")
    public String getSelectionCenterOffsetZ() { return selectionCenterOffsetZ; }
    @JsonProperty("SelectionCenterOffsetZ")
    public void setSelectionCenterOffsetZ(String value) { this.selectionCenterOffsetZ = value; }

    @JsonProperty("CollisionOffsetX")
    public String getCollisionOffsetX() { return collisionOffsetX; }
    @JsonProperty("CollisionOffsetX")
    public void setCollisionOffsetX(String value) { this.collisionOffsetX = value; }

    @JsonProperty("AverageDensity")
    public String getAverageDensity() { return averageDensity; }
    @JsonProperty("AverageDensity")
    public void setAverageDensity(String value) { this.averageDensity = value; }

    @JsonProperty("UseOOBTestZoom")
    public String getUseOOBTestZoom() { return useOOBTestZoom; }
    @JsonProperty("UseOOBTestZoom")
    public void setUseOOBTestZoom(String value) { this.useOOBTestZoom = value; }

    @JsonProperty("VeteranMassMult")
    public String getVeteranMassMult() { return veteranMassMult; }
    @JsonProperty("VeteranMassMult")
    public void setVeteranMassMult(String value) { this.veteranMassMult = value; }

    @JsonProperty("Adjacency")
    public String getAdjacency() { return adjacency; }
    @JsonProperty("Adjacency")
    public void setAdjacency(String value) { this.adjacency = value; }

    @JsonProperty("LifeBarRender")
    public Boolean getLifeBarRender() { return lifeBarRender; }
    @JsonProperty("LifeBarRender")
    public void setLifeBarRender(Boolean value) { this.lifeBarRender = value; }

    @JsonProperty("SelectionYOffset")
    public String getSelectionYOffset() { return selectionYOffset; }
    @JsonProperty("SelectionYOffset")
    public void setSelectionYOffset(String value) { this.selectionYOffset = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }

    @JsonProperty("Enhancements")
    public Enhancements getEnhancements() { return enhancements; }
    @JsonProperty("Enhancements")
    public void setEnhancements(Enhancements value) { this.enhancements = value; }

    @JsonProperty("VeteranHealingMult")
    public String[] getVeteranHealingMult() { return veteranHealingMult; }
    @JsonProperty("VeteranHealingMult")
    public void setVeteranHealingMult(String[] value) { this.veteranHealingMult = value; }

    @JsonProperty("SelectionCenterOffsetY")
    public String getSelectionCenterOffsetY() { return selectionCenterOffsetY; }
    @JsonProperty("SelectionCenterOffsetY")
    public void setSelectionCenterOffsetY(String value) { this.selectionCenterOffsetY = value; }

    @JsonProperty("EnhancementPresets")
    public EnhancementPresets getEnhancementPresets() { return enhancementPresets; }
    @JsonProperty("EnhancementPresets")
    public void setEnhancementPresets(EnhancementPresets value) { this.enhancementPresets = value; }

    @JsonProperty("StrategicIconSize")
    public String getStrategicIconSize() { return strategicIconSize; }
    @JsonProperty("StrategicIconSize")
    public void setStrategicIconSize(String value) { this.strategicIconSize = value; }

    @JsonProperty("SelectionMeshScaleX")
    public String getSelectionMeshScaleX() { return selectionMeshScaleX; }
    @JsonProperty("SelectionMeshScaleX")
    public void setSelectionMeshScaleX(String value) { this.selectionMeshScaleX = value; }

    @JsonProperty("SelectionMeshScaleZ")
    public String getSelectionMeshScaleZ() { return selectionMeshScaleZ; }
    @JsonProperty("SelectionMeshScaleZ")
    public void setSelectionMeshScaleZ(String value) { this.selectionMeshScaleZ = value; }

    @JsonProperty("SelectionMeshUseTopAmount")
    public String getSelectionMeshUseTopAmount() { return selectionMeshUseTopAmount; }
    @JsonProperty("SelectionMeshUseTopAmount")
    public void setSelectionMeshUseTopAmount(String value) { this.selectionMeshUseTopAmount = value; }

    @JsonProperty("UpgradeDesc")
    public String getUpgradeDesc() { return upgradeDesc; }
    @JsonProperty("UpgradeDesc")
    public void setUpgradeDesc(String value) { this.upgradeDesc = value; }

    @JsonProperty("WatchBone")
    public String getWatchBone() { return watchBone; }
    @JsonProperty("WatchBone")
    public void setWatchBone(String value) { this.watchBone = value; }

    @JsonProperty("SplitDamage")
    public SplitDamage getSplitDamage() { return splitDamage; }
    @JsonProperty("SplitDamage")
    public void setSplitDamage(SplitDamage value) { this.splitDamage = value; }

    @JsonProperty("Abilities")
    public Abilities getAbilities() { return abilities; }
    @JsonProperty("Abilities")
    public void setAbilities(Abilities value) { this.abilities = value; }

    @JsonProperty("BuffFields")
    public BuffFields getBuffFields() { return buffFields; }
    @JsonProperty("BuffFields")
    public void setBuffFields(BuffFields value) { this.buffFields = value; }

    @JsonProperty("ResolvePath")
    public Boolean getResolvePath() { return resolvePath; }
    @JsonProperty("ResolvePath")
    public void setResolvePath(Boolean value) { this.resolvePath = value; }

    @JsonProperty("Lifetime")
    public String getLifetime() { return lifetime; }
    @JsonProperty("Lifetime")
    public void setLifetime(String value) { this.lifetime = value; }

    @JsonProperty("MaxMoveRange")
    public String getMaxMoveRange() { return maxMoveRange; }
    @JsonProperty("MaxMoveRange")
    public void setMaxMoveRange(String value) { this.maxMoveRange = value; }

    @JsonProperty("2")
    public The2_Enum getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(The2_Enum value) { this.the2 = value; }

    @JsonProperty("SizeXContracted")
    public String getSizeXContracted() { return sizeXContracted; }
    @JsonProperty("SizeXContracted")
    public void setSizeXContracted(String value) { this.sizeXContracted = value; }

    @JsonProperty("SizeYContracted")
    public String getSizeYContracted() { return sizeYContracted; }
    @JsonProperty("SizeYContracted")
    public void setSizeYContracted(String value) { this.sizeYContracted = value; }

    @JsonProperty("SizeZContracted")
    public String getSizeZContracted() { return sizeZContracted; }
    @JsonProperty("SizeZContracted")
    public void setSizeZContracted(String value) { this.sizeZContracted = value; }

    @JsonProperty("SpecialAbilities")
    public SpecialAbilities getSpecialAbilities() { return specialAbilities; }
    @JsonProperty("SpecialAbilities")
    public void setSpecialAbilities(SpecialAbilities value) { this.specialAbilities = value; }

    @JsonProperty("Rotators")
    public Rotators getRotators() { return rotators; }
    @JsonProperty("Rotators")
    public void setRotators(Rotators value) { this.rotators = value; }

    @JsonProperty("3")
    public String getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(String value) { this.the3 = value; }

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

    @JsonProperty("SelectionSizey")
    public String getSelectionSizey() { return selectionSizey; }
    @JsonProperty("SelectionSizey")
    public void setSelectionSizey(String value) { this.selectionSizey = value; }
}
