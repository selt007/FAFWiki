package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class MovementEffectsLand {
    private SubBottomUpEffect[] effects;
    private LandTreads treads;
    private Footfall footfall;
    private CameraShake cameraShake;

    @JsonProperty("Effects")
    public SubBottomUpEffect[] getEffects() { return effects; }
    @JsonProperty("Effects")
    public void setEffects(SubBottomUpEffect[] value) { this.effects = value; }

    @JsonProperty("Treads")
    public LandTreads getTreads() { return treads; }
    @JsonProperty("Treads")
    public void setTreads(LandTreads value) { this.treads = value; }

    @JsonProperty("Footfall")
    public Footfall getFootfall() { return footfall; }
    @JsonProperty("Footfall")
    public void setFootfall(Footfall value) { this.footfall = value; }

    @JsonProperty("CameraShake")
    public CameraShake getCameraShake() { return cameraShake; }
    @JsonProperty("CameraShake")
    public void setCameraShake(CameraShake value) { this.cameraShake = value; }
}
