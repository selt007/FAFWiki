package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Transport {
    private Boolean airClass;
    private Long transportClass;
    private Long classGenericUpTo;
    private Long storageSlots;
    private Long class4AttachSize;
    private Boolean canFireFromTransport;
    private Long class3AttachSize;
    private Long class2AttachSize;
    private Long dockingSlots;
    private Double repairRate;
    private Long classSAttachSize;
    private Long class1AttachSize;

    @JsonProperty("AirClass")
    public Boolean getAirClass() { return airClass; }
    @JsonProperty("AirClass")
    public void setAirClass(Boolean value) { this.airClass = value; }

    @JsonProperty("TransportClass")
    public Long getTransportClass() { return transportClass; }
    @JsonProperty("TransportClass")
    public void setTransportClass(Long value) { this.transportClass = value; }

    @JsonProperty("ClassGenericUpTo")
    public Long getClassGenericUpTo() { return classGenericUpTo; }
    @JsonProperty("ClassGenericUpTo")
    public void setClassGenericUpTo(Long value) { this.classGenericUpTo = value; }

    @JsonProperty("StorageSlots")
    public Long getStorageSlots() { return storageSlots; }
    @JsonProperty("StorageSlots")
    public void setStorageSlots(Long value) { this.storageSlots = value; }

    @JsonProperty("Class4AttachSize")
    public Long getClass4AttachSize() { return class4AttachSize; }
    @JsonProperty("Class4AttachSize")
    public void setClass4AttachSize(Long value) { this.class4AttachSize = value; }

    @JsonProperty("CanFireFromTransport")
    public Boolean getCanFireFromTransport() { return canFireFromTransport; }
    @JsonProperty("CanFireFromTransport")
    public void setCanFireFromTransport(Boolean value) { this.canFireFromTransport = value; }

    @JsonProperty("Class3AttachSize")
    public Long getClass3AttachSize() { return class3AttachSize; }
    @JsonProperty("Class3AttachSize")
    public void setClass3AttachSize(Long value) { this.class3AttachSize = value; }

    @JsonProperty("Class2AttachSize")
    public Long getClass2AttachSize() { return class2AttachSize; }
    @JsonProperty("Class2AttachSize")
    public void setClass2AttachSize(Long value) { this.class2AttachSize = value; }

    @JsonProperty("DockingSlots")
    public Long getDockingSlots() { return dockingSlots; }
    @JsonProperty("DockingSlots")
    public void setDockingSlots(Long value) { this.dockingSlots = value; }

    @JsonProperty("RepairRate")
    public Double getRepairRate() { return repairRate; }
    @JsonProperty("RepairRate")
    public void setRepairRate(Double value) { this.repairRate = value; }

    @JsonProperty("ClassSAttachSize")
    public Long getClassSAttachSize() { return classSAttachSize; }
    @JsonProperty("ClassSAttachSize")
    public void setClassSAttachSize(Long value) { this.classSAttachSize = value; }

    @JsonProperty("Class1AttachSize")
    public Long getClass1AttachSize() { return class1AttachSize; }
    @JsonProperty("Class1AttachSize")
    public void setClass1AttachSize(Long value) { this.class1AttachSize = value; }
}
