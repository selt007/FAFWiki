package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class General {
    private Category category;
    private Classification classification;
    private Map<String, Boolean> commandCaps;
    private FactionName factionName;
    private GeneralIcon icon;
    private TechLevel techLevel;
    private String unitName;
    private String unitWeight;
    private ToggleCaps toggleCaps;
    private String tarmacGlowDecal;
    private String selectionPriority;
    private Boolean constructionBar;
    private OrderOverrides orderOverrides;
    private BuildBones buildBones;
    private String upgradesFromBase;
    private String upgradesTo;
    private String upgradesFrom;
    private String tarmacDecal;
    private String capCost;
    private String quickSelectPriority;
    private String the0;
    private String the1;
    private String the2;
    private Boolean instantDeathOnSelfDestruct;
    private BuildBonesAlt1 buildBonesAlt1;
    private String buildEffectScaleX;
    private String buildEffectScaleY;
    private String buildEffectScaleZ;

    @JsonProperty("Category")
    public Category getCategory() { return category; }
    @JsonProperty("Category")
    public void setCategory(Category value) { this.category = value; }

    @JsonProperty("Classification")
    public Classification getClassification() { return classification; }
    @JsonProperty("Classification")
    public void setClassification(Classification value) { this.classification = value; }

    @JsonProperty("CommandCaps")
    public Map<String, Boolean> getCommandCaps() { return commandCaps; }
    @JsonProperty("CommandCaps")
    public void setCommandCaps(Map<String, Boolean> value) { this.commandCaps = value; }

    @JsonProperty("FactionName")
    public FactionName getFactionName() { return factionName; }
    @JsonProperty("FactionName")
    public void setFactionName(FactionName value) { this.factionName = value; }

    @JsonProperty("Icon")
    public GeneralIcon getIcon() { return icon; }
    @JsonProperty("Icon")
    public void setIcon(GeneralIcon value) { this.icon = value; }

    @JsonProperty("TechLevel")
    public TechLevel getTechLevel() { return techLevel; }
    @JsonProperty("TechLevel")
    public void setTechLevel(TechLevel value) { this.techLevel = value; }

    @JsonProperty("UnitName")
    public String getUnitName() { return unitName; }
    @JsonProperty("UnitName")
    public void setUnitName(String value) { this.unitName = value; }

    @JsonProperty("UnitWeight")
    public String getUnitWeight() { return unitWeight; }
    @JsonProperty("UnitWeight")
    public void setUnitWeight(String value) { this.unitWeight = value; }

    @JsonProperty("ToggleCaps")
    public ToggleCaps getToggleCaps() { return toggleCaps; }
    @JsonProperty("ToggleCaps")
    public void setToggleCaps(ToggleCaps value) { this.toggleCaps = value; }

    @JsonProperty("TarmacGlowDecal")
    public String getTarmacGlowDecal() { return tarmacGlowDecal; }
    @JsonProperty("TarmacGlowDecal")
    public void setTarmacGlowDecal(String value) { this.tarmacGlowDecal = value; }

    @JsonProperty("SelectionPriority")
    public String getSelectionPriority() { return selectionPriority; }
    @JsonProperty("SelectionPriority")
    public void setSelectionPriority(String value) { this.selectionPriority = value; }

    @JsonProperty("ConstructionBar")
    public Boolean getConstructionBar() { return constructionBar; }
    @JsonProperty("ConstructionBar")
    public void setConstructionBar(Boolean value) { this.constructionBar = value; }

    @JsonProperty("OrderOverrides")
    public OrderOverrides getOrderOverrides() { return orderOverrides; }
    @JsonProperty("OrderOverrides")
    public void setOrderOverrides(OrderOverrides value) { this.orderOverrides = value; }

    @JsonProperty("BuildBones")
    public BuildBones getBuildBones() { return buildBones; }
    @JsonProperty("BuildBones")
    public void setBuildBones(BuildBones value) { this.buildBones = value; }

    @JsonProperty("UpgradesFromBase")
    public String getUpgradesFromBase() { return upgradesFromBase; }
    @JsonProperty("UpgradesFromBase")
    public void setUpgradesFromBase(String value) { this.upgradesFromBase = value; }

    @JsonProperty("UpgradesTo")
    public String getUpgradesTo() { return upgradesTo; }
    @JsonProperty("UpgradesTo")
    public void setUpgradesTo(String value) { this.upgradesTo = value; }

    @JsonProperty("UpgradesFrom")
    public String getUpgradesFrom() { return upgradesFrom; }
    @JsonProperty("UpgradesFrom")
    public void setUpgradesFrom(String value) { this.upgradesFrom = value; }

    @JsonProperty("TarmacDecal")
    public String getTarmacDecal() { return tarmacDecal; }
    @JsonProperty("TarmacDecal")
    public void setTarmacDecal(String value) { this.tarmacDecal = value; }

    @JsonProperty("CapCost")
    public String getCapCost() { return capCost; }
    @JsonProperty("CapCost")
    public void setCapCost(String value) { this.capCost = value; }

    @JsonProperty("QuickSelectPriority")
    public String getQuickSelectPriority() { return quickSelectPriority; }
    @JsonProperty("QuickSelectPriority")
    public void setQuickSelectPriority(String value) { this.quickSelectPriority = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }

    @JsonProperty("2")
    public String getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(String value) { this.the2 = value; }

    @JsonProperty("InstantDeathOnSelfDestruct")
    public Boolean getInstantDeathOnSelfDestruct() { return instantDeathOnSelfDestruct; }
    @JsonProperty("InstantDeathOnSelfDestruct")
    public void setInstantDeathOnSelfDestruct(Boolean value) { this.instantDeathOnSelfDestruct = value; }

    @JsonProperty("BuildBonesAlt1")
    public BuildBonesAlt1 getBuildBonesAlt1() { return buildBonesAlt1; }
    @JsonProperty("BuildBonesAlt1")
    public void setBuildBonesAlt1(BuildBonesAlt1 value) { this.buildBonesAlt1 = value; }

    @JsonProperty("BuildEffectScaleX")
    public String getBuildEffectScaleX() { return buildEffectScaleX; }
    @JsonProperty("BuildEffectScaleX")
    public void setBuildEffectScaleX(String value) { this.buildEffectScaleX = value; }

    @JsonProperty("BuildEffectScaleY")
    public String getBuildEffectScaleY() { return buildEffectScaleY; }
    @JsonProperty("BuildEffectScaleY")
    public void setBuildEffectScaleY(String value) { this.buildEffectScaleY = value; }

    @JsonProperty("BuildEffectScaleZ")
    public String getBuildEffectScaleZ() { return buildEffectScaleZ; }
    @JsonProperty("BuildEffectScaleZ")
    public void setBuildEffectScaleZ(String value) { this.buildEffectScaleZ = value; }
}
