package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ArtillerySupport {
    private String lockoutDuration;
    private String maxSimultaniousArtillerySupport;
    private String range;
    private boolean supportGroundTargetting;
    private Target targetCategory;

    @JsonProperty("LockoutDuration")
    public String getLockoutDuration() { return lockoutDuration; }
    @JsonProperty("LockoutDuration")
    public void setLockoutDuration(String value) { this.lockoutDuration = value; }

    @JsonProperty("MaxSimultaniousArtillerySupport")
    public String getMaxSimultaniousArtillerySupport() { return maxSimultaniousArtillerySupport; }
    @JsonProperty("MaxSimultaniousArtillerySupport")
    public void setMaxSimultaniousArtillerySupport(String value) { this.maxSimultaniousArtillerySupport = value; }

    @JsonProperty("Range")
    public String getRange() { return range; }
    @JsonProperty("Range")
    public void setRange(String value) { this.range = value; }

    @JsonProperty("SupportGroundTargetting")
    public boolean getSupportGroundTargetting() { return supportGroundTargetting; }
    @JsonProperty("SupportGroundTargetting")
    public void setSupportGroundTargetting(boolean value) { this.supportGroundTargetting = value; }

    @JsonProperty("TargetCategory")
    public Target getTargetCategory() { return targetCategory; }
    @JsonProperty("TargetCategory")
    public void setTargetCategory(Target value) { this.targetCategory = value; }
}
