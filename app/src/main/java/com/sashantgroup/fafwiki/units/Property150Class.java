package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property150Class {
    private String albedoName;
    private String lodCutoff;
    private ShaderName shaderName;
    private String specularName;
    private LookupName lookupName;
    private Boolean scrolling;
    private String meshName;
    private String secondaryName;
    private String normalsName;
    private String the0;
    private String textureName;
    private Boolean silhouette;

    @JsonProperty("AlbedoName")
    public String getAlbedoName() { return albedoName; }
    @JsonProperty("AlbedoName")
    public void setAlbedoName(String value) { this.albedoName = value; }

    @JsonProperty("LODCutoff")
    public String getLodCutoff() { return lodCutoff; }
    @JsonProperty("LODCutoff")
    public void setLodCutoff(String value) { this.lodCutoff = value; }

    @JsonProperty("ShaderName")
    public ShaderName getShaderName() { return shaderName; }
    @JsonProperty("ShaderName")
    public void setShaderName(ShaderName value) { this.shaderName = value; }

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

    @JsonProperty("SecondaryName")
    public String getSecondaryName() { return secondaryName; }
    @JsonProperty("SecondaryName")
    public void setSecondaryName(String value) { this.secondaryName = value; }

    @JsonProperty("NormalsName")
    public String getNormalsName() { return normalsName; }
    @JsonProperty("NormalsName")
    public void setNormalsName(String value) { this.normalsName = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("TextureName")
    public String getTextureName() { return textureName; }
    @JsonProperty("TextureName")
    public void setTextureName(String value) { this.textureName = value; }

    @JsonProperty("Silhouette")
    public Boolean getSilhouette() { return silhouette; }
    @JsonProperty("Silhouette")
    public void setSilhouette(Boolean value) { this.silhouette = value; }
}
