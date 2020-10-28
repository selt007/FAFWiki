package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class Unit {
    private Weapon[] weapon;
    private Defense defense;
    private long strategicIconSortPriority;
    private Transport transport;
    private Double sizeSphere;
    private String strategicIconName;
    private double sizeZ;
    private Audio audio;
    private String id;
    private Double selectionSizeZ;
    private Long buildIconSortPriority;
    private double lifeBarSize;
    private double sizeX;
    private String[] categories;
    private Double selectionSizeX;
    private double selectionThickness;
    private Interface unitInterface;
    private double sizeY;
    private Wreckage wreckage;
    private Display display;
    private General general;
    private UnitFootprint footprint;
    private double lifeBarOffset;
    private double lifeBarHeight;
    private Intel intel;
    private Double collisionOffsetY;
    private Economy economy;
    private Physics physics;
    private String description;
    private UnitAir air;
    private Buffs buffs;
    private Veteran veteran;
    private AI ai;
    private Long averageDensity;
    private Double collisionOffsetZ;
    private Double veteranMassMult;
    private Double selectionCenterOffsetZ;
    private Double selectionCenterOffsetX;
    private Double selectionCenterOffsetY;
    private Long useOOBTestZoom;
    private Double collisionOffsetX;
    private String[] contrailEffects;
    private Map<String, EnhancementPreset> enhancementPresets;
    private Long selectionYOffset;
    private Enhancements enhancements;
    private String adjacency;
    private Abilities abilities;
    private long[] veteranMass;
    private double[] veteranHealingMult;
    private Double selectionMeshUseTopAmount;
    private Double selectionMeshScaleZ;
    private Double selectionMeshScaleX;
    private Long strategicIconSize;
    private Long watchBone;
    private Boolean lifeBarRender;
    private SplitDamage splitDamage;
    private Long secondsBeforeExplosionWhenCharging;
    private Long secondsBeforeChargeKicksIn;
    private Boolean resolvePath;
    private BuffFields buffFields;

    @JsonProperty("Weapon")
    public Weapon[] getWeapon() { return weapon; }
    @JsonProperty("Weapon")
    public void setWeapon(Weapon[] value) { this.weapon = value; }

    @JsonProperty("Defense")
    public Defense getDefense() { return defense; }
    @JsonProperty("Defense")
    public void setDefense(Defense value) { this.defense = value; }

    @JsonProperty("StrategicIconSortPriority")
    public long getStrategicIconSortPriority() { return strategicIconSortPriority; }
    @JsonProperty("StrategicIconSortPriority")
    public void setStrategicIconSortPriority(long value) { this.strategicIconSortPriority = value; }

    @JsonProperty("Transport")
    public Transport getTransport() { return transport; }
    @JsonProperty("Transport")
    public void setTransport(Transport value) { this.transport = value; }

    @JsonProperty("SizeSphere")
    public Double getSizeSphere() { return sizeSphere; }
    @JsonProperty("SizeSphere")
    public void setSizeSphere(Double value) { this.sizeSphere = value; }

    @JsonProperty("StrategicIconName")
    public String getStrategicIconName() { return strategicIconName; }
    @JsonProperty("StrategicIconName")
    public void setStrategicIconName(String value) { this.strategicIconName = value; }

    @JsonProperty("SizeZ")
    public double getSizeZ() { return sizeZ; }
    @JsonProperty("SizeZ")
    public void setSizeZ(double value) { this.sizeZ = value; }

    @JsonProperty("Audio")
    public Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Audio value) { this.audio = value; }

    @JsonProperty("ID")
    public String getID() { return id; }
    @JsonProperty("ID")
    public void setID(String value) { this.id = value; }

    @JsonProperty("SelectionSizeZ")
    public Double getSelectionSizeZ() { return selectionSizeZ; }
    @JsonProperty("SelectionSizeZ")
    public void setSelectionSizeZ(Double value) { this.selectionSizeZ = value; }

    @JsonProperty("BuildIconSortPriority")
    public Long getBuildIconSortPriority() { return buildIconSortPriority; }
    @JsonProperty("BuildIconSortPriority")
    public void setBuildIconSortPriority(Long value) { this.buildIconSortPriority = value; }

    @JsonProperty("LifeBarSize")
    public double getLifeBarSize() { return lifeBarSize; }
    @JsonProperty("LifeBarSize")
    public void setLifeBarSize(double value) { this.lifeBarSize = value; }

    @JsonProperty("SizeX")
    public double getSizeX() { return sizeX; }
    @JsonProperty("SizeX")
    public void setSizeX(double value) { this.sizeX = value; }

    @JsonProperty("Categories")
    public String[] getCategories() { return categories; }
    @JsonProperty("Categories")
    public void setCategories(String[] value) { this.categories = value; }

    @JsonProperty("SelectionSizeX")
    public Double getSelectionSizeX() { return selectionSizeX; }
    @JsonProperty("SelectionSizeX")
    public void setSelectionSizeX(Double value) { this.selectionSizeX = value; }

    @JsonProperty("SelectionThickness")
    public double getSelectionThickness() { return selectionThickness; }
    @JsonProperty("SelectionThickness")
    public void setSelectionThickness(double value) { this.selectionThickness = value; }

    @JsonProperty("Interface")
    public Interface getUnitInterface() { return unitInterface; }
    @JsonProperty("Interface")
    public void setUnitInterface(Interface value) { this.unitInterface = value; }

    @JsonProperty("SizeY")
    public double getSizeY() { return sizeY; }
    @JsonProperty("SizeY")
    public void setSizeY(double value) { this.sizeY = value; }

    @JsonProperty("Wreckage")
    public Wreckage getWreckage() { return wreckage; }
    @JsonProperty("Wreckage")
    public void setWreckage(Wreckage value) { this.wreckage = value; }

    @JsonProperty("Display")
    public Display getDisplay() { return display; }
    @JsonProperty("Display")
    public void setDisplay(Display value) { this.display = value; }

    @JsonProperty("General")
    public General getGeneral() { return general; }
    @JsonProperty("General")
    public void setGeneral(General value) { this.general = value; }

    @JsonProperty("Footprint")
    public UnitFootprint getFootprint() { return footprint; }
    @JsonProperty("Footprint")
    public void setFootprint(UnitFootprint value) { this.footprint = value; }

    @JsonProperty("LifeBarOffset")
    public double getLifeBarOffset() { return lifeBarOffset; }
    @JsonProperty("LifeBarOffset")
    public void setLifeBarOffset(double value) { this.lifeBarOffset = value; }

    @JsonProperty("LifeBarHeight")
    public double getLifeBarHeight() { return lifeBarHeight; }
    @JsonProperty("LifeBarHeight")
    public void setLifeBarHeight(double value) { this.lifeBarHeight = value; }

    @JsonProperty("Intel")
    public Intel getIntel() { return intel; }
    @JsonProperty("Intel")
    public void setIntel(Intel value) { this.intel = value; }

    @JsonProperty("CollisionOffsetY")
    public Double getCollisionOffsetY() { return collisionOffsetY; }
    @JsonProperty("CollisionOffsetY")
    public void setCollisionOffsetY(Double value) { this.collisionOffsetY = value; }

    @JsonProperty("Economy")
    public Economy getEconomy() { return economy; }
    @JsonProperty("Economy")
    public void setEconomy(Economy value) { this.economy = value; }

    @JsonProperty("Physics")
    public Physics getPhysics() { return physics; }
    @JsonProperty("Physics")
    public void setPhysics(Physics value) { this.physics = value; }

    @JsonProperty("Description")
    public String getDescription() { return description; }
    @JsonProperty("Description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("Air")
    public UnitAir getAir() { return air; }
    @JsonProperty("Air")
    public void setAir(UnitAir value) { this.air = value; }

    @JsonProperty("Buffs")
    public Buffs getBuffs() { return buffs; }
    @JsonProperty("Buffs")
    public void setBuffs(Buffs value) { this.buffs = value; }

    @JsonProperty("Veteran")
    public Veteran getVeteran() { return veteran; }
    @JsonProperty("Veteran")
    public void setVeteran(Veteran value) { this.veteran = value; }

    @JsonProperty("AI")
    public AI getAI() { return ai; }
    @JsonProperty("AI")
    public void setAI(AI value) { this.ai = value; }

    @JsonProperty("AverageDensity")
    public Long getAverageDensity() { return averageDensity; }
    @JsonProperty("AverageDensity")
    public void setAverageDensity(Long value) { this.averageDensity = value; }

    @JsonProperty("CollisionOffsetZ")
    public Double getCollisionOffsetZ() { return collisionOffsetZ; }
    @JsonProperty("CollisionOffsetZ")
    public void setCollisionOffsetZ(Double value) { this.collisionOffsetZ = value; }

    @JsonProperty("VeteranMassMult")
    public Double getVeteranMassMult() { return veteranMassMult; }
    @JsonProperty("VeteranMassMult")
    public void setVeteranMassMult(Double value) { this.veteranMassMult = value; }

    @JsonProperty("SelectionCenterOffsetZ")
    public Double getSelectionCenterOffsetZ() { return selectionCenterOffsetZ; }
    @JsonProperty("SelectionCenterOffsetZ")
    public void setSelectionCenterOffsetZ(Double value) { this.selectionCenterOffsetZ = value; }

    @JsonProperty("SelectionCenterOffsetX")
    public Double getSelectionCenterOffsetX() { return selectionCenterOffsetX; }
    @JsonProperty("SelectionCenterOffsetX")
    public void setSelectionCenterOffsetX(Double value) { this.selectionCenterOffsetX = value; }

    @JsonProperty("SelectionCenterOffsetY")
    public Double getSelectionCenterOffsetY() { return selectionCenterOffsetY; }
    @JsonProperty("SelectionCenterOffsetY")
    public void setSelectionCenterOffsetY(Double value) { this.selectionCenterOffsetY = value; }

    @JsonProperty("UseOOBTestZoom")
    public Long getUseOOBTestZoom() { return useOOBTestZoom; }
    @JsonProperty("UseOOBTestZoom")
    public void setUseOOBTestZoom(Long value) { this.useOOBTestZoom = value; }

    @JsonProperty("CollisionOffsetX")
    public Double getCollisionOffsetX() { return collisionOffsetX; }
    @JsonProperty("CollisionOffsetX")
    public void setCollisionOffsetX(Double value) { this.collisionOffsetX = value; }

    @JsonProperty("ContrailEffects")
    public String[] getContrailEffects() { return contrailEffects; }
    @JsonProperty("ContrailEffects")
    public void setContrailEffects(String[] value) { this.contrailEffects = value; }

    @JsonProperty("EnhancementPresets")
    public Map<String, EnhancementPreset> getEnhancementPresets() { return enhancementPresets; }
    @JsonProperty("EnhancementPresets")
    public void setEnhancementPresets(Map<String, EnhancementPreset> value) { this.enhancementPresets = value; }

    @JsonProperty("SelectionYOffset")
    public Long getSelectionYOffset() { return selectionYOffset; }
    @JsonProperty("SelectionYOffset")
    public void setSelectionYOffset(Long value) { this.selectionYOffset = value; }

    @JsonProperty("Enhancements")
    public Enhancements getEnhancements() { return enhancements; }
    @JsonProperty("Enhancements")
    public void setEnhancements(Enhancements value) { this.enhancements = value; }

    @JsonProperty("Adjacency")
    public String getAdjacency() { return adjacency; }
    @JsonProperty("Adjacency")
    public void setAdjacency(String value) { this.adjacency = value; }

    @JsonProperty("Abilities")
    public Abilities getAbilities() { return abilities; }
    @JsonProperty("Abilities")
    public void setAbilities(Abilities value) { this.abilities = value; }

    @JsonProperty("VeteranMass")
    public long[] getVeteranMass() { return veteranMass; }
    @JsonProperty("VeteranMass")
    public void setVeteranMass(long[] value) { this.veteranMass = value; }

    @JsonProperty("VeteranHealingMult")
    public double[] getVeteranHealingMult() { return veteranHealingMult; }
    @JsonProperty("VeteranHealingMult")
    public void setVeteranHealingMult(double[] value) { this.veteranHealingMult = value; }

    @JsonProperty("SelectionMeshUseTopAmount")
    public Double getSelectionMeshUseTopAmount() { return selectionMeshUseTopAmount; }
    @JsonProperty("SelectionMeshUseTopAmount")
    public void setSelectionMeshUseTopAmount(Double value) { this.selectionMeshUseTopAmount = value; }

    @JsonProperty("SelectionMeshScaleZ")
    public Double getSelectionMeshScaleZ() { return selectionMeshScaleZ; }
    @JsonProperty("SelectionMeshScaleZ")
    public void setSelectionMeshScaleZ(Double value) { this.selectionMeshScaleZ = value; }

    @JsonProperty("SelectionMeshScaleX")
    public Double getSelectionMeshScaleX() { return selectionMeshScaleX; }
    @JsonProperty("SelectionMeshScaleX")
    public void setSelectionMeshScaleX(Double value) { this.selectionMeshScaleX = value; }

    @JsonProperty("StrategicIconSize")
    public Long getStrategicIconSize() { return strategicIconSize; }
    @JsonProperty("StrategicIconSize")
    public void setStrategicIconSize(Long value) { this.strategicIconSize = value; }

    @JsonProperty("WatchBone")
    public Long getWatchBone() { return watchBone; }
    @JsonProperty("WatchBone")
    public void setWatchBone(Long value) { this.watchBone = value; }

    @JsonProperty("LifeBarRender")
    public Boolean getLifeBarRender() { return lifeBarRender; }
    @JsonProperty("LifeBarRender")
    public void setLifeBarRender(Boolean value) { this.lifeBarRender = value; }

    @JsonProperty("SplitDamage")
    public SplitDamage getSplitDamage() { return splitDamage; }
    @JsonProperty("SplitDamage")
    public void setSplitDamage(SplitDamage value) { this.splitDamage = value; }

    @JsonProperty("SecondsBeforeExplosionWhenCharging")
    public Long getSecondsBeforeExplosionWhenCharging() { return secondsBeforeExplosionWhenCharging; }
    @JsonProperty("SecondsBeforeExplosionWhenCharging")
    public void setSecondsBeforeExplosionWhenCharging(Long value) { this.secondsBeforeExplosionWhenCharging = value; }

    @JsonProperty("SecondsBeforeChargeKicksIn")
    public Long getSecondsBeforeChargeKicksIn() { return secondsBeforeChargeKicksIn; }
    @JsonProperty("SecondsBeforeChargeKicksIn")
    public void setSecondsBeforeChargeKicksIn(Long value) { this.secondsBeforeChargeKicksIn = value; }

    @JsonProperty("ResolvePath")
    public Boolean getResolvePath() { return resolvePath; }
    @JsonProperty("ResolvePath")
    public void setResolvePath(Boolean value) { this.resolvePath = value; }

    @JsonProperty("BuffFields")
    public BuffFields getBuffFields() { return buffFields; }
    @JsonProperty("BuffFields")
    public void setBuffFields(BuffFields value) { this.buffFields = value; }
}
