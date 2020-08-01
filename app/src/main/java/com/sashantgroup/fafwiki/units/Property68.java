package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property68 {
    private String lodCutoff;
    private Boolean scrolling;
    private ShaderName shaderName;
    private String the0;
    private String the1;
    private String albedoName;
    private String meshName;
    private Shader shader;
    private String specularName;
    private String normalsName;

    @JsonProperty("LODCutoff")
    public String getLodCutoff() { return lodCutoff; }
    @JsonProperty("LODCutoff")
    public void setLodCutoff(String value) { this.lodCutoff = value; }

    @JsonProperty("Scrolling")
    public Boolean getScrolling() { return scrolling; }
    @JsonProperty("Scrolling")
    public void setScrolling(Boolean value) { this.scrolling = value; }

    @JsonProperty("ShaderName")
    public ShaderName getShaderName() { return shaderName; }
    @JsonProperty("ShaderName")
    public void setShaderName(ShaderName value) { this.shaderName = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }

    @JsonProperty("AlbedoName")
    public String getAlbedoName() { return albedoName; }
    @JsonProperty("AlbedoName")
    public void setAlbedoName(String value) { this.albedoName = value; }

    @JsonProperty("MeshName")
    public String getMeshName() { return meshName; }
    @JsonProperty("MeshName")
    public void setMeshName(String value) { this.meshName = value; }

    @JsonProperty("Shader")
    public Shader getShader() { return shader; }
    @JsonProperty("Shader")
    public void setShader(Shader value) { this.shader = value; }

    @JsonProperty("SpecularName")
    public String getSpecularName() { return specularName; }
    @JsonProperty("SpecularName")
    public void setSpecularName(String value) { this.specularName = value; }

    @JsonProperty("NormalsName")
    public String getNormalsName() { return normalsName; }
    @JsonProperty("NormalsName")
    public void setNormalsName(String value) { this.normalsName = value; }
}
