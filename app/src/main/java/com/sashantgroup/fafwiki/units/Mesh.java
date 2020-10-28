package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class Mesh {
    private Lod[] loDs;
    private long iconFadeInZoom;

    @JsonProperty("LODs")
    public Lod[] getLoDs() { return loDs; }
    @JsonProperty("LODs")
    public void setLoDs(Lod[] value) { this.loDs = value; }

    @JsonProperty("IconFadeInZoom")
    public long getIconFadeInZoom() { return iconFadeInZoom; }
    @JsonProperty("IconFadeInZoom")
    public void setIconFadeInZoom(long value) { this.iconFadeInZoom = value; }
}
