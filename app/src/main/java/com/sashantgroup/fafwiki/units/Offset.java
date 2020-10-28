package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Offset {
    private long z;

    @JsonProperty("z")
    public long getZ() { return z; }
    @JsonProperty("z")
    public void setZ(long value) { this.z = value; }
}
