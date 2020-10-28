package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class RackBone {
    private Bone rackBone;
    private Bone[] muzzleBones;
    private Boolean hideMuzzle;
    private Long telescopeRecoilDistance;
    private String telescopeBone;

    @JsonProperty("RackBone")
    public Bone getRackBone() { return rackBone; }
    @JsonProperty("RackBone")
    public void setRackBone(Bone value) { this.rackBone = value; }

    @JsonProperty("MuzzleBones")
    public Bone[] getMuzzleBones() { return muzzleBones; }
    @JsonProperty("MuzzleBones")
    public void setMuzzleBones(Bone[] value) { this.muzzleBones = value; }

    @JsonProperty("HideMuzzle")
    public Boolean getHideMuzzle() { return hideMuzzle; }
    @JsonProperty("HideMuzzle")
    public void setHideMuzzle(Boolean value) { this.hideMuzzle = value; }

    @JsonProperty("TelescopeRecoilDistance")
    public Long getTelescopeRecoilDistance() { return telescopeRecoilDistance; }
    @JsonProperty("TelescopeRecoilDistance")
    public void setTelescopeRecoilDistance(Long value) { this.telescopeRecoilDistance = value; }

    @JsonProperty("TelescopeBone")
    public String getTelescopeBone() { return telescopeBone; }
    @JsonProperty("TelescopeBone")
    public void setTelescopeBone(String value) { this.telescopeBone = value; }
}
