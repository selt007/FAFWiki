package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Physics {
    private Double bankingSlope;
    private Double turnRadius;
    private BuildOnLayerCaps buildOnLayerCaps;
    private MotionType motionType;
    private Double attackElevation;
    private Double meshExtentsZ;
    private Double minSpeedPercent;
    private Long fuelUseTime;
    private Double groundCollisionOffset;
    private Double meshExtentsX;
    private Double elevation;
    private Double maxSteerForce;
    private Double maxSpeed;
    private Double maxAcceleration;
    private Long turnRate;
    private Long fuelRechargeRate;
    private Double meshExtentsY;
    private Double skirtOffsetZ;
    private Long skirtSizeX;
    private Long skirtSizeZ;
    private Double skirtOffsetX;
    private Double dragCoefficient;
    private RollOffPoint[] rollOffPoints;
    private double[] raisedPlatforms;
    private Boolean flattenSkirt;
    private Double maxSpeedReverse;
    private Long backUpDistance;
    private Double wobbleSpeed;
    private Long turnFacingRate;
    private Boolean rotateBodyWhileMoving;
    private Double maxBrake;
    private Double wobbleFactor;
    private Boolean rotateOnSpot;
    private Double rotateOnSpotThreshold;
    private Boolean standUpright;
    private Long catchUpAcc;
    private Double waterSpeedMultiplier;
    private Double layerChangeOffsetHeight;
    private double[] occupyRects;
    private BuildRestriction buildRestriction;
    private Long maxGroundVariation;
    private Long collisionOffsetX;
    private Double meshExtentsOffsetY;
    private PhysicsFootprint footprint;
    private Double landSpeedMultiplier;
    private Long layerTransitionDuration;
    private MotionType altMotionType;
    private Double chargeSpeedMult;
    private Long chargeAccMult;
    private Long backupDistance;
    private Boolean sinkLower;
    private Double sinkSpeed;
    private Double subSpeedMultiplier;

    @JsonProperty("BankingSlope")
    public Double getBankingSlope() { return bankingSlope; }
    @JsonProperty("BankingSlope")
    public void setBankingSlope(Double value) { this.bankingSlope = value; }

    @JsonProperty("TurnRadius")
    public Double getTurnRadius() { return turnRadius; }
    @JsonProperty("TurnRadius")
    public void setTurnRadius(Double value) { this.turnRadius = value; }

    @JsonProperty("BuildOnLayerCaps")
    public BuildOnLayerCaps getBuildOnLayerCaps() { return buildOnLayerCaps; }
    @JsonProperty("BuildOnLayerCaps")
    public void setBuildOnLayerCaps(BuildOnLayerCaps value) { this.buildOnLayerCaps = value; }

    @JsonProperty("MotionType")
    public MotionType getMotionType() { return motionType; }
    @JsonProperty("MotionType")
    public void setMotionType(MotionType value) { this.motionType = value; }

    @JsonProperty("AttackElevation")
    public Double getAttackElevation() { return attackElevation; }
    @JsonProperty("AttackElevation")
    public void setAttackElevation(Double value) { this.attackElevation = value; }

    @JsonProperty("MeshExtentsZ")
    public Double getMeshExtentsZ() { return meshExtentsZ; }
    @JsonProperty("MeshExtentsZ")
    public void setMeshExtentsZ(Double value) { this.meshExtentsZ = value; }

    @JsonProperty("MinSpeedPercent")
    public Double getMinSpeedPercent() { return minSpeedPercent; }
    @JsonProperty("MinSpeedPercent")
    public void setMinSpeedPercent(Double value) { this.minSpeedPercent = value; }

    @JsonProperty("FuelUseTime")
    public Long getFuelUseTime() { return fuelUseTime; }
    @JsonProperty("FuelUseTime")
    public void setFuelUseTime(Long value) { this.fuelUseTime = value; }

    @JsonProperty("GroundCollisionOffset")
    public Double getGroundCollisionOffset() { return groundCollisionOffset; }
    @JsonProperty("GroundCollisionOffset")
    public void setGroundCollisionOffset(Double value) { this.groundCollisionOffset = value; }

    @JsonProperty("MeshExtentsX")
    public Double getMeshExtentsX() { return meshExtentsX; }
    @JsonProperty("MeshExtentsX")
    public void setMeshExtentsX(Double value) { this.meshExtentsX = value; }

    @JsonProperty("Elevation")
    public Double getElevation() { return elevation; }
    @JsonProperty("Elevation")
    public void setElevation(Double value) { this.elevation = value; }

    @JsonProperty("MaxSteerForce")
    public Double getMaxSteerForce() { return maxSteerForce; }
    @JsonProperty("MaxSteerForce")
    public void setMaxSteerForce(Double value) { this.maxSteerForce = value; }

    @JsonProperty("MaxSpeed")
    public Double getMaxSpeed() { return maxSpeed; }
    @JsonProperty("MaxSpeed")
    public void setMaxSpeed(Double value) { this.maxSpeed = value; }

    @JsonProperty("MaxAcceleration")
    public Double getMaxAcceleration() { return maxAcceleration; }
    @JsonProperty("MaxAcceleration")
    public void setMaxAcceleration(Double value) { this.maxAcceleration = value; }

    @JsonProperty("TurnRate")
    public Long getTurnRate() { return turnRate; }
    @JsonProperty("TurnRate")
    public void setTurnRate(Long value) { this.turnRate = value; }

    @JsonProperty("FuelRechargeRate")
    public Long getFuelRechargeRate() { return fuelRechargeRate; }
    @JsonProperty("FuelRechargeRate")
    public void setFuelRechargeRate(Long value) { this.fuelRechargeRate = value; }

    @JsonProperty("MeshExtentsY")
    public Double getMeshExtentsY() { return meshExtentsY; }
    @JsonProperty("MeshExtentsY")
    public void setMeshExtentsY(Double value) { this.meshExtentsY = value; }

    @JsonProperty("SkirtOffsetZ")
    public Double getSkirtOffsetZ() { return skirtOffsetZ; }
    @JsonProperty("SkirtOffsetZ")
    public void setSkirtOffsetZ(Double value) { this.skirtOffsetZ = value; }

    @JsonProperty("SkirtSizeX")
    public Long getSkirtSizeX() { return skirtSizeX; }
    @JsonProperty("SkirtSizeX")
    public void setSkirtSizeX(Long value) { this.skirtSizeX = value; }

    @JsonProperty("SkirtSizeZ")
    public Long getSkirtSizeZ() { return skirtSizeZ; }
    @JsonProperty("SkirtSizeZ")
    public void setSkirtSizeZ(Long value) { this.skirtSizeZ = value; }

    @JsonProperty("SkirtOffsetX")
    public Double getSkirtOffsetX() { return skirtOffsetX; }
    @JsonProperty("SkirtOffsetX")
    public void setSkirtOffsetX(Double value) { this.skirtOffsetX = value; }

    @JsonProperty("DragCoefficient")
    public Double getDragCoefficient() { return dragCoefficient; }
    @JsonProperty("DragCoefficient")
    public void setDragCoefficient(Double value) { this.dragCoefficient = value; }

    @JsonProperty("RollOffPoints")
    public RollOffPoint[] getRollOffPoints() { return rollOffPoints; }
    @JsonProperty("RollOffPoints")
    public void setRollOffPoints(RollOffPoint[] value) { this.rollOffPoints = value; }

    @JsonProperty("RaisedPlatforms")
    public double[] getRaisedPlatforms() { return raisedPlatforms; }
    @JsonProperty("RaisedPlatforms")
    public void setRaisedPlatforms(double[] value) { this.raisedPlatforms = value; }

    @JsonProperty("FlattenSkirt")
    public Boolean getFlattenSkirt() { return flattenSkirt; }
    @JsonProperty("FlattenSkirt")
    public void setFlattenSkirt(Boolean value) { this.flattenSkirt = value; }

    @JsonProperty("MaxSpeedReverse")
    public Double getMaxSpeedReverse() { return maxSpeedReverse; }
    @JsonProperty("MaxSpeedReverse")
    public void setMaxSpeedReverse(Double value) { this.maxSpeedReverse = value; }

    @JsonProperty("BackUpDistance")
    public Long getBackUpDistance() { return backUpDistance; }
    @JsonProperty("BackUpDistance")
    public void setBackUpDistance(Long value) { this.backUpDistance = value; }

    @JsonProperty("WobbleSpeed")
    public Double getWobbleSpeed() { return wobbleSpeed; }
    @JsonProperty("WobbleSpeed")
    public void setWobbleSpeed(Double value) { this.wobbleSpeed = value; }

    @JsonProperty("TurnFacingRate")
    public Long getTurnFacingRate() { return turnFacingRate; }
    @JsonProperty("TurnFacingRate")
    public void setTurnFacingRate(Long value) { this.turnFacingRate = value; }

    @JsonProperty("RotateBodyWhileMoving")
    public Boolean getRotateBodyWhileMoving() { return rotateBodyWhileMoving; }
    @JsonProperty("RotateBodyWhileMoving")
    public void setRotateBodyWhileMoving(Boolean value) { this.rotateBodyWhileMoving = value; }

    @JsonProperty("MaxBrake")
    public Double getMaxBrake() { return maxBrake; }
    @JsonProperty("MaxBrake")
    public void setMaxBrake(Double value) { this.maxBrake = value; }

    @JsonProperty("WobbleFactor")
    public Double getWobbleFactor() { return wobbleFactor; }
    @JsonProperty("WobbleFactor")
    public void setWobbleFactor(Double value) { this.wobbleFactor = value; }

    @JsonProperty("RotateOnSpot")
    public Boolean getRotateOnSpot() { return rotateOnSpot; }
    @JsonProperty("RotateOnSpot")
    public void setRotateOnSpot(Boolean value) { this.rotateOnSpot = value; }

    @JsonProperty("RotateOnSpotThreshold")
    public Double getRotateOnSpotThreshold() { return rotateOnSpotThreshold; }
    @JsonProperty("RotateOnSpotThreshold")
    public void setRotateOnSpotThreshold(Double value) { this.rotateOnSpotThreshold = value; }

    @JsonProperty("StandUpright")
    public Boolean getStandUpright() { return standUpright; }
    @JsonProperty("StandUpright")
    public void setStandUpright(Boolean value) { this.standUpright = value; }

    @JsonProperty("CatchUpAcc")
    public Long getCatchUpAcc() { return catchUpAcc; }
    @JsonProperty("CatchUpAcc")
    public void setCatchUpAcc(Long value) { this.catchUpAcc = value; }

    @JsonProperty("WaterSpeedMultiplier")
    public Double getWaterSpeedMultiplier() { return waterSpeedMultiplier; }
    @JsonProperty("WaterSpeedMultiplier")
    public void setWaterSpeedMultiplier(Double value) { this.waterSpeedMultiplier = value; }

    @JsonProperty("LayerChangeOffsetHeight")
    public Double getLayerChangeOffsetHeight() { return layerChangeOffsetHeight; }
    @JsonProperty("LayerChangeOffsetHeight")
    public void setLayerChangeOffsetHeight(Double value) { this.layerChangeOffsetHeight = value; }

    @JsonProperty("OccupyRects")
    public double[] getOccupyRects() { return occupyRects; }
    @JsonProperty("OccupyRects")
    public void setOccupyRects(double[] value) { this.occupyRects = value; }

    @JsonProperty("BuildRestriction")
    public BuildRestriction getBuildRestriction() { return buildRestriction; }
    @JsonProperty("BuildRestriction")
    public void setBuildRestriction(BuildRestriction value) { this.buildRestriction = value; }

    @JsonProperty("MaxGroundVariation")
    public Long getMaxGroundVariation() { return maxGroundVariation; }
    @JsonProperty("MaxGroundVariation")
    public void setMaxGroundVariation(Long value) { this.maxGroundVariation = value; }

    @JsonProperty("CollisionOffsetX")
    public Long getCollisionOffsetX() { return collisionOffsetX; }
    @JsonProperty("CollisionOffsetX")
    public void setCollisionOffsetX(Long value) { this.collisionOffsetX = value; }

    @JsonProperty("MeshExtentsOffsetY")
    public Double getMeshExtentsOffsetY() { return meshExtentsOffsetY; }
    @JsonProperty("MeshExtentsOffsetY")
    public void setMeshExtentsOffsetY(Double value) { this.meshExtentsOffsetY = value; }

    @JsonProperty("Footprint")
    public PhysicsFootprint getFootprint() { return footprint; }
    @JsonProperty("Footprint")
    public void setFootprint(PhysicsFootprint value) { this.footprint = value; }

    @JsonProperty("LandSpeedMultiplier")
    public Double getLandSpeedMultiplier() { return landSpeedMultiplier; }
    @JsonProperty("LandSpeedMultiplier")
    public void setLandSpeedMultiplier(Double value) { this.landSpeedMultiplier = value; }

    @JsonProperty("LayerTransitionDuration")
    public Long getLayerTransitionDuration() { return layerTransitionDuration; }
    @JsonProperty("LayerTransitionDuration")
    public void setLayerTransitionDuration(Long value) { this.layerTransitionDuration = value; }

    @JsonProperty("AltMotionType")
    public MotionType getAltMotionType() { return altMotionType; }
    @JsonProperty("AltMotionType")
    public void setAltMotionType(MotionType value) { this.altMotionType = value; }

    @JsonProperty("ChargeSpeedMult")
    public Double getChargeSpeedMult() { return chargeSpeedMult; }
    @JsonProperty("ChargeSpeedMult")
    public void setChargeSpeedMult(Double value) { this.chargeSpeedMult = value; }

    @JsonProperty("ChargeAccMult")
    public Long getChargeAccMult() { return chargeAccMult; }
    @JsonProperty("ChargeAccMult")
    public void setChargeAccMult(Long value) { this.chargeAccMult = value; }

    @JsonProperty("BackupDistance")
    public Long getBackupDistance() { return backupDistance; }
    @JsonProperty("BackupDistance")
    public void setBackupDistance(Long value) { this.backupDistance = value; }

    @JsonProperty("SinkLower")
    public Boolean getSinkLower() { return sinkLower; }
    @JsonProperty("SinkLower")
    public void setSinkLower(Boolean value) { this.sinkLower = value; }

    @JsonProperty("SinkSpeed")
    public Double getSinkSpeed() { return sinkSpeed; }
    @JsonProperty("SinkSpeed")
    public void setSinkSpeed(Double value) { this.sinkSpeed = value; }

    @JsonProperty("SubSpeedMultiplier")
    public Double getSubSpeedMultiplier() { return subSpeedMultiplier; }
    @JsonProperty("SubSpeedMultiplier")
    public void setSubSpeedMultiplier(Double value) { this.subSpeedMultiplier = value; }
}
