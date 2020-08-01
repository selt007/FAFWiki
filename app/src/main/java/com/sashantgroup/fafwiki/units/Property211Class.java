package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property211Class {
    private String boneName;
    private String[] offset;

    @JsonProperty("BoneName")
    public String getBoneName() { return boneName; }
    @JsonProperty("BoneName")
    public void setBoneName(String value) { this.boneName = value; }

    @JsonProperty("Offset")
    public String[] getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(String[] value) { this.offset = value; }
}
