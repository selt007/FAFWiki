package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class UnitAudio {
    private Activate airUnitWaterImpact;
    private Activate ambientMove;
    private Activate destroyed;
    private Activate killed;
    private Activate landing;
    private Activate startMove;
    private Activate stopMove;
    private Activate thruster;
    private Activate uiSelection;
    private Activate refueling;
    private Activate deathExplosion;
    private Activate load;
    private Activate unload;
    private Activate construct;
    private Activate constructLoop;
    private Activate doneBeingBuilt;
    private Activate activeLoop;
    private Activate close;
    private Activate open;
    private Activate activate;
    private NuclearLaunchDetected nuclearLaunchDetected;
    private Activate shieldOff;
    private Activate shieldOn;
    private Activate captureLoop;
    private Activate commanderArrival;
    private Activate enhanceEnd;
    private Activate enhanceFail;
    private Activate enhanceLoop;
    private Activate enhanceStart;
    private Activate footFallGeneric;
    private Activate footFallGenericSeabed;
    private Activate reclaimLoop;
    private Activate startCapture;
    private Activate startReclaim;
    private Activate teleportChargingAtDestination;
    private Activate teleportChargingAtUnit;
    private Activate teleportIn;
    private Activate hoverKilledOnWater;
    private Activate pack;
    private Activate unpack;
    private Activate ambientMoveSub;
    private Activate startMoveSub;
    private Activate stopMoveSub;
    private Activate submergeStart;
    private Activate surfaceStart;
    private Activate ambientMoveLand;
    private Activate ambientMoveWater;
    private Activate enterWater;
    private Activate transitionWater;
    private Activate constructStop;
    private Activate transitionLand;
    private Activate amphibiousFloatingKilledOnLand;
    private Activate startMoveLand;
    private Activate startMoveWater;
    private Activate stopMoveLand;
    private Activate stopMoveWater;
    private Activate takeOff;
    private Activate launchSat;
    private Activate moveArms;
    private Activate deploy;
    private Activate eggOpen;
    private Activate eggSink;
    private Activate nukeCharge;
    private Activate teleportOut;
    private Activate spawn;
    private Activate coverLaunch;
    private Activate supportingArtilleryPing;
    private Activate flaresFired;
    private String the0;
    private String the1;
    private String the2;
    private String the3;
    private Activate intelOverchargeActivated;
    private Activate intelOverchargeActiveLoop;
    private Activate intelOverchargeChargingLoop;
    private String the4;
    private String the5;
    private String the6;
    private String the7;
    private String the8;
    private String the9;
    private String the10;
    private String the11;
    private String the12;
    private String the13;
    private String the14;
    private Activate capacitorInUseLoop;
    private Activate capacitorStopBeingUsed;
    private Activate constructSparkle;
    private Activate reclaimSparkle;
    private UISelectionMultiple uiSelectionMultiple;
    private UICommandAcknowledgeMultiple uiCommandAcknowledgeMultiple;
    private Activate ambientIdle;

    @JsonProperty("AirUnitWaterImpact")
    public Activate getAirUnitWaterImpact() { return airUnitWaterImpact; }
    @JsonProperty("AirUnitWaterImpact")
    public void setAirUnitWaterImpact(Activate value) { this.airUnitWaterImpact = value; }

    @JsonProperty("AmbientMove")
    public Activate getAmbientMove() { return ambientMove; }
    @JsonProperty("AmbientMove")
    public void setAmbientMove(Activate value) { this.ambientMove = value; }

    @JsonProperty("Destroyed")
    public Activate getDestroyed() { return destroyed; }
    @JsonProperty("Destroyed")
    public void setDestroyed(Activate value) { this.destroyed = value; }

    @JsonProperty("Killed")
    public Activate getKilled() { return killed; }
    @JsonProperty("Killed")
    public void setKilled(Activate value) { this.killed = value; }

    @JsonProperty("Landing")
    public Activate getLanding() { return landing; }
    @JsonProperty("Landing")
    public void setLanding(Activate value) { this.landing = value; }

    @JsonProperty("StartMove")
    public Activate getStartMove() { return startMove; }
    @JsonProperty("StartMove")
    public void setStartMove(Activate value) { this.startMove = value; }

    @JsonProperty("StopMove")
    public Activate getStopMove() { return stopMove; }
    @JsonProperty("StopMove")
    public void setStopMove(Activate value) { this.stopMove = value; }

    @JsonProperty("Thruster")
    public Activate getThruster() { return thruster; }
    @JsonProperty("Thruster")
    public void setThruster(Activate value) { this.thruster = value; }

    @JsonProperty("UISelection")
    public Activate getUISelection() { return uiSelection; }
    @JsonProperty("UISelection")
    public void setUISelection(Activate value) { this.uiSelection = value; }

    @JsonProperty("Refueling")
    public Activate getRefueling() { return refueling; }
    @JsonProperty("Refueling")
    public void setRefueling(Activate value) { this.refueling = value; }

    @JsonProperty("DeathExplosion")
    public Activate getDeathExplosion() { return deathExplosion; }
    @JsonProperty("DeathExplosion")
    public void setDeathExplosion(Activate value) { this.deathExplosion = value; }

    @JsonProperty("Load")
    public Activate getLoad() { return load; }
    @JsonProperty("Load")
    public void setLoad(Activate value) { this.load = value; }

    @JsonProperty("Unload")
    public Activate getUnload() { return unload; }
    @JsonProperty("Unload")
    public void setUnload(Activate value) { this.unload = value; }

    @JsonProperty("Construct")
    public Activate getConstruct() { return construct; }
    @JsonProperty("Construct")
    public void setConstruct(Activate value) { this.construct = value; }

    @JsonProperty("ConstructLoop")
    public Activate getConstructLoop() { return constructLoop; }
    @JsonProperty("ConstructLoop")
    public void setConstructLoop(Activate value) { this.constructLoop = value; }

    @JsonProperty("DoneBeingBuilt")
    public Activate getDoneBeingBuilt() { return doneBeingBuilt; }
    @JsonProperty("DoneBeingBuilt")
    public void setDoneBeingBuilt(Activate value) { this.doneBeingBuilt = value; }

    @JsonProperty("ActiveLoop")
    public Activate getActiveLoop() { return activeLoop; }
    @JsonProperty("ActiveLoop")
    public void setActiveLoop(Activate value) { this.activeLoop = value; }

    @JsonProperty("Close")
    public Activate getClose() { return close; }
    @JsonProperty("Close")
    public void setClose(Activate value) { this.close = value; }

    @JsonProperty("Open")
    public Activate getOpen() { return open; }
    @JsonProperty("Open")
    public void setOpen(Activate value) { this.open = value; }

    @JsonProperty("Activate")
    public Activate getActivate() { return activate; }
    @JsonProperty("Activate")
    public void setActivate(Activate value) { this.activate = value; }

    @JsonProperty("NuclearLaunchDetected")
    public NuclearLaunchDetected getNuclearLaunchDetected() { return nuclearLaunchDetected; }
    @JsonProperty("NuclearLaunchDetected")
    public void setNuclearLaunchDetected(NuclearLaunchDetected value) { this.nuclearLaunchDetected = value; }

    @JsonProperty("ShieldOff")
    public Activate getShieldOff() { return shieldOff; }
    @JsonProperty("ShieldOff")
    public void setShieldOff(Activate value) { this.shieldOff = value; }

    @JsonProperty("ShieldOn")
    public Activate getShieldOn() { return shieldOn; }
    @JsonProperty("ShieldOn")
    public void setShieldOn(Activate value) { this.shieldOn = value; }

    @JsonProperty("CaptureLoop")
    public Activate getCaptureLoop() { return captureLoop; }
    @JsonProperty("CaptureLoop")
    public void setCaptureLoop(Activate value) { this.captureLoop = value; }

    @JsonProperty("CommanderArrival")
    public Activate getCommanderArrival() { return commanderArrival; }
    @JsonProperty("CommanderArrival")
    public void setCommanderArrival(Activate value) { this.commanderArrival = value; }

    @JsonProperty("EnhanceEnd")
    public Activate getEnhanceEnd() { return enhanceEnd; }
    @JsonProperty("EnhanceEnd")
    public void setEnhanceEnd(Activate value) { this.enhanceEnd = value; }

    @JsonProperty("EnhanceFail")
    public Activate getEnhanceFail() { return enhanceFail; }
    @JsonProperty("EnhanceFail")
    public void setEnhanceFail(Activate value) { this.enhanceFail = value; }

    @JsonProperty("EnhanceLoop")
    public Activate getEnhanceLoop() { return enhanceLoop; }
    @JsonProperty("EnhanceLoop")
    public void setEnhanceLoop(Activate value) { this.enhanceLoop = value; }

    @JsonProperty("EnhanceStart")
    public Activate getEnhanceStart() { return enhanceStart; }
    @JsonProperty("EnhanceStart")
    public void setEnhanceStart(Activate value) { this.enhanceStart = value; }

    @JsonProperty("FootFallGeneric")
    public Activate getFootFallGeneric() { return footFallGeneric; }
    @JsonProperty("FootFallGeneric")
    public void setFootFallGeneric(Activate value) { this.footFallGeneric = value; }

    @JsonProperty("FootFallGenericSeabed")
    public Activate getFootFallGenericSeabed() { return footFallGenericSeabed; }
    @JsonProperty("FootFallGenericSeabed")
    public void setFootFallGenericSeabed(Activate value) { this.footFallGenericSeabed = value; }

    @JsonProperty("ReclaimLoop")
    public Activate getReclaimLoop() { return reclaimLoop; }
    @JsonProperty("ReclaimLoop")
    public void setReclaimLoop(Activate value) { this.reclaimLoop = value; }

    @JsonProperty("StartCapture")
    public Activate getStartCapture() { return startCapture; }
    @JsonProperty("StartCapture")
    public void setStartCapture(Activate value) { this.startCapture = value; }

    @JsonProperty("StartReclaim")
    public Activate getStartReclaim() { return startReclaim; }
    @JsonProperty("StartReclaim")
    public void setStartReclaim(Activate value) { this.startReclaim = value; }

    @JsonProperty("TeleportChargingAtDestination")
    public Activate getTeleportChargingAtDestination() { return teleportChargingAtDestination; }
    @JsonProperty("TeleportChargingAtDestination")
    public void setTeleportChargingAtDestination(Activate value) { this.teleportChargingAtDestination = value; }

    @JsonProperty("TeleportChargingAtUnit")
    public Activate getTeleportChargingAtUnit() { return teleportChargingAtUnit; }
    @JsonProperty("TeleportChargingAtUnit")
    public void setTeleportChargingAtUnit(Activate value) { this.teleportChargingAtUnit = value; }

    @JsonProperty("TeleportIn")
    public Activate getTeleportIn() { return teleportIn; }
    @JsonProperty("TeleportIn")
    public void setTeleportIn(Activate value) { this.teleportIn = value; }

    @JsonProperty("HoverKilledOnWater")
    public Activate getHoverKilledOnWater() { return hoverKilledOnWater; }
    @JsonProperty("HoverKilledOnWater")
    public void setHoverKilledOnWater(Activate value) { this.hoverKilledOnWater = value; }

    @JsonProperty("Pack")
    public Activate getPack() { return pack; }
    @JsonProperty("Pack")
    public void setPack(Activate value) { this.pack = value; }

    @JsonProperty("Unpack")
    public Activate getUnpack() { return unpack; }
    @JsonProperty("Unpack")
    public void setUnpack(Activate value) { this.unpack = value; }

    @JsonProperty("AmbientMoveSub")
    public Activate getAmbientMoveSub() { return ambientMoveSub; }
    @JsonProperty("AmbientMoveSub")
    public void setAmbientMoveSub(Activate value) { this.ambientMoveSub = value; }

    @JsonProperty("StartMoveSub")
    public Activate getStartMoveSub() { return startMoveSub; }
    @JsonProperty("StartMoveSub")
    public void setStartMoveSub(Activate value) { this.startMoveSub = value; }

    @JsonProperty("StopMoveSub")
    public Activate getStopMoveSub() { return stopMoveSub; }
    @JsonProperty("StopMoveSub")
    public void setStopMoveSub(Activate value) { this.stopMoveSub = value; }

    @JsonProperty("SubmergeStart")
    public Activate getSubmergeStart() { return submergeStart; }
    @JsonProperty("SubmergeStart")
    public void setSubmergeStart(Activate value) { this.submergeStart = value; }

    @JsonProperty("SurfaceStart")
    public Activate getSurfaceStart() { return surfaceStart; }
    @JsonProperty("SurfaceStart")
    public void setSurfaceStart(Activate value) { this.surfaceStart = value; }

    @JsonProperty("AmbientMoveLand")
    public Activate getAmbientMoveLand() { return ambientMoveLand; }
    @JsonProperty("AmbientMoveLand")
    public void setAmbientMoveLand(Activate value) { this.ambientMoveLand = value; }

    @JsonProperty("AmbientMoveWater")
    public Activate getAmbientMoveWater() { return ambientMoveWater; }
    @JsonProperty("AmbientMoveWater")
    public void setAmbientMoveWater(Activate value) { this.ambientMoveWater = value; }

    @JsonProperty("EnterWater")
    public Activate getEnterWater() { return enterWater; }
    @JsonProperty("EnterWater")
    public void setEnterWater(Activate value) { this.enterWater = value; }

    @JsonProperty("TransitionWater")
    public Activate getTransitionWater() { return transitionWater; }
    @JsonProperty("TransitionWater")
    public void setTransitionWater(Activate value) { this.transitionWater = value; }

    @JsonProperty("ConstructStop")
    public Activate getConstructStop() { return constructStop; }
    @JsonProperty("ConstructStop")
    public void setConstructStop(Activate value) { this.constructStop = value; }

    @JsonProperty("TransitionLand")
    public Activate getTransitionLand() { return transitionLand; }
    @JsonProperty("TransitionLand")
    public void setTransitionLand(Activate value) { this.transitionLand = value; }

    @JsonProperty("AmphibiousFloatingKilledOnLand")
    public Activate getAmphibiousFloatingKilledOnLand() { return amphibiousFloatingKilledOnLand; }
    @JsonProperty("AmphibiousFloatingKilledOnLand")
    public void setAmphibiousFloatingKilledOnLand(Activate value) { this.amphibiousFloatingKilledOnLand = value; }

    @JsonProperty("StartMoveLand")
    public Activate getStartMoveLand() { return startMoveLand; }
    @JsonProperty("StartMoveLand")
    public void setStartMoveLand(Activate value) { this.startMoveLand = value; }

    @JsonProperty("StartMoveWater")
    public Activate getStartMoveWater() { return startMoveWater; }
    @JsonProperty("StartMoveWater")
    public void setStartMoveWater(Activate value) { this.startMoveWater = value; }

    @JsonProperty("StopMoveLand")
    public Activate getStopMoveLand() { return stopMoveLand; }
    @JsonProperty("StopMoveLand")
    public void setStopMoveLand(Activate value) { this.stopMoveLand = value; }

    @JsonProperty("StopMoveWater")
    public Activate getStopMoveWater() { return stopMoveWater; }
    @JsonProperty("StopMoveWater")
    public void setStopMoveWater(Activate value) { this.stopMoveWater = value; }

    @JsonProperty("TakeOff")
    public Activate getTakeOff() { return takeOff; }
    @JsonProperty("TakeOff")
    public void setTakeOff(Activate value) { this.takeOff = value; }

    @JsonProperty("LaunchSat")
    public Activate getLaunchSat() { return launchSat; }
    @JsonProperty("LaunchSat")
    public void setLaunchSat(Activate value) { this.launchSat = value; }

    @JsonProperty("MoveArms")
    public Activate getMoveArms() { return moveArms; }
    @JsonProperty("MoveArms")
    public void setMoveArms(Activate value) { this.moveArms = value; }

    @JsonProperty("Deploy")
    public Activate getDeploy() { return deploy; }
    @JsonProperty("Deploy")
    public void setDeploy(Activate value) { this.deploy = value; }

    @JsonProperty("EggOpen")
    public Activate getEggOpen() { return eggOpen; }
    @JsonProperty("EggOpen")
    public void setEggOpen(Activate value) { this.eggOpen = value; }

    @JsonProperty("EggSink")
    public Activate getEggSink() { return eggSink; }
    @JsonProperty("EggSink")
    public void setEggSink(Activate value) { this.eggSink = value; }

    @JsonProperty("NukeCharge")
    public Activate getNukeCharge() { return nukeCharge; }
    @JsonProperty("NukeCharge")
    public void setNukeCharge(Activate value) { this.nukeCharge = value; }

    @JsonProperty("TeleportOut")
    public Activate getTeleportOut() { return teleportOut; }
    @JsonProperty("TeleportOut")
    public void setTeleportOut(Activate value) { this.teleportOut = value; }

    @JsonProperty("Spawn")
    public Activate getSpawn() { return spawn; }
    @JsonProperty("Spawn")
    public void setSpawn(Activate value) { this.spawn = value; }

    @JsonProperty("CoverLaunch")
    public Activate getCoverLaunch() { return coverLaunch; }
    @JsonProperty("CoverLaunch")
    public void setCoverLaunch(Activate value) { this.coverLaunch = value; }

    @JsonProperty("SupportingArtilleryPing")
    public Activate getSupportingArtilleryPing() { return supportingArtilleryPing; }
    @JsonProperty("SupportingArtilleryPing")
    public void setSupportingArtilleryPing(Activate value) { this.supportingArtilleryPing = value; }

    @JsonProperty("FlaresFired")
    public Activate getFlaresFired() { return flaresFired; }
    @JsonProperty("FlaresFired")
    public void setFlaresFired(Activate value) { this.flaresFired = value; }

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

    @JsonProperty("IntelOverchargeActivated")
    public Activate getIntelOverchargeActivated() { return intelOverchargeActivated; }
    @JsonProperty("IntelOverchargeActivated")
    public void setIntelOverchargeActivated(Activate value) { this.intelOverchargeActivated = value; }

    @JsonProperty("IntelOverchargeActiveLoop")
    public Activate getIntelOverchargeActiveLoop() { return intelOverchargeActiveLoop; }
    @JsonProperty("IntelOverchargeActiveLoop")
    public void setIntelOverchargeActiveLoop(Activate value) { this.intelOverchargeActiveLoop = value; }

    @JsonProperty("IntelOverchargeChargingLoop")
    public Activate getIntelOverchargeChargingLoop() { return intelOverchargeChargingLoop; }
    @JsonProperty("IntelOverchargeChargingLoop")
    public void setIntelOverchargeChargingLoop(Activate value) { this.intelOverchargeChargingLoop = value; }

    @JsonProperty("4")
    public String getThe4() { return the4; }
    @JsonProperty("4")
    public void setThe4(String value) { this.the4 = value; }

    @JsonProperty("5")
    public String getThe5() { return the5; }
    @JsonProperty("5")
    public void setThe5(String value) { this.the5 = value; }

    @JsonProperty("6")
    public String getThe6() { return the6; }
    @JsonProperty("6")
    public void setThe6(String value) { this.the6 = value; }

    @JsonProperty("7")
    public String getThe7() { return the7; }
    @JsonProperty("7")
    public void setThe7(String value) { this.the7 = value; }

    @JsonProperty("8")
    public String getThe8() { return the8; }
    @JsonProperty("8")
    public void setThe8(String value) { this.the8 = value; }

    @JsonProperty("9")
    public String getThe9() { return the9; }
    @JsonProperty("9")
    public void setThe9(String value) { this.the9 = value; }

    @JsonProperty("10")
    public String getThe10() { return the10; }
    @JsonProperty("10")
    public void setThe10(String value) { this.the10 = value; }

    @JsonProperty("11")
    public String getThe11() { return the11; }
    @JsonProperty("11")
    public void setThe11(String value) { this.the11 = value; }

    @JsonProperty("12")
    public String getThe12() { return the12; }
    @JsonProperty("12")
    public void setThe12(String value) { this.the12 = value; }

    @JsonProperty("13")
    public String getThe13() { return the13; }
    @JsonProperty("13")
    public void setThe13(String value) { this.the13 = value; }

    @JsonProperty("14")
    public String getThe14() { return the14; }
    @JsonProperty("14")
    public void setThe14(String value) { this.the14 = value; }

    @JsonProperty("CapacitorInUseLoop")
    public Activate getCapacitorInUseLoop() { return capacitorInUseLoop; }
    @JsonProperty("CapacitorInUseLoop")
    public void setCapacitorInUseLoop(Activate value) { this.capacitorInUseLoop = value; }

    @JsonProperty("CapacitorStopBeingUsed")
    public Activate getCapacitorStopBeingUsed() { return capacitorStopBeingUsed; }
    @JsonProperty("CapacitorStopBeingUsed")
    public void setCapacitorStopBeingUsed(Activate value) { this.capacitorStopBeingUsed = value; }

    @JsonProperty("ConstructSparkle")
    public Activate getConstructSparkle() { return constructSparkle; }
    @JsonProperty("ConstructSparkle")
    public void setConstructSparkle(Activate value) { this.constructSparkle = value; }

    @JsonProperty("ReclaimSparkle")
    public Activate getReclaimSparkle() { return reclaimSparkle; }
    @JsonProperty("ReclaimSparkle")
    public void setReclaimSparkle(Activate value) { this.reclaimSparkle = value; }

    @JsonProperty("UISelectionMultiple")
    public UISelectionMultiple getUISelectionMultiple() { return uiSelectionMultiple; }
    @JsonProperty("UISelectionMultiple")
    public void setUISelectionMultiple(UISelectionMultiple value) { this.uiSelectionMultiple = value; }

    @JsonProperty("UICommandAcknowledgeMultiple")
    public UICommandAcknowledgeMultiple getUICommandAcknowledgeMultiple() { return uiCommandAcknowledgeMultiple; }
    @JsonProperty("UICommandAcknowledgeMultiple")
    public void setUICommandAcknowledgeMultiple(UICommandAcknowledgeMultiple value) { this.uiCommandAcknowledgeMultiple = value; }

    @JsonProperty("AmbientIdle")
    public Activate getAmbientIdle() { return ambientIdle; }
    @JsonProperty("AmbientIdle")
    public void setAmbientIdle(Activate value) { this.ambientIdle = value; }
}
