package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Intel {
    private Long visionRadius;
    private Long radarRadius;
    private Long sonarRadius;
    private Long omniRadius;
    private Long waterVisionRadius;
    private Boolean freeIntel;
    private Boolean showIntelOnSelect;
    private Long reactivateTime;
    private Boolean radarStealth;
    private Boolean sonarStealth;
    private Long sonarStealthFieldRadius;
    private Long radarStealthFieldRadius;
    private Long remoteViewingRadius;
    private Long jammerBlips;
    private JamRadius jamRadius;
    private ActiveIntel activeIntel;
    private Boolean cloak;
    private Boolean radarStealthField;
    private Long minVisionRadius;
    private Long maxVisionRadius;
    private Long stealthWaitTime;
    private Long visionRadiusOnDeath;
    private Long intelDurationOnDeath;
    private Long waterVisionradius;

    @JsonProperty("VisionRadius")
    public Long getVisionRadius() { return visionRadius; }
    @JsonProperty("VisionRadius")
    public void setVisionRadius(Long value) { this.visionRadius = value; }

    @JsonProperty("RadarRadius")
    public Long getRadarRadius() { return radarRadius; }
    @JsonProperty("RadarRadius")
    public void setRadarRadius(Long value) { this.radarRadius = value; }

    @JsonProperty("SonarRadius")
    public Long getSonarRadius() { return sonarRadius; }
    @JsonProperty("SonarRadius")
    public void setSonarRadius(Long value) { this.sonarRadius = value; }

    @JsonProperty("OmniRadius")
    public Long getOmniRadius() { return omniRadius; }
    @JsonProperty("OmniRadius")
    public void setOmniRadius(Long value) { this.omniRadius = value; }

    @JsonProperty("WaterVisionRadius")
    public Long getWaterVisionRadius() { return waterVisionRadius; }
    @JsonProperty("WaterVisionRadius")
    public void setWaterVisionRadius(Long value) { this.waterVisionRadius = value; }

    @JsonProperty("FreeIntel")
    public Boolean getFreeIntel() { return freeIntel; }
    @JsonProperty("FreeIntel")
    public void setFreeIntel(Boolean value) { this.freeIntel = value; }

    @JsonProperty("ShowIntelOnSelect")
    public Boolean getShowIntelOnSelect() { return showIntelOnSelect; }
    @JsonProperty("ShowIntelOnSelect")
    public void setShowIntelOnSelect(Boolean value) { this.showIntelOnSelect = value; }

    @JsonProperty("ReactivateTime")
    public Long getReactivateTime() { return reactivateTime; }
    @JsonProperty("ReactivateTime")
    public void setReactivateTime(Long value) { this.reactivateTime = value; }

    @JsonProperty("RadarStealth")
    public Boolean getRadarStealth() { return radarStealth; }
    @JsonProperty("RadarStealth")
    public void setRadarStealth(Boolean value) { this.radarStealth = value; }

    @JsonProperty("SonarStealth")
    public Boolean getSonarStealth() { return sonarStealth; }
    @JsonProperty("SonarStealth")
    public void setSonarStealth(Boolean value) { this.sonarStealth = value; }

    @JsonProperty("SonarStealthFieldRadius")
    public Long getSonarStealthFieldRadius() { return sonarStealthFieldRadius; }
    @JsonProperty("SonarStealthFieldRadius")
    public void setSonarStealthFieldRadius(Long value) { this.sonarStealthFieldRadius = value; }

    @JsonProperty("RadarStealthFieldRadius")
    public Long getRadarStealthFieldRadius() { return radarStealthFieldRadius; }
    @JsonProperty("RadarStealthFieldRadius")
    public void setRadarStealthFieldRadius(Long value) { this.radarStealthFieldRadius = value; }

    @JsonProperty("RemoteViewingRadius")
    public Long getRemoteViewingRadius() { return remoteViewingRadius; }
    @JsonProperty("RemoteViewingRadius")
    public void setRemoteViewingRadius(Long value) { this.remoteViewingRadius = value; }

    @JsonProperty("JammerBlips")
    public Long getJammerBlips() { return jammerBlips; }
    @JsonProperty("JammerBlips")
    public void setJammerBlips(Long value) { this.jammerBlips = value; }

    @JsonProperty("JamRadius")
    public JamRadius getJamRadius() { return jamRadius; }
    @JsonProperty("JamRadius")
    public void setJamRadius(JamRadius value) { this.jamRadius = value; }

    @JsonProperty("ActiveIntel")
    public ActiveIntel getActiveIntel() { return activeIntel; }
    @JsonProperty("ActiveIntel")
    public void setActiveIntel(ActiveIntel value) { this.activeIntel = value; }

    @JsonProperty("Cloak")
    public Boolean getCloak() { return cloak; }
    @JsonProperty("Cloak")
    public void setCloak(Boolean value) { this.cloak = value; }

    @JsonProperty("RadarStealthField")
    public Boolean getRadarStealthField() { return radarStealthField; }
    @JsonProperty("RadarStealthField")
    public void setRadarStealthField(Boolean value) { this.radarStealthField = value; }

    @JsonProperty("MinVisionRadius")
    public Long getMinVisionRadius() { return minVisionRadius; }
    @JsonProperty("MinVisionRadius")
    public void setMinVisionRadius(Long value) { this.minVisionRadius = value; }

    @JsonProperty("MaxVisionRadius")
    public Long getMaxVisionRadius() { return maxVisionRadius; }
    @JsonProperty("MaxVisionRadius")
    public void setMaxVisionRadius(Long value) { this.maxVisionRadius = value; }

    @JsonProperty("StealthWaitTime")
    public Long getStealthWaitTime() { return stealthWaitTime; }
    @JsonProperty("StealthWaitTime")
    public void setStealthWaitTime(Long value) { this.stealthWaitTime = value; }

    @JsonProperty("VisionRadiusOnDeath")
    public Long getVisionRadiusOnDeath() { return visionRadiusOnDeath; }
    @JsonProperty("VisionRadiusOnDeath")
    public void setVisionRadiusOnDeath(Long value) { this.visionRadiusOnDeath = value; }

    @JsonProperty("IntelDurationOnDeath")
    public Long getIntelDurationOnDeath() { return intelDurationOnDeath; }
    @JsonProperty("IntelDurationOnDeath")
    public void setIntelDurationOnDeath(Long value) { this.intelDurationOnDeath = value; }

    @JsonProperty("WaterVisionradius")
    public Long getWaterVisionradius() { return waterVisionradius; }
    @JsonProperty("WaterVisionradius")
    public void setWaterVisionradius(Long value) { this.waterVisionradius = value; }
}
