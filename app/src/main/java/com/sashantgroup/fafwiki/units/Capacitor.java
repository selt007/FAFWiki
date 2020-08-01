package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Capacitor {
    private boolean active;
    private String[] buffs;
    private String duration;
    private String chargeEnergyCost;
    private String chargeTime;
    private String bitmapID;
    private String helpText;

    @JsonProperty("Active")
    public boolean getActive() { return active; }
    @JsonProperty("Active")
    public void setActive(boolean value) { this.active = value; }

    @JsonProperty("Buffs")
    public String[] getBuffs() { return buffs; }
    @JsonProperty("Buffs")
    public void setBuffs(String[] value) { this.buffs = value; }

    @JsonProperty("Duration")
    public String getDuration() { return duration; }
    @JsonProperty("Duration")
    public void setDuration(String value) { this.duration = value; }

    @JsonProperty("ChargeEnergyCost")
    public String getChargeEnergyCost() { return chargeEnergyCost; }
    @JsonProperty("ChargeEnergyCost")
    public void setChargeEnergyCost(String value) { this.chargeEnergyCost = value; }

    @JsonProperty("ChargeTime")
    public String getChargeTime() { return chargeTime; }
    @JsonProperty("ChargeTime")
    public void setChargeTime(String value) { this.chargeTime = value; }

    @JsonProperty("bitmapId")
    public String getBitmapID() { return bitmapID; }
    @JsonProperty("bitmapId")
    public void setBitmapID(String value) { this.bitmapID = value; }

    @JsonProperty("helpText")
    public String getHelpText() { return helpText; }
    @JsonProperty("helpText")
    public void setHelpText(String value) { this.helpText = value; }
}
