package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class AI {
    private String guardReturnRadius;
    private String guardScanRadius;
    private String[] targetBones;
    private String beaconName;
    private String refuelingMultiplier;
    private String refuelingRepairAmount;
    private String repairConsumeEnergy;
    private String repairConsumeMass;
    private Boolean initialAutoMode;
    private Boolean showAssistRangeOnSelect;
    private String stagingPlatformScanRadius;
    private String guardRadius;
    private String[] addTargetBones;
    private String attackAngle;
    private Boolean needUnpack;
    private String the0;
    private String the1;
    private String bombardModeCheckRadius;
    private String bombardModeCheckUnits;
    private String bombardModeCheckWeapon;

    @JsonProperty("GuardReturnRadius")
    public String getGuardReturnRadius() { return guardReturnRadius; }
    @JsonProperty("GuardReturnRadius")
    public void setGuardReturnRadius(String value) { this.guardReturnRadius = value; }

    @JsonProperty("GuardScanRadius")
    public String getGuardScanRadius() { return guardScanRadius; }
    @JsonProperty("GuardScanRadius")
    public void setGuardScanRadius(String value) { this.guardScanRadius = value; }

    @JsonProperty("TargetBones")
    public String[] getTargetBones() { return targetBones; }
    @JsonProperty("TargetBones")
    public void setTargetBones(String[] value) { this.targetBones = value; }

    @JsonProperty("BeaconName")
    public String getBeaconName() { return beaconName; }
    @JsonProperty("BeaconName")
    public void setBeaconName(String value) { this.beaconName = value; }

    @JsonProperty("RefuelingMultiplier")
    public String getRefuelingMultiplier() { return refuelingMultiplier; }
    @JsonProperty("RefuelingMultiplier")
    public void setRefuelingMultiplier(String value) { this.refuelingMultiplier = value; }

    @JsonProperty("RefuelingRepairAmount")
    public String getRefuelingRepairAmount() { return refuelingRepairAmount; }
    @JsonProperty("RefuelingRepairAmount")
    public void setRefuelingRepairAmount(String value) { this.refuelingRepairAmount = value; }

    @JsonProperty("RepairConsumeEnergy")
    public String getRepairConsumeEnergy() { return repairConsumeEnergy; }
    @JsonProperty("RepairConsumeEnergy")
    public void setRepairConsumeEnergy(String value) { this.repairConsumeEnergy = value; }

    @JsonProperty("RepairConsumeMass")
    public String getRepairConsumeMass() { return repairConsumeMass; }
    @JsonProperty("RepairConsumeMass")
    public void setRepairConsumeMass(String value) { this.repairConsumeMass = value; }

    @JsonProperty("InitialAutoMode")
    public Boolean getInitialAutoMode() { return initialAutoMode; }
    @JsonProperty("InitialAutoMode")
    public void setInitialAutoMode(Boolean value) { this.initialAutoMode = value; }

    @JsonProperty("ShowAssistRangeOnSelect")
    public Boolean getShowAssistRangeOnSelect() { return showAssistRangeOnSelect; }
    @JsonProperty("ShowAssistRangeOnSelect")
    public void setShowAssistRangeOnSelect(Boolean value) { this.showAssistRangeOnSelect = value; }

    @JsonProperty("StagingPlatformScanRadius")
    public String getStagingPlatformScanRadius() { return stagingPlatformScanRadius; }
    @JsonProperty("StagingPlatformScanRadius")
    public void setStagingPlatformScanRadius(String value) { this.stagingPlatformScanRadius = value; }

    @JsonProperty("GuardRadius")
    public String getGuardRadius() { return guardRadius; }
    @JsonProperty("GuardRadius")
    public void setGuardRadius(String value) { this.guardRadius = value; }

    @JsonProperty("AddTargetBones")
    public String[] getAddTargetBones() { return addTargetBones; }
    @JsonProperty("AddTargetBones")
    public void setAddTargetBones(String[] value) { this.addTargetBones = value; }

    @JsonProperty("AttackAngle")
    public String getAttackAngle() { return attackAngle; }
    @JsonProperty("AttackAngle")
    public void setAttackAngle(String value) { this.attackAngle = value; }

    @JsonProperty("NeedUnpack")
    public Boolean getNeedUnpack() { return needUnpack; }
    @JsonProperty("NeedUnpack")
    public void setNeedUnpack(Boolean value) { this.needUnpack = value; }

    @JsonProperty("0")
    public String getThe0() { return the0; }
    @JsonProperty("0")
    public void setThe0(String value) { this.the0 = value; }

    @JsonProperty("1")
    public String getThe1() { return the1; }
    @JsonProperty("1")
    public void setThe1(String value) { this.the1 = value; }

    @JsonProperty("BombardModeCheckRadius")
    public String getBombardModeCheckRadius() { return bombardModeCheckRadius; }
    @JsonProperty("BombardModeCheckRadius")
    public void setBombardModeCheckRadius(String value) { this.bombardModeCheckRadius = value; }

    @JsonProperty("BombardModeCheckUnits")
    public String getBombardModeCheckUnits() { return bombardModeCheckUnits; }
    @JsonProperty("BombardModeCheckUnits")
    public void setBombardModeCheckUnits(String value) { this.bombardModeCheckUnits = value; }

    @JsonProperty("BombardModeCheckWeapon")
    public String getBombardModeCheckWeapon() { return bombardModeCheckWeapon; }
    @JsonProperty("BombardModeCheckWeapon")
    public void setBombardModeCheckWeapon(String value) { this.bombardModeCheckWeapon = value; }
}
