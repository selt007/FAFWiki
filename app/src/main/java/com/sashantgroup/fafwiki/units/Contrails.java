package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Contrails {
    private String[] bones;
    private Long zOffset;

    @JsonProperty("Bones")
    public String[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(String[] value) { this.bones = value; }

    @JsonProperty("ZOffset")
    public Long getZOffset() { return zOffset; }
    @JsonProperty("ZOffset")
    public void setZOffset(Long value) { this.zOffset = value; }
}
