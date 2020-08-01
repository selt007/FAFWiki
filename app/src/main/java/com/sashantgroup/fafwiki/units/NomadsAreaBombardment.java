package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class NomadsAreaBombardment {
    private String areaOfEffect;
    private String maxRadius;
    private Boolean noAutoEnable;
    private String wantNumTargets;
    private Boolean canUseRangeExtenders;
    private Boolean isRangeExtender;

    @JsonProperty("AreaOfEffect")
    public String getAreaOfEffect() { return areaOfEffect; }
    @JsonProperty("AreaOfEffect")
    public void setAreaOfEffect(String value) { this.areaOfEffect = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

    @JsonProperty("NoAutoEnable")
    public Boolean getNoAutoEnable() { return noAutoEnable; }
    @JsonProperty("NoAutoEnable")
    public void setNoAutoEnable(Boolean value) { this.noAutoEnable = value; }

    @JsonProperty("WantNumTargets")
    public String getWantNumTargets() { return wantNumTargets; }
    @JsonProperty("WantNumTargets")
    public void setWantNumTargets(String value) { this.wantNumTargets = value; }

    @JsonProperty("CanUseRangeExtenders")
    public Boolean getCanUseRangeExtenders() { return canUseRangeExtenders; }
    @JsonProperty("CanUseRangeExtenders")
    public void setCanUseRangeExtenders(Boolean value) { this.canUseRangeExtenders = value; }

    @JsonProperty("IsRangeExtender")
    public Boolean getIsRangeExtender() { return isRangeExtender; }
    @JsonProperty("IsRangeExtender")
    public void setIsRangeExtender(Boolean value) { this.isRangeExtender = value; }
}
