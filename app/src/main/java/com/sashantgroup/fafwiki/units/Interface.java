package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Interface {
    private String helpText;

    @JsonProperty("HelpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("HelpText")
    public void setHelpText(String value) { this.helpText = value; }
}
