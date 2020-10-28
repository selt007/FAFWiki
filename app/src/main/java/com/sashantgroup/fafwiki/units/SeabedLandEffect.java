package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class SeabedLandEffect {
    private String[] bones;
    private String type;

    @JsonProperty("Bones")
    public String[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String[] value) { this.bones = value; }

    @JsonProperty("Type")
    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String value) { this.type = value; }
}
