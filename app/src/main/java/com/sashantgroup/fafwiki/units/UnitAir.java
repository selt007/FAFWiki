package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class UnitAir {
    private Long autoLandTime;
    private long liftFactor;
    private boolean canFly;
    private Long kRollDamping;
    private Long minAirspeed;
    private double bankFactor;
    private double maxAirspeed;
    private double kLiftDamping;
    private Long engageDistance;
    private double kTurn;
    private boolean bankForward;
    private Double kRoll;
    private Boolean winged;
    private Double kMoveDamping;
    private Double combatTurnSpeed;
    private long kLift;
    private Double tightTurnMultiplier;
    private Double startTurnDistance;
    private Double kMove;
    private double kTurnDamping;
    private Double turnSpeed;
    private Long breakOffDistance;
    private Long breakOffTrigger;
    private Boolean breakOffIfNearNewTarget;
    private Double randomBreakOffDistanceMult;
    private Long predictAheadForBombDrop;
    private Double circlingElevationChangeRatio;
    private Long circlingDirChangeFrequencySEC;
    private Double circlingRadiusVsAirMult;
    private Long circlingTurnMult;
    private Double circlingRadiusChangeMaxRatio;
    private Double circlingRadiusChangeMinRatio;
    private Boolean hoverOverAttack;
    private Boolean circlingDirChange;
    private Long circlingFlightChangeFrequency;
    private Long transportHoverHeight;

    @JsonProperty("AutoLandTime")
    public Long getAutoLandTime() { return autoLandTime; }
    @JsonProperty("AutoLandTime")
    public void setAutoLandTime(Long value) { this.autoLandTime = value; }

    @JsonProperty("LiftFactor")
    public long getLiftFactor() { return liftFactor; }
    @JsonProperty("LiftFactor")
    public void setLiftFactor(long value) { this.liftFactor = value; }

    @JsonProperty("CanFly")
    public boolean getCanFly() { return canFly; }
    @JsonProperty("CanFly")
    public void setCanFly(boolean value) { this.canFly = value; }

    @JsonProperty("KRollDamping")
    public Long getKRollDamping() { return kRollDamping; }
    @JsonProperty("KRollDamping")
    public void setKRollDamping(Long value) { this.kRollDamping = value; }

    @JsonProperty("MinAirspeed")
    public Long getMinAirspeed() { return minAirspeed; }
    @JsonProperty("MinAirspeed")
    public void setMinAirspeed(Long value) { this.minAirspeed = value; }

    @JsonProperty("BankFactor")
    public double getBankFactor() { return bankFactor; }
    @JsonProperty("BankFactor")
    public void setBankFactor(double value) { this.bankFactor = value; }

    @JsonProperty("MaxAirspeed")
    public double getMaxAirspeed() { return maxAirspeed; }
    @JsonProperty("MaxAirspeed")
    public void setMaxAirspeed(double value) { this.maxAirspeed = value; }

    @JsonProperty("KLiftDamping")
    public double getKLiftDamping() { return kLiftDamping; }
    @JsonProperty("KLiftDamping")
    public void setKLiftDamping(double value) { this.kLiftDamping = value; }

    @JsonProperty("EngageDistance")
    public Long getEngageDistance() { return engageDistance; }
    @JsonProperty("EngageDistance")
    public void setEngageDistance(Long value) { this.engageDistance = value; }

    @JsonProperty("KTurn")
    public double getKTurn() { return kTurn; }
    @JsonProperty("KTurn")
    public void setKTurn(double value) { this.kTurn = value; }

    @JsonProperty("BankForward")
    public boolean getBankForward() { return bankForward; }
    @JsonProperty("BankForward")
    public void setBankForward(boolean value) { this.bankForward = value; }

    @JsonProperty("KRoll")
    public Double getKRoll() { return kRoll; }
    @JsonProperty("KRoll")
    public void setKRoll(Double value) { this.kRoll = value; }

    @JsonProperty("Winged")
    public Boolean getWinged() { return winged; }
    @JsonProperty("Winged")
    public void setWinged(Boolean value) { this.winged = value; }

    @JsonProperty("KMoveDamping")
    public Double getKMoveDamping() { return kMoveDamping; }
    @JsonProperty("KMoveDamping")
    public void setKMoveDamping(Double value) { this.kMoveDamping = value; }

    @JsonProperty("CombatTurnSpeed")
    public Double getCombatTurnSpeed() { return combatTurnSpeed; }
    @JsonProperty("CombatTurnSpeed")
    public void setCombatTurnSpeed(Double value) { this.combatTurnSpeed = value; }

    @JsonProperty("KLift")
    public long getKLift() { return kLift; }
    @JsonProperty("KLift")
    public void setKLift(long value) { this.kLift = value; }

    @JsonProperty("TightTurnMultiplier")
    public Double getTightTurnMultiplier() { return tightTurnMultiplier; }
    @JsonProperty("TightTurnMultiplier")
    public void setTightTurnMultiplier(Double value) { this.tightTurnMultiplier = value; }

    @JsonProperty("StartTurnDistance")
    public Double getStartTurnDistance() { return startTurnDistance; }
    @JsonProperty("StartTurnDistance")
    public void setStartTurnDistance(Double value) { this.startTurnDistance = value; }

    @JsonProperty("KMove")
    public Double getKMove() { return kMove; }
    @JsonProperty("KMove")
    public void setKMove(Double value) { this.kMove = value; }

    @JsonProperty("KTurnDamping")
    public double getKTurnDamping() { return kTurnDamping; }
    @JsonProperty("KTurnDamping")
    public void setKTurnDamping(double value) { this.kTurnDamping = value; }

    @JsonProperty("TurnSpeed")
    public Double getTurnSpeed() { return turnSpeed; }
    @JsonProperty("TurnSpeed")
    public void setTurnSpeed(Double value) { this.turnSpeed = value; }

    @JsonProperty("BreakOffDistance")
    public Long getBreakOffDistance() { return breakOffDistance; }
    @JsonProperty("BreakOffDistance")
    public void setBreakOffDistance(Long value) { this.breakOffDistance = value; }

    @JsonProperty("BreakOffTrigger")
    public Long getBreakOffTrigger() { return breakOffTrigger; }
    @JsonProperty("BreakOffTrigger")
    public void setBreakOffTrigger(Long value) { this.breakOffTrigger = value; }

    @JsonProperty("BreakOffIfNearNewTarget")
    public Boolean getBreakOffIfNearNewTarget() { return breakOffIfNearNewTarget; }
    @JsonProperty("BreakOffIfNearNewTarget")
    public void setBreakOffIfNearNewTarget(Boolean value) { this.breakOffIfNearNewTarget = value; }

    @JsonProperty("RandomBreakOffDistanceMult")
    public Double getRandomBreakOffDistanceMult() { return randomBreakOffDistanceMult; }
    @JsonProperty("RandomBreakOffDistanceMult")
    public void setRandomBreakOffDistanceMult(Double value) { this.randomBreakOffDistanceMult = value; }

    @JsonProperty("PredictAheadForBombDrop")
    public Long getPredictAheadForBombDrop() { return predictAheadForBombDrop; }
    @JsonProperty("PredictAheadForBombDrop")
    public void setPredictAheadForBombDrop(Long value) { this.predictAheadForBombDrop = value; }

    @JsonProperty("CirclingElevationChangeRatio")
    public Double getCirclingElevationChangeRatio() { return circlingElevationChangeRatio; }
    @JsonProperty("CirclingElevationChangeRatio")
    public void setCirclingElevationChangeRatio(Double value) { this.circlingElevationChangeRatio = value; }

    @JsonProperty("CirclingDirChangeFrequencySec")
    public Long getCirclingDirChangeFrequencySEC() { return circlingDirChangeFrequencySEC; }
    @JsonProperty("CirclingDirChangeFrequencySec")
    public void setCirclingDirChangeFrequencySEC(Long value) { this.circlingDirChangeFrequencySEC = value; }

    @JsonProperty("CirclingRadiusVsAirMult")
    public Double getCirclingRadiusVsAirMult() { return circlingRadiusVsAirMult; }
    @JsonProperty("CirclingRadiusVsAirMult")
    public void setCirclingRadiusVsAirMult(Double value) { this.circlingRadiusVsAirMult = value; }

    @JsonProperty("CirclingTurnMult")
    public Long getCirclingTurnMult() { return circlingTurnMult; }
    @JsonProperty("CirclingTurnMult")
    public void setCirclingTurnMult(Long value) { this.circlingTurnMult = value; }

    @JsonProperty("CirclingRadiusChangeMaxRatio")
    public Double getCirclingRadiusChangeMaxRatio() { return circlingRadiusChangeMaxRatio; }
    @JsonProperty("CirclingRadiusChangeMaxRatio")
    public void setCirclingRadiusChangeMaxRatio(Double value) { this.circlingRadiusChangeMaxRatio = value; }

    @JsonProperty("CirclingRadiusChangeMinRatio")
    public Double getCirclingRadiusChangeMinRatio() { return circlingRadiusChangeMinRatio; }
    @JsonProperty("CirclingRadiusChangeMinRatio")
    public void setCirclingRadiusChangeMinRatio(Double value) { this.circlingRadiusChangeMinRatio = value; }

    @JsonProperty("HoverOverAttack")
    public Boolean getHoverOverAttack() { return hoverOverAttack; }
    @JsonProperty("HoverOverAttack")
    public void setHoverOverAttack(Boolean value) { this.hoverOverAttack = value; }

    @JsonProperty("CirclingDirChange")
    public Boolean getCirclingDirChange() { return circlingDirChange; }
    @JsonProperty("CirclingDirChange")
    public void setCirclingDirChange(Boolean value) { this.circlingDirChange = value; }

    @JsonProperty("CirclingFlightChangeFrequency")
    public Long getCirclingFlightChangeFrequency() { return circlingFlightChangeFrequency; }
    @JsonProperty("CirclingFlightChangeFrequency")
    public void setCirclingFlightChangeFrequency(Long value) { this.circlingFlightChangeFrequency = value; }

    @JsonProperty("TransportHoverHeight")
    public Long getTransportHoverHeight() { return transportHoverHeight; }
    @JsonProperty("TransportHoverHeight")
    public void setTransportHoverHeight(Long value) { this.transportHoverHeight = value; }
}
