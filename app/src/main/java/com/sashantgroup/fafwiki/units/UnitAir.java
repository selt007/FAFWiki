package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class UnitAir {
    private String autoLandTime;
    private String bankFactor;
    private boolean bankForward;
    private String breakOffDistance;
    private String breakOffTrigger;
    private boolean canFly;
    private String kLift;
    private String kLiftDamping;
    private String kMove;
    private String kMoveDamping;
    private String kRoll;
    private String kRollDamping;
    private String kTurn;
    private String kTurnDamping;
    private String liftFactor;
    private String maxAirspeed;
    private String minAirspeed;
    private String turnSpeed;
    private Boolean winged;
    private Boolean breakOffIfNearNewTarget;
    private String combatTurnSpeed;
    private String engageDistance;
    private String predictAheadForBombDrop;
    private String startTurnDistance;
    private String tightTurnMultiplier;
    private String randomBreakOffDistanceMult;
    private Boolean circlingDirChange;
    private String circlingElevationChangeRatio;
    private String circlingFlightChangeFrequency;
    private String circlingRadiusChangeMaxRatio;
    private String circlingRadiusChangeMinRatio;
    private String circlingTurnMult;
    private String transportHoverHeight;
    private String circlingDirChangeFrequencySEC;
    private String circlingRadiusVsAirMult;
    private Boolean hoverOverAttack;

    @JsonProperty("AutoLandTime")
    public String getAutoLandTime() { return autoLandTime; }
    @JsonProperty("AutoLandTime")
    public void setAutoLandTime(String value) { this.autoLandTime = value; }

    @JsonProperty("BankFactor")
    public String getBankFactor() { return bankFactor; }
    @JsonProperty("BankFactor")
    public void setBankFactor(String value) { this.bankFactor = value; }

    @JsonProperty("BankForward")
    public boolean getBankForward() { return bankForward; }
    @JsonProperty("BankForward")
    public void setBankForward(boolean value) { this.bankForward = value; }

    @JsonProperty("BreakOffDistance")
    public String getBreakOffDistance() { return breakOffDistance; }
    @JsonProperty("BreakOffDistance")
    public void setBreakOffDistance(String value) { this.breakOffDistance = value; }

    @JsonProperty("BreakOffTrigger")
    public String getBreakOffTrigger() { return breakOffTrigger; }
    @JsonProperty("BreakOffTrigger")
    public void setBreakOffTrigger(String value) { this.breakOffTrigger = value; }

    @JsonProperty("CanFly")
    public boolean getCanFly() { return canFly; }
    @JsonProperty("CanFly")
    public void setCanFly(boolean value) { this.canFly = value; }

    @JsonProperty("KLift")
    public String getKLift() { return kLift; }
    @JsonProperty("KLift")
    public void setKLift(String value) { this.kLift = value; }

    @JsonProperty("KLiftDamping")
    public String getKLiftDamping() { return kLiftDamping; }
    @JsonProperty("KLiftDamping")
    public void setKLiftDamping(String value) { this.kLiftDamping = value; }

    @JsonProperty("KMove")
    public String getKMove() { return kMove; }
    @JsonProperty("KMove")
    public void setKMove(String value) { this.kMove = value; }

    @JsonProperty("KMoveDamping")
    public String getKMoveDamping() { return kMoveDamping; }
    @JsonProperty("KMoveDamping")
    public void setKMoveDamping(String value) { this.kMoveDamping = value; }

    @JsonProperty("KRoll")
    public String getKRoll() { return kRoll; }
    @JsonProperty("KRoll")
    public void setKRoll(String value) { this.kRoll = value; }

    @JsonProperty("KRollDamping")
    public String getKRollDamping() { return kRollDamping; }
    @JsonProperty("KRollDamping")
    public void setKRollDamping(String value) { this.kRollDamping = value; }

    @JsonProperty("KTurn")
    public String getKTurn() { return kTurn; }
    @JsonProperty("KTurn")
    public void setKTurn(String value) { this.kTurn = value; }

    @JsonProperty("KTurnDamping")
    public String getKTurnDamping() { return kTurnDamping; }
    @JsonProperty("KTurnDamping")
    public void setKTurnDamping(String value) { this.kTurnDamping = value; }

    @JsonProperty("LiftFactor")
    public String getLiftFactor() { return liftFactor; }
    @JsonProperty("LiftFactor")
    public void setLiftFactor(String value) { this.liftFactor = value; }

    @JsonProperty("MaxAirspeed")
    public String getMaxAirspeed() { return maxAirspeed; }
    @JsonProperty("MaxAirspeed")
    public void setMaxAirspeed(String value) { this.maxAirspeed = value; }

    @JsonProperty("MinAirspeed")
    public String getMinAirspeed() { return minAirspeed; }
    @JsonProperty("MinAirspeed")
    public void setMinAirspeed(String value) { this.minAirspeed = value; }

    @JsonProperty("TurnSpeed")
    public String getTurnSpeed() { return turnSpeed; }
    @JsonProperty("TurnSpeed")
    public void setTurnSpeed(String value) { this.turnSpeed = value; }

    @JsonProperty("Winged")
    public Boolean getWinged() { return winged; }
    @JsonProperty("Winged")
    public void setWinged(Boolean value) { this.winged = value; }

    @JsonProperty("BreakOffIfNearNewTarget")
    public Boolean getBreakOffIfNearNewTarget() { return breakOffIfNearNewTarget; }
    @JsonProperty("BreakOffIfNearNewTarget")
    public void setBreakOffIfNearNewTarget(Boolean value) { this.breakOffIfNearNewTarget = value; }

    @JsonProperty("CombatTurnSpeed")
    public String getCombatTurnSpeed() { return combatTurnSpeed; }
    @JsonProperty("CombatTurnSpeed")
    public void setCombatTurnSpeed(String value) { this.combatTurnSpeed = value; }

    @JsonProperty("EngageDistance")
    public String getEngageDistance() { return engageDistance; }
    @JsonProperty("EngageDistance")
    public void setEngageDistance(String value) { this.engageDistance = value; }

    @JsonProperty("PredictAheadForBombDrop")
    public String getPredictAheadForBombDrop() { return predictAheadForBombDrop; }
    @JsonProperty("PredictAheadForBombDrop")
    public void setPredictAheadForBombDrop(String value) { this.predictAheadForBombDrop = value; }

    @JsonProperty("StartTurnDistance")
    public String getStartTurnDistance() { return startTurnDistance; }
    @JsonProperty("StartTurnDistance")
    public void setStartTurnDistance(String value) { this.startTurnDistance = value; }

    @JsonProperty("TightTurnMultiplier")
    public String getTightTurnMultiplier() { return tightTurnMultiplier; }
    @JsonProperty("TightTurnMultiplier")
    public void setTightTurnMultiplier(String value) { this.tightTurnMultiplier = value; }

    @JsonProperty("RandomBreakOffDistanceMult")
    public String getRandomBreakOffDistanceMult() { return randomBreakOffDistanceMult; }
    @JsonProperty("RandomBreakOffDistanceMult")
    public void setRandomBreakOffDistanceMult(String value) { this.randomBreakOffDistanceMult = value; }

    @JsonProperty("CirclingDirChange")
    public Boolean getCirclingDirChange() { return circlingDirChange; }
    @JsonProperty("CirclingDirChange")
    public void setCirclingDirChange(Boolean value) { this.circlingDirChange = value; }

    @JsonProperty("CirclingElevationChangeRatio")
    public String getCirclingElevationChangeRatio() { return circlingElevationChangeRatio; }
    @JsonProperty("CirclingElevationChangeRatio")
    public void setCirclingElevationChangeRatio(String value) { this.circlingElevationChangeRatio = value; }

    @JsonProperty("CirclingFlightChangeFrequency")
    public String getCirclingFlightChangeFrequency() { return circlingFlightChangeFrequency; }
    @JsonProperty("CirclingFlightChangeFrequency")
    public void setCirclingFlightChangeFrequency(String value) { this.circlingFlightChangeFrequency = value; }

    @JsonProperty("CirclingRadiusChangeMaxRatio")
    public String getCirclingRadiusChangeMaxRatio() { return circlingRadiusChangeMaxRatio; }
    @JsonProperty("CirclingRadiusChangeMaxRatio")
    public void setCirclingRadiusChangeMaxRatio(String value) { this.circlingRadiusChangeMaxRatio = value; }

    @JsonProperty("CirclingRadiusChangeMinRatio")
    public String getCirclingRadiusChangeMinRatio() { return circlingRadiusChangeMinRatio; }
    @JsonProperty("CirclingRadiusChangeMinRatio")
    public void setCirclingRadiusChangeMinRatio(String value) { this.circlingRadiusChangeMinRatio = value; }

    @JsonProperty("CirclingTurnMult")
    public String getCirclingTurnMult() { return circlingTurnMult; }
    @JsonProperty("CirclingTurnMult")
    public void setCirclingTurnMult(String value) { this.circlingTurnMult = value; }

    @JsonProperty("TransportHoverHeight")
    public String getTransportHoverHeight() { return transportHoverHeight; }
    @JsonProperty("TransportHoverHeight")
    public void setTransportHoverHeight(String value) { this.transportHoverHeight = value; }

    @JsonProperty("CirclingDirChangeFrequencySec")
    public String getCirclingDirChangeFrequencySEC() { return circlingDirChangeFrequencySEC; }
    @JsonProperty("CirclingDirChangeFrequencySec")
    public void setCirclingDirChangeFrequencySEC(String value) { this.circlingDirChangeFrequencySEC = value; }

    @JsonProperty("CirclingRadiusVsAirMult")
    public String getCirclingRadiusVsAirMult() { return circlingRadiusVsAirMult; }
    @JsonProperty("CirclingRadiusVsAirMult")
    public void setCirclingRadiusVsAirMult(String value) { this.circlingRadiusVsAirMult = value; }

    @JsonProperty("HoverOverAttack")
    public Boolean getHoverOverAttack() { return hoverOverAttack; }
    @JsonProperty("HoverOverAttack")
    public void setHoverOverAttack(Boolean value) { this.hoverOverAttack = value; }
}
