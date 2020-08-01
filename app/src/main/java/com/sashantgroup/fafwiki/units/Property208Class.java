package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property208Class {
    private String footBone;
    private String scale;
    private Property118Type type;
    private Tread tread;

    @JsonProperty("FootBone")
    public String getFootBone() { return footBone; }
    @JsonProperty("FootBone")
    public void setFootBone(String value) { this.footBone = value; }

    @JsonProperty("Scale")
    public String getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(String value) { this.scale = value; }

    @JsonProperty("Type")
    public Property118Type getType() { return type; }
    @JsonProperty("Type")
    public void setType(Property118Type value) { this.type = value; }

    @JsonProperty("Tread")
    public Tread getTread() { return tread; }
    @JsonProperty("Tread")
    public void setTread(Tread value) { this.tread = value; }
}
