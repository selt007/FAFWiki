package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class DroneL {
    private String helpText;
    private String bitmapID;

    @JsonProperty("helpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("helpText")
    public void setHelpText(String value) { this.helpText = value; }

    @JsonProperty("bitmapId")
    public String getBitmapID() { return bitmapID; }
    @JsonProperty("bitmapId")
    public void setBitmapID(String value) { this.bitmapID = value; }
}
