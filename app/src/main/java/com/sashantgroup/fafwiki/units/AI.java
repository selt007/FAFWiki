package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class AI {
    private Long guardReturnRadius;
    private Double guardScanRadius;
    private String[] targetBones;
    private Long refuelingRepairAmount;
    private Long refuelingMultiplier;
    private Long repairConsumeEnergy;
    private Long repairConsumeMass;
    private String beaconName;
    private Long attackAngle;
    private Boolean initialAutoMode;
    private Boolean needUnpack;
    private Long stagingPlatformScanRadius;
    private Boolean showAssistRangeOnSelect;
    private String[] addTargetBones;
    private Long guardRadius;

    @JsonProperty("GuardReturnRadius")
    public Long getGuardReturnRadius() { return guardReturnRadius; }
    @JsonProperty("GuardReturnRadius")
    public void setGuardReturnRadius(Long value) { this.guardReturnRadius = value; }

    @JsonProperty("GuardScanRadius")
    public Double getGuardScanRadius() { return guardScanRadius; }
    @JsonProperty("GuardScanRadius")
    public void setGuardScanRadius(Double value) { this.guardScanRadius = value; }

    @JsonProperty("TargetBones")
    public String[] getTargetBones() { return targetBones; }
    @JsonProperty("TargetBones")
    public void setTargetBones(String[] value) { this.targetBones = value; }

    @JsonProperty("RefuelingRepairAmount")
    public Long getRefuelingRepairAmount() { return refuelingRepairAmount; }
    @JsonProperty("RefuelingRepairAmount")
    public void setRefuelingRepairAmount(Long value) { this.refuelingRepairAmount = value; }

    @JsonProperty("RefuelingMultiplier")
    public Long getRefuelingMultiplier() { return refuelingMultiplier; }
    @JsonProperty("RefuelingMultiplier")
    public void setRefuelingMultiplier(Long value) { this.refuelingMultiplier = value; }

    @JsonProperty("RepairConsumeEnergy")
    public Long getRepairConsumeEnergy() { return repairConsumeEnergy; }
    @JsonProperty("RepairConsumeEnergy")
    public void setRepairConsumeEnergy(Long value) { this.repairConsumeEnergy = value; }

    @JsonProperty("RepairConsumeMass")
    public Long getRepairConsumeMass() { return repairConsumeMass; }
    @JsonProperty("RepairConsumeMass")
    public void setRepairConsumeMass(Long value) { this.repairConsumeMass = value; }

    @JsonProperty("BeaconName")
    public String getBeaconName() { return beaconName; }
    @JsonProperty("BeaconName")
    public void setBeaconName(String value) { this.beaconName = value; }

    @JsonProperty("AttackAngle")
    public Long getAttackAngle() { return attackAngle; }
    @JsonProperty("AttackAngle")
    public void setAttackAngle(Long value) { this.attackAngle = value; }

    @JsonProperty("InitialAutoMode")
    public Boolean getInitialAutoMode() { return initialAutoMode; }
    @JsonProperty("InitialAutoMode")
    public void setInitialAutoMode(Boolean value) { this.initialAutoMode = value; }

    @JsonProperty("NeedUnpack")
    public Boolean getNeedUnpack() { return needUnpack; }
    @JsonProperty("NeedUnpack")
    public void setNeedUnpack(Boolean value) { this.needUnpack = value; }

    @JsonProperty("StagingPlatformScanRadius")
    public Long getStagingPlatformScanRadius() { return stagingPlatformScanRadius; }
    @JsonProperty("StagingPlatformScanRadius")
    public void setStagingPlatformScanRadius(Long value) { this.stagingPlatformScanRadius = value; }

    @JsonProperty("ShowAssistRangeOnSelect")
    public Boolean getShowAssistRangeOnSelect() { return showAssistRangeOnSelect; }
    @JsonProperty("ShowAssistRangeOnSelect")
    public void setShowAssistRangeOnSelect(Boolean value) { this.showAssistRangeOnSelect = value; }

    @JsonProperty("AddTargetBones")
    public String[] getAddTargetBones() { return addTargetBones; }
    @JsonProperty("AddTargetBones")
    public void setAddTargetBones(String[] value) { this.addTargetBones = value; }

    @JsonProperty("GuardRadius")
    public Long getGuardRadius() { return guardRadius; }
    @JsonProperty("GuardRadius")
    public void setGuardRadius(Long value) { this.guardRadius = value; }
}
