package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Veteran {
    private String level1;
    private String level2;
    private String level3;
    private String level4;
    private String level5;

    @JsonProperty("Level1")
    public String getLevel1() { return level1; }
    @JsonProperty("Level1")
    public void setLevel1(String value) { this.level1 = value; }

    @JsonProperty("Level2")
    public String getLevel2() { return level2; }
    @JsonProperty("Level2")
    public void setLevel2(String value) { this.level2 = value; }

    @JsonProperty("Level3")
    public String getLevel3() { return level3; }
    @JsonProperty("Level3")
    public void setLevel3(String value) { this.level3 = value; }

    @JsonProperty("Level4")
    public String getLevel4() { return level4; }
    @JsonProperty("Level4")
    public void setLevel4(String value) { this.level4 = value; }

    @JsonProperty("Level5")
    public String getLevel5() { return level5; }
    @JsonProperty("Level5")
    public void setLevel5(String value) { this.level5 = value; }
}
