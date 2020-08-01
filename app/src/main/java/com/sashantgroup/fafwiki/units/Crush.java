package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Crush {
    private CrushBones bones;
    private Damage damage;

    @JsonProperty("Bones")
    public CrushBones getBones() { return bones; }
    @JsonProperty("Bones")
    public void setBones(CrushBones value) { this.bones = value; }

    @JsonProperty("Damage")
    public Damage getDamage() { return damage; }
    @JsonProperty("Damage")
    public void setDamage(Damage value) { this.damage = value; }
}
