package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Footfall {
    private FootfallBones bones;
    private CameraShake cameraShake;
    private Damage damage;

    @JsonProperty("Bones")
    public FootfallBones getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(FootfallBones value) { this.bones = value; }

    @JsonProperty("CameraShake")
    public CameraShake getCameraShake() { return cameraShake; }
    @JsonProperty("CameraShake")
    public void setCameraShake(CameraShake value) { this.cameraShake = value; }

    @JsonProperty("Damage")
    public Damage getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(Damage value) { this.damage = value; }
}
