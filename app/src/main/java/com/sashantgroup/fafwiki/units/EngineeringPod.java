package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class EngineeringPod {
    private String podUnitID;
    private String podAttachpoint;
    private boolean createWithUnit;
    private String podName;

    @JsonProperty("PodUnitID")
    public String getPodUnitID() { return podUnitID; }
    @JsonProperty("PodUnitID")
    public void setPodUnitID(String value) { this.podUnitID = value; }

    @JsonProperty("PodAttachpoint")
    public String getPodAttachpoint() { return podAttachpoint; }
    @JsonProperty("PodAttachpoint")
    public void setPodAttachpoint(String value) { this.podAttachpoint = value; }

    @JsonProperty("CreateWithUnit")
    public boolean getCreateWithUnit() { return createWithUnit; }
    @JsonProperty("CreateWithUnit")
    public void setCreateWithUnit(boolean value) { this.createWithUnit = value; }

    @JsonProperty("PodName")
    public String getPodName() { return podName; }
    @JsonProperty("PodName")
    public void setPodName(String value) { this.podName = value; }
}
