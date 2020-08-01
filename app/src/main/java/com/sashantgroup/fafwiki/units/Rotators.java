package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Rotators {
    private String the0;
    private String the1;
    private String the2;
    private String the3;
    private boolean stationary;
    private String primaryAccel;
    private String primarySpeed;
    private String secondaryAccel;
    private String secondarySpeed;

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }

    @JsonProperty("2")
    public String getThe2() { return the2; }
    @JsonProperty("2")
    public void setThe2(String value) { this.the2 = value; }

    @JsonProperty("3")
    public String getThe3() { return the3; }
    @JsonProperty("3")
    public void setThe3(String value) { this.the3 = value; }

    @JsonProperty("Stationary")
    public boolean getStationary() { return stationary; }
    @JsonProperty("Stationary")
    public void setStationary(boolean value) { this.stationary = value; }

    @JsonProperty("PrimaryAccel")
    public String getPrimaryAccel() { return primaryAccel; }
    @JsonProperty("PrimaryAccel")
    public void setPrimaryAccel(String value) { this.primaryAccel = value; }

    @JsonProperty("PrimarySpeed")
    public String getPrimarySpeed() { return primarySpeed; }
    @JsonProperty("PrimarySpeed")
    public void setPrimarySpeed(String value) { this.primarySpeed = value; }

    @JsonProperty("SecondaryAccel")
    public String getSecondaryAccel() { return secondaryAccel; }
    @JsonProperty("SecondaryAccel")
    public void setSecondaryAccel(String value) { this.secondaryAccel = value; }

    @JsonProperty("SecondarySpeed")
    public String getSecondarySpeed() { return secondarySpeed; }
    @JsonProperty("SecondarySpeed")
    public void setSecondarySpeed(String value) { this.secondarySpeed = value; }
}
