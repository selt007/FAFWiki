package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BuffAdd {
    private Boolean onImpact;
    private Boolean onFire;

    @JsonProperty("OnImpact")
    public Boolean getOnImpact() { return onImpact; }
    @JsonProperty("OnImpact")
    public void setOnImpact(Boolean value) { this.onImpact = value; }

    @JsonProperty("OnFire")
    public Boolean getOnFire() { return onFire; }
    @JsonProperty("OnFire")
    public void setOnFire(Boolean value) { this.onFire = value; }
}
