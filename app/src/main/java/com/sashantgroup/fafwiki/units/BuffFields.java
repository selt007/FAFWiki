package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BuffFields {
    private String advancedRegenField;
    private String regenField;

    @JsonProperty("AdvancedRegenField")
    public String getAdvancedRegenField() { return advancedRegenField; }
    @JsonProperty("AdvancedRegenField")
    public void setAdvancedRegenField(String value) { this.advancedRegenField = value; }

    @JsonProperty("RegenField")
    public String getRegenField() { return regenField; }
    @JsonProperty("RegenField")
    public void setRegenField(String value) { this.regenField = value; }
}
