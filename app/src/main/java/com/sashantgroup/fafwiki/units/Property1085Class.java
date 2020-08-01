package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property1085Class {
    private String damage;
    private boolean damageFriendly;
    private String damageRadius;
    private ArmorType damageType;
    private String displayName;
    private boolean dummyWeapon;
    private String label;
    private String maxRadius;
    private String rateOfFire;
    private WeaponCategory weaponCategory;
    private Audio audio;
    private Property1085Buffs buffs;
    private Boolean aboveWaterTargetsOnly;
    private String firingTolerance;

    @JsonProperty("Damage")
    public String getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(String value) { this.damage = value; }

    @JsonProperty("DamageFriendly")
    public boolean getDamageFriendly() { return damageFriendly; }
    @JsonProperty("DamageFriendly")
    public void setDamageFriendly(boolean value) { this.damageFriendly = value; }

    @JsonProperty("DamageRadius")
    public String getDamageRadius() { return damageRadius; }
    @JsonProperty("DamageRadius")
    public void setDamageRadius(String value) { this.damageRadius = value; }

    @JsonProperty("DamageType")
    public ArmorType getDamageType() { return damageType; }
    @JsonProperty("DamageType")
    public void setDamageType(ArmorType value) { this.damageType = value; }

    @JsonProperty("DisplayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("DisplayName")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("DummyWeapon")
    public boolean getDummyWeapon() { return dummyWeapon; }
    @JsonProperty("DummyWeapon")
    public void setDummyWeapon(boolean value) { this.dummyWeapon = value; }

    @JsonProperty("Label")
    public String getLabel() { return label; }
    @JsonProperty("Label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("MaxRadius")
    public String getMaxRadius() { return maxRadius; }
    @JsonProperty("MaxRadius")
    public void setMaxRadius(String value) { this.maxRadius = value; }

    @JsonProperty("RateOfFire")
    public String getRateOfFire() { return rateOfFire; }
    @JsonProperty("RateOfFire")
    public void setRateOfFire(String value) { this.rateOfFire = value; }

    @JsonProperty("WeaponCategory")
    public WeaponCategory getWeaponCategory() { return weaponCategory; }
    @JsonProperty("WeaponCategory")
    public void setWeaponCategory(WeaponCategory value) { this.weaponCategory = value; }

    @JsonProperty("Audio")
    public Audio getAudio() { return audio; }
    @JsonProperty("Audio")
    public void setAudio(Audio value) { this.audio = value; }

    @JsonProperty("Buffs")
    public Property1085Buffs getBuffs() { return buffs; }
    @JsonProperty("Buffs")
    public void setBuffs(Property1085Buffs value) { this.buffs = value; }

    @JsonProperty("AboveWaterTargetsOnly")
    public Boolean getAboveWaterTargetsOnly() { return aboveWaterTargetsOnly; }
    @JsonProperty("AboveWaterTargetsOnly")
    public void setAboveWaterTargetsOnly(Boolean value) { this.aboveWaterTargetsOnly = value; }

    @JsonProperty("FiringTolerance")
    public String getFiringTolerance() { return firingTolerance; }
    @JsonProperty("FiringTolerance")
    public void setFiringTolerance(String value) { this.firingTolerance = value; }
}
