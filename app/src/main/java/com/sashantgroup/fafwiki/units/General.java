package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class General {
    private Category category;
    private Classification classification;
    private long unitWeight;
    private String unitName;
    private FactionName factionName;
    private TechLevel techLevel;
    private Icon icon;
    private Map<String, Boolean> commandCaps;
    private TarmacGlowDecal tarmacGlowDecal;
    private Boolean constructionBar;
    private ToggleCaps toggleCaps;
    private OrderOverrides orderOverrides;
    private String upgradesTo;
    private String upgradesFromBase;
    private String upgradesFrom;
    private Long selectionPriority;
    private BuildBones buildBones;
    private Boolean excludeFromVeterancy;
    private Long teleportDelay;
    private String tarmacDecal;
    private Double capCost;
    private Long quickSelectPriority;
    private Boolean instantDeathOnSelfDestruct;
    private Double fractionThreshold;
    private BuildBonesAlt1 buildBonesAlt1;

    @JsonProperty("Category")
    public Category getCategory() { return category; }
    @JsonProperty("Category")
    public void setCategory(Category value) { this.category = value; }

    @JsonProperty("Classification")
    public Classification getClassification() { return classification; }
    @JsonProperty("Classification")
    public void setClassification(Classification value) { this.classification = value; }

    @JsonProperty("UnitWeight")
    public long getUnitWeight() { return unitWeight; }
    @JsonProperty("UnitWeight")
    public void setUnitWeight(long value) { this.unitWeight = value; }

    @JsonProperty("UnitName")
    public String getUnitName() { return unitName; }
    @JsonProperty("UnitName")
    public void setUnitName(String value) { this.unitName = value; }

    @JsonProperty("FactionName")
    public FactionName getFactionName() { return factionName; }
    @JsonProperty("FactionName")
    public void setFactionName(FactionName value) { this.factionName = value; }

    @JsonProperty("TechLevel")
    public TechLevel getTechLevel() { return techLevel; }
    @JsonProperty("TechLevel")
    public void setTechLevel(TechLevel value) { this.techLevel = value; }

    @JsonProperty("Icon")
    public Icon getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(Icon value) { this.icon = value; }

    @JsonProperty("CommandCaps")
    public Map<String, Boolean> getCommandCaps() { return commandCaps; }
    @JsonProperty("CommandCaps")
    public void setCommandCaps(Map<String, Boolean> value) { this.commandCaps = value; }

    @JsonProperty("TarmacGlowDecal")
    public TarmacGlowDecal getTarmacGlowDecal() { return tarmacGlowDecal; }
    @JsonProperty("TarmacGlowDecal")
    public void setTarmacGlowDecal(TarmacGlowDecal value) { this.tarmacGlowDecal = value; }

    @JsonProperty("ConstructionBar")
    public Boolean getConstructionBar() { return constructionBar; }
    @JsonProperty("ConstructionBar")
    public void setConstructionBar(Boolean value) { this.constructionBar = value; }

    @JsonProperty("ToggleCaps")
    public ToggleCaps getToggleCaps() { return toggleCaps; }
    @JsonProperty("ToggleCaps")
    public void setToggleCaps(ToggleCaps value) { this.toggleCaps = value; }

    @JsonProperty("OrderOverrides")
    public OrderOverrides getOrderOverrides() { return orderOverrides; }
    @JsonProperty("OrderOverrides")
    public void setOrderOverrides(OrderOverrides value) { this.orderOverrides = value; }

    @JsonProperty("UpgradesTo")
    public String getUpgradesTo() { return upgradesTo; }
    @JsonProperty("UpgradesTo")
    public void setUpgradesTo(String value) { this.upgradesTo = value; }

    @JsonProperty("UpgradesFromBase")
    public String getUpgradesFromBase() { return upgradesFromBase; }
    @JsonProperty("UpgradesFromBase")
    public void setUpgradesFromBase(String value) { this.upgradesFromBase = value; }

    @JsonProperty("UpgradesFrom")
    public String getUpgradesFrom() { return upgradesFrom; }
    @JsonProperty("UpgradesFrom")
    public void setUpgradesFrom(String value) { this.upgradesFrom = value; }

    @JsonProperty("SelectionPriority")
    public Long getSelectionPriority() { return selectionPriority; }
    @JsonProperty("SelectionPriority")
    public void setSelectionPriority(Long value) { this.selectionPriority = value; }

    @JsonProperty("BuildBones")
    public BuildBones getBuildBones() { return buildBones; }
    @JsonProperty("BuildBones")
    public void setBuildBones(BuildBones value) { this.buildBones = value; }

    @JsonProperty("ExcludeFromVeterancy")
    public Boolean getExcludeFromVeterancy() { return excludeFromVeterancy; }
    @JsonProperty("ExcludeFromVeterancy")
    public void setExcludeFromVeterancy(Boolean value) { this.excludeFromVeterancy = value; }

    @JsonProperty("TeleportDelay")
    public Long getTeleportDelay() { return teleportDelay; }
    @JsonProperty("TeleportDelay")
    public void setTeleportDelay(Long value) { this.teleportDelay = value; }

    @JsonProperty("TarmacDecal")
    public String getTarmacDecal() { return tarmacDecal; }
    @JsonProperty("TarmacDecal")
    public void setTarmacDecal(String value) { this.tarmacDecal = value; }

    @JsonProperty("CapCost")
    public Double getCapCost() { return capCost; }
    @JsonProperty("CapCost")
    public void setCapCost(Double value) { this.capCost = value; }

    @JsonProperty("QuickSelectPriority")
    public Long getQuickSelectPriority() { return quickSelectPriority; }
    @JsonProperty("QuickSelectPriority")
    public void setQuickSelectPriority(Long value) { this.quickSelectPriority = value; }

    @JsonProperty("InstantDeathOnSelfDestruct")
    public Boolean getInstantDeathOnSelfDestruct() { return instantDeathOnSelfDestruct; }
    @JsonProperty("InstantDeathOnSelfDestruct")
    public void setInstantDeathOnSelfDestruct(Boolean value) { this.instantDeathOnSelfDestruct = value; }

    @JsonProperty("FractionThreshold")
    public Double getFractionThreshold() { return fractionThreshold; }
    @JsonProperty("FractionThreshold")
    public void setFractionThreshold(Double value) { this.fractionThreshold = value; }

    @JsonProperty("BuildBonesAlt1")
    public BuildBonesAlt1 getBuildBonesAlt1() { return buildBonesAlt1; }
    @JsonProperty("BuildBonesAlt1")
    public void setBuildBonesAlt1(BuildBonesAlt1 value) { this.buildBonesAlt1 = value; }
}
