package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property270Class {
    private String bone;
    private String[] offset;

    @JsonProperty("Bone")
    public String getBone() { return bone; }
    @JsonProperty("Bone")
    public void setBone(String value) { this.bone = value; }

    @JsonProperty("Offset")
    public String[] getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(String[] value) { this.offset = value; }
}
