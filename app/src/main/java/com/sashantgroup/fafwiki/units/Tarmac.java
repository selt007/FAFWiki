package com.sashantgroup.fafwiki.units;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Tarmac {
    private Albedo albedo;
    private String deathLifetime;
    private String fadeOut;
    private String length;
    private Normal normal;
    private String[] orientations;
    private boolean removeWhenDead;
    private String width;
    private String albedoKilled;

    @JsonProperty("Albedo")
    public Albedo getAlbedo() { return albedo; }
    @JsonProperty("Albedo")
    public void setAlbedo(Albedo value) { this.albedo = value; }

    @JsonProperty("DeathLifetime")
    public String getDeathLifetime() { return deathLifetime; }
    @JsonProperty("DeathLifetime")
    public void setDeathLifetime(String value) { this.deathLifetime = value; }

    @JsonProperty("FadeOut")
    public String getFadeOut() { return fadeOut; }
    @JsonProperty("FadeOut")
    public void setFadeOut(String value) { this.fadeOut = value; }

    @JsonProperty("Length")
    public String getLength() { return length; }
    @JsonProperty("Length")
    public void setLength(String value) { this.length = value; }

    @JsonProperty("Normal")
    public Normal getNormal() { return normal; }
    @JsonProperty("Normal")
    public void setNormal(Normal value) { this.normal = value; }

    @JsonProperty("Orientations")
    public String[] getOrientations() { return orientations; }
    @JsonProperty("Orientations")
    public void setOrientations(String[] value) { this.orientations = value; }

    @JsonProperty("RemoveWhenDead")
    public boolean getRemoveWhenDead() { return removeWhenDead; }
    @JsonProperty("RemoveWhenDead")
    public void setRemoveWhenDead(boolean value) { this.removeWhenDead = value; }

    @JsonProperty("Width")
    public String getWidth() { return width; }
    @JsonProperty("Width")
    public void setWidth(String value) { this.width = value; }

    @JsonProperty("AlbedoKilled")
    public String getAlbedoKilled() { return albedoKilled; }
    @JsonProperty("AlbedoKilled")
    public void setAlbedoKilled(String value) { this.albedoKilled = value; }
}
