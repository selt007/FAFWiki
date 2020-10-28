package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Lod {
    private ShaderName shaderName;
    private long lodCutoff;
    private String specularName;
    private String albedoName;
    private Boolean scrolling;
    private String secondaryName;
    private String normalsName;
    private String meshName;
    private Boolean silhouette;
    private LookupName lookupName;

    @JsonProperty("ShaderName")
    public ShaderName getShaderName() { return shaderName; }
    @JsonProperty("ShaderName")
    public void setShaderName(ShaderName value) { this.shaderName = value; }

    @JsonProperty("LODCutoff")
    public long getLodCutoff() { return lodCutoff; }
    @JsonProperty("LODCutoff")
    public void setLodCutoff(long value) { this.lodCutoff = value; }

    @JsonProperty("SpecularName")
    public String getSpecularName() { return specularName; }
    @JsonProperty("SpecularName")
    public void setSpecularName(String value) { this.specularName = value; }

    @JsonProperty("AlbedoName")
    public String getAlbedoName() { return albedoName; }
    @JsonProperty("AlbedoName")
    public void setAlbedoName(String value) { this.albedoName = value; }

    @JsonProperty("Scrolling")
    public Boolean getScrolling() { return scrolling; }
    @JsonProperty("Scrolling")
    public void setScrolling(Boolean value) { this.scrolling = value; }

    @JsonProperty("SecondaryName")
    public String getSecondaryName() { return secondaryName; }
    @JsonProperty("SecondaryName")
    public void setSecondaryName(String value) { this.secondaryName = value; }

    @JsonProperty("NormalsName")
    public String getNormalsName() { return normalsName; }
    @JsonProperty("NormalsName")
    public void setNormalsName(String value) { this.normalsName = value; }

    @JsonProperty("MeshName")
    public String getMeshName() { return meshName; }
    @JsonProperty("MeshName")
    public void setMeshName(String value) { this.meshName = value; }

    @JsonProperty("Silhouette")
    public Boolean getSilhouette() { return silhouette; }
    @JsonProperty("Silhouette")
    public void setSilhouette(Boolean value) { this.silhouette = value; }

    @JsonProperty("LookupName")
    public LookupName getLookupName() { return lookupName; }
    @JsonProperty("LookupName")
    public void setLookupName(LookupName value) { this.lookupName = value; }
}
