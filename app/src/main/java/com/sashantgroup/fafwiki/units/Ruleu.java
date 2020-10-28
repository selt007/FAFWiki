package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Ruleu {
    private String helpText;

    @JsonProperty("helpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("helpText")
    public void setHelpText(String value) { this.helpText = value; }
}
