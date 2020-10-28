package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Back {
    private Name name;
    private long y;
    private long x;

    @JsonProperty("name")
    public Name getName() { return name; }
    @JsonProperty("name")
    public void setName(Name value) { this.name = value; }

    @JsonProperty("y")
    public long getY() { return y; }
    @JsonProperty("y")
    public void setY(long value) { this.y = value; }

    @JsonProperty("x")
    public long getX() { return x; }
    @JsonProperty("x")
    public void setX(long value) { this.x = value; }
}
