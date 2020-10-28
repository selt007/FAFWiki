package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class ActiveIntel {
    private Boolean omni;
    private Boolean sonar;
    private Boolean radar;

    @JsonProperty("Omni")
    public Boolean getOmni() { return omni; }
    @JsonProperty("Omni")
    public void setOmni(Boolean value) { this.omni = value; }

    @JsonProperty("Sonar")
    public Boolean getSonar() { return sonar; }
    @JsonProperty("Sonar")
    public void setSonar(Boolean value) { this.sonar = value; }

    @JsonProperty("Radar")
    public Boolean getRadar() { return radar; }
    @JsonProperty("Radar")
    public void setRadar(Boolean value) { this.radar = value; }
}
