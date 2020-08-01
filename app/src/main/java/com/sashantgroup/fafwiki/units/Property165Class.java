package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property165Class {
    private String lodCutoff;
    private ShaderName shaderName;
    private LookupName lookupName;
    private Boolean scrolling;
    private String secondaryName;
    private String albedoName;
    private String specularName;

    @JsonProperty("LODCutoff")
    public String getLodCutoff() { return lodCutoff; }
    @JsonProperty("LODCutoff")
    public void setLodCutoff(String value) { this.lodCutoff = value; }

    @JsonProperty("ShaderName")
    public ShaderName getShaderName() { return shaderName; }
    @JsonProperty("ShaderName")
    public void setShaderName(ShaderName value) { this.shaderName = value; }

    @JsonProperty("LookupName")
    public LookupName getLookupName() { return lookupName; }
    @JsonProperty("LookupName")
    public void setLookupName(LookupName value) { this.lookupName = value; }

    @JsonProperty("Scrolling")
    public Boolean getScrolling() { return scrolling; }
    @JsonProperty("Scrolling")
    public void setScrolling(Boolean value) { this.scrolling = value; }

    @JsonProperty("SecondaryName")
    public String getSecondaryName() { return secondaryName; }
    @JsonProperty("SecondaryName")
    public void setSecondaryName(String value) { this.secondaryName = value; }

    @JsonProperty("AlbedoName")
    public String getAlbedoName() { return albedoName; }
    @JsonProperty("AlbedoName")
    public void setAlbedoName(String value) { this.albedoName = value; }

    @JsonProperty("SpecularName")
    public String getSpecularName() { return specularName; }
    @JsonProperty("SpecularName")
    public void setSpecularName(String value) { this.specularName = value; }
}
