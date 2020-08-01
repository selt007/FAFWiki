package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Anchor {
    private String buff;

    @JsonProperty("Buff")
    public String getBuff() { return buff; }
    @JsonProperty("Buff")
    public void setBuff(String value) { this.buff = value; }
}
