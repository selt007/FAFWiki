package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property124Class {
    private String lodCutoff;
    private ShaderName shaderName;
    private String albedoName;
    private String specularName;
    private LookupName lookupName;
    private Boolean scrolling;
    private String meshName;
    private String normalsName;

    @JsonProperty("LODCutoff")
    public String getLodCutoff() { return lodCutoff; }
    @JsonProperty("LODCutoff")
    public void setLodCutoff(String value) { this.lodCutoff = value; }

    @JsonProperty("ShaderName")
    public ShaderName getShaderName() { return shaderName; }
    @JsonProperty("ShaderName")
    public void setShaderName(ShaderName value) { this.shaderName = value; }

    @JsonProperty("AlbedoName")
    public String getAlbedoName() { return albedoName; }
    @JsonProperty("AlbedoName")
    public void setAlbedoName(String value) { this.albedoName = value; }

    @JsonProperty("SpecularName")
    public String getSpecularName() { return specularName; }
    @JsonProperty("SpecularName")
    public void setSpecularName(String value) { this.specularName = value; }

    @JsonProperty("LookupName")
    public LookupName getLookupName() { return lookupName; }
    @JsonProperty("LookupName")
    public void setLookupName(LookupName value) { this.lookupName = value; }

    @JsonProperty("Scrolling")
    public Boolean getScrolling() { return scrolling; }
    @JsonProperty("Scrolling")
    public void setScrolling(Boolean value) { this.scrolling = value; }

    @JsonProperty("MeshName")
    public String getMeshName() { return meshName; }
    @JsonProperty("MeshName")
    public void setMeshName(String value) { this.meshName = value; }

    @JsonProperty("NormalsName")
    public String getNormalsName() { return normalsName; }
    @JsonProperty("NormalsName")
    public void setNormalsName(String value) { this.normalsName = value; }
}
