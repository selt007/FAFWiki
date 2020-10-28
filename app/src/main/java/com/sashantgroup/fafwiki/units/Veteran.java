package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Veteran {
    private long level4;
    private long level2;
    private long level1;
    private long level5;
    private long level3;

    @JsonProperty("Level4")
    public long getLevel4() { return level4; }
    @JsonProperty("Level4")
    public void setLevel4(long value) { this.level4 = value; }

    @JsonProperty("Level2")
    public long getLevel2() { return level2; }
    @JsonProperty("Level2")
    public void setLevel2(long value) { this.level2 = value; }

    @JsonProperty("Level1")
    public long getLevel1() { return level1; }
    @JsonProperty("Level1")
    public void setLevel1(long value) { this.level1 = value; }

    @JsonProperty("Level5")
    public long getLevel5() { return level5; }
    @JsonProperty("Level5")
    public void setLevel5(long value) { this.level5 = value; }

    @JsonProperty("Level3")
    public long getLevel3() { return level3; }
    @JsonProperty("Level3")
    public void setLevel3(long value) { this.level3 = value; }
}
