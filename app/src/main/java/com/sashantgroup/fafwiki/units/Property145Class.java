package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Property145Class {
    private boolean createWithUnit;
    private String podAttachpoint;
    private String podName;
    private String podUnitID;

    @JsonProperty("CreateWithUnit")
    public boolean getCreateWithUnit() { return createWithUnit; }
    @JsonProperty("CreateWithUnit")
    public void setCreateWithUnit(boolean value) { this.createWithUnit = value; }

    @JsonProperty("PodAttachpoint")
    public String getPodAttachpoint() { return podAttachpoint; }
    @JsonProperty("PodAttachpoint")
    public void setPodAttachpoint(String value) { this.podAttachpoint = value; }

    @JsonProperty("PodName")
    public String getPodName() { return podName; }
    @JsonProperty("PodName")
    public void setPodName(String value) { this.podName = value; }

    @JsonProperty("PodUnitID")
    public String getPodUnitID() { return podUnitID; }
    @JsonProperty("PodUnitID")
    public void setPodUnitID(String value) { this.podUnitID = value; }
}
