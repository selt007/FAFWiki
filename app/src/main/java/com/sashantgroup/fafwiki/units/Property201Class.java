package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property201Class {
    private String footBone;
    private Tread tread;

    @JsonProperty("FootBone")
    public String getFootBone() { return footBone; }
    @JsonProperty("FootBone")
    public void setFootBone(String value) { this.footBone = value; }

    @JsonProperty("Tread")
    public Tread getTread() { return tread; }
    @JsonProperty("Tread")
    public void setTread(Tread value) { this.tread = value; }
}
