package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Transport {
    private Boolean airClass;
    private String transportClass;
    private Boolean canFireFromTransport;
    private String class2AttachSize;
    private String class3AttachSize;
    private String classGenericUpTo;
    private String class4AttachSize;
    private String storageSlots;
    private String dockingSlots;
    private String repairRate;
    private String classSAttachSize;
    private String class1AttachSize;
    private Boolean dontUseForcedAttachPoints;

    @JsonProperty("AirClass")
    public Boolean getAirClass() { return airClass; }
    @JsonProperty("AirClass")
    public void setAirClass(Boolean value) { this.airClass = value; }

    @JsonProperty("TransportClass")
    public String getTransportClass() { return transportClass; }
    @JsonProperty("TransportClass")
    public void setTransportClass(String value) { this.transportClass = value; }

    @JsonProperty("CanFireFromTransport")
    public Boolean getCanFireFromTransport() { return canFireFromTransport; }
    @JsonProperty("CanFireFromTransport")
    public void setCanFireFromTransport(Boolean value) { this.canFireFromTransport = value; }

    @JsonProperty("Class2AttachSize")
    public String getClass2AttachSize() { return class2AttachSize; }
    @JsonProperty("Class2AttachSize")
    public void setClass2AttachSize(String value) { this.class2AttachSize = value; }

    @JsonProperty("Class3AttachSize")
    public String getClass3AttachSize() { return class3AttachSize; }
    @JsonProperty("Class3AttachSize")
    public void setClass3AttachSize(String value) { this.class3AttachSize = value; }

    @JsonProperty("ClassGenericUpTo")
    public String getClassGenericUpTo() { return classGenericUpTo; }
    @JsonProperty("ClassGenericUpTo")
    public void setClassGenericUpTo(String value) { this.classGenericUpTo = value; }

    @JsonProperty("Class4AttachSize")
    public String getClass4AttachSize() { return class4AttachSize; }
    @JsonProperty("Class4AttachSize")
    public void setClass4AttachSize(String value) { this.class4AttachSize = value; }

    @JsonProperty("StorageSlots")
    public String getStorageSlots() { return storageSlots; }
    @JsonProperty("StorageSlots")
    public void setStorageSlots(String value) { this.storageSlots = value; }

    @JsonProperty("DockingSlots")
    public String getDockingSlots() { return dockingSlots; }
    @JsonProperty("DockingSlots")
    public void setDockingSlots(String value) { this.dockingSlots = value; }

    @JsonProperty("RepairRate")
    public String getRepairRate() { return repairRate; }
    @JsonProperty("RepairRate")
    public void setRepairRate(String value) { this.repairRate = value; }

    @JsonProperty("ClassSAttachSize")
    public String getClassSAttachSize() { return classSAttachSize; }
    @JsonProperty("ClassSAttachSize")
    public void setClassSAttachSize(String value) { this.classSAttachSize = value; }

    @JsonProperty("Class1AttachSize")
    public String getClass1AttachSize() { return class1AttachSize; }
    @JsonProperty("Class1AttachSize")
    public void setClass1AttachSize(String value) { this.class1AttachSize = value; }

    @JsonProperty("DontUseForcedAttachPoints")
    public Boolean getDontUseForcedAttachPoints() { return dontUseForcedAttachPoints; }
    @JsonProperty("DontUseForcedAttachPoints")
    public void setDontUseForcedAttachPoints(Boolean value) { this.dontUseForcedAttachPoints = value; }
}
