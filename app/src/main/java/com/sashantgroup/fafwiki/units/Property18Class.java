package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property18Class {
    private String albedoName;
    private String lodCutoff;
    private String meshName;
    private Shader shader;

    @JsonProperty("AlbedoName")
    public String getAlbedoName() { return albedoName; }
    @JsonProperty("AlbedoName")
    public void setAlbedoName(String value) { this.albedoName = value; }

    @JsonProperty("LODCutoff")
    public String getLodCutoff() { return lodCutoff; }
    @JsonProperty("LODCutoff")
    public void setLodCutoff(String value) { this.lodCutoff = value; }

    @JsonProperty("MeshName")
    public String getMeshName() { return meshName; }
    @JsonProperty("MeshName")
    public void setMeshName(String value) { this.meshName = value; }

    @JsonProperty("Shader")
    public Shader getShader() { return shader; }
    @JsonProperty("Shader")
    public void setShader(Shader value) { this.shader = value; }
}
