package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Physics {
    private String attackElevation;
    private BuildOnLayerCaps buildOnLayerCaps;
    private String elevation;
    private String fuelRechargeRate;
    private String fuelUseTime;
    private String groundCollisionOffset;
    private String maxSpeed;
    private String meshExtentsX;
    private String meshExtentsY;
    private String meshExtentsZ;
    private String minSpeedPercent;
    private MotionType motionType;
    private String bankingSlope;
    private String dragCoefficient;
    private String maxAcceleration;
    private String maxBrake;
    private String maxSpeedReverse;
    private String maxSteerForce;
    private Boolean rotateBodyWhileMoving;
    private Boolean rotateOnSpot;
    private String turnFacingRate;
    private String turnRadius;
    private String turnRate;
    private Boolean standUpright;
    private String backUpDistance;
    private String rotateOnSpotThreshold;
    private String skirtOffsetX;
    private String skirtOffsetZ;
    private String skirtSizeX;
    private String skirtSizeZ;
    private Boolean flattenSkirt;
    private String the0;
    private String the1;
    private String the2;
    private String[] raisedPlatforms;
    private Map<String, RollOffPoint> rollOffPoints;
    private String[] occupyRects;
    private BuildRestriction buildRestriction;
    private String maxGroundVariation;
    private String layerChangeOffsetHeight;
    private String wobbleFactor;
    private String wobbleSpeed;
    private String waterSpeedMultiplier;
    private String catchUpAcc;
    private String collisionOffsetX;
    private String meshExtentsOffsetY;
    private PhysicsFootprint footprint;
    private String backupDistance;
    private Boolean sinkLower;
    private MotionType altMotionType;
    private String landSpeedMultiplier;
    private String layerTransitionDuration;
    private String sinkSpeed;
    private Boolean stayUpright;

    @JsonProperty("AttackElevation")
    public String getAttackElevation() { return attackElevation; }
    @JsonProperty("AttackElevation")
    public void setAttackElevation(String value) { this.attackElevation = value; }

    @JsonProperty("BuildOnLayerCaps")
    public BuildOnLayerCaps getBuildOnLayerCaps() { return buildOnLayerCaps; }
    @JsonProperty("BuildOnLayerCaps")
    public void setBuildOnLayerCaps(BuildOnLayerCaps value) { this.buildOnLayerCaps = value; }

    @JsonProperty("Elevation")
    public String getElevation() { return elevation; }
    @JsonProperty("Elevation")
    public void setElevation(String value) { this.elevation = value; }

    @JsonProperty("FuelRechargeRate")
    public String getFuelRechargeRate() { return fuelRechargeRate; }
    @JsonProperty("FuelRechargeRate")
    public void setFuelRechargeRate(String value) { this.fuelRechargeRate = value; }

    @JsonProperty("FuelUseTime")
    public String getFuelUseTime() { return fuelUseTime; }
    @JsonProperty("FuelUseTime")
    public void setFuelUseTime(String value) { this.fuelUseTime = value; }

    @JsonProperty("GroundCollisionOffset")
    public String getGroundCollisionOffset() { return groundCollisionOffset; }
    @JsonProperty("GroundCollisionOffset")
    public void setGroundCollisionOffset(String value) { this.groundCollisionOffset = value; }

    @JsonProperty("MaxSpeed")
    public String getMaxSpeed() { return maxSpeed; }
    @JsonProperty("MaxSpeed")
    public void setMaxSpeed(String value) { this.maxSpeed = value; }

    @JsonProperty("MeshExtentsX")
    public String getMeshExtentsX() { return meshExtentsX; }
    @JsonProperty("MeshExtentsX")
    public void setMeshExtentsX(String value) { this.meshExtentsX = value; }

    @JsonProperty("MeshExtentsY")
    public String getMeshExtentsY() { return meshExtentsY; }
    @JsonProperty("MeshExtentsY")
    public void setMeshExtentsY(String value) { this.meshExtentsY = value; }

    @JsonProperty("MeshExtentsZ")
    public String getMeshExtentsZ() { return meshExtentsZ; }
    @JsonProperty("MeshExtentsZ")
    public void setMeshExtentsZ(String value) { this.meshExtentsZ = value; }

    @JsonProperty("MinSpeedPercent")
    public String getMinSpeedPercent() { return minSpeedPercent; }
    @JsonProperty("MinSpeedPercent")
    public void setMinSpeedPercent(String value) { this.minSpeedPercent = value; }

    @JsonProperty("MotionType")
    public MotionType getMotionType() { return motionType; }
    @JsonProperty("MotionType")
    public void setMotionType(MotionType value) { this.motionType = value; }

    @JsonProperty("BankingSlope")
    public String getBankingSlope() { return bankingSlope; }
    @JsonProperty("BankingSlope")
    public void setBankingSlope(String value) { this.bankingSlope = value; }

    @JsonProperty("DragCoefficient")
    public String getDragCoefficient() { return dragCoefficient; }
    @JsonProperty("DragCoefficient")
    public void setDragCoefficient(String value) { this.dragCoefficient = value; }

    @JsonProperty("MaxAcceleration")
    public String getMaxAcceleration() { return maxAcceleration; }
    @JsonProperty("MaxAcceleration")
    public void setMaxAcceleration(String value) { this.maxAcceleration = value; }

    @JsonProperty("MaxBrake")
    public String getMaxBrake() { return maxBrake; }
    @JsonProperty("MaxBrake")
    public void setMaxBrake(String value) { this.maxBrake = value; }

    @JsonProperty("MaxSpeedReverse")
    public String getMaxSpeedReverse() { return maxSpeedReverse; }
    @JsonProperty("MaxSpeedReverse")
    public void setMaxSpeedReverse(String value) { this.maxSpeedReverse = value; }

    @JsonProperty("MaxSteerForce")
    public String getMaxSteerForce() { return maxSteerForce; }
    @JsonProperty("MaxSteerForce")
    public void setMaxSteerForce(String value) { this.maxSteerForce = value; }

    @JsonProperty("RotateBodyWhileMoving")
    public Boolean getRotateBodyWhileMoving() { return rotateBodyWhileMoving; }
    @JsonProperty("RotateBodyWhileMoving")
    public void setRotateBodyWhileMoving(Boolean value) { this.rotateBodyWhileMoving = value; }

    @JsonProperty("RotateOnSpot")
    public Boolean getRotateOnSpot() { return rotateOnSpot; }
    @JsonProperty("RotateOnSpot")
    public void setRotateOnSpot(Boolean value) { this.rotateOnSpot = value; }

    @JsonProperty("TurnFacingRate")
    public String getTurnFacingRate() { return turnFacingRate; }
    @JsonProperty("TurnFacingRate")
    public void setTurnFacingRate(String value) { this.turnFacingRate = value; }

    @JsonProperty("TurnRadius")
    public String getTurnRadius() { return turnRadius; }
    @JsonProperty("TurnRadius")
    public void setTurnRadius(String value) { this.turnRadius = value; }

    @JsonProperty("TurnRate")
    public String getTurnRate() { return turnRate; }
    @JsonProperty("TurnRate")
    public void setTurnRate(String value) { this.turnRate = value; }

    @JsonProperty("StandUpright")
    public Boolean getStandUpright() { return standUpright; }
    @JsonProperty("StandUpright")
    public void setStandUpright(Boolean value) { this.standUpright = value; }

    @JsonProperty("BackUpDistance")
    public String getBackUpDistance() { return backUpDistance; }
    @JsonProperty("BackUpDistance")
    public void setBackUpDistance(String value) { this.backUpDistance = value; }

    @JsonProperty("RotateOnSpotThreshold")
    public String getRotateOnSpotThreshold() { return rotateOnSpotThreshold; }
    @JsonProperty("RotateOnSpotThreshold")
    public void setRotateOnSpotThreshold(String value) { this.rotateOnSpotThreshold = value; }

    @JsonProperty("SkirtOffsetX")
    public String getSkirtOffsetX() { return skirtOffsetX; }
    @JsonProperty("SkirtOffsetX")
    public void setSkirtOffsetX(String value) { this.skirtOffsetX = value; }

    @JsonProperty("SkirtOffsetZ")
    public String getSkirtOffsetZ() { return skirtOffsetZ; }
    @JsonProperty("SkirtOffsetZ")
    public void setSkirtOffsetZ(String value) { this.skirtOffsetZ = value; }

    @JsonProperty("SkirtSizeX")
    public String getSkirtSizeX() { return skirtSizeX; }
    @JsonProperty("SkirtSizeX")
    public void setSkirtSizeX(String value) { this.skirtSizeX = value; }

    @JsonProperty("SkirtSizeZ")
    public String getSkirtSizeZ() { return skirtSizeZ; }
    @JsonProperty("SkirtSizeZ")
    public void setSkirtSizeZ(String value) { this.skirtSizeZ = value; }

    @JsonProperty("FlattenSkirt")
    public Boolean getFlattenSkirt() { return flattenSkirt; }
    @JsonProperty("FlattenSkirt")
    public void setFlattenSkirt(Boolean value) { this.flattenSkirt = value; }

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

    @JsonProperty("RaisedPlatforms")
    public String[] getRaisedPlatforms() { return raisedPlatforms; }
    @JsonProperty("RaisedPlatforms")
    public void setRaisedPlatforms(String[] value) { this.raisedPlatforms = value; }

    @JsonProperty("RollOffPoints")
    public Map<String, RollOffPoint> getRollOffPoints() { return rollOffPoints; }
    @JsonProperty("RollOffPoints")
    public void setRollOffPoints(Map<String, RollOffPoint> value) { this.rollOffPoints = value; }

    @JsonProperty("OccupyRects")
    public String[] getOccupyRects() { return occupyRects; }
    @JsonProperty("OccupyRects")
    public void setOccupyRects(String[] value) { this.occupyRects = value; }

    @JsonProperty("BuildRestriction")
    public BuildRestriction getBuildRestriction() { return buildRestriction; }
    @JsonProperty("BuildRestriction")
    public void setBuildRestriction(BuildRestriction value) { this.buildRestriction = value; }

    @JsonProperty("MaxGroundVariation")
    public String getMaxGroundVariation() { return maxGroundVariation; }
    @JsonProperty("MaxGroundVariation")
    public void setMaxGroundVariation(String value) { this.maxGroundVariation = value; }

    @JsonProperty("LayerChangeOffsetHeight")
    public String getLayerChangeOffsetHeight() { return layerChangeOffsetHeight; }
    @JsonProperty("LayerChangeOffsetHeight")
    public void setLayerChangeOffsetHeight(String value) { this.layerChangeOffsetHeight = value; }

    @JsonProperty("WobbleFactor")
    public String getWobbleFactor() { return wobbleFactor; }
    @JsonProperty("WobbleFactor")
    public void setWobbleFactor(String value) { this.wobbleFactor = value; }

    @JsonProperty("WobbleSpeed")
    public String getWobbleSpeed() { return wobbleSpeed; }
    @JsonProperty("WobbleSpeed")
    public void setWobbleSpeed(String value) { this.wobbleSpeed = value; }

    @JsonProperty("WaterSpeedMultiplier")
    public String getWaterSpeedMultiplier() { return waterSpeedMultiplier; }
    @JsonProperty("WaterSpeedMultiplier")
    public void setWaterSpeedMultiplier(String value) { this.waterSpeedMultiplier = value; }

    @JsonProperty("CatchUpAcc")
    public String getCatchUpAcc() { return catchUpAcc; }
    @JsonProperty("CatchUpAcc")
    public void setCatchUpAcc(String value) { this.catchUpAcc = value; }

    @JsonProperty("CollisionOffsetX")
    public String getCollisionOffsetX() { return collisionOffsetX; }
    @JsonProperty("CollisionOffsetX")
    public void setCollisionOffsetX(String value) { this.collisionOffsetX = value; }

    @JsonProperty("MeshExtentsOffsetY")
    public String getMeshExtentsOffsetY() { return meshExtentsOffsetY; }
    @JsonProperty("MeshExtentsOffsetY")
    public void setMeshExtentsOffsetY(String value) { this.meshExtentsOffsetY = value; }

    @JsonProperty("Footprint")
    public PhysicsFootprint getFootprint() { return footprint; }
    @JsonProperty("Footprint")
    public void setFootprint(PhysicsFootprint value) { this.footprint = value; }

    @JsonProperty("BackupDistance")
    public String getBackupDistance() { return backupDistance; }
    @JsonProperty("BackupDistance")
    public void setBackupDistance(String value) { this.backupDistance = value; }

    @JsonProperty("SinkLower")
    public Boolean getSinkLower() { return sinkLower; }
    @JsonProperty("SinkLower")
    public void setSinkLower(Boolean value) { this.sinkLower = value; }

    @JsonProperty("AltMotionType")
    public MotionType getAltMotionType() { return altMotionType; }
    @JsonProperty("AltMotionType")
    public void setAltMotionType(MotionType value) { this.altMotionType = value; }

    @JsonProperty("LandSpeedMultiplier")
    public String getLandSpeedMultiplier() { return landSpeedMultiplier; }
    @JsonProperty("LandSpeedMultiplier")
    public void setLandSpeedMultiplier(String value) { this.landSpeedMultiplier = value; }

    @JsonProperty("LayerTransitionDuration")
    public String getLayerTransitionDuration() { return layerTransitionDuration; }
    @JsonProperty("LayerTransitionDuration")
    public void setLayerTransitionDuration(String value) { this.layerTransitionDuration = value; }

    @JsonProperty("SinkSpeed")
    public String getSinkSpeed() { return sinkSpeed; }
    @JsonProperty("SinkSpeed")
    public void setSinkSpeed(String value) { this.sinkSpeed = value; }

    @JsonProperty("StayUpright")
    public Boolean getStayUpright() { return stayUpright; }
    @JsonProperty("StayUpright")
    public void setStayUpright(Boolean value) { this.stayUpright = value; }
}
