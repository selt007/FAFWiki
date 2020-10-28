package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Defense {
    private long health;
    private Double regenRate;
    private Long economyThreatLevel;
    private Double surfaceThreatLevel;
    private long maxHealth;
    private Double subThreatLevel;
    private ArmorType armorType;
    private Double airThreatLevel;
    private Shield shield;
    private Long threatLevel;
    private AntiMissile antiMissile;

    @JsonProperty("Health")
    public long getHealth() { return health; }
    @JsonProperty("Health")
    public void setHealth(long value) { this.health = value; }

    @JsonProperty("RegenRate")
    public Double getRegenRate() { return regenRate; }
    @JsonProperty("RegenRate")
    public void setRegenRate(Double value) { this.regenRate = value; }

    @JsonProperty("EconomyThreatLevel")
    public Long getEconomyThreatLevel() { return economyThreatLevel; }
    @JsonProperty("EconomyThreatLevel")
    public void setEconomyThreatLevel(Long value) { this.economyThreatLevel = value; }

    @JsonProperty("SurfaceThreatLevel")
    public Double getSurfaceThreatLevel() { return surfaceThreatLevel; }
    @JsonProperty("SurfaceThreatLevel")
    public void setSurfaceThreatLevel(Double value) { this.surfaceThreatLevel = value; }

    @JsonProperty("MaxHealth")
    public long getMaxHealth() { return maxHealth; }
    @JsonProperty("MaxHealth")
    public void setMaxHealth(long value) { this.maxHealth = value; }

    @JsonProperty("SubThreatLevel")
    public Double getSubThreatLevel() { return subThreatLevel; }
    @JsonProperty("SubThreatLevel")
    public void setSubThreatLevel(Double value) { this.subThreatLevel = value; }

    @JsonProperty("ArmorType")
    public ArmorType getArmorType() { return armorType; }
    @JsonProperty("ArmorType")
    public void setArmorType(ArmorType value) { this.armorType = value; }

    @JsonProperty("AirThreatLevel")
    public Double getAirThreatLevel() { return airThreatLevel; }
    @JsonProperty("AirThreatLevel")
    public void setAirThreatLevel(Double value) { this.airThreatLevel = value; }

    @JsonProperty("Shield")
    public Shield getShield() { return shield; }
    @JsonProperty("Shield")
    public void setShield(Shield value) { this.shield = value; }

    @JsonProperty("ThreatLevel")
    public Long getThreatLevel() { return threatLevel; }
    @JsonProperty("ThreatLevel")
    public void setThreatLevel(Long value) { this.threatLevel = value; }

    @JsonProperty("AntiMissile")
    public AntiMissile getAntiMissile() { return antiMissile; }
    @JsonProperty("AntiMissile")
    public void setAntiMissile(AntiMissile value) { this.antiMissile = value; }
}
