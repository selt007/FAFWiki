package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Tarmac {
    private double width;
    private Long deathLifetime;
    private Normal normal;
    private Albedo albedo;
    private boolean removeWhenDead;
    private long fadeOut;
    private long[] orientations;
    private double length;

    @JsonProperty("Width")
    public double getWidth() { return width; }
    @JsonProperty("Width")
    public void setWidth(double value) { this.width = value; }

    @JsonProperty("DeathLifetime")
    public Long getDeathLifetime() { return deathLifetime; }
    @JsonProperty("DeathLifetime")
    public void setDeathLifetime(Long value) { this.deathLifetime = value; }

    @JsonProperty("Normal")
    public Normal getNormal() { return normal; }
    @JsonProperty("Normal")
    public void setNormal(Normal value) { this.normal = value; }

    @JsonProperty("Albedo")
    public Albedo getAlbedo() { return albedo; }
    @JsonProperty("Albedo")
    public void setAlbedo(Albedo value) { this.albedo = value; }

    @JsonProperty("RemoveWhenDead")
    public boolean getRemoveWhenDead() { return removeWhenDead; }
    @JsonProperty("RemoveWhenDead")
    public void setRemoveWhenDead(boolean value) { this.removeWhenDead = value; }

    @JsonProperty("FadeOut")
    public long getFadeOut() { return fadeOut; }
    @JsonProperty("FadeOut")
    public void setFadeOut(long value) { this.fadeOut = value; }

    @JsonProperty("Orientations")
    public long[] getOrientations() { return orientations; }
    @JsonProperty("Orientations")
    public void setOrientations(long[] value) { this.orientations = value; }

    @JsonProperty("Length")
    public double getLength() { return length; }
    @JsonProperty("Length")
    public void setLength(double value) { this.length = value; }
}
