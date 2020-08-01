package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property118Class {
    private String footBone;
    private String hipBone;
    private String kneeBone;
    private String maxFootFall;
    private Offset offset;
    private boolean straightLegs;
    private Tread tread;
    private Property118Type type;
    private String scale;

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

    @JsonProperty("MaxFootFall")
    public String getMaxFootFall() { return maxFootFall; }
    @JsonProperty("MaxFootFall")
    public void setMaxFootFall(String value) { this.maxFootFall = value; }

    @JsonProperty("Offset")
    public Offset getOffset() { return offset; }
    @JsonProperty("Offset")
    public void setOffset(Offset value) { this.offset = value; }

    @JsonProperty("StraightLegs")
    public boolean getStraightLegs() { return straightLegs; }
    @JsonProperty("StraightLegs")
    public void setStraightLegs(boolean value) { this.straightLegs = value; }

    @JsonProperty("Tread")
    public Tread getTread() { return tread; }
    @JsonProperty("Tread")
    public void setTread(Tread value) { this.tread = value; }

    @JsonProperty("Type")
    public Property118Type getType() { return type; }
    @JsonProperty("Type")
    public void setType(Property118Type value) { this.type = value; }

    @JsonProperty("Scale")
    public String getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(String value) { this.scale = value; }
}
