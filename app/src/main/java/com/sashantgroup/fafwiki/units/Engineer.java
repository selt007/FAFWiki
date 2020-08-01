package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Engineer {
    private String buildIconSortPriority;
    private String description;
    private String[] enhancements;
    private String helpText;
    private SortCategory sortCategory;
    private String unitName;
    private String selectionPriority;
    private UIUnitViewOverrides uiUnitViewOverrides;

    @JsonProperty("BuildIconSortPriority")
    public String getBuildIconSortPriority() { return buildIconSortPriority; }
    @JsonProperty("BuildIconSortPriority")
    public void setBuildIconSortPriority(String value) { this.buildIconSortPriority = value; }

    @JsonProperty("Description")
    public String getDescription() { return description; }
    @JsonProperty("Description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("Enhancements")
    public String[] getEnhancements() { return enhancements; }
    @JsonProperty("Enhancements")
    public void setEnhancements(String[] value) { this.enhancements = value; }

    @JsonProperty("HelpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("HelpText")
    public void setHelpText(String value) { this.helpText = value; }

    @JsonProperty("SortCategory")
    public SortCategory getSortCategory() { return sortCategory; }
    @JsonProperty("SortCategory")
    public void setSortCategory(SortCategory value) { this.sortCategory = value; }

    @JsonProperty("UnitName")
    public String getUnitName() { return unitName; }
    @JsonProperty("UnitName")
    public void setUnitName(String value) { this.unitName = value; }

    @JsonProperty("SelectionPriority")
    public String getSelectionPriority() { return selectionPriority; }
    @JsonProperty("SelectionPriority")
    public void setSelectionPriority(String value) { this.selectionPriority = value; }

    @JsonProperty("UIUnitViewOverrides")
    public UIUnitViewOverrides getUIUnitViewOverrides() { return uiUnitViewOverrides; }
    @JsonProperty("UIUnitViewOverrides")
    public void setUIUnitViewOverrides(UIUnitViewOverrides value) { this.uiUnitViewOverrides = value; }
}
