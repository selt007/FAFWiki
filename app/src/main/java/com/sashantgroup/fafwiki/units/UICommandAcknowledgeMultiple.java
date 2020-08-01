package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class UICommandAcknowledgeMultiple {
    private UICommandAcknowledgeMultipleProperty210 property210;
    private UICommandAcknowledgeMultipleProperty227 property227;
    private UICommandAcknowledgeMultipleProperty244 property244;
    private Property261 property261;

    @JsonProperty("Property210")
    public UICommandAcknowledgeMultipleProperty210 getProperty210() { return property210; }
    @JsonProperty("Property210")
    public void setProperty210(UICommandAcknowledgeMultipleProperty210 value) { this.property210 = value; }

    @JsonProperty("Property227")
    public UICommandAcknowledgeMultipleProperty227 getProperty227() { return property227; }
    @JsonProperty("Property227")
    public void setProperty227(UICommandAcknowledgeMultipleProperty227 value) { this.property227 = value; }

    @JsonProperty("Property244")
    public UICommandAcknowledgeMultipleProperty244 getProperty244() { return property244; }
    @JsonProperty("Property244")
    public void setProperty244(UICommandAcknowledgeMultipleProperty244 value) { this.property244 = value; }

    @JsonProperty("Property261")
    public Property261 getProperty261() { return property261; }
    @JsonProperty("Property261")
    public void setProperty261(Property261 value) { this.property261 = value; }
}
