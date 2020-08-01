package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Defense {
    private String airThreatLevel;
    private ArmorType armorType;
    private String economyThreatLevel;
    private String health;
    private String maxHealth;
    private String regenRate;
    private String subThreatLevel;
    private String surfaceThreatLevel;
    private Shield shield;
    private String threatLevel;
    private AntiMissile antiMissile;
    private AntiMissileFlares antiMissileFlares;
    private String the0;

    @JsonProperty("AirThreatLevel")
    public String getAirThreatLevel() { return airThreatLevel; }
    @JsonProperty("AirThreatLevel")
    public void setAirThreatLevel(String value) { this.airThreatLevel = value; }

    @JsonProperty("ArmorType")
    public ArmorType getArmorType() { return armorType; }
    @JsonProperty("ArmorType")
    public void setArmorType(ArmorType value) { this.armorType = value; }

    @JsonProperty("EconomyThreatLevel")
    public String getEconomyThreatLevel() { return economyThreatLevel; }
    @JsonProperty("EconomyThreatLevel")
    public void setEconomyThreatLevel(String value) { this.economyThreatLevel = value; }

    @JsonProperty("Health")
    public String getHealth() { return health; }
    @JsonProperty("Health")
    public void setHealth(String value) { this.health = value; }

    @JsonProperty("MaxHealth")
    public String getMaxHealth() { return maxHealth; }
    @JsonProperty("MaxHealth")
    public void setMaxHealth(String value) { this.maxHealth = value; }

    @JsonProperty("RegenRate")
    public String getRegenRate() { return regenRate; }
    @JsonProperty("RegenRate")
    public void setRegenRate(String value) { this.regenRate = value; }

    @JsonProperty("SubThreatLevel")
    public String getSubThreatLevel() { return subThreatLevel; }
    @JsonProperty("SubThreatLevel")
    public void setSubThreatLevel(String value) { this.subThreatLevel = value; }

    @JsonProperty("SurfaceThreatLevel")
    public String getSurfaceThreatLevel() { return surfaceThreatLevel; }
    @JsonProperty("SurfaceThreatLevel")
    public void setSurfaceThreatLevel(String value) { this.surfaceThreatLevel = value; }

    @JsonProperty("Shield")
    public Shield getShield() { return shield; }
    @JsonProperty("Shield")
    public void setShield(Shield value) { this.shield = value; }

    @JsonProperty("ThreatLevel")
    public String getThreatLevel() { return threatLevel; }
    @JsonProperty("ThreatLevel")
    public void setThreatLevel(String value) { this.threatLevel = value; }

    @JsonProperty("AntiMissile")
    public AntiMissile getAntiMissile() { return antiMissile; }
    @JsonProperty("AntiMissile")
    public void setAntiMissile(AntiMissile value) { this.antiMissile = value; }

    @JsonProperty("AntiMissileFlares")
    public AntiMissileFlares getAntiMissileFlares() { return antiMissileFlares; }
    @JsonProperty("AntiMissileFlares")
    public void setAntiMissileFlares(AntiMissileFlares value) { this.antiMissileFlares = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }
}
