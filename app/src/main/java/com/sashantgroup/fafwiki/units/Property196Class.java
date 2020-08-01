package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property196Class {
    private String[] bones;
    private String[] offset;
    private String type;
    private String scale;
    private Boolean recolour;

    @JsonProperty("Bones")
    public String[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String[] value) { this.bones = value; }

    @JsonProperty("Offset")
    public String[] getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(String[] value) { this.offset = value; }

    @JsonProperty("Type")
    public String getType() { return type; }
    @JsonProperty("Type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("Scale")
    public String getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(String value) { this.scale = value; }

    @JsonProperty("Recolour")
    public Boolean getRecolour() { return recolour; }
    @JsonProperty("Recolour")
    public void setRecolour(Boolean value) { this.recolour = value; }
}
