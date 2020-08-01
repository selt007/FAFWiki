package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SpecialAbilities {
    private LaunchTacMissile launchTacMissile;
    private LaunchNuke launchNuke;
    private LaunchNuke nomadsIntelOvercharge;
    private NomadsAreaBombardment nomadsAreaBombardment;
    private NomadsIntelProbe nomadsIntelProbe;
    private NomadsIntelProbe nomadsIntelProbeAdvanced;

    @JsonProperty("LaunchTacMissile")
    public LaunchTacMissile getLaunchTacMissile() { return launchTacMissile; }
    @JsonProperty("LaunchTacMissile")
    public void setLaunchTacMissile(LaunchTacMissile value) { this.launchTacMissile = value; }

    @JsonProperty("LaunchNuke")
    public LaunchNuke getLaunchNuke() { return launchNuke; }
    @JsonProperty("LaunchNuke")
    public void setLaunchNuke(LaunchNuke value) { this.launchNuke = value; }

    @JsonProperty("NomadsIntelOvercharge")
    public LaunchNuke getNomadsIntelOvercharge() { return nomadsIntelOvercharge; }
    @JsonProperty("NomadsIntelOvercharge")
    public void setNomadsIntelOvercharge(LaunchNuke value) { this.nomadsIntelOvercharge = value; }

    @JsonProperty("NomadsAreaBombardment")
    public NomadsAreaBombardment getNomadsAreaBombardment() { return nomadsAreaBombardment; }
    @JsonProperty("NomadsAreaBombardment")
    public void setNomadsAreaBombardment(NomadsAreaBombardment value) { this.nomadsAreaBombardment = value; }

    @JsonProperty("NomadsIntelProbe")
    public NomadsIntelProbe getNomadsIntelProbe() { return nomadsIntelProbe; }
    @JsonProperty("NomadsIntelProbe")
    public void setNomadsIntelProbe(NomadsIntelProbe value) { this.nomadsIntelProbe = value; }

    @JsonProperty("NomadsIntelProbeAdvanced")
    public NomadsIntelProbe getNomadsIntelProbeAdvanced() { return nomadsIntelProbeAdvanced; }
    @JsonProperty("NomadsIntelProbeAdvanced")
    public void setNomadsIntelProbeAdvanced(NomadsIntelProbe value) { this.nomadsIntelProbeAdvanced = value; }
}
