package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Intel {
    private String visionRadius;
    private String radarRadius;
    private String sonarRadius;
    private String omniRadius;
    private String waterVisionRadius;
    private Boolean radarStealth;
    private Boolean sonarStealth;
    private String reactivateTime;
    private Boolean showIntelOnSelect;
    private String radarStealthFieldRadius;
    private String sonarStealthFieldRadius;
    private Boolean freeIntel;
    private JamRadius jamRadius;
    private String jammerBlips;
    private ActiveIntel activeIntel;
    private Boolean cloak;
    private Boolean radarStealthField;
    private String remoteViewingRadius;
    private String maxVisionRadius;
    private String minVisionRadius;
    private String intelDurationOnDeath;
    private String visionRadiusOnDeath;
    private String stealthWaitTime;
    private String waterVisionradius;
    private String overchargeDamageMulti;
    private String overchargeEnergyCost;
    private String overchargeEnergyDrainPerSecond;
    private String overchargeTime;
    private String overchargeType;

    @JsonProperty("VisionRadius")
    public String getVisionRadius() { return visionRadius; }
    @JsonProperty("VisionRadius")
    public void setVisionRadius(String value) { this.visionRadius = value; }

    @JsonProperty("RadarRadius")
    public String getRadarRadius() { return radarRadius; }
    @JsonProperty("RadarRadius")
    public void setRadarRadius(String value) { this.radarRadius = value; }

    @JsonProperty("SonarRadius")
    public String getSonarRadius() { return sonarRadius; }
    @JsonProperty("SonarRadius")
    public void setSonarRadius(String value) { this.sonarRadius = value; }

    @JsonProperty("OmniRadius")
    public String getOmniRadius() { return omniRadius; }
    @JsonProperty("OmniRadius")
    public void setOmniRadius(String value) { this.omniRadius = value; }

    @JsonProperty("WaterVisionRadius")
    public String getWaterVisionRadius() { return waterVisionRadius; }
    @JsonProperty("WaterVisionRadius")
    public void setWaterVisionRadius(String value) { this.waterVisionRadius = value; }

    @JsonProperty("RadarStealth")
    public Boolean getRadarStealth() { return radarStealth; }
    @JsonProperty("RadarStealth")
    public void setRadarStealth(Boolean value) { this.radarStealth = value; }

    @JsonProperty("SonarStealth")
    public Boolean getSonarStealth() { return sonarStealth; }
    @JsonProperty("SonarStealth")
    public void setSonarStealth(Boolean value) { this.sonarStealth = value; }

    @JsonProperty("ReactivateTime")
    public String getReactivateTime() { return reactivateTime; }
    @JsonProperty("ReactivateTime")
    public void setReactivateTime(String value) { this.reactivateTime = value; }

    @JsonProperty("ShowIntelOnSelect")
    public Boolean getShowIntelOnSelect() { return showIntelOnSelect; }
    @JsonProperty("ShowIntelOnSelect")
    public void setShowIntelOnSelect(Boolean value) { this.showIntelOnSelect = value; }

    @JsonProperty("RadarStealthFieldRadius")
    public String getRadarStealthFieldRadius() { return radarStealthFieldRadius; }
    @JsonProperty("RadarStealthFieldRadius")
    public void setRadarStealthFieldRadius(String value) { this.radarStealthFieldRadius = value; }

    @JsonProperty("SonarStealthFieldRadius")
    public String getSonarStealthFieldRadius() { return sonarStealthFieldRadius; }
    @JsonProperty("SonarStealthFieldRadius")
    public void setSonarStealthFieldRadius(String value) { this.sonarStealthFieldRadius = value; }

    @JsonProperty("FreeIntel")
    public Boolean getFreeIntel() { return freeIntel; }
    @JsonProperty("FreeIntel")
    public void setFreeIntel(Boolean value) { this.freeIntel = value; }

    @JsonProperty("JamRadius")
    public JamRadius getJamRadius() { return jamRadius; }
    @JsonProperty("JamRadius")
    public void setJamRadius(JamRadius value) { this.jamRadius = value; }

    @JsonProperty("JammerBlips")
    public String getJammerBlips() { return jammerBlips; }
    @JsonProperty("JammerBlips")
    public void setJammerBlips(String value) { this.jammerBlips = value; }

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

    @JsonProperty("RemoteViewingRadius")
    public String getRemoteViewingRadius() { return remoteViewingRadius; }
    @JsonProperty("RemoteViewingRadius")
    public void setRemoteViewingRadius(String value) { this.remoteViewingRadius = value; }

    @JsonProperty("MaxVisionRadius")
    public String getMaxVisionRadius() { return maxVisionRadius; }
    @JsonProperty("MaxVisionRadius")
    public void setMaxVisionRadius(String value) { this.maxVisionRadius = value; }

    @JsonProperty("MinVisionRadius")
    public String getMinVisionRadius() { return minVisionRadius; }
    @JsonProperty("MinVisionRadius")
    public void setMinVisionRadius(String value) { this.minVisionRadius = value; }

    @JsonProperty("IntelDurationOnDeath")
    public String getIntelDurationOnDeath() { return intelDurationOnDeath; }
    @JsonProperty("IntelDurationOnDeath")
    public void setIntelDurationOnDeath(String value) { this.intelDurationOnDeath = value; }

    @JsonProperty("VisionRadiusOnDeath")
    public String getVisionRadiusOnDeath() { return visionRadiusOnDeath; }
    @JsonProperty("VisionRadiusOnDeath")
    public void setVisionRadiusOnDeath(String value) { this.visionRadiusOnDeath = value; }

    @JsonProperty("StealthWaitTime")
    public String getStealthWaitTime() { return stealthWaitTime; }
    @JsonProperty("StealthWaitTime")
    public void setStealthWaitTime(String value) { this.stealthWaitTime = value; }

    @JsonProperty("WaterVisionradius")
    public String getWaterVisionradius() { return waterVisionradius; }
    @JsonProperty("WaterVisionradius")
    public void setWaterVisionradius(String value) { this.waterVisionradius = value; }

    @JsonProperty("OverchargeDamageMulti")
    public String getOverchargeDamageMulti() { return overchargeDamageMulti; }
    @JsonProperty("OverchargeDamageMulti")
    public void setOverchargeDamageMulti(String value) { this.overchargeDamageMulti = value; }

    @JsonProperty("OverchargeEnergyCost")
    public String getOverchargeEnergyCost() { return overchargeEnergyCost; }
    @JsonProperty("OverchargeEnergyCost")
    public void setOverchargeEnergyCost(String value) { this.overchargeEnergyCost = value; }

    @JsonProperty("OverchargeEnergyDrainPerSecond")
    public String getOverchargeEnergyDrainPerSecond() { return overchargeEnergyDrainPerSecond; }
    @JsonProperty("OverchargeEnergyDrainPerSecond")
    public void setOverchargeEnergyDrainPerSecond(String value) { this.overchargeEnergyDrainPerSecond = value; }

    @JsonProperty("OverchargeTime")
    public String getOverchargeTime() { return overchargeTime; }
    @JsonProperty("OverchargeTime")
    public void setOverchargeTime(String value) { this.overchargeTime = value; }

    @JsonProperty("OverchargeType")
    public String getOverchargeType() { return overchargeType; }
    @JsonProperty("OverchargeType")
    public void setOverchargeType(String value) { this.overchargeType = value; }
}
