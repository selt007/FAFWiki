package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class EffectsProperty55 {
    private String[] bones;
    private String scale;
    private Property55Type type;
    private String[] offset;

    @JsonProperty("Bones")
    public String[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String[] value) { this.bones = value; }

    @JsonProperty("Scale")
    public String getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(String value) { this.scale = value; }

    @JsonProperty("Type")
    public Property55Type getType() { return type; }
    @JsonProperty("Type")
    public void setType(Property55Type value) { this.type = value; }

    @JsonProperty("Offset")
    public String[] getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(String[] value) { this.offset = value; }
}
