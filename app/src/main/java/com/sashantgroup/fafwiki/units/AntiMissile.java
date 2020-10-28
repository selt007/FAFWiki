package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class AntiMissile {
    private long radius;
    private long redirectRateOfFire;
    private String attachBone;

    @JsonProperty("Radius")
    public long getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(long value) { this.radius = value; }

    @JsonProperty("RedirectRateOfFire")
    public long getRedirectRateOfFire() { return redirectRateOfFire; }
    @JsonProperty("RedirectRateOfFire")
    public void setRedirectRateOfFire(long value) { this.redirectRateOfFire = value; }

    @JsonProperty("AttachBone")
    public String getAttachBone() { return attachBone; }
    @JsonProperty("AttachBone")
    public void setAttachBone(String value) { this.attachBone = value; }
}
