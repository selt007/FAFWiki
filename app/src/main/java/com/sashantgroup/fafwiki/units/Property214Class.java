package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property214Class {
    private String footBone;
    private String hipBone;
    private String kneeBone;
    private Property209Type type;
    private Tread tread;

    @JsonProperty("FootBone")
    public String getFootBone() { return footBone; }
    @JsonProperty("FootBone")
    public void setFootBone(String value) { this.footBone = value; }

    @JsonProperty("HipBone")
    public String getHipBone() { return hipBone; }
    @JsonProperty("HipBone")
    public void setHipBone(String value) { this.hipBone = value; }

    @JsonProperty("KneeBone")
    public String getKneeBone() { return kneeBone; }
    @JsonProperty("KneeBone")
    public void setKneeBone(String value) { this.kneeBone = value; }

    @JsonProperty("Type")
    public Property209Type getType() { return type; }
    @JsonProperty("Type")
    public void setType(Property209Type value) { this.type = value; }

    @JsonProperty("Tread")
    public Tread getTread() { return tread; }
    @JsonProperty("Tread")
    public void setTread(Tread value) { this.tread = value; }
}
