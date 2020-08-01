package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AntiMissile {
    private String attachBone;
    private String radius;
    private String redirectRateOfFire;

    @JsonProperty("AttachBone")
    public String getAttachBone() { return attachBone; }
    @JsonProperty("AttachBone")
    public void setAttachBone(String value) { this.attachBone = value; }

    @JsonProperty("Radius")
    public String getRadius() { return radius; }
    @JsonProperty("Radius")
    public void setRadius(String value) { this.radius = value; }

    @JsonProperty("RedirectRateOfFire")
    public String getRedirectRateOfFire() { return redirectRateOfFire; }
    @JsonProperty("RedirectRateOfFire")
    public void setRedirectRateOfFire(String value) { this.redirectRateOfFire = value; }
}
