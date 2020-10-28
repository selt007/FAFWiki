package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Footfall {
    private BoneClass[] bones;
    private CameraShake cameraShake;
    private Damage damage;

    @JsonProperty("Bones")
    public BoneClass[] getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(BoneClass[] value) { this.bones = value; }

    @JsonProperty("CameraShake")
    public CameraShake getCameraShake() { return cameraShake; }
    @JsonProperty("CameraShake")
    public void setCameraShake(CameraShake value) { this.cameraShake = value; }

    @JsonProperty("Damage")
    public Damage getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(Damage value) { this.damage = value; }
}
