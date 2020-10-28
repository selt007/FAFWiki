package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class BuildOnLayerCaps {
    private boolean layerWater;
    private boolean layerSeabed;
    private boolean layerOrbit;
    private boolean layerSub;
    private boolean layerLand;
    private boolean layerAir;

    @JsonProperty("LAYER_Water")
    public boolean getLayerWater() { return layerWater; }
    @JsonProperty("LAYER_Water")
    public void setLayerWater(boolean value) { this.layerWater = value; }

    @JsonProperty("LAYER_Seabed")
    public boolean getLayerSeabed() { return layerSeabed; }
    @JsonProperty("LAYER_Seabed")
    public void setLayerSeabed(boolean value) { this.layerSeabed = value; }

    @JsonProperty("LAYER_Orbit")
    public boolean getLayerOrbit() { return layerOrbit; }
    @JsonProperty("LAYER_Orbit")
    public void setLayerOrbit(boolean value) { this.layerOrbit = value; }

    @JsonProperty("LAYER_Sub")
    public boolean getLayerSub() { return layerSub; }
    @JsonProperty("LAYER_Sub")
    public void setLayerSub(boolean value) { this.layerSub = value; }

    @JsonProperty("LAYER_Land")
    public boolean getLayerLand() { return layerLand; }
    @JsonProperty("LAYER_Land")
    public void setLayerLand(boolean value) { this.layerLand = value; }

    @JsonProperty("LAYER_Air")
    public boolean getLayerAir() { return layerAir; }
    @JsonProperty("LAYER_Air")
    public void setLayerAir(boolean value) { this.layerAir = value; }
}
