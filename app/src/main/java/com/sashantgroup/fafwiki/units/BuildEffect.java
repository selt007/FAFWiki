package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class BuildEffect {
    private String extendsFront;
    private String extendsRear;
    private String extendsTop;
    private FactoryUnion factory;
    private String emitter;
    private String offsetZ;
    private String scale;
    private String heightScale;
    private String partArrivesByDropshipBone;
    private String partArrivesByDropshipMesh;
    private String extendsBottom;
    private String extendstop;

    @JsonProperty("ExtendsFront")
    public String getExtendsFront() { return extendsFront; }
    @JsonProperty("ExtendsFront")
    public void setExtendsFront(String value) { this.extendsFront = value; }

    @JsonProperty("ExtendsRear")
    public String getExtendsRear() { return extendsRear; }
    @JsonProperty("ExtendsRear")
    public void setExtendsRear(String value) { this.extendsRear = value; }

    @JsonProperty("ExtendsTop")
    public String getExtendsTop() { return extendsTop; }
    @JsonProperty("ExtendsTop")
    public void setExtendsTop(String value) { this.extendsTop = value; }

    @JsonProperty("Factory")
    public FactoryUnion getFactory() { return factory; }
    @JsonProperty("Factory")
    public void setFactory(FactoryUnion value) { this.factory = value; }

    @JsonProperty("Emitter")
    public String getEmitter() { return emitter; }
    @JsonProperty("Emitter")
    public void setEmitter(String value) { this.emitter = value; }

    @JsonProperty("OffsetZ")
    public String getOffsetZ() { return offsetZ; }
    @JsonProperty("OffsetZ")
    public void setOffsetZ(String value) { this.offsetZ = value; }

    @JsonProperty("Scale")
    public String getScale() { return scale; }
    @JsonProperty("Scale")
    public void setScale(String value) { this.scale = value; }

    @JsonProperty("HeightScale")
    public String getHeightScale() { return heightScale; }
    @JsonProperty("HeightScale")
    public void setHeightScale(String value) { this.heightScale = value; }

    @JsonProperty("PartArrivesByDropshipBone")
    public String getPartArrivesByDropshipBone() { return partArrivesByDropshipBone; }
    @JsonProperty("PartArrivesByDropshipBone")
    public void setPartArrivesByDropshipBone(String value) { this.partArrivesByDropshipBone = value; }

    @JsonProperty("PartArrivesByDropshipMesh")
    public String getPartArrivesByDropshipMesh() { return partArrivesByDropshipMesh; }
    @JsonProperty("PartArrivesByDropshipMesh")
    public void setPartArrivesByDropshipMesh(String value) { this.partArrivesByDropshipMesh = value; }

    @JsonProperty("ExtendsBottom")
    public String getExtendsBottom() { return extendsBottom; }
    @JsonProperty("ExtendsBottom")
    public void setExtendsBottom(String value) { this.extendsBottom = value; }

    @JsonProperty("Extendstop")
    public String getExtendstop() { return extendstop; }
    @JsonProperty("Extendstop")
    public void setExtendstop(String value) { this.extendstop = value; }
}
