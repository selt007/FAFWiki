package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class ToggleCaps {
    private Boolean ruleutcShieldToggle;
    private Boolean ruleutcProductionToggle;
    private Boolean ruleutcIntelToggle;
    private Boolean ruleutcStealthToggle;
    private Boolean ruleutcWeaponToggle;
    private Boolean ruleutcJammingToggle;
    private Boolean ruleutcCloakToggle;
    private Boolean ruleutcSpecialToggle;

    @JsonProperty("RULEUTC_ShieldToggle")
    public Boolean getRuleutcShieldToggle() { return ruleutcShieldToggle; }
    @JsonProperty("RULEUTC_ShieldToggle")
    public void setRuleutcShieldToggle(Boolean value) { this.ruleutcShieldToggle = value; }

    @JsonProperty("RULEUTC_ProductionToggle")
    public Boolean getRuleutcProductionToggle() { return ruleutcProductionToggle; }
    @JsonProperty("RULEUTC_ProductionToggle")
    public void setRuleutcProductionToggle(Boolean value) { this.ruleutcProductionToggle = value; }

    @JsonProperty("RULEUTC_IntelToggle")
    public Boolean getRuleutcIntelToggle() { return ruleutcIntelToggle; }
    @JsonProperty("RULEUTC_IntelToggle")
    public void setRuleutcIntelToggle(Boolean value) { this.ruleutcIntelToggle = value; }

    @JsonProperty("RULEUTC_StealthToggle")
    public Boolean getRuleutcStealthToggle() { return ruleutcStealthToggle; }
    @JsonProperty("RULEUTC_StealthToggle")
    public void setRuleutcStealthToggle(Boolean value) { this.ruleutcStealthToggle = value; }

    @JsonProperty("RULEUTC_WeaponToggle")
    public Boolean getRuleutcWeaponToggle() { return ruleutcWeaponToggle; }
    @JsonProperty("RULEUTC_WeaponToggle")
    public void setRuleutcWeaponToggle(Boolean value) { this.ruleutcWeaponToggle = value; }

    @JsonProperty("RULEUTC_JammingToggle")
    public Boolean getRuleutcJammingToggle() { return ruleutcJammingToggle; }
    @JsonProperty("RULEUTC_JammingToggle")
    public void setRuleutcJammingToggle(Boolean value) { this.ruleutcJammingToggle = value; }

    @JsonProperty("RULEUTC_CloakToggle")
    public Boolean getRuleutcCloakToggle() { return ruleutcCloakToggle; }
    @JsonProperty("RULEUTC_CloakToggle")
    public void setRuleutcCloakToggle(Boolean value) { this.ruleutcCloakToggle = value; }

    @JsonProperty("RULEUTC_SpecialToggle")
    public Boolean getRuleutcSpecialToggle() { return ruleutcSpecialToggle; }
    @JsonProperty("RULEUTC_SpecialToggle")
    public void setRuleutcSpecialToggle(Boolean value) { this.ruleutcSpecialToggle = value; }
}
