package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BarrelLoop {
    private UISelection fire;

    @JsonProperty("Fire")
    public UISelection getFire() { return fire; }
    @JsonProperty("Fire")
    public void setFire(UISelection value) { this.fire = value; }
}
