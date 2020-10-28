package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class EnhancementPreset {
    private String description;
    private long buildIconSortPriority;
    private String unitName;
    private SortCategory sortCategory;
    private String helpText;
    private String[] enhancements;

    @JsonProperty("Description")
    public String getDescription() { return description; }
    @JsonProperty("Description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("BuildIconSortPriority")
    public long getBuildIconSortPriority() { return buildIconSortPriority; }
    @JsonProperty("BuildIconSortPriority")
    public void setBuildIconSortPriority(long value) { this.buildIconSortPriority = value; }

    @JsonProperty("UnitName")
    public String getUnitName() { return unitName; }
    @JsonProperty("UnitName")
    public void setUnitName(String value) { this.unitName = value; }

    @JsonProperty("SortCategory")
    public SortCategory getSortCategory() { return sortCategory; }
    @JsonProperty("SortCategory")
    public void setSortCategory(SortCategory value) { this.sortCategory = value; }

    @JsonProperty("HelpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("HelpText")
    public void setHelpText(String value) { this.helpText = value; }

    @JsonProperty("Enhancements")
    public String[] getEnhancements() { return enhancements; }
    @JsonProperty("Enhancements")
    public void setEnhancements(String[] value) { this.enhancements = value; }
}
