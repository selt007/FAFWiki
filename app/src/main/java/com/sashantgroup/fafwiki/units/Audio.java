package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Audio {
    private UISelection thruster;
    private UISelection refueling;
    private UISelection stopMove;
    private UISelection destroyed;
    private UISelection startMove;
    private UISelection ambientMove;
    private UISelection killed;
    private UISelection airUnitWaterImpact;
    private UISelection landing;
    private UISelection uiSelection;
    private UISelection shieldOff;
    private UISelection shieldOn;
    private UISelection deathExplosion;
    private UISelection construct;
    private UISelection doneBeingBuilt;
    private UISelection constructLoop;
    private UISelection hoverKilledOnWater;
    private UISelection captureLoop;
    private UISelection startReclaim;
    private UISelection startCapture;
    private UISelection reclaimLoop;
    private UISelection load;
    private UISelection unload;
    private UISelection ambientMoveSub;
    private UISelection submergeStart;
    private UISelection stopMoveSub;
    private UISelection surfaceStart;
    private UISelection startMoveSub;
    private UISelection unpack;
    private UISelection pack;
    private NuclearLaunchDetected nuclearLaunchDetected;
    private UISelection footFallGeneric;
    private UISelection enhanceStart;
    private UISelection commanderArrival;
    private UISelection teleportChargingAtDestination;
    private UISelection enhanceEnd;
    private UISelection enhanceFail;
    private UISelection enhanceLoop;
    private UISelection footFallGenericSeabed;
    private UISelection teleportIn;
    private UISelection teleportChargingAtUnit;
    private UISelection activeLoop;
    private UISelection open;
    private UISelection close;
    private UISelection activate;
    private UISelection transitionWater;
    private UISelection transitionLand;
    private UISelection constructStop;
    private UISelection ambientMoveWater;
    private UISelection ambientMoveLand;
    private UISelection moveArms;
    private UISelection launchSat;
    private UISelection enterWater;
    private UISelection startMoveWater;
    private UISelection amphibiousFloatingKilledOnLand;
    private UISelection stopMoveLand;
    private UISelection stopMoveWater;
    private UISelection startMoveLand;
    private UISelection deploy;
    private UISelection eggOpen;
    private UISelection eggSink;
    private UISelection nukeCharge;
    private UISelection teleportOut;

    @JsonProperty("Thruster")
    public UISelection getThruster() { return thruster; }
    @JsonProperty("Thruster")
    public void setThruster(UISelection value) { this.thruster = value; }

    @JsonProperty("Refueling")
    public UISelection getRefueling() { return refueling; }
    @JsonProperty("Refueling")
    public void setRefueling(UISelection value) { this.refueling = value; }

    @JsonProperty("StopMove")
    public UISelection getStopMove() { return stopMove; }
    @JsonProperty("StopMove")
    public void setStopMove(UISelection value) { this.stopMove = value; }

    @JsonProperty("Destroyed")
    public UISelection getDestroyed() { return destroyed; }
    @JsonProperty("Destroyed")
    public void setDestroyed(UISelection value) { this.destroyed = value; }

    @JsonProperty("StartMove")
    public UISelection getStartMove() { return startMove; }
    @JsonProperty("StartMove")
    public void setStartMove(UISelection value) { this.startMove = value; }

    @JsonProperty("AmbientMove")
    public UISelection getAmbientMove() { return ambientMove; }
    @JsonProperty("AmbientMove")
    public void setAmbientMove(UISelection value) { this.ambientMove = value; }

    @JsonProperty("Killed")
    public UISelection getKilled() { return killed; }
    @JsonProperty("Killed")
    public void setKilled(UISelection value) { this.killed = value; }

    @JsonProperty("AirUnitWaterImpact")
    public UISelection getAirUnitWaterImpact() { return airUnitWaterImpact; }
    @JsonProperty("AirUnitWaterImpact")
    public void setAirUnitWaterImpact(UISelection value) { this.airUnitWaterImpact = value; }

    @JsonProperty("Landing")
    public UISelection getLanding() { return landing; }
    @JsonProperty("Landing")
    public void setLanding(UISelection value) { this.landing = value; }

    @JsonProperty("UISelection")
    public UISelection getUISelection() { return uiSelection; }
    @JsonProperty("UISelection")
    public void setUISelection(UISelection value) { this.uiSelection = value; }

    @JsonProperty("ShieldOff")
    public UISelection getShieldOff() { return shieldOff; }
    @JsonProperty("ShieldOff")
    public void setShieldOff(UISelection value) { this.shieldOff = value; }

    @JsonProperty("ShieldOn")
    public UISelection getShieldOn() { return shieldOn; }
    @JsonProperty("ShieldOn")
    public void setShieldOn(UISelection value) { this.shieldOn = value; }

    @JsonProperty("DeathExplosion")
    public UISelection getDeathExplosion() { return deathExplosion; }
    @JsonProperty("DeathExplosion")
    public void setDeathExplosion(UISelection value) { this.deathExplosion = value; }

    @JsonProperty("Construct")
    public UISelection getConstruct() { return construct; }
    @JsonProperty("Construct")
    public void setConstruct(UISelection value) { this.construct = value; }

    @JsonProperty("DoneBeingBuilt")
    public UISelection getDoneBeingBuilt() { return doneBeingBuilt; }
    @JsonProperty("DoneBeingBuilt")
    public void setDoneBeingBuilt(UISelection value) { this.doneBeingBuilt = value; }

    @JsonProperty("ConstructLoop")
    public UISelection getConstructLoop() { return constructLoop; }
    @JsonProperty("ConstructLoop")
    public void setConstructLoop(UISelection value) { this.constructLoop = value; }

    @JsonProperty("HoverKilledOnWater")
    public UISelection getHoverKilledOnWater() { return hoverKilledOnWater; }
    @JsonProperty("HoverKilledOnWater")
    public void setHoverKilledOnWater(UISelection value) { this.hoverKilledOnWater = value; }

    @JsonProperty("CaptureLoop")
    public UISelection getCaptureLoop() { return captureLoop; }
    @JsonProperty("CaptureLoop")
    public void setCaptureLoop(UISelection value) { this.captureLoop = value; }

    @JsonProperty("StartReclaim")
    public UISelection getStartReclaim() { return startReclaim; }
    @JsonProperty("StartReclaim")
    public void setStartReclaim(UISelection value) { this.startReclaim = value; }

    @JsonProperty("StartCapture")
    public UISelection getStartCapture() { return startCapture; }
    @JsonProperty("StartCapture")
    public void setStartCapture(UISelection value) { this.startCapture = value; }

    @JsonProperty("ReclaimLoop")
    public UISelection getReclaimLoop() { return reclaimLoop; }
    @JsonProperty("ReclaimLoop")
    public void setReclaimLoop(UISelection value) { this.reclaimLoop = value; }

    @JsonProperty("Load")
    public UISelection getLoad() { return load; }
    @JsonProperty("Load")
    public void setLoad(UISelection value) { this.load = value; }

    @JsonProperty("Unload")
    public UISelection getUnload() { return unload; }
    @JsonProperty("Unload")
    public void setUnload(UISelection value) { this.unload = value; }

    @JsonProperty("AmbientMoveSub")
    public UISelection getAmbientMoveSub() { return ambientMoveSub; }
    @JsonProperty("AmbientMoveSub")
    public void setAmbientMoveSub(UISelection value) { this.ambientMoveSub = value; }

    @JsonProperty("SubmergeStart")
    public UISelection getSubmergeStart() { return submergeStart; }
    @JsonProperty("SubmergeStart")
    public void setSubmergeStart(UISelection value) { this.submergeStart = value; }

    @JsonProperty("StopMoveSub")
    public UISelection getStopMoveSub() { return stopMoveSub; }
    @JsonProperty("StopMoveSub")
    public void setStopMoveSub(UISelection value) { this.stopMoveSub = value; }

    @JsonProperty("SurfaceStart")
    public UISelection getSurfaceStart() { return surfaceStart; }
    @JsonProperty("SurfaceStart")
    public void setSurfaceStart(UISelection value) { this.surfaceStart = value; }

    @JsonProperty("StartMoveSub")
    public UISelection getStartMoveSub() { return startMoveSub; }
    @JsonProperty("StartMoveSub")
    public void setStartMoveSub(UISelection value) { this.startMoveSub = value; }

    @JsonProperty("Unpack")
    public UISelection getUnpack() { return unpack; }
    @JsonProperty("Unpack")
    public void setUnpack(UISelection value) { this.unpack = value; }

    @JsonProperty("Pack")
    public UISelection getPack() { return pack; }
    @JsonProperty("Pack")
    public void setPack(UISelection value) { this.pack = value; }

    @JsonProperty("NuclearLaunchDetected")
    public NuclearLaunchDetected getNuclearLaunchDetected() { return nuclearLaunchDetected; }
    @JsonProperty("NuclearLaunchDetected")
    public void setNuclearLaunchDetected(NuclearLaunchDetected value) { this.nuclearLaunchDetected = value; }

    @JsonProperty("FootFallGeneric")
    public UISelection getFootFallGeneric() { return footFallGeneric; }
    @JsonProperty("FootFallGeneric")
    public void setFootFallGeneric(UISelection value) { this.footFallGeneric = value; }

    @JsonProperty("EnhanceStart")
    public UISelection getEnhanceStart() { return enhanceStart; }
    @JsonProperty("EnhanceStart")
    public void setEnhanceStart(UISelection value) { this.enhanceStart = value; }

    @JsonProperty("CommanderArrival")
    public UISelection getCommanderArrival() { return commanderArrival; }
    @JsonProperty("CommanderArrival")
    public void setCommanderArrival(UISelection value) { this.commanderArrival = value; }

    @JsonProperty("TeleportChargingAtDestination")
    public UISelection getTeleportChargingAtDestination() { return teleportChargingAtDestination; }
    @JsonProperty("TeleportChargingAtDestination")
    public void setTeleportChargingAtDestination(UISelection value) { this.teleportChargingAtDestination = value; }

    @JsonProperty("EnhanceEnd")
    public UISelection getEnhanceEnd() { return enhanceEnd; }
    @JsonProperty("EnhanceEnd")
    public void setEnhanceEnd(UISelection value) { this.enhanceEnd = value; }

    @JsonProperty("EnhanceFail")
    public UISelection getEnhanceFail() { return enhanceFail; }
    @JsonProperty("EnhanceFail")
    public void setEnhanceFail(UISelection value) { this.enhanceFail = value; }

    @JsonProperty("EnhanceLoop")
    public UISelection getEnhanceLoop() { return enhanceLoop; }
    @JsonProperty("EnhanceLoop")
    public void setEnhanceLoop(UISelection value) { this.enhanceLoop = value; }

    @JsonProperty("FootFallGenericSeabed")
    public UISelection getFootFallGenericSeabed() { return footFallGenericSeabed; }
    @JsonProperty("FootFallGenericSeabed")
    public void setFootFallGenericSeabed(UISelection value) { this.footFallGenericSeabed = value; }

    @JsonProperty("TeleportIn")
    public UISelection getTeleportIn() { return teleportIn; }
    @JsonProperty("TeleportIn")
    public void setTeleportIn(UISelection value) { this.teleportIn = value; }

    @JsonProperty("TeleportChargingAtUnit")
    public UISelection getTeleportChargingAtUnit() { return teleportChargingAtUnit; }
    @JsonProperty("TeleportChargingAtUnit")
    public void setTeleportChargingAtUnit(UISelection value) { this.teleportChargingAtUnit = value; }

    @JsonProperty("ActiveLoop")
    public UISelection getActiveLoop() { return activeLoop; }
    @JsonProperty("ActiveLoop")
    public void setActiveLoop(UISelection value) { this.activeLoop = value; }

    @JsonProperty("Open")
    public UISelection getOpen() { return open; }
    @JsonProperty("Open")
    public void setOpen(UISelection value) { this.open = value; }

    @JsonProperty("Close")
    public UISelection getClose() { return close; }
    @JsonProperty("Close")
    public void setClose(UISelection value) { this.close = value; }

    @JsonProperty("Activate")
    public UISelection getActivate() { return activate; }
    @JsonProperty("Activate")
    public void setActivate(UISelection value) { this.activate = value; }

    @JsonProperty("TransitionWater")
    public UISelection getTransitionWater() { return transitionWater; }
    @JsonProperty("TransitionWater")
    public void setTransitionWater(UISelection value) { this.transitionWater = value; }

    @JsonProperty("TransitionLand")
    public UISelection getTransitionLand() { return transitionLand; }
    @JsonProperty("TransitionLand")
    public void setTransitionLand(UISelection value) { this.transitionLand = value; }

    @JsonProperty("ConstructStop")
    public UISelection getConstructStop() { return constructStop; }
    @JsonProperty("ConstructStop")
    public void setConstructStop(UISelection value) { this.constructStop = value; }

    @JsonProperty("AmbientMoveWater")
    public UISelection getAmbientMoveWater() { return ambientMoveWater; }
    @JsonProperty("AmbientMoveWater")
    public void setAmbientMoveWater(UISelection value) { this.ambientMoveWater = value; }

    @JsonProperty("AmbientMoveLand")
    public UISelection getAmbientMoveLand() { return ambientMoveLand; }
    @JsonProperty("AmbientMoveLand")
    public void setAmbientMoveLand(UISelection value) { this.ambientMoveLand = value; }

    @JsonProperty("MoveArms")
    public UISelection getMoveArms() { return moveArms; }
    @JsonProperty("MoveArms")
    public void setMoveArms(UISelection value) { this.moveArms = value; }

    @JsonProperty("LaunchSat")
    public UISelection getLaunchSat() { return launchSat; }
    @JsonProperty("LaunchSat")
    public void setLaunchSat(UISelection value) { this.launchSat = value; }

    @JsonProperty("EnterWater")
    public UISelection getEnterWater() { return enterWater; }
    @JsonProperty("EnterWater")
    public void setEnterWater(UISelection value) { this.enterWater = value; }

    @JsonProperty("StartMoveWater")
    public UISelection getStartMoveWater() { return startMoveWater; }
    @JsonProperty("StartMoveWater")
    public void setStartMoveWater(UISelection value) { this.startMoveWater = value; }

    @JsonProperty("AmphibiousFloatingKilledOnLand")
    public UISelection getAmphibiousFloatingKilledOnLand() { return amphibiousFloatingKilledOnLand; }
    @JsonProperty("AmphibiousFloatingKilledOnLand")
    public void setAmphibiousFloatingKilledOnLand(UISelection value) { this.amphibiousFloatingKilledOnLand = value; }

    @JsonProperty("StopMoveLand")
    public UISelection getStopMoveLand() { return stopMoveLand; }
    @JsonProperty("StopMoveLand")
    public void setStopMoveLand(UISelection value) { this.stopMoveLand = value; }

    @JsonProperty("StopMoveWater")
    public UISelection getStopMoveWater() { return stopMoveWater; }
    @JsonProperty("StopMoveWater")
    public void setStopMoveWater(UISelection value) { this.stopMoveWater = value; }

    @JsonProperty("StartMoveLand")
    public UISelection getStartMoveLand() { return startMoveLand; }
    @JsonProperty("StartMoveLand")
    public void setStartMoveLand(UISelection value) { this.startMoveLand = value; }

    @JsonProperty("Deploy")
    public UISelection getDeploy() { return deploy; }
    @JsonProperty("Deploy")
    public void setDeploy(UISelection value) { this.deploy = value; }

    @JsonProperty("EggOpen")
    public UISelection getEggOpen() { return eggOpen; }
    @JsonProperty("EggOpen")
    public void setEggOpen(UISelection value) { this.eggOpen = value; }

    @JsonProperty("EggSink")
    public UISelection getEggSink() { return eggSink; }
    @JsonProperty("EggSink")
    public void setEggSink(UISelection value) { this.eggSink = value; }

    @JsonProperty("NukeCharge")
    public UISelection getNukeCharge() { return nukeCharge; }
    @JsonProperty("NukeCharge")
    public void setNukeCharge(UISelection value) { this.nukeCharge = value; }

    @JsonProperty("TeleportOut")
    public UISelection getTeleportOut() { return teleportOut; }
    @JsonProperty("TeleportOut")
    public void setTeleportOut(UISelection value) { this.teleportOut = value; }
}
